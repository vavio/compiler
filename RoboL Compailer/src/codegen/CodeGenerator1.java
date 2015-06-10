package codegen;

import java.util.List;
import java.util.Map;

import lexer.JFlexToken;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.TerminalNode;

import converter.AntlrLexer;
import parser.RoboLBaseListener;
import parser.RoboLParser.Ako_nasoka_blockContext;
import parser.RoboLParser.Ako_uslov_blockContext;
import parser.RoboLParser.Ako_zeton_blockContext;
import parser.RoboLParser.Ako_zid_blockContext;
import parser.RoboLParser.ArgumentContext;
import parser.RoboLParser.Broj_promenlivaContext;
import parser.RoboLParser.Deklariranje_promenlivaContext;
import parser.RoboLParser.Glavna_procedura_blockContext;
import parser.RoboLParser.KomandaContext;
import parser.RoboLParser.Nasoka_promenlivaContext;
import parser.RoboLParser.ParametarContext;
import parser.RoboLParser.ParametriContext;
import parser.RoboLParser.Potprocedura_blockContext;
import parser.RoboLParser.Povik_proceduraContext;
import parser.RoboLParser.Povtoruvaj_broj_pati_blockContext;
import parser.RoboLParser.Povtoruvaj_do_nasoka_blockContext;
import parser.RoboLParser.Povtoruvaj_do_uslov_blockContext;
import parser.RoboLParser.Povtoruvaj_do_zeton_blockContext;
import parser.RoboLParser.Povtoruvaj_do_zid_blockContext;
import semantics.Procedure;
import semantics.Variable;

public class CodeGenerator1 extends RoboLBaseListener{
	private AntlrLexer lexer;
	private StringBuilder builder;
	int labelStartLoopId, labelEndLoopId, labelEndCondId; 
	
	public CodeGenerator1(AntlrLexer lexer) {
		super();
		this.lexer = lexer;
		builder = new StringBuilder();
		labelStartLoopId = labelEndLoopId = labelEndCondId = 0;
	}
	
	// ------------------------------- PROCEDURA ---------------------------------------	
	
	@Override
	public void enterPotprocedura_block(Potprocedura_blockContext ctx) {
		int procedureId = Integer.parseInt(ctx.ID().getText());
		builder.append(getIdentifier(procedureId));
		builder.append(":\n");
		
		super.enterPotprocedura_block(ctx);
	}
	
	@Override
	public void enterArgument(ArgumentContext ctx) {
		builder.append("data ");
		builder.append(getIdentifier(Integer.parseInt(ctx.ID().getText())));
		builder.append("\n");
		
		super.enterArgument(ctx);
	}
	
	@Override
	public void exitPotprocedura_block(Potprocedura_blockContext ctx) {
		builder.append("ret\n\n");
		super.exitPotprocedura_block(ctx);
	}
	
	@Override
	public void enterGlavna_procedura_block(Glavna_procedura_blockContext ctx) {
		builder.append("main:\n");
		super.enterGlavna_procedura_block(ctx);
	}
	
	@Override
	public void exitGlavna_procedura_block(Glavna_procedura_blockContext ctx) {
		builder.append("ret\n\n");
		super.exitGlavna_procedura_block(ctx);
	}
	
	@Override
	public void enterDeklariranje_promenliva(Deklariranje_promenlivaContext ctx) {
		List<TerminalNode> ids = ctx.ID();
		for (TerminalNode tn : ids) {
			int varId = Integer.parseInt(tn.getSymbol().getText());
			builder.append("data ");
			builder.append(getIdentifier(varId));
			builder.append("\n");
		}
		super.enterDeklariranje_promenliva(ctx);
	}
	
	// ------------------------------- USLOVI ---------------------------------------	
	
	@Override
	public void enterAko_zeton_block(Ako_zeton_blockContext ctx) {
		String endLabel = getUniqueEndCondLabel();
		LabelContainer labelContainer = new LabelContainer("", endLabel, "cond");
		ctx.addChild(labelContainer);
		
		builder.append("cmp regC $C\n");
		builder.append("jne ");
		builder.append(endLabel);
		builder.append("\n");
		super.enterAko_zeton_block(ctx);
	}
	
