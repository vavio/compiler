package semantics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import lexer.JFlexToken;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import parser.RoboLBaseVisitor;
import parser.RoboLParser.ArgumentContext;
import parser.RoboLParser.Azururanje_promenlivaContext;
import parser.RoboLParser.Broj_promenlivaContext;
import parser.RoboLParser.Deklariranje_promenlivaContext;
import parser.RoboLParser.Glavna_procedura_blockContext;
import parser.RoboLParser.Inicijaliziranje_promenlivaContext;
import parser.RoboLParser.IzrazContext;
import parser.RoboLParser.Nasoka_promenlivaContext;
import parser.RoboLParser.ParametarContext;
import parser.RoboLParser.ParametriContext;
import parser.RoboLParser.Potprocedura_blockContext;
import parser.RoboLParser.Povik_proceduraContext;
import converter.AntlrLexer;
import error.Error;
import error.ErrorContainer;

public class SemanticAnalyzer extends RoboLBaseVisitor<String> {
	private AntlrLexer lexer;
	private Map<Integer, Procedure> procedures;
	ErrorContainer errorContainer;

	public SemanticAnalyzer(AntlrLexer lexer, ErrorContainer errorContainer) {
		this.lexer = lexer;
		procedures = new HashMap<Integer, Procedure>();
		this.errorContainer = errorContainer;
	}

	// Glavna procedura
	@Override
	public String visitGlavna_procedura_block(Glavna_procedura_blockContext ctx) {
		procedures.put(-1, new Procedure(-1));
		return super.visitGlavna_procedura_block(ctx);
	}

	// Potprocedura
	@Override
	public String visitPotprocedura_block(Potprocedura_blockContext ctx) {
		int id = Integer.parseInt(ctx.ID().getSymbol().getText());
		Token token = ctx.ID().getSymbol();
		if (procedures.containsKey(id)) {
			String description = "Потпроцедура \"" + lexer.getIIdentifierNameById(id) + "\" веќе постои.";
			addError(token, description, "Искористете ново име.");
		} else {
			procedures.put(id, new Procedure(id));
		}
		return super.visitPotprocedura_block(ctx);
	}

	// Argument
	@Override
	public String visitArgument(ArgumentContext ctx) {
		Procedure parentProcedure = findParentProcedure(ctx);
		Token token = ctx.ID().getSymbol();
		
		Variable variable = new Variable();
		int id = Integer.parseInt(ctx.ID().getText());
		variable.setId(id);
		
		int type = ctx.tip().getStart().getType();
		if (type == JFlexToken.KW_NASOKA.getValue()) {
			variable.setType(VariableType.Nasoka);
		} else {
			variable.setType(VariableType.Broj);
		}

		variable.setParent(parentProcedure);
		
		if (parentProcedure.getVariables().containsKey(id)) {
			String description = "Веќе постои аргумент или променлива со име \"" + lexer.getIIdentifierNameById(id) + "\".";
			addError(token, description, "Искористете ново и уникатно име.");
		}
		else {
			parentProcedure.getArguments().add(variable); // dodadi i vo lista na argumenti
			parentProcedure.getVariables().put(id, variable); // dodadi i vo lista na promenlivi
		}
		return super.visitArgument(ctx);
	}

