package robol;

// Generated from RoboL.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RoboLParser}.
 */
public interface RoboLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RoboLParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull RoboLParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull RoboLParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#definiranje_okolina_block}.
	 * @param ctx the parse tree
	 */
	void enterDefiniranje_okolina_block(@NotNull RoboLParser.Definiranje_okolina_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#definiranje_okolina_block}.
	 * @param ctx the parse tree
	 */
	void exitDefiniranje_okolina_block(@NotNull RoboLParser.Definiranje_okolina_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#okolina_block}.
	 * @param ctx the parse tree
	 */
	void enterOkolina_block(@NotNull RoboLParser.Okolina_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#okolina_block}.
	 * @param ctx the parse tree
	 */
	void exitOkolina_block(@NotNull RoboLParser.Okolina_blockContext ctx);
}