	@Override
	public void exitAko_zeton_block(Ako_zeton_blockContext ctx) {
		LabelContainer labelContainer = (LabelContainer) ctx.getChild(ctx.getChildCount()-1);
		
		builder.append(labelContainer.endLabel);
		builder.append(":\n");
		
		ctx.removeLastChild();
		super.exitAko_zeton_block(ctx);
	}
	
	@Override
	public void enterAko_zid_block(Ako_zid_blockContext ctx) {
		String endLabel = getUniqueEndCondLabel();
		LabelContainer labelContainer = new LabelContainer("", endLabel, "cond");
		ctx.addChild(labelContainer);
		
		builder.append("cmp regC $W\n");
		builder.append("jne ");
		builder.append(endLabel);
		builder.append("\n");
		super.enterAko_zid_block(ctx);
	}
	
	@Override
	public void exitAko_zid_block(Ako_zid_blockContext ctx) {
		LabelContainer labelContainer = (LabelContainer) ctx.getChild(ctx.getChildCount()-1);
		
		builder.append(labelContainer.endLabel);
		builder.append(":\n");
		
		ctx.removeLastChild();
		super.exitAko_zid_block(ctx);
	}
	
	@Override
	public void enterAko_nasoka_block(Ako_nasoka_blockContext ctx) {
		String endLabel = getUniqueEndCondLabel();
		LabelContainer labelContainer = new LabelContainer("", endLabel, "cond");
		ctx.addChild(labelContainer);
		
		builder.append("cmp regD ");
		if (ctx.nasoka_promenliva().getStart().getType() == JFlexToken.ID.getValue()) {
			builder.append(getIdentifier(Integer.parseInt(ctx.nasoka_promenliva().getStart().getText())));
		}
		else {
			builder.append(ctx.nasoka_promenliva().getStart().getText());
			
		}
		builder.append("\n");
		
		builder.append("jne ");
		builder.append(endLabel);
		builder.append("\n");
		super.enterAko_nasoka_block(ctx);
	}
	
	@Override
	public void exitAko_nasoka_block(Ako_nasoka_blockContext ctx) {
		LabelContainer labelContainer = (LabelContainer) ctx.getChild(ctx.getChildCount()-1);
		
		builder.append(labelContainer.endLabel);
		builder.append(":\n");
		
		ctx.removeLastChild();
		super.exitAko_nasoka_block(ctx);
	}
	
	@Override
	public void enterAko_uslov_block(Ako_uslov_blockContext ctx) {
		String endLabel = getUniqueEndCondLabel();
		LabelContainer labelContainer = new LabelContainer("", endLabel, "cond");
		ctx.addChild(labelContainer);
		builder.append("push\n");
		
		builder.append("move regN ");
		if(ctx.uslov().broj_promenliva(0).getStart().getType() == JFlexToken.ID.getValue()) {
			builder.append(getIdentifier(Integer.parseInt(ctx.uslov().broj_promenliva(0).getStart().getText())));
		}
		else {
			builder.append(Integer.parseInt(ctx.uslov().broj_promenliva(0).getStart().getText()));
		}
		builder.append("\n");
		
		builder.append("cmp regN ");
		if(ctx.uslov().broj_promenliva(1).getStart().getType() == JFlexToken.ID.getValue()) {
			builder.append(getIdentifier(Integer.parseInt(ctx.uslov().broj_promenliva(1).getStart().getText())));
		}
		else {
			builder.append(Integer.parseInt(ctx.uslov().broj_promenliva(1).getStart().getText()));
		}
		builder.append("\n");
		
		if (ctx.uslov().komparator().getStart().getType() == JFlexToken.OP_EQUAL.getValue()) {
			builder.append("jie ");
		}
		else if (ctx.uslov().komparator().getStart().getType() == JFlexToken.OP_NOTEQUAL.getValue()) {
			builder.append("jne ");
		}
		else if (ctx.uslov().komparator().getStart().getType() == JFlexToken.OP_LESSEQUAL.getValue()) {
			builder.append("jle ");
		}
		else if (ctx.uslov().komparator().getStart().getType() == JFlexToken.OP_LESS.getValue()) {
			builder.append("jl ");
		}
		else if (ctx.uslov().komparator().getStart().getType() == JFlexToken.OP_GREATEREQUAL.getValue()) {
			builder.append("jme ");
		}
		else if (ctx.uslov().komparator().getStart().getType() == JFlexToken.OP_GREATER.getValue()) {
			builder.append("jm ");
		}
		builder.append(endLabel);
		builder.append("\n");
		
		super.enterAko_uslov_block(ctx);
	}
	
