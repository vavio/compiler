package parser;

// Generated from RoboL.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RoboLParser}.
 */
public interface RoboLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RoboLParser#povtoruvaj_do_uslov_block}.
	 * @param ctx the parse tree
	 */
	void enterPovtoruvaj_do_uslov_block(@NotNull RoboLParser.Povtoruvaj_do_uslov_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#povtoruvaj_do_uslov_block}.
	 * @param ctx the parse tree
	 */
	void exitPovtoruvaj_do_uslov_block(@NotNull RoboLParser.Povtoruvaj_do_uslov_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#komanda_povtoruvaj}.
	 * @param ctx the parse tree
	 */
	void enterKomanda_povtoruvaj(@NotNull RoboLParser.Komanda_povtoruvajContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#komanda_povtoruvaj}.
	 * @param ctx the parse tree
	 */
	void exitKomanda_povtoruvaj(@NotNull RoboLParser.Komanda_povtoruvajContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#komparator}.
	 * @param ctx the parse tree
	 */
	void enterKomparator(@NotNull RoboLParser.KomparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#komparator}.
	 * @param ctx the parse tree
	 */
	void exitKomparator(@NotNull RoboLParser.KomparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#nasoka_block}.
	 * @param ctx the parse tree
	 */
	void enterNasoka_block(@NotNull RoboLParser.Nasoka_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#nasoka_block}.
	 * @param ctx the parse tree
	 */
	void exitNasoka_block(@NotNull RoboLParser.Nasoka_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#izraz}.
	 * @param ctx the parse tree
	 */
	void enterIzraz(@NotNull RoboLParser.IzrazContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#izraz}.
	 * @param ctx the parse tree
	 */
	void exitIzraz(@NotNull RoboLParser.IzrazContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#ako_zeton_block}.
	 * @param ctx the parse tree
	 */
	void enterAko_zeton_block(@NotNull RoboLParser.Ako_zeton_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#ako_zeton_block}.
	 * @param ctx the parse tree
	 */
	void exitAko_zeton_block(@NotNull RoboLParser.Ako_zeton_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#povik_procedura}.
	 * @param ctx the parse tree
	 */
	void enterPovik_procedura(@NotNull RoboLParser.Povik_proceduraContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#povik_procedura}.
	 * @param ctx the parse tree
	 */
	void exitPovik_procedura(@NotNull RoboLParser.Povik_proceduraContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#zidovi_block}.
	 * @param ctx the parse tree
	 */
	void enterZidovi_block(@NotNull RoboLParser.Zidovi_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#zidovi_block}.
	 * @param ctx the parse tree
	 */
	void exitZidovi_block(@NotNull RoboLParser.Zidovi_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#tip}.
	 * @param ctx the parse tree
	 */
	void enterTip(@NotNull RoboLParser.TipContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#tip}.
	 * @param ctx the parse tree
	 */
	void exitTip(@NotNull RoboLParser.TipContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(@NotNull RoboLParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(@NotNull RoboLParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#glavna_procedura_block}.
	 * @param ctx the parse tree
	 */
	void enterGlavna_procedura_block(@NotNull RoboLParser.Glavna_procedura_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#glavna_procedura_block}.
	 * @param ctx the parse tree
	 */
	void exitGlavna_procedura_block(@NotNull RoboLParser.Glavna_procedura_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#zid}.
	 * @param ctx the parse tree
	 */
	void enterZid(@NotNull RoboLParser.ZidContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#zid}.
	 * @param ctx the parse tree
	 */
	void exitZid(@NotNull RoboLParser.ZidContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#povtoruvaj_broj_pati_block}.
	 * @param ctx the parse tree
	 */
	void enterPovtoruvaj_broj_pati_block(@NotNull RoboLParser.Povtoruvaj_broj_pati_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#povtoruvaj_broj_pati_block}.
	 * @param ctx the parse tree
	 */
	void exitPovtoruvaj_broj_pati_block(@NotNull RoboLParser.Povtoruvaj_broj_pati_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#komanda_kontrola}.
	 * @param ctx the parse tree
	 */
	void enterKomanda_kontrola(@NotNull RoboLParser.Komanda_kontrolaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#komanda_kontrola}.
	 * @param ctx the parse tree
	 */
	void exitKomanda_kontrola(@NotNull RoboLParser.Komanda_kontrolaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#inicijaliziranje_promenliva}.
	 * @param ctx the parse tree
	 */
	void enterInicijaliziranje_promenliva(@NotNull RoboLParser.Inicijaliziranje_promenlivaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#inicijaliziranje_promenliva}.
	 * @param ctx the parse tree
	 */
	void exitInicijaliziranje_promenliva(@NotNull RoboLParser.Inicijaliziranje_promenlivaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#azururanje_promenliva}.
	 * @param ctx the parse tree
	 */
	void enterAzururanje_promenliva(@NotNull RoboLParser.Azururanje_promenlivaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#azururanje_promenliva}.
	 * @param ctx the parse tree
	 */
	void exitAzururanje_promenliva(@NotNull RoboLParser.Azururanje_promenlivaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#parametar}.
	 * @param ctx the parse tree
	 */
	void enterParametar(@NotNull RoboLParser.ParametarContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#parametar}.
	 * @param ctx the parse tree
	 */
	void exitParametar(@NotNull RoboLParser.ParametarContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#ako_uslov_block}.
	 * @param ctx the parse tree
	 */
	void enterAko_uslov_block(@NotNull RoboLParser.Ako_uslov_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#ako_uslov_block}.
	 * @param ctx the parse tree
	 */
	void exitAko_uslov_block(@NotNull RoboLParser.Ako_uslov_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#komanda_site}.
	 * @param ctx the parse tree
	 */
	void enterKomanda_site(@NotNull RoboLParser.Komanda_siteContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#komanda_site}.
	 * @param ctx the parse tree
	 */
	void exitKomanda_site(@NotNull RoboLParser.Komanda_siteContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link RoboLParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(@NotNull RoboLParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(@NotNull RoboLParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#potprocedura_block}.
	 * @param ctx the parse tree
	 */
	void enterPotprocedura_block(@NotNull RoboLParser.Potprocedura_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#potprocedura_block}.
	 * @param ctx the parse tree
	 */
	void exitPotprocedura_block(@NotNull RoboLParser.Potprocedura_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#povtoruvaj_do_nasoka_block}.
	 * @param ctx the parse tree
	 */
	void enterPovtoruvaj_do_nasoka_block(@NotNull RoboLParser.Povtoruvaj_do_nasoka_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#povtoruvaj_do_nasoka_block}.
	 * @param ctx the parse tree
	 */
	void exitPovtoruvaj_do_nasoka_block(@NotNull RoboLParser.Povtoruvaj_do_nasoka_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#deklariranje_promenliva}.
	 * @param ctx the parse tree
	 */
	void enterDeklariranje_promenliva(@NotNull RoboLParser.Deklariranje_promenlivaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#deklariranje_promenliva}.
	 * @param ctx the parse tree
	 */
	void exitDeklariranje_promenliva(@NotNull RoboLParser.Deklariranje_promenlivaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#argumenti}.
	 * @param ctx the parse tree
	 */
	void enterArgumenti(@NotNull RoboLParser.ArgumentiContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#argumenti}.
	 * @param ctx the parse tree
	 */
	void exitArgumenti(@NotNull RoboLParser.ArgumentiContext ctx);
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
	 * Enter a parse tree produced by {@link RoboLParser#komanda}.
	 * @param ctx the parse tree
	 */
	void enterKomanda(@NotNull RoboLParser.KomandaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#komanda}.
	 * @param ctx the parse tree
	 */
	void exitKomanda(@NotNull RoboLParser.KomandaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull RoboLParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull RoboLParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#parametri}.
	 * @param ctx the parse tree
	 */
	void enterParametri(@NotNull RoboLParser.ParametriContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#parametri}.
	 * @param ctx the parse tree
	 */
	void exitParametri(@NotNull RoboLParser.ParametriContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull RoboLParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull RoboLParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#zeton}.
	 * @param ctx the parse tree
	 */
	void enterZeton(@NotNull RoboLParser.ZetonContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#zeton}.
	 * @param ctx the parse tree
	 */
	void exitZeton(@NotNull RoboLParser.ZetonContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#uslov}.
	 * @param ctx the parse tree
	 */
	void enterUslov(@NotNull RoboLParser.UslovContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#uslov}.
	 * @param ctx the parse tree
	 */
	void exitUslov(@NotNull RoboLParser.UslovContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#komanda_vgnezdena}.
	 * @param ctx the parse tree
	 */
	void enterKomanda_vgnezdena(@NotNull RoboLParser.Komanda_vgnezdenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#komanda_vgnezdena}.
	 * @param ctx the parse tree
	 */
	void exitKomanda_vgnezdena(@NotNull RoboLParser.Komanda_vgnezdenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#povtoruvaj_do_zeton_block}.
	 * @param ctx the parse tree
	 */
	void enterPovtoruvaj_do_zeton_block(@NotNull RoboLParser.Povtoruvaj_do_zeton_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#povtoruvaj_do_zeton_block}.
	 * @param ctx the parse tree
	 */
	void exitPovtoruvaj_do_zeton_block(@NotNull RoboLParser.Povtoruvaj_do_zeton_blockContext ctx);
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
	 * Enter a parse tree produced by {@link RoboLParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull RoboLParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull RoboLParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#ako_nasoka_block}.
	 * @param ctx the parse tree
	 */
	void enterAko_nasoka_block(@NotNull RoboLParser.Ako_nasoka_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#ako_nasoka_block}.
	 * @param ctx the parse tree
	 */
	void exitAko_nasoka_block(@NotNull RoboLParser.Ako_nasoka_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#ako_zid_block}.
	 * @param ctx the parse tree
	 */
	void enterAko_zid_block(@NotNull RoboLParser.Ako_zid_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#ako_zid_block}.
	 * @param ctx the parse tree
	 */
	void exitAko_zid_block(@NotNull RoboLParser.Ako_zid_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#zetoni_block}.
	 * @param ctx the parse tree
	 */
	void enterZetoni_block(@NotNull RoboLParser.Zetoni_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#zetoni_block}.
	 * @param ctx the parse tree
	 */
	void exitZetoni_block(@NotNull RoboLParser.Zetoni_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#broj_promenliva}.
	 * @param ctx the parse tree
	 */
	void enterBroj_promenliva(@NotNull RoboLParser.Broj_promenlivaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#broj_promenliva}.
	 * @param ctx the parse tree
	 */
	void exitBroj_promenliva(@NotNull RoboLParser.Broj_promenlivaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#povtoruvaj_do_zid_block}.
	 * @param ctx the parse tree
	 */
	void enterPovtoruvaj_do_zid_block(@NotNull RoboLParser.Povtoruvaj_do_zid_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#povtoruvaj_do_zid_block}.
	 * @param ctx the parse tree
	 */
	void exitPovtoruvaj_do_zid_block(@NotNull RoboLParser.Povtoruvaj_do_zid_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLParser#nasoka_promenliva}.
	 * @param ctx the parse tree
	 */
	void enterNasoka_promenliva(@NotNull RoboLParser.Nasoka_promenlivaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLParser#nasoka_promenliva}.
	 * @param ctx the parse tree
	 */
	void exitNasoka_promenliva(@NotNull RoboLParser.Nasoka_promenlivaContext ctx);
}