	// Povik na procedura
	@Override
	public String visitPovik_procedura(Povik_proceduraContext ctx) {
		int id = Integer.parseInt(ctx.ID().getText());
		Procedure procedure = procedures.get(id);
		Procedure parentProcedure = findParentProcedure(ctx);
		Token token = ctx.ID().getSymbol();
		
		if (procedure == null) {
			String description = "Невалиден повик. Потпроцедурата \"" + lexer.getIIdentifierNameById(id) + "\" не постои.";
			addError(token, description, "");
		} 
		else {
			int argsCount = procedure.getArguments().size();
			int parmsCount = 0;
			if (ctx.getChild(2) instanceof ParametriContext) {
				for (int i=0; i<ctx.getChild(2).getChildCount(); i++) {
					if (ctx.getChild(2).getChild(i) instanceof ParametarContext) {
						parmsCount++;
					}
				}
			}
			
			if (argsCount != parmsCount) {
				String description = "Бројот на параметрите за потпроцедурата \"" + lexer.getIIdentifierNameById(id) + "\" не е точен. ";
				description += "Прима: " + argsCount + ". Проследени: " + parmsCount + ".";
				addError(token, description, "");
			}
			else {
				if (argsCount > 0) {
					List<Integer> parms = new ArrayList<>();
					for (int i=0; i<ctx.getChild(2).getChildCount(); i++) {
						if (ctx.getChild(2).getChild(i) instanceof ParametarContext) {
							ParserRuleContext subParametar = (ParserRuleContext) ctx.getChild(2).getChild(i).getChild(0);
							if (subParametar instanceof Broj_promenlivaContext) {
								Broj_promenlivaContext brojPromenlivaContext = (Broj_promenlivaContext) subParametar;
								if (brojPromenlivaContext.getStart().getType() == JFlexToken.NASOKA.getValue()) {
									parms.add(2);
								}
								else if (brojPromenlivaContext.getStart().getType() == JFlexToken.ID.getValue()) {
									int varId = Integer.parseInt(brojPromenlivaContext.getStart().getText());
									if (parentProcedure.getVariables().get(varId).getType() == VariableType.Broj) {
										parms.add(1);
									}
									else if (parentProcedure.getVariables().get(varId).getType() == VariableType.Nasoka) {
										parms.add(2);
									}
									else if (parentProcedure.getVariables().get(varId).getType() == VariableType.Neinicijalizirana) {
										parms.add(0);
									}
								}
							}
							else if (subParametar instanceof Nasoka_promenlivaContext) {
								Nasoka_promenlivaContext nasokaPromenlivaContext = 	(Nasoka_promenlivaContext) subParametar;
								if (nasokaPromenlivaContext.getStart().getType() == JFlexToken.NASOKA.getValue()) {
									parms.add(2);
								}
								else if (nasokaPromenlivaContext.getStart().getType() == JFlexToken.ID.getValue()) {
									int varId = Integer.parseInt(nasokaPromenlivaContext.getStart().getText());
									if (parentProcedure.getVariables().get(varId).getType() == VariableType.Broj) {
										parms.add(1);
									}
									else if (parentProcedure.getVariables().get(varId).getType() == VariableType.Nasoka) {
										parms.add(2);
									}
									else if (parentProcedure.getVariables().get(varId).getType() == VariableType.Neinicijalizirana) {
//										int line = nasokaPromenlivaContext.getStart().getLine();
//										int startIndex = nasokaPromenlivaContext.getStart().getStartIndex();
//										int stoptIndex = nasokaPromenlivaContext.getStart().getStopIndex();
//										String description = "Неиницијализирана променлива \"" + lexer.getIIdentifierNameById(varId) + "\".";
//										addError(line, startIndex, stoptIndex, description, "");
										parms.add(0);
									}
								}
							}
						}
					}
					
					boolean flag = true; // flag = nema nekompatibilni tipovi
					for (int i=0; i<parmsCount; i++) {
						if (parms.get(i) == 1 && procedure.getArguments().get(i).getType() != VariableType.Broj) {
							flag = false;
							break;
						}
						else if (parms.get(i) == 2 && procedure.getArguments().get(i).getType() != VariableType.Nasoka) {
							flag = false;
							break;
						}
					}
					
					if (!flag) {
						StringBuilder prifaka = new StringBuilder();
						StringBuilder dobiva = new StringBuilder();
						for (int i=0; i<parmsCount; i++) {
							if(procedure.getArguments().get(i).getType() == VariableType.Nasoka) {
								prifaka.append("насока");
							} 
							else {
								prifaka.append("број");
							}
							
							if (parms.get(i) == 1) {
								dobiva.append("број");
							}
							else if (parms.get(i) == 2) {
								dobiva.append("насока");
							}
							else {
								dobiva.append("недефинирано");
							}
							
 							if (i+1 < parmsCount) {
								prifaka.append(", ");
								dobiva.append(", ");
							}
						}
						
						String description = "Невалиден потпис при повик на потпроцедурата \"" + lexer.getIIdentifierNameById(id) + "\". ";
						description += "Очекува: " + prifaka.toString() + ". Добива: " + dobiva.toString() + "."; 
						addError(token, description, "");
					}
				}
			}
		}
		return super.visitPovik_procedura(ctx);
	}