	@Override
	public void exitAko_uslov_block(Ako_uslov_blockContext ctx) {
		LabelContainer labelContainer = (LabelContainer) ctx.getChild(ctx.getChildCount()-1);
		
		builder.append(labelContainer.endLabel);
		builder.append(":\n");
		builder.append("pop\n");
		
		ctx.removeLastChild();
		super.exitAko_uslov_block(ctx);
	}
		
	// --------------------------------------- LOOPS ------------------------------------------
	
	@Override
	public void enterPovtoruvaj_broj_pati_block(Povtoruvaj_broj_pati_blockContext ctx) {
		String startLabel = getUniqueStartLoopLabel();
		String endLabel = getUniqueEndLoopLabel();
		LabelContainer labelContainer = new LabelContainer(startLabel, endLabel, "loop");
		ctx.addChild(labelContainer);
		
		builder.append("push\n");
		builder.append("move regN 0\n");
		builder.append(startLabel);
		builder.append(":\n");
		
		
		builder.append("cmp regN ");
		if(ctx.broj_promenliva().getStart().getType() == JFlexToken.ID.getValue()) {
			builder.append(getIdentifier(Integer.parseInt(ctx.broj_promenliva().getStart().getText())));
		}
		else {
			builder.append(Integer.parseInt(ctx.broj_promenliva().getStart().getText()));
		}
		builder.append("\n");
		
		builder.append("jme ");
		builder.append(endLabel);
		builder.append("\n");
		
		super.enterPovtoruvaj_broj_pati_block(ctx);
	}
	
	@Override
	public void exitPovtoruvaj_broj_pati_block(Povtoruvaj_broj_pati_blockContext ctx) {
		LabelContainer labelContainer = (LabelContainer) ctx.getChild(ctx.getChildCount()-1);
		builder.append("inc\n");
		builder.append("jmp ");
		builder.append(labelContainer.startLabel);
		builder.append("\n");
		
		builder.append(labelContainer.endLabel);
		builder.append(":\n");
		builder.append("pop\n");
		
		ctx.removeLastChild();
		super.exitPovtoruvaj_broj_pati_block(ctx);
	}
	
	@Override
	public void enterPovtoruvaj_do_uslov_block(Povtoruvaj_do_uslov_blockContext ctx) {
		String startLabel = getUniqueStartLoopLabel();
		String endLabel = getUniqueEndLoopLabel();
		LabelContainer labelContainer = new LabelContainer(startLabel, endLabel, "loop");
		ctx.addChild(labelContainer);
		
		builder.append("push\n");
		
		builder.append("move regN ");
		if(ctx.uslov().broj_promenliva(0).getStart().getType() == JFlexToken.ID.getValue()) {
			builder.append(getIdentifier(Integer.parseInt(ctx.uslov().broj_promenliva(0).getStart().getText())));
		}
		else {
			builder.append(Integer.parseInt(ctx.uslov().broj_promenliva(0).getStart().getText()));
		}
		builder.append("\n");
		
		builder.append(startLabel);
		builder.append(":\n");
		
		builder.append("cmp regN ");
		if(ctx.uslov().broj_promenliva(1).getStart().getType() == JFlexToken.ID.getValue()) {
			builder.append(getIdentifier(Integer.parseInt(ctx.uslov().broj_promenliva(1).getStart().getText())));
		}
		else {
			builder.append(Integer.parseInt(ctx.uslov().broj_promenliva(1).getStart().getText()));
		}
		builder.append("\n");
		
		if (ctx.uslov().komparator().getStart().getType() == JFlexToken.OP_EQUAL.getValue()) {
			builder.append("jie ");
		}
		else if (ctx.uslov().komparator().getStart().getType() == JFlexToken.OP_NOTEQUAL.getValue()) {
			builder.append("jne ");
		}
		else if (ctx.uslov().komparator().getStart().getType() == JFlexToken.OP_LESSEQUAL.getValue()) {
			builder.append("jle ");
		}
		else if (ctx.uslov().komparator().getStart().getType() == JFlexToken.OP_LESS.getValue()) {
			builder.append("jl ");
		}
		else if (ctx.uslov().komparator().getStart().getType() == JFlexToken.OP_GREATEREQUAL.getValue()) {
			builder.append("jme ");
		}
		else if (ctx.uslov().komparator().getStart().getType() == JFlexToken.OP_GREATER.getValue()) {
			builder.append("jm ");
		}
		builder.append(endLabel);
		builder.append("\n");
		
		super.enterPovtoruvaj_do_uslov_block(ctx);
	}
	
