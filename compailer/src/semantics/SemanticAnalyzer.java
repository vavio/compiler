package semantics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import lexer.JFlexToken;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import parser.RoboLBaseVisitor;
import parser.RoboLParser.ArgumentContext;
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

public class SemanticAnalyzer extends RoboLBaseVisitor<String> {
	private AntlrLexer lexer;
	private Map<Integer, Procedure> procedures;
	private List<Error> errors;
	private boolean hasError;

	public SemanticAnalyzer(AntlrLexer lexer) {
		this.lexer = lexer;
		procedures = new HashMap<Integer, Procedure>();
		errors = new LinkedList<>();
		hasError = false;
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
		int id = Integer.parseInt(ctx.ID().getText());
		if (procedures.containsKey(id)) {
			int line = ctx.ID().getSymbol().getLine();
			int startIndex = ctx.ID().getSymbol().getStartIndex();
			int stopIndex = ctx.ID().getSymbol().getStartIndex();
			String description = "Потпроцедура \"" + lexer.getIIdentifierNameById(id) + "\" веќе постои.";
			addError(line, startIndex, stopIndex, description, "Искористете ново име.");
		} else {
			Procedure proc = new Procedure();
			proc.setId(id);
			procedures.put(id, proc);
		}
		return super.visitPotprocedura_block(ctx);
	}

	// Argument
	@Override
	public String visitArgument(ArgumentContext ctx) {
		Variable variable = new Variable();
		int id = Integer.parseInt(ctx.ID().getText());
		int type = ctx.tip().getStart().getType();
		variable.setId(id);
		if (type == JFlexToken.KW_NASOKA.getValue()) {
			variable.setType(VariableType.Nasoka);
		} else {
			variable.setType(VariableType.Broj);
		}
		Potprocedura_blockContext parentContex = (Potprocedura_blockContext) ctx.getParent().getParent();
		Procedure parentProcedure = procedures.get(Integer.parseInt(parentContex.ID().getText()));
		variable.setParent(parentProcedure);
		parentProcedure.getArguments().add(variable); // dodadi i vo lista na
														// argumenti
		parentProcedure.getVariables().put(id, variable); // dodadi i vo lista
															// na promenlivi
		return super.visitArgument(ctx);
	}

