package parser;

// Generated from RoboL.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RoboLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RoboLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RoboLParser#povtoruvaj_do_uslov_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPovtoruvaj_do_uslov_block(@NotNull RoboLParser.Povtoruvaj_do_uslov_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#komanda_povtoruvaj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKomanda_povtoruvaj(@NotNull RoboLParser.Komanda_povtoruvajContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#komparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKomparator(@NotNull RoboLParser.KomparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#nasoka_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNasoka_block(@NotNull RoboLParser.Nasoka_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#izraz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIzraz(@NotNull RoboLParser.IzrazContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#ako_zeton_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAko_zeton_block(@NotNull RoboLParser.Ako_zeton_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#povik_procedura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPovik_procedura(@NotNull RoboLParser.Povik_proceduraContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#zidovi_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZidovi_block(@NotNull RoboLParser.Zidovi_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#tip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTip(@NotNull RoboLParser.TipContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(@NotNull RoboLParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#glavna_procedura_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlavna_procedura_block(@NotNull RoboLParser.Glavna_procedura_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#zid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZid(@NotNull RoboLParser.ZidContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#povtoruvaj_broj_pati_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPovtoruvaj_broj_pati_block(@NotNull RoboLParser.Povtoruvaj_broj_pati_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#komanda_kontrola}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKomanda_kontrola(@NotNull RoboLParser.Komanda_kontrolaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#inicijaliziranje_promenliva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicijaliziranje_promenliva(@NotNull RoboLParser.Inicijaliziranje_promenlivaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#azururanje_promenliva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAzururanje_promenliva(@NotNull RoboLParser.Azururanje_promenlivaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#parametar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametar(@NotNull RoboLParser.ParametarContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#ako_uslov_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAko_uslov_block(@NotNull RoboLParser.Ako_uslov_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#komanda_site}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKomanda_site(@NotNull RoboLParser.Komanda_siteContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#okolina_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOkolina_block(@NotNull RoboLParser.Okolina_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(@NotNull RoboLParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#potprocedura_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotprocedura_block(@NotNull RoboLParser.Potprocedura_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#povtoruvaj_do_nasoka_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPovtoruvaj_do_nasoka_block(@NotNull RoboLParser.Povtoruvaj_do_nasoka_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#deklariranje_promenliva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeklariranje_promenliva(@NotNull RoboLParser.Deklariranje_promenlivaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#argumenti}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumenti(@NotNull RoboLParser.ArgumentiContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#definiranje_okolina_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefiniranje_okolina_block(@NotNull RoboLParser.Definiranje_okolina_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#komanda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKomanda(@NotNull RoboLParser.KomandaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#parametri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametri(@NotNull RoboLParser.ParametriContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(@NotNull RoboLParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#zeton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeton(@NotNull RoboLParser.ZetonContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#uslov}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUslov(@NotNull RoboLParser.UslovContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#komanda_vgnezdena}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKomanda_vgnezdena(@NotNull RoboLParser.Komanda_vgnezdenaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#povtoruvaj_do_zeton_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPovtoruvaj_do_zeton_block(@NotNull RoboLParser.Povtoruvaj_do_zeton_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull RoboLParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#ako_nasoka_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAko_nasoka_block(@NotNull RoboLParser.Ako_nasoka_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#ako_zid_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAko_zid_block(@NotNull RoboLParser.Ako_zid_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#zetoni_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZetoni_block(@NotNull RoboLParser.Zetoni_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#broj_promenliva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBroj_promenliva(@NotNull RoboLParser.Broj_promenlivaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#povtoruvaj_do_zid_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPovtoruvaj_do_zid_block(@NotNull RoboLParser.Povtoruvaj_do_zid_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLParser#nasoka_promenliva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNasoka_promenliva(@NotNull RoboLParser.Nasoka_promenlivaContext ctx);
}