	@Override
	public void exitPovtoruvaj_do_uslov_block(Povtoruvaj_do_uslov_blockContext ctx) {
		LabelContainer labelContainer = (LabelContainer) ctx.getChild(ctx.getChildCount()-1);
		
		builder.append("jmp ");
		builder.append(labelContainer.startLabel);
		builder.append("\n");
		
		builder.append(labelContainer.endLabel);
		builder.append(":\n");
		builder.append("pop\n");
		
		ctx.removeLastChild();
		super.exitPovtoruvaj_do_uslov_block(ctx);
	}
	
	@Override
	public void enterPovtoruvaj_do_zid_block(Povtoruvaj_do_zid_blockContext ctx) {
		String startLabel = getUniqueStartLoopLabel();
		String endLabel = getUniqueEndLoopLabel();
		LabelContainer labelContainer = new LabelContainer(startLabel, endLabel, "loop");
		ctx.addChild(labelContainer);
		
		builder.append(startLabel);
		builder.append(":\n");
		builder.append("cmp regC $W\n");
		builder.append("jie ");
		builder.append(endLabel);
		builder.append("\n");
		
		super.enterPovtoruvaj_do_zid_block(ctx);
	}
	
	@Override
	public void exitPovtoruvaj_do_zid_block(Povtoruvaj_do_zid_blockContext ctx) {
		LabelContainer labelContainer = (LabelContainer) ctx.getChild(ctx.getChildCount()-1);
		builder.append("jmp ");
		builder.append(labelContainer.startLabel);
		builder.append("\n");
		
		builder.append(labelContainer.endLabel);
		builder.append(":\n");
		
		ctx.removeLastChild();
		super.exitPovtoruvaj_do_zid_block(ctx);
	}
	
	@Override
	public void enterPovtoruvaj_do_zeton_block(Povtoruvaj_do_zeton_blockContext ctx) {
		String startLabel = getUniqueStartLoopLabel();
		String endLabel = getUniqueEndLoopLabel();
		LabelContainer labelContainer = new LabelContainer(startLabel, endLabel, "loop");
		ctx.addChild(labelContainer);
		
		builder.append(startLabel);
		builder.append(":\n");
		builder.append("cmp regC $C\n");
		builder.append("jie ");
		builder.append(endLabel);
		builder.append("\n");
		
		super.enterPovtoruvaj_do_zeton_block(ctx);
	}
	
	@Override
	public void exitPovtoruvaj_do_zeton_block(Povtoruvaj_do_zeton_blockContext ctx) {
		LabelContainer labelContainer = (LabelContainer) ctx.getChild(ctx.getChildCount()-1);
		builder.append("jmp ");
		builder.append(labelContainer.startLabel);
		builder.append("\n");
		
		builder.append(labelContainer.endLabel);
		builder.append(":\n");
		
		ctx.removeLastChild();
		super.exitPovtoruvaj_do_zeton_block(ctx);
	}
	
	
	@Override
	public void enterPovtoruvaj_do_nasoka_block(Povtoruvaj_do_nasoka_blockContext ctx) {
		String startLabel = getUniqueStartLoopLabel();
		String endLabel = getUniqueEndLoopLabel();
		LabelContainer labelContainer = new LabelContainer(startLabel, endLabel, "loop");
		ctx.addChild(labelContainer);
		
		builder.append(startLabel);
		builder.append(":\n");
		
		builder.append("cmp regD ");
		if (ctx.nasoka_promenliva().getStart().getType() == JFlexToken.ID.getValue()) {
			builder.append(getIdentifier(Integer.parseInt(ctx.nasoka_promenliva().getStart().getText())));
		}
		else {
			builder.append(ctx.nasoka_promenliva().getStart().getText());
			
		}
		builder.append("\n");
		
		builder.append("jie ");
		builder.append(endLabel);
		builder.append("\n");
		
		super.enterPovtoruvaj_do_nasoka_block(ctx);
	}