	// Povik na procedura
	@Override
	public String visitPovik_procedura(Povik_proceduraContext ctx) {
		int id = Integer.parseInt(ctx.ID().getText());
		Procedure procedure = procedures.get(id);
		Procedure parentProcedure = findParentProcedure(ctx);
		if (procedure == null) {
			int line = ctx.ID().getSymbol().getLine();
			int startIndex = ctx.ID().getSymbol().getStartIndex();
			int stoptIndex = ctx.ID().getSymbol().getStopIndex();
			String description = "Невалиден повик. Потпроцедурата \"" + lexer.getIIdentifierNameById(id) + "\" не постои.";
			addError(line, startIndex, stoptIndex, description, "");
		} else {
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
				int line = ctx.ID().getSymbol().getLine();
				int startIndex = ctx.ID().getSymbol().getStartIndex();
				int stoptIndex = ctx.ID().getSymbol().getStopIndex();
				String description = "Бројот на параметрите за потпроцедурата \"" + lexer.getIIdentifierNameById(id) + "\" не е точен. ";
				description += "Прима: " + argsCount + ". Проследени: " + parmsCount + ".";
				addError(line, startIndex, stoptIndex, description, "");
			}
			else {
				if (argsCount > 0) {
					List<Integer> parms = new ArrayList<>();
					for (int i=0; i<ctx.getChild(2).getChildCount(); i++) {
						if (ctx.getChild(2).getChild(i) instanceof ParametarContext) {
							ParserRuleContext subParametar = (ParserRuleContext) ctx.getChild(2).getChild(i).getChild(0);
							if (subParametar instanceof IzrazContext) {
								int expressionType = (evalExpresionType(subParametar , parentProcedure)); 
								parms.add(expressionType);
								if (expressionType == 0 || expressionType == 3) {
									int line = subParametar.getStart().getLine();
									int startIndex = subParametar.getStart().getStartIndex();
									int stoptIndex = subParametar.getStart().getStopIndex();
									String description = "Невалиден израз. Содржи операции помеѓу податоци од тип \"насока\" и \"број\".";
									addError(line, startIndex, stoptIndex, description, "");
								}
							}
							else if (subParametar instanceof Nasoka_promenlivaContext) {
								Nasoka_promenlivaContext nasokaPromenlivaContext = 
										(Nasoka_promenlivaContext) subParametar;
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
										int line = nasokaPromenlivaContext.getStart().getLine();
										int startIndex = nasokaPromenlivaContext.getStart().getStartIndex();
										int stoptIndex = nasokaPromenlivaContext.getStart().getStopIndex();
										String description = "Неиницијализирана променлива \"" + lexer.getIIdentifierNameById(varId) + "\".";
										addError(line, startIndex, stoptIndex, description, "");
										parms.add(0);
									}
								}
							}
						}
					}
					
					boolean flag = true;
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
						
						int line = ctx.ID().getSymbol().getLine();
						int startIndex = ctx.ID().getSymbol().getStartIndex();
						int stoptIndex = ctx.ID().getSymbol().getStopIndex();
						String description = "Невалиден потпис при повик на потпроцедурата \"" + lexer.getIIdentifierNameById(id) + "\". ";
						description += "Очекува: " + prifaka.toString() + ". Добива: " + dobiva.toString() + "."; 
						addError(line, startIndex, stoptIndex, description, "");
					}
				}
			}
			
			// Da se iskoristi StringBuilder
			// da se proveriv tipovi и да се евалуирав изрази
			// сас некоју не иницијализирану променливу
		}
		return super.visitPovik_procedura(ctx);
	}

	// Deklariranje promenliva
	@Override
	public String visitDeklariranje_promenliva(Deklariranje_promenlivaContext ctx) {
		ParserRuleContext parentContex = ctx.getParent().getParent();
		List<TerminalNode> ids = ctx.ID();
		int parentId = -2;
		if (parentContex instanceof Glavna_procedura_blockContext) {
			parentId = -1;
		} else {
			parentId = Integer.parseInt(((Potprocedura_blockContext) parentContex).ID().getText());
		}
		Procedure parentProcedure = procedures.get(parentId);
		if (parentProcedure == null) {
			System.out.println("Nula");
		}
		
		if (parentProcedure.getVariables() == null) {
			System.out.println("Nula");
		}
		for (TerminalNode tn : ids) {
			int id = Integer.parseInt(tn.getSymbol().getText());
			if (parentProcedure.getVariables().containsKey(id)) {
				int line = tn.getSymbol().getLine();
				int startIndex = tn.getSymbol().getStartIndex();
				int stopIndex = tn.getSymbol().getStartIndex();
				String description = "Променливата \"" + lexer.getIIdentifierNameById(id) + "\" е веќе декларирана.";
				addError(line, startIndex, stopIndex, description, "Искористете ново и уникатно име.");
			} else {
				parentProcedure.getVariables().put(id, new Variable(id, VariableType.Neinicijalizirana, parentProcedure));
			}
		}
		return super.visitDeklariranje_promenliva(ctx);
	}

	// Inicijaliziranje na procedura