	// Deklariranje promenliva
	@Override
	public String visitDeklariranje_promenliva(Deklariranje_promenlivaContext ctx) {
		Procedure parentProcedure = findParentProcedure(ctx);
		List<TerminalNode> ids = ctx.ID();
		for (TerminalNode tn : ids) {
			int varId = Integer.parseInt(tn.getSymbol().getText());
			Token token = tn.getSymbol();
			if (parentProcedure.getVariables().containsKey(varId)) {
				String description = "Променливата \"" + lexer.getIIdentifierNameById(varId) + "\" веќе постои.";
				addError(token, description, "Искористете ново и уникатно име.");
			} else {
				parentProcedure.getVariables().put(varId, new Variable(varId, VariableType.Neinicijalizirana, parentProcedure));
			}
		}
		return super.visitDeklariranje_promenliva(ctx);
	}



	@Override
	public String visitInicijaliziranje_promenliva(Inicijaliziranje_promenlivaContext ctx) {
		// Да се рефакторира
		Procedure parentProcedure = findParentProcedure(ctx);
		int varId = Integer.parseInt(ctx.ID().getSymbol().getText());
		
		if (!parentProcedure.getVariables().containsKey(varId)) {
			int line = ctx.ID().getSymbol().getLine();
			int startIndex = ctx.ID().getSymbol().getStartIndex();
			int stoptIndex = ctx.ID().getSymbol().getStopIndex();
			String description = "Променливата \"" + lexer.getIIdentifierNameById(varId) + "\" не постои.";
			addError(line, startIndex, stoptIndex, description, "");
		}
		else if(!(ctx.getParent() instanceof Glavna_procedura_blockContext) && !(ctx.getParent() instanceof Potprocedura_blockContext)) {
			System.out.println("Proverka vo nekoja naredba");
			if (parentProcedure.getVariables().get(varId).getType() == VariableType.Neinicijalizirana) {
				int line = ctx.ID().getSymbol().getLine();
				int startIndex = ctx.ID().getSymbol().getStartIndex();
				int stoptIndex = ctx.ID().getSymbol().getStopIndex();
				String description = "Променливата \"" + lexer.getIIdentifierNameById(varId) + "\" не е иницијализирана на почеток.";
				addError(line, startIndex, stoptIndex, description, "");
			}
		}
		
		
		if (ctx.broj_promenliva() != null) {
			if (ctx.broj_promenliva().getStart().getType() == JFlexToken.ID.getValue()) {
				int id = Integer.parseInt(ctx.broj_promenliva().getStart().getText());
				if (!parentProcedure.getVariables().containsKey(id)) {
					int line = ctx.broj_promenliva().getStart().getLine();
					int startIndex = ctx.broj_promenliva().getStart().getStartIndex();
					int stoptIndex = ctx.broj_promenliva().getStart().getStopIndex();
					String description = "Променливата \"" + lexer.getIIdentifierNameById(id) + "\" не постои.";
					addError(line, startIndex, stoptIndex, description, "");
				}
				else if (parentProcedure.getVariables().get(id).getType() == VariableType.Neinicijalizirana) {
					int line = ctx.broj_promenliva().getStart().getLine();
					int startIndex = ctx.broj_promenliva().getStart().getStartIndex();
					int stoptIndex = ctx.broj_promenliva().getStart().getStopIndex();
					String description = "Користење на неиницијализирана променлива \"" + lexer.getIIdentifierNameById(id) + "\".";
					addError(line, startIndex, stoptIndex, description, "");
				}
				else {
					parentProcedure.getVariables().get(varId).setType(parentProcedure.getVariables().get(id).getType() );
				}
				
			}
			else if (ctx.broj_promenliva().getStart().getType() == JFlexToken.BROJ.getValue()) {
				parentProcedure.getVariables().get(varId).setType(VariableType.Broj);
			}
		}
		else if (ctx.nasoka_promenliva() != null) {
			if (ctx.nasoka_promenliva().getStart().getType() == JFlexToken.ID.getValue()) {
				int id = Integer.parseInt(ctx.nasoka_promenliva().getStart().getText());
				if (!parentProcedure.getVariables().containsKey(id)) {
					int line = ctx.nasoka_promenliva().getStart().getLine();
					int startIndex = ctx.nasoka_promenliva().getStart().getStartIndex();
					int stoptIndex = ctx.nasoka_promenliva().getStart().getStopIndex();
					String description = "Променливата \"" + lexer.getIIdentifierNameById(id) + "\" не постои.";
					addError(line, startIndex, stoptIndex, description, "");
				}
				else if (parentProcedure.getVariables().get(id).getType() == VariableType.Neinicijalizirana) {
					int line = ctx.nasoka_promenliva().getStart().getLine();
					int startIndex = ctx.nasoka_promenliva().getStart().getStartIndex();
					int stoptIndex = ctx.nasoka_promenliva().getStart().getStopIndex();
					String description = "Користење на неиницијализирана променлива \"" + lexer.getIIdentifierNameById(id) + "\".";
					addError(line, startIndex, stoptIndex, description, "");
				}
				else {
					parentProcedure.getVariables().get(varId).setType(parentProcedure.getVariables().get(id).getType() );
				}
				
			}
			else if (ctx.nasoka_promenliva().getStart().getType() == JFlexToken.NASOKA.getValue()) {
				parentProcedure.getVariables().get(varId).setType(VariableType.Nasoka);
			}
			
		}
		
		return super.visitInicijaliziranje_promenliva(ctx);
	}

