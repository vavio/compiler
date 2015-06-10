package semantics;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;

import converter.AntlrLexer;
import error.Error;
import parser.RoboLBaseListener;
import parser.RoboLParser.Glavna_procedura_blockContext;
import parser.RoboLParser.Potprocedura_blockContext;

public class SemanticAnalyzer1  extends RoboLBaseListener {
	private AntlrLexer lexer;
	private Map<Integer, Procedure> procedures;
	private List<Error> errors;
	
	public SemanticAnalyzer1(AntlrLexer lexer) {
		this.lexer = lexer;
		procedures = new HashMap<Integer, Procedure>();
		errors = new LinkedList<>();
	}
	
	@Override
	public void enterGlavna_procedura_block(Glavna_procedura_blockContext ctx) {
		procedures.put(-1, new Procedure(-1));
		super.enterGlavna_procedura_block(ctx);
	}
	
	@Override
	public void enterPotprocedura_block(Potprocedura_blockContext ctx) {
		int id = Integer.parseInt(ctx.ID().getText());
		if (procedures.containsKey(id)) {
			int line = ctx.ID().getSymbol().getLine();
			int startIndex = ctx.ID().getSymbol().getStartIndex();
			int stopIndex = ctx.ID().getSymbol().getStartIndex();
			String description = "Потпроцедура \"" + lexer.getIIdentifierNameById(id) + "\" веќе постои.";
			addError(line, startIndex, stopIndex, description, "Искористете ново име.");
		} else {
			procedures.put(id, new Procedure(id));
		}
		super.enterPotprocedura_block(ctx);
	}
	
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

	public void addError(int line, int startIndex, int stopIndex, String description, String sugestion) {
		Error error = new Error(line, startIndex, stopIndex, description, sugestion);
		System.out.println(error.getDescription());
	}
}