	@Override
	public void exitPovtoruvaj_do_nasoka_block(Povtoruvaj_do_nasoka_blockContext ctx) {
		LabelContainer labelContainer = (LabelContainer) ctx.getChild(ctx.getChildCount()-1);
		
		builder.append("jmp ");
		builder.append(labelContainer.startLabel);
		builder.append("\n");
		
		builder.append(labelContainer.endLabel);
		builder.append(":\n");
		
		ctx.removeLastChild();
		super.exitPovtoruvaj_do_nasoka_block(ctx);
	}

	// ------------------------------------ KOMANDI -----------------------------------
	
	@Override
	public void enterKomanda(KomandaContext ctx) {
		if (ctx.getStart().getType() == JFlexToken.KW_ODI.getValue()) {
			builder.append("go\n");
		}
		else if (ctx.getStart().getType() == JFlexToken.KW_ZEMI.getValue()) {
			builder.append("tk\n");
		}
		else if (ctx.getStart().getType() == JFlexToken.KW_OSTAVI.getValue()) {
			builder.append("lv\n");
		}
		else if (ctx.getStart().getType() == JFlexToken.KW_DESNO.getValue()) {
			builder.append("rr\n");
		}
		else if (ctx.getStart().getType() == JFlexToken.KW_LEVO.getValue()) {
			builder.append("rl\n");
		}
		super.enterKomanda(ctx);
	}
	
	// ------------------------------------ CALL -----------------------------------
	
	@Override
	public void enterPovik_procedura(Povik_proceduraContext ctx) {
		builder.append("call ");
		builder.append(getIdentifier(Integer.parseInt(ctx.ID().getText())));
		builder.append("(");
		super.enterPovik_procedura(ctx);
	}
	
	@Override
	public void enterParametri(ParametriContext ctx) {
		List<ParametarContext> list = ctx.parametar();
		for (int i=0; i<list.size(); i++) {
			if (i>0) {
				builder.append(", ");
			}
			ParametarContext pc = list.get(i);
			if (pc.getChild(0) instanceof Broj_promenlivaContext) {
				Broj_promenlivaContext context = (Broj_promenlivaContext) pc.getChild(0);
				if (context.getStart().getType() == JFlexToken.ID.getValue()) {
					builder.append(getIdentifier(Integer.parseInt(context.getStart().getText())));
				}
				else {
					builder.append(context.getStart().getText());
				}
			}
			else if (pc.getChild(0) instanceof Nasoka_promenlivaContext) {
				Nasoka_promenlivaContext context = (Nasoka_promenlivaContext) pc.getChild(0);
				if (context.getStart().getType() == JFlexToken.ID.getValue()) {
					builder.append(getIdentifier(Integer.parseInt(context.getStart().getText())));
				}
				else {
					builder.append(context.getStart().getText());
				}
			}
		}
		super.enterParametri(ctx);
	}
	
	@Override
	public void exitPovik_procedura(Povik_proceduraContext ctx) {
		builder.append(")\n");
		super.exitPovik_procedura(ctx);
	}

	// ---------------------------------- IZRAZI ------------------------------------
	
	
	
	
	private String getIdentifier(Integer id) {
		return lexer.getReversedIdentifierMap().get(id);
	}
	
	private String getUniqueEndCondLabel() {
		return String.format("endCond%d", labelEndCondId++);
	}
	
	private String getUniqueStartLoopLabel() {
		return String.format("startLoop%d", labelStartLoopId++);
	}
	
	private String getUniqueEndLoopLabel() {
		return String.format("endLoop%d", labelEndLoopId++);
	}
	
	public String generateRimalCode() {
		return builder.toString();
	}
	
	@Override
	public String toString() {
		return builder.toString();
	}

}