	@Override
	public String visitAzururanje_promenliva(Azururanje_promenlivaContext ctx) {
		Procedure parentProcedure = findParentProcedure(ctx);
		int id = Integer.parseInt(ctx.ID().getSymbol().getText());
		Token token = ctx.ID().getSymbol();

		if (!parentProcedure.getVariables().containsKey(id)) {
			String description = "Променливата \"" + lexer.getIIdentifierNameById(id) + "\" не постои.";
			addError(token, description, "");
		}
		else if (parentProcedure.getVariables().get(id).getType() == VariableType.Neinicijalizirana) {
			String description = "Користење на неиницијализирана променлива \"" + lexer.getIIdentifierNameById(id) + "\".";
			addError(token, description, "");
		}
		else if (parentProcedure.getVariables().get(id).getType() == VariableType.Nasoka) {
			String description = "Променлива \"" + lexer.getIIdentifierNameById(id) + "\" не смее да биде од тип \"насока\".";
			addError(token, description, "");
		}
		
		return super.visitAzururanje_promenliva(ctx);
	}
	
	@Override
	public String visitIzraz(IzrazContext ctx) {
		Procedure parentProcedure = findParentProcedure(ctx);
		if (ctx.broj_promenliva(0).getStart().getType() == JFlexToken.ID.getValue()) {
			int id = Integer.parseInt(ctx.broj_promenliva(0).getStart().getText());
			Token token = ctx.broj_promenliva(0).getStart();
			
			if (!parentProcedure.getVariables().containsKey(id)) {
				String description = "Променливата \"" + lexer.getIIdentifierNameById(id) + "\" не постои.";
				addError(token, description, "");
			}
			else if (parentProcedure.getVariables().get(id).getType() == VariableType.Neinicijalizirana) {
				String description = "Користење на неиницијализирана променлива \"" + lexer.getIIdentifierNameById(id) + "\".";
				addError(token, description, "");
			}
			else if (parentProcedure.getVariables().get(id).getType() == VariableType.Nasoka) {
				String description = "Променлива \"" + lexer.getIIdentifierNameById(id) + "\" не смее да биде од тип \"насока\".";
				addError(token, description, "");
			}
		}
		
		if (ctx.broj_promenliva(1).getStart().getType() == JFlexToken.ID.getValue()) {
			int id = Integer.parseInt(ctx.broj_promenliva(1).getStart().getText());
			Token token = ctx.broj_promenliva(1).getStart();
			
			if (!parentProcedure.getVariables().containsKey(id)) {
				String description = "Променливата \"" + lexer.getIIdentifierNameById(id) + "\" не постои.";
				addError(token, description, "");
			}
			else if (parentProcedure.getVariables().get(id).getType() == VariableType.Neinicijalizirana) {
				String description = "Користење на неиницијализирана променлива \"" + lexer.getIIdentifierNameById(id) + "\".";
				addError(token, description, "");
			}
			else if (parentProcedure.getVariables().get(id).getType() == VariableType.Nasoka) {
				String description = "Променлива \"" + lexer.getIIdentifierNameById(id) + "\" не смее да биде од тип \"насока\".";
				addError(token, description, "");
			}
		}
		return super.visitIzraz(ctx);
	}
	