//	@Override
//	public String visitInicijaliziranje_promenliva(Inicijaliziranje_promenlivaContext ctx) {
//		int id = Integer.parseInt(ctx.ID().getText());
//		if (!variables.containsKey(id)) {
//			int line = ctx.ID().getSymbol().getLine();
//			int startIndex = ctx.ID().getSymbol().getStartIndex();
//			int stoptIndex = ctx.ID().getSymbol().getStopIndex();
//			String description = "Променливата \"" + lexer.getIIdentifierNameById(id) + "\" не постои.";
//			addError(line, startIndex, stoptIndex, description, "");
//		} else {
//			// da se proveriv tipovi и да се евалуирав изрази, дали се работи
//			// сас некоју не иницијализирану променливу
//		}
//		return super.visitInicijaliziranje_promenliva(ctx);
//	}

	@Override
	public String visitInicijaliziranje_promenliva(Inicijaliziranje_promenlivaContext ctx) {
		Procedure parentProcedure = findParentProcedure(ctx);
		int id = Integer.parseInt(ctx.ID().getText());
		if (!parentProcedure.getVariables().containsKey(id)) {
			int line = ctx.ID().getSymbol().getLine();
			int startIndex = ctx.ID().getSymbol().getStartIndex();
			int stoptIndex = ctx.ID().getSymbol().getStopIndex();
			String description = "Променливата \"" + lexer.getIIdentifierNameById(id) + "\" не постои.";
			addError(line, startIndex, stoptIndex, description, "");
		} else {
			// da se proveriv tipovi и да се евалуирав изрази, дали се работи
			// сас некоју не иницијализирану променливу
			boolean hasUninitializedVariables = findUninitializedVariables((ParserRuleContext)ctx.getChild(2), parentProcedure);
			if (!hasUninitializedVariables) {
				int expresionType = evalExpresionType((ParserRuleContext)ctx.getChild(2), parentProcedure);
				if (expresionType == 0 || expresionType == 3) {
					int line = ctx.ID().getSymbol().getLine();
					int startIndex = ctx.ID().getSymbol().getStartIndex();
					int stoptIndex = ctx.ID().getSymbol().getStopIndex();
					String description = "Невалиден израз. Содржи операции помеѓу податоци од тип \"насока\" и \"број\".";
					addError(line, startIndex, stoptIndex, description, "");
				}
				else if (expresionType == 1) {
					parentProcedure.getVariables().get(id).setType(VariableType.Broj);
				}
				else if (expresionType == 2) {
					parentProcedure.getVariables().get(id).setType(VariableType.Nasoka);
				}
			}
			
		}
		return super.visitInicijaliziranje_promenliva(ctx);
	}

	// Najdi neinicijalizirana promenliva
	public boolean findUninitializedVariables(ParserRuleContext ctx, Procedure parentProcedure) {
		if (ctx instanceof Broj_promenlivaContext) {
			Broj_promenlivaContext context = (Broj_promenlivaContext) ctx;
			if (context.getStart().getType() == JFlexToken.ID.getValue()) {
				int id = Integer.parseInt(context.getStart().getText());
				if (parentProcedure.getVariables().get(id).getType() == VariableType.Neinicijalizirana) {
					int line = context.getStart().getLine();
					int startIndex = context.getStart().getStartIndex();
					int stoptIndex = context.getStart().getStopIndex();
					String description = "Користење на неиницијализирана променлива \"" + lexer.getIIdentifierNameById(id) + "\".";
					addError(line, startIndex, stoptIndex, description, "");
					return true;
				}
			}
			return false;
		}
		else if (ctx == null) {
			return false;
		}
		else {
			boolean flag = false;
			for (int i=0; i<ctx.getChildCount(); i++) {
				if (ctx.getChild(i) instanceof ParserRuleContext) {
					flag = flag || findUninitializedVariables((ParserRuleContext)ctx.getChild(i), parentProcedure);
				}
			}
			return flag;
		}
	}
	
	// Evaluairaj tip na cel izraz
	// 0 - nedefinirano, 1 - broj, 2 - nasoka, 3 - mesano (error)
	public int evalExpresionType(ParserRuleContext ctx, Procedure parentProcedure) {
		if (ctx instanceof Broj_promenlivaContext) {
			Broj_promenlivaContext context = (Broj_promenlivaContext) ctx;
			if (context.getStart().getType() == JFlexToken.ID.getValue()) {
				int id = Integer.parseInt(context.getStart().getText());
				if (parentProcedure.getVariables().get(id).getType() == VariableType.Broj) {
					return 1;
				}
				else if (parentProcedure.getVariables().get(id).getType() == VariableType.Nasoka) {
					return 2;
				}
				else {
					return 0;
				}
			}
			else {
				return 1;
			}
		}
		else if (ctx == null) {
			return 0;
		}
		else if (ctx instanceof Nasoka_promenlivaContext) {
			Nasoka_promenlivaContext context = (Nasoka_promenlivaContext) ctx;
			if (context.getStart().getType() == JFlexToken.ID.getValue()) {
				int id = Integer.parseInt(context.getStart().getText());
				if (parentProcedure.getVariables().get(id).getType() == VariableType.Broj) {
					return 1;
				}
				else if (parentProcedure.getVariables().get(id).getType() == VariableType.Nasoka) {
					return 2;
				}
				else {
					return 0;
				}
			}
			else {
				return 2;
			}
		}
		else {
			int flag = 0;
			for (int i=0; i<ctx.getChildCount(); i++) {
				if (ctx.getChild(i) instanceof ParserRuleContext) {
					int flag1 = evalExpresionType((ParserRuleContext)ctx.getChild(i), parentProcedure);
					if (flag1 != 0 && flag == 0) {
						flag = flag1;
					}
					else if (flag1 != flag) {
						flag = 3;
					}
				}
			}
			return flag;
		}
			
	}
	
	// proveri tipovi na povik
	
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
		System.out.println(error.getDescription());
		hasError = true;
	}

	public Map<Integer, Procedure> getProcedures() {
		return procedures;
	}

	public void setProcedures(Map<Integer, Procedure> procedures) {
		this.procedures = procedures;
	}
}