	@Override
	public String visitBroj_promenliva(Broj_promenlivaContext ctx) {
		if (ctx.getStart().getType() == JFlexToken.ID.getValue()) {
			Procedure parentProcedure = findParentProcedure(ctx);
			int id = Integer.parseInt(ctx.getStart().getText());
			Token token = ctx.getStart();
			
			if (!parentProcedure.getVariables().containsKey(id)) {
				String description = "Променливата \"" + lexer.getIIdentifierNameById(id) + "\" не постои.";
				addError(token, description, "");
			}
			else if (parentProcedure.getVariables().get(id).getType() == VariableType.Neinicijalizirana) {
				String description = "Користење на неиницијализирана променлива \"" + lexer.getIIdentifierNameById(id) + "\".";
				addError(token, description, "");
			}
			
		}
		else if (ctx.getStart().getType() == JFlexToken.ID.getValue()) {
			int id = Integer.parseInt(ctx.getStart().getText());
			Token token = ctx.getStart();
			
			if (token.getText().length() > 7) {
				String description = "Максимална дозволена големина на податоци од тип \"број\" е 7 цифри.";
				addError(token, description, "");
			}
		}
		return super.visitBroj_promenliva(ctx);
	}
	
	@Override
	public String visitNasoka_promenliva(Nasoka_promenlivaContext ctx) {
		if (ctx.getStart().getType() == JFlexToken.ID.getValue()) {
			Procedure parentProcedure = findParentProcedure(ctx);
			int id = Integer.parseInt(ctx.getStart().getText());
			Token token = ctx.getStart();
			
			if (!parentProcedure.getVariables().containsKey(id)) {
				String description = "Променливата \"" + lexer.getIIdentifierNameById(id) + "\" не постои.";
				addError(token, description, "");
			}
			else if (parentProcedure.getVariables().get(id).getType() == VariableType.Neinicijalizirana) {
				String description = "Користење на неиницијализирана променлива \"" + lexer.getIIdentifierNameById(id) + "\".";
				addError(token, description, "");
			}
			
		}
		return super.visitNasoka_promenliva(ctx);
	}
	
	// Najdi parent 
	public Procedure findParentProcedure(ParserRuleContext ctx) {
		if (ctx instanceof Glavna_procedura_blockContext) {
			return procedures.get(-1);
		} else if (ctx instanceof Potprocedura_blockContext) {
			int id = Integer.parseInt(((Potprocedura_blockContext) ctx).ID().getText());
			return procedures.get(id);
		} else if (ctx == null) {
			System.out.println("Nemozev da najdam parent procedura za izrazot");
			return null;
		} else {
			return findParentProcedure(ctx.getParent());
		}
	}

	// Dodadi greska
	public void addError(int line, int startIndex, int stopIndex, String description, String sugestion) {
		Error error = new Error(line, startIndex, stopIndex, description, sugestion);
		errorContainer.addError(error);
		System.out.println(error.getDescription());
	}
	
	public void addError(Token token, String description, String sugestion) {
		int line = token.getLine();
		int startIndex = token.getStartIndex();
		int stopIndex = token.getStopIndex();
		Error error = new Error(line, startIndex, stopIndex, description, sugestion);
		errorContainer.addError(error);
		System.out.println(error.getDescription());
	}

	
	public Map<Integer, Procedure> getProcedures() {
		return procedures;
	}

	public void setProcedures(Map<Integer, Procedure> procedures) {
		this.procedures = procedures;
	}
}
