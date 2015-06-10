package parser;

// Generated from RoboL.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RoboLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KW_OKOLINA=1, KW_OKOLINA_DZID=2, KW_POCHETOK=3, KW_KRAJ=4, KW_OKOLINA_ZHETON=5, 
		KW_ROBOT=6, KW_PROCEDURA=7, KW_BROJ=8, KW_NASOKA=9, KW_ODI=10, KW_LEVO=11, 
		KW_DESNO=12, KW_ZEMI=13, KW_OSTAVI=14, KW_AKO=15, KW_ZHETON=16, KW_DZID=17, 
		KW_POVTORUVAJ=18, KW_DO=19, KW_PATI=20, KW_PROMENLIVA=21, OP_ASSIGN=22, 
		OP_ADD=23, OP_MINUS=24, OP_MULTIPLY=25, OP_DIVIDE=26, OP_EQUAL=27, OP_NOTEQUAL=28, 
		OP_GREATER=29, OP_LESS=30, OP_GREATEREQUAL=31, OP_LESSEQUAL=32, NASOKA=33, 
		BROJ=34, ID=35, EXCLAMATION=36, COMMA=37, LPAREN=38, RPAREN=39, COLON=40, 
		ID_ERROR=41, ERROR=42, PRAVEC=43;
	public static final String[] tokenNames = {
		"<INVALID>", "KW_OKOLINA", "KW_OKOLINA_DZID", "KW_POCHETOK", "KW_KRAJ", 
		"KW_OKOLINA_ZHETON", "KW_ROBOT", "KW_PROCEDURA", "KW_BROJ", "KW_NASOKA", 
		"KW_ODI", "KW_LEVO", "KW_DESNO", "KW_ZEMI", "KW_OSTAVI", "KW_AKO", "KW_ZHETON", 
		"KW_DZID", "KW_POVTORUVAJ", "KW_DO", "KW_PATI", "KW_PROMENLIVA", "OP_ASSIGN", 
		"OP_ADD", "OP_MINUS", "OP_MULTIPLY", "OP_DIVIDE", "OP_EQUAL", "OP_NOTEQUAL", 
		"OP_GREATER", "OP_LESS", "OP_GREATEREQUAL", "OP_LESSEQUAL", "NASOKA", 
		"BROJ", "ID", "EXCLAMATION", "COMMA", "LPAREN", "RPAREN", "COLON", "ID_ERROR", 
		"ERROR", "PRAVEC"
	};
	public static final int
		RULE_start = 0, RULE_programa = 1, RULE_definiranje_okolina_block = 2, 
		RULE_okolina_block = 3, RULE_zidovi_block = 4, RULE_zid = 5, RULE_zetoni_block = 6, 
		RULE_zeton = 7, RULE_nasoka_block = 8, RULE_potprocedura_block = 9, RULE_argumenti = 10, 
		RULE_argument = 11, RULE_tip = 12, RULE_glavna_procedura_block = 13, RULE_broj_promenliva = 14, 
		RULE_nasoka_promenliva = 15, RULE_izraz = 16, RULE_deklariranje_promenliva = 17, 
		RULE_inicijaliziranje_promenliva = 18, RULE_azururanje_promenliva = 19, 
		RULE_uslov = 20, RULE_komparator = 21, RULE_operator = 22, RULE_komanda = 23, 
		RULE_komanda_site = 24, RULE_komanda_vgnezdena = 25, RULE_komanda_kontrola = 26, 
		RULE_ako_zeton_block = 27, RULE_ako_zid_block = 28, RULE_ako_nasoka_block = 29, 
		RULE_ako_uslov_block = 30, RULE_komanda_povtoruvaj = 31, RULE_povtoruvaj_broj_pati_block = 32, 
		RULE_povtoruvaj_do_zeton_block = 33, RULE_povtoruvaj_do_zid_block = 34, 
		RULE_povtoruvaj_do_nasoka_block = 35, RULE_povtoruvaj_do_uslov_block = 36, 
		RULE_povik_procedura = 37, RULE_parametri = 38, RULE_parametar = 39;
	public static final String[] ruleNames = {
		"start", "programa", "definiranje_okolina_block", "okolina_block", "zidovi_block", 
		"zid", "zetoni_block", "zeton", "nasoka_block", "potprocedura_block", 
		"argumenti", "argument", "tip", "glavna_procedura_block", "broj_promenliva", 
		"nasoka_promenliva", "izraz", "deklariranje_promenliva", "inicijaliziranje_promenliva", 
		"azururanje_promenliva", "uslov", "komparator", "operator", "komanda", 
		"komanda_site", "komanda_vgnezdena", "komanda_kontrola", "ako_zeton_block", 
		"ako_zid_block", "ako_nasoka_block", "ako_uslov_block", "komanda_povtoruvaj", 
		"povtoruvaj_broj_pati_block", "povtoruvaj_do_zeton_block", "povtoruvaj_do_zid_block", 
		"povtoruvaj_do_nasoka_block", "povtoruvaj_do_uslov_block", "povik_procedura", 
		"parametri", "parametar"
	};

	@Override
	public String getGrammarFileName() { return "RoboL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RoboLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); programa();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramaContext extends ParserRuleContext {
		public List<Potprocedura_blockContext> potprocedura_block() {
			return getRuleContexts(Potprocedura_blockContext.class);
		}
		public Definiranje_okolina_blockContext definiranje_okolina_block() {
			return getRuleContext(Definiranje_okolina_blockContext.class,0);
		}
		public Potprocedura_blockContext potprocedura_block(int i) {
			return getRuleContext(Potprocedura_blockContext.class,i);
		}
		public Glavna_procedura_blockContext glavna_procedura_block() {
			return getRuleContext(Glavna_procedura_blockContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programa);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82); definiranje_okolina_block();
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(83); potprocedura_block();
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(89); glavna_procedura_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Definiranje_okolina_blockContext extends ParserRuleContext {
		public Okolina_blockContext okolina_block() {
			return getRuleContext(Okolina_blockContext.class,0);
		}
		public Zetoni_blockContext zetoni_block() {
			return getRuleContext(Zetoni_blockContext.class,0);
		}
		public Zidovi_blockContext zidovi_block() {
			return getRuleContext(Zidovi_blockContext.class,0);
		}
		public Nasoka_blockContext nasoka_block() {
			return getRuleContext(Nasoka_blockContext.class,0);
		}
		public Definiranje_okolina_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definiranje_okolina_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterDefiniranje_okolina_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitDefiniranje_okolina_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitDefiniranje_okolina_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definiranje_okolina_blockContext definiranje_okolina_block() throws RecognitionException {
		Definiranje_okolina_blockContext _localctx = new Definiranje_okolina_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definiranje_okolina_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); okolina_block();
			setState(93);
			_la = _input.LA(1);
			if (_la==KW_OKOLINA_DZID) {
				{
				setState(92); zidovi_block();
				}
			}

			setState(96);
			_la = _input.LA(1);
			if (_la==KW_OKOLINA_ZHETON) {
				{
				setState(95); zetoni_block();
				}
			}

			setState(98); nasoka_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Okolina_blockContext extends ParserRuleContext {
		public List<TerminalNode> BROJ() { return getTokens(RoboLParser.BROJ); }
		public TerminalNode COMMA() { return getToken(RoboLParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(RoboLParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(RoboLParser.LPAREN, 0); }
		public TerminalNode BROJ(int i) {
			return getToken(RoboLParser.BROJ, i);
		}
		public TerminalNode KW_OKOLINA() { return getToken(RoboLParser.KW_OKOLINA, 0); }
		public Okolina_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_okolina_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterOkolina_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitOkolina_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitOkolina_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Okolina_blockContext okolina_block() throws RecognitionException {
		Okolina_blockContext _localctx = new Okolina_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_okolina_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); match(KW_OKOLINA);
			setState(101); match(LPAREN);
			setState(102); match(BROJ);
			setState(103); match(COMMA);
			setState(104); match(BROJ);
			setState(105); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Zidovi_blockContext extends ParserRuleContext {
		public TerminalNode KW_KRAJ() { return getToken(RoboLParser.KW_KRAJ, 0); }
		public ZidContext zid(int i) {
			return getRuleContext(ZidContext.class,i);
		}
		public TerminalNode KW_OKOLINA_DZID() { return getToken(RoboLParser.KW_OKOLINA_DZID, 0); }
		public TerminalNode KW_POCHETOK() { return getToken(RoboLParser.KW_POCHETOK, 0); }
		public List<ZidContext> zid() {
			return getRuleContexts(ZidContext.class);
		}
		public Zidovi_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zidovi_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterZidovi_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitZidovi_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitZidovi_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Zidovi_blockContext zidovi_block() throws RecognitionException {
		Zidovi_blockContext _localctx = new Zidovi_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_zidovi_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(KW_OKOLINA_DZID);
			setState(108); match(KW_POCHETOK);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRAVEC) {
				{
				{
				setState(109); zid();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115); match(KW_KRAJ);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ZidContext extends ParserRuleContext {
		public TerminalNode PRAVEC() { return getToken(RoboLParser.PRAVEC, 0); }
		public List<TerminalNode> BROJ() { return getTokens(RoboLParser.BROJ); }
		public TerminalNode OP_MINUS() { return getToken(RoboLParser.OP_MINUS, 0); }
		public TerminalNode BROJ(int i) {
			return getToken(RoboLParser.BROJ, i);
		}
		public ZidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterZid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitZid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitZid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ZidContext zid() throws RecognitionException {
		ZidContext _localctx = new ZidContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_zid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); match(PRAVEC);
			setState(118); match(BROJ);
			setState(119); match(BROJ);
			setState(120); match(OP_MINUS);
			setState(121); match(BROJ);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Zetoni_blockContext extends ParserRuleContext {
		public List<ZetonContext> zeton() {
			return getRuleContexts(ZetonContext.class);
		}
		public TerminalNode KW_KRAJ() { return getToken(RoboLParser.KW_KRAJ, 0); }
		public TerminalNode KW_POCHETOK() { return getToken(RoboLParser.KW_POCHETOK, 0); }
		public TerminalNode KW_OKOLINA_ZHETON() { return getToken(RoboLParser.KW_OKOLINA_ZHETON, 0); }
		public ZetonContext zeton(int i) {
			return getRuleContext(ZetonContext.class,i);
		}
		public Zetoni_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zetoni_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterZetoni_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitZetoni_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitZetoni_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Zetoni_blockContext zetoni_block() throws RecognitionException {
		Zetoni_blockContext _localctx = new Zetoni_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_zetoni_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); match(KW_OKOLINA_ZHETON);
			setState(124); match(KW_POCHETOK);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(125); zeton();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131); match(KW_KRAJ);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ZetonContext extends ParserRuleContext {
		public List<TerminalNode> BROJ() { return getTokens(RoboLParser.BROJ); }
		public TerminalNode COMMA() { return getToken(RoboLParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(RoboLParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(RoboLParser.LPAREN, 0); }
		public TerminalNode BROJ(int i) {
			return getToken(RoboLParser.BROJ, i);
		}
		public ZetonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zeton; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterZeton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitZeton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitZeton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ZetonContext zeton() throws RecognitionException {
		ZetonContext _localctx = new ZetonContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_zeton);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); match(LPAREN);
			setState(134); match(BROJ);
			setState(135); match(COMMA);
			setState(136); match(BROJ);
			setState(137); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nasoka_blockContext extends ParserRuleContext {
		public TerminalNode NASOKA() { return getToken(RoboLParser.NASOKA, 0); }
		public List<TerminalNode> BROJ() { return getTokens(RoboLParser.BROJ); }
		public TerminalNode COMMA() { return getToken(RoboLParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(RoboLParser.RPAREN, 0); }
		public TerminalNode KW_ROBOT() { return getToken(RoboLParser.KW_ROBOT, 0); }
		public TerminalNode LPAREN() { return getToken(RoboLParser.LPAREN, 0); }
		public TerminalNode BROJ(int i) {
			return getToken(RoboLParser.BROJ, i);
		}
		public Nasoka_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nasoka_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterNasoka_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitNasoka_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitNasoka_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nasoka_blockContext nasoka_block() throws RecognitionException {
		Nasoka_blockContext _localctx = new Nasoka_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nasoka_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); match(KW_ROBOT);
			setState(140); match(NASOKA);
			setState(141); match(LPAREN);
			setState(142); match(BROJ);
			setState(143); match(COMMA);
			setState(144); match(BROJ);
			setState(145); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Potprocedura_blockContext extends ParserRuleContext {
		public TerminalNode KW_KRAJ() { return getToken(RoboLParser.KW_KRAJ, 0); }
		public ArgumentiContext argumenti() {
			return getRuleContext(ArgumentiContext.class,0);
		}
		public List<Komanda_siteContext> komanda_site() {
			return getRuleContexts(Komanda_siteContext.class);
		}
		public TerminalNode ID() { return getToken(RoboLParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(RoboLParser.RPAREN, 0); }
		public TerminalNode KW_POCHETOK() { return getToken(RoboLParser.KW_POCHETOK, 0); }
		public TerminalNode KW_PROCEDURA() { return getToken(RoboLParser.KW_PROCEDURA, 0); }
		public TerminalNode LPAREN() { return getToken(RoboLParser.LPAREN, 0); }
		public Komanda_siteContext komanda_site(int i) {
			return getRuleContext(Komanda_siteContext.class,i);
		}
		public Potprocedura_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potprocedura_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterPotprocedura_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitPotprocedura_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitPotprocedura_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Potprocedura_blockContext potprocedura_block() throws RecognitionException {
		Potprocedura_blockContext _localctx = new Potprocedura_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_potprocedura_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); match(KW_PROCEDURA);
			setState(148); match(ID);
			setState(149); match(LPAREN);
			setState(151);
			_la = _input.LA(1);
			if (_la==KW_BROJ || _la==KW_NASOKA) {
				{
				setState(150); argumenti();
				}
			}

			setState(153); match(RPAREN);
			setState(154); match(KW_POCHETOK);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ODI) | (1L << KW_LEVO) | (1L << KW_DESNO) | (1L << KW_ZEMI) | (1L << KW_OSTAVI) | (1L << KW_AKO) | (1L << KW_POVTORUVAJ) | (1L << KW_PROMENLIVA) | (1L << ID))) != 0)) {
				{
				{
				setState(155); komanda_site();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161); match(KW_KRAJ);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentiContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RoboLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RoboLParser.COMMA, i);
		}
		public ArgumentiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumenti; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterArgumenti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitArgumenti(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitArgumenti(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentiContext argumenti() throws RecognitionException {
		ArgumentiContext _localctx = new ArgumentiContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_argumenti);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); argument();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(164); match(COMMA);
				setState(165); argument();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RoboLParser.ID, 0); }
		public TipContext tip() {
			return getRuleContext(TipContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); tip();
			setState(172); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipContext extends ParserRuleContext {
		public TerminalNode KW_NASOKA() { return getToken(RoboLParser.KW_NASOKA, 0); }
		public TerminalNode KW_BROJ() { return getToken(RoboLParser.KW_BROJ, 0); }
		public TipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterTip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitTip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitTip(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipContext tip() throws RecognitionException {
		TipContext _localctx = new TipContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !(_la==KW_BROJ || _la==KW_NASOKA) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Glavna_procedura_blockContext extends ParserRuleContext {
		public TerminalNode KW_KRAJ() { return getToken(RoboLParser.KW_KRAJ, 0); }
		public List<Komanda_siteContext> komanda_site() {
			return getRuleContexts(Komanda_siteContext.class);
		}
		public TerminalNode RPAREN() { return getToken(RoboLParser.RPAREN, 0); }
		public TerminalNode KW_POCHETOK() { return getToken(RoboLParser.KW_POCHETOK, 0); }
		public TerminalNode KW_PROCEDURA() { return getToken(RoboLParser.KW_PROCEDURA, 0); }
		public TerminalNode LPAREN() { return getToken(RoboLParser.LPAREN, 0); }
		public Komanda_siteContext komanda_site(int i) {
			return getRuleContext(Komanda_siteContext.class,i);
		}
		public Glavna_procedura_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glavna_procedura_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterGlavna_procedura_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitGlavna_procedura_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitGlavna_procedura_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Glavna_procedura_blockContext glavna_procedura_block() throws RecognitionException {
		Glavna_procedura_blockContext _localctx = new Glavna_procedura_blockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_glavna_procedura_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); match(KW_PROCEDURA);
			setState(177); match(LPAREN);
			setState(178); match(RPAREN);
			setState(179); match(KW_POCHETOK);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ODI) | (1L << KW_LEVO) | (1L << KW_DESNO) | (1L << KW_ZEMI) | (1L << KW_OSTAVI) | (1L << KW_AKO) | (1L << KW_POVTORUVAJ) | (1L << KW_PROMENLIVA) | (1L << ID))) != 0)) {
				{
				{
				setState(180); komanda_site();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186); match(KW_KRAJ);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Broj_promenlivaContext extends ParserRuleContext {
		public TerminalNode BROJ() { return getToken(RoboLParser.BROJ, 0); }
		public TerminalNode ID() { return getToken(RoboLParser.ID, 0); }
		public Broj_promenlivaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_broj_promenliva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterBroj_promenliva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitBroj_promenliva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitBroj_promenliva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Broj_promenlivaContext broj_promenliva() throws RecognitionException {
		Broj_promenlivaContext _localctx = new Broj_promenlivaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_broj_promenliva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !(_la==BROJ || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nasoka_promenlivaContext extends ParserRuleContext {
		public TerminalNode NASOKA() { return getToken(RoboLParser.NASOKA, 0); }
		public TerminalNode ID() { return getToken(RoboLParser.ID, 0); }
		public Nasoka_promenlivaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nasoka_promenliva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterNasoka_promenliva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitNasoka_promenliva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitNasoka_promenliva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nasoka_promenlivaContext nasoka_promenliva() throws RecognitionException {
		Nasoka_promenlivaContext _localctx = new Nasoka_promenlivaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nasoka_promenliva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !(_la==NASOKA || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IzrazContext extends ParserRuleContext {
		public Broj_promenlivaContext broj_promenliva(int i) {
			return getRuleContext(Broj_promenlivaContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public List<Broj_promenlivaContext> broj_promenliva() {
			return getRuleContexts(Broj_promenlivaContext.class);
		}
		public IzrazContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_izraz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterIzraz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitIzraz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitIzraz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IzrazContext izraz() throws RecognitionException {
		IzrazContext _localctx = new IzrazContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_izraz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192); broj_promenliva();
			setState(193); operator();
			setState(194); broj_promenliva();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Deklariranje_promenlivaContext extends ParserRuleContext {
		public TerminalNode KW_PROMENLIVA() { return getToken(RoboLParser.KW_PROMENLIVA, 0); }
		public List<TerminalNode> COMMA() { return getTokens(RoboLParser.COMMA); }
		public List<TerminalNode> ID() { return getTokens(RoboLParser.ID); }
		public TerminalNode COMMA(int i) {
			return getToken(RoboLParser.COMMA, i);
		}
		public TerminalNode ID(int i) {
			return getToken(RoboLParser.ID, i);
		}
		public Deklariranje_promenlivaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deklariranje_promenliva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterDeklariranje_promenliva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitDeklariranje_promenliva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitDeklariranje_promenliva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deklariranje_promenlivaContext deklariranje_promenliva() throws RecognitionException {
		Deklariranje_promenlivaContext _localctx = new Deklariranje_promenlivaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_deklariranje_promenliva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); match(KW_PROMENLIVA);
			setState(197); match(ID);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(198); match(COMMA);
				setState(199); match(ID);
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inicijaliziranje_promenlivaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RoboLParser.ID, 0); }
		public TerminalNode OP_ASSIGN() { return getToken(RoboLParser.OP_ASSIGN, 0); }
		public Nasoka_promenlivaContext nasoka_promenliva() {
			return getRuleContext(Nasoka_promenlivaContext.class,0);
		}
		public Broj_promenlivaContext broj_promenliva() {
			return getRuleContext(Broj_promenlivaContext.class,0);
		}
		public Inicijaliziranje_promenlivaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicijaliziranje_promenliva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterInicijaliziranje_promenliva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitInicijaliziranje_promenliva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitInicijaliziranje_promenliva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inicijaliziranje_promenlivaContext inicijaliziranje_promenliva() throws RecognitionException {
		Inicijaliziranje_promenlivaContext _localctx = new Inicijaliziranje_promenlivaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_inicijaliziranje_promenliva);
		try {
			setState(211);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205); match(ID);
				setState(206); match(OP_ASSIGN);
				setState(207); broj_promenliva();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208); match(ID);
				setState(209); match(OP_ASSIGN);
				setState(210); nasoka_promenliva();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Azururanje_promenlivaContext extends ParserRuleContext {
		public IzrazContext izraz() {
			return getRuleContext(IzrazContext.class,0);
		}
		public TerminalNode ID() { return getToken(RoboLParser.ID, 0); }
		public TerminalNode OP_ASSIGN() { return getToken(RoboLParser.OP_ASSIGN, 0); }
		public Azururanje_promenlivaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_azururanje_promenliva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterAzururanje_promenliva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitAzururanje_promenliva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitAzururanje_promenliva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Azururanje_promenlivaContext azururanje_promenliva() throws RecognitionException {
		Azururanje_promenlivaContext _localctx = new Azururanje_promenlivaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_azururanje_promenliva);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); match(ID);
			setState(214); match(OP_ASSIGN);
			setState(215); izraz();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UslovContext extends ParserRuleContext {
		public Broj_promenlivaContext broj_promenliva(int i) {
			return getRuleContext(Broj_promenlivaContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(RoboLParser.RPAREN, 0); }
		public KomparatorContext komparator() {
			return getRuleContext(KomparatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RoboLParser.LPAREN, 0); }
		public List<Broj_promenlivaContext> broj_promenliva() {
			return getRuleContexts(Broj_promenlivaContext.class);
		}
		public UslovContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uslov; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterUslov(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitUslov(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitUslov(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UslovContext uslov() throws RecognitionException {
		UslovContext _localctx = new UslovContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_uslov);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); match(LPAREN);
			setState(218); broj_promenliva();
			setState(219); komparator();
			setState(220); broj_promenliva();
			setState(221); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KomparatorContext extends ParserRuleContext {
		public TerminalNode OP_LESSEQUAL() { return getToken(RoboLParser.OP_LESSEQUAL, 0); }
		public TerminalNode OP_LESS() { return getToken(RoboLParser.OP_LESS, 0); }
		public TerminalNode OP_EQUAL() { return getToken(RoboLParser.OP_EQUAL, 0); }
		public TerminalNode OP_GREATER() { return getToken(RoboLParser.OP_GREATER, 0); }
		public TerminalNode OP_NOTEQUAL() { return getToken(RoboLParser.OP_NOTEQUAL, 0); }
		public TerminalNode OP_GREATEREQUAL() { return getToken(RoboLParser.OP_GREATEREQUAL, 0); }
		public KomparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_komparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterKomparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitKomparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitKomparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KomparatorContext komparator() throws RecognitionException {
		KomparatorContext _localctx = new KomparatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_komparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_EQUAL) | (1L << OP_NOTEQUAL) | (1L << OP_GREATER) | (1L << OP_LESS) | (1L << OP_GREATEREQUAL) | (1L << OP_LESSEQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode OP_MULTIPLY() { return getToken(RoboLParser.OP_MULTIPLY, 0); }
		public TerminalNode OP_ADD() { return getToken(RoboLParser.OP_ADD, 0); }
		public TerminalNode OP_DIVIDE() { return getToken(RoboLParser.OP_DIVIDE, 0); }
		public TerminalNode OP_MINUS() { return getToken(RoboLParser.OP_MINUS, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_ADD) | (1L << OP_MINUS) | (1L << OP_MULTIPLY) | (1L << OP_DIVIDE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KomandaContext extends ParserRuleContext {
		public Komanda_povtoruvajContext komanda_povtoruvaj() {
			return getRuleContext(Komanda_povtoruvajContext.class,0);
		}
		public TerminalNode KW_ODI() { return getToken(RoboLParser.KW_ODI, 0); }
		public TerminalNode KW_LEVO() { return getToken(RoboLParser.KW_LEVO, 0); }
		public Komanda_kontrolaContext komanda_kontrola() {
			return getRuleContext(Komanda_kontrolaContext.class,0);
		}
		public TerminalNode KW_ZEMI() { return getToken(RoboLParser.KW_ZEMI, 0); }
		public TerminalNode KW_DESNO() { return getToken(RoboLParser.KW_DESNO, 0); }
		public TerminalNode KW_OSTAVI() { return getToken(RoboLParser.KW_OSTAVI, 0); }
		public Povik_proceduraContext povik_procedura() {
			return getRuleContext(Povik_proceduraContext.class,0);
		}
		public KomandaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_komanda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterKomanda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitKomanda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitKomanda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KomandaContext komanda() throws RecognitionException {
		KomandaContext _localctx = new KomandaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_komanda);
		try {
			setState(235);
			switch (_input.LA(1)) {
			case KW_AKO:
				enterOuterAlt(_localctx, 1);
				{
				setState(227); komanda_kontrola();
				}
				break;
			case KW_POVTORUVAJ:
				enterOuterAlt(_localctx, 2);
				{
				setState(228); komanda_povtoruvaj();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(229); povik_procedura();
				}
				break;
			case KW_ODI:
				enterOuterAlt(_localctx, 4);
				{
				setState(230); match(KW_ODI);
				}
				break;
			case KW_LEVO:
				enterOuterAlt(_localctx, 5);
				{
				setState(231); match(KW_LEVO);
				}
				break;
			case KW_DESNO:
				enterOuterAlt(_localctx, 6);
				{
				setState(232); match(KW_DESNO);
				}
				break;
			case KW_ZEMI:
				enterOuterAlt(_localctx, 7);
				{
				setState(233); match(KW_ZEMI);
				}
				break;
			case KW_OSTAVI:
				enterOuterAlt(_localctx, 8);
				{
				setState(234); match(KW_OSTAVI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Komanda_siteContext extends ParserRuleContext {
		public Deklariranje_promenlivaContext deklariranje_promenliva() {
			return getRuleContext(Deklariranje_promenlivaContext.class,0);
		}
		public Azururanje_promenlivaContext azururanje_promenliva() {
			return getRuleContext(Azururanje_promenlivaContext.class,0);
		}
		public Inicijaliziranje_promenlivaContext inicijaliziranje_promenliva() {
			return getRuleContext(Inicijaliziranje_promenlivaContext.class,0);
		}
		public KomandaContext komanda() {
			return getRuleContext(KomandaContext.class,0);
		}
		public Komanda_siteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_komanda_site; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterKomanda_site(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitKomanda_site(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitKomanda_site(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Komanda_siteContext komanda_site() throws RecognitionException {
		Komanda_siteContext _localctx = new Komanda_siteContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_komanda_site);
		try {
			setState(241);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237); komanda();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238); deklariranje_promenliva();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239); inicijaliziranje_promenliva();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(240); azururanje_promenliva();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Komanda_vgnezdenaContext extends ParserRuleContext {
		public Azururanje_promenlivaContext azururanje_promenliva() {
			return getRuleContext(Azururanje_promenlivaContext.class,0);
		}
		public Inicijaliziranje_promenlivaContext inicijaliziranje_promenliva() {
			return getRuleContext(Inicijaliziranje_promenlivaContext.class,0);
		}
		public KomandaContext komanda() {
			return getRuleContext(KomandaContext.class,0);
		}
		public Komanda_vgnezdenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_komanda_vgnezdena; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterKomanda_vgnezdena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitKomanda_vgnezdena(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitKomanda_vgnezdena(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Komanda_vgnezdenaContext komanda_vgnezdena() throws RecognitionException {
		Komanda_vgnezdenaContext _localctx = new Komanda_vgnezdenaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_komanda_vgnezdena);
		try {
			setState(246);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243); komanda();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244); inicijaliziranje_promenliva();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(245); azururanje_promenliva();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Komanda_kontrolaContext extends ParserRuleContext {
		public Ako_uslov_blockContext ako_uslov_block() {
			return getRuleContext(Ako_uslov_blockContext.class,0);
		}
		public Ako_zid_blockContext ako_zid_block() {
			return getRuleContext(Ako_zid_blockContext.class,0);
		}
		public Ako_nasoka_blockContext ako_nasoka_block() {
			return getRuleContext(Ako_nasoka_blockContext.class,0);
		}
		public Ako_zeton_blockContext ako_zeton_block() {
			return getRuleContext(Ako_zeton_blockContext.class,0);
		}
		public Komanda_kontrolaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_komanda_kontrola; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterKomanda_kontrola(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitKomanda_kontrola(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitKomanda_kontrola(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Komanda_kontrolaContext komanda_kontrola() throws RecognitionException {
		Komanda_kontrolaContext _localctx = new Komanda_kontrolaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_komanda_kontrola);
		try {
			setState(252);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248); ako_zeton_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249); ako_zid_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250); ako_nasoka_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(251); ako_uslov_block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ako_zeton_blockContext extends ParserRuleContext {
		public TerminalNode EXCLAMATION(int i) {
			return getToken(RoboLParser.EXCLAMATION, i);
		}
		public List<Komanda_vgnezdenaContext> komanda_vgnezdena() {
			return getRuleContexts(Komanda_vgnezdenaContext.class);
		}
		public Komanda_vgnezdenaContext komanda_vgnezdena(int i) {
			return getRuleContext(Komanda_vgnezdenaContext.class,i);
		}
		public List<TerminalNode> EXCLAMATION() { return getTokens(RoboLParser.EXCLAMATION); }
		public TerminalNode KW_ZHETON() { return getToken(RoboLParser.KW_ZHETON, 0); }
		public TerminalNode KW_AKO() { return getToken(RoboLParser.KW_AKO, 0); }
		public Ako_zeton_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ako_zeton_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterAko_zeton_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitAko_zeton_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitAko_zeton_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ako_zeton_blockContext ako_zeton_block() throws RecognitionException {
		Ako_zeton_blockContext _localctx = new Ako_zeton_blockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ako_zeton_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); match(KW_AKO);
			setState(255); match(KW_ZHETON);
			setState(256); match(EXCLAMATION);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ODI) | (1L << KW_LEVO) | (1L << KW_DESNO) | (1L << KW_ZEMI) | (1L << KW_OSTAVI) | (1L << KW_AKO) | (1L << KW_POVTORUVAJ) | (1L << ID))) != 0)) {
				{
				{
				setState(257); komanda_vgnezdena();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263); match(EXCLAMATION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ako_zid_blockContext extends ParserRuleContext {
		public TerminalNode EXCLAMATION(int i) {
			return getToken(RoboLParser.EXCLAMATION, i);
		}
		public List<Komanda_vgnezdenaContext> komanda_vgnezdena() {
			return getRuleContexts(Komanda_vgnezdenaContext.class);
		}
		public TerminalNode KW_DZID() { return getToken(RoboLParser.KW_DZID, 0); }
		public Komanda_vgnezdenaContext komanda_vgnezdena(int i) {
			return getRuleContext(Komanda_vgnezdenaContext.class,i);
		}
		public List<TerminalNode> EXCLAMATION() { return getTokens(RoboLParser.EXCLAMATION); }
		public TerminalNode KW_AKO() { return getToken(RoboLParser.KW_AKO, 0); }
		public Ako_zid_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ako_zid_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterAko_zid_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitAko_zid_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitAko_zid_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ako_zid_blockContext ako_zid_block() throws RecognitionException {
		Ako_zid_blockContext _localctx = new Ako_zid_blockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ako_zid_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265); match(KW_AKO);
			setState(266); match(KW_DZID);
			setState(267); match(EXCLAMATION);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ODI) | (1L << KW_LEVO) | (1L << KW_DESNO) | (1L << KW_ZEMI) | (1L << KW_OSTAVI) | (1L << KW_AKO) | (1L << KW_POVTORUVAJ) | (1L << ID))) != 0)) {
				{
				{
				setState(268); komanda_vgnezdena();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274); match(EXCLAMATION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ako_nasoka_blockContext extends ParserRuleContext {
		public TerminalNode EXCLAMATION(int i) {
			return getToken(RoboLParser.EXCLAMATION, i);
		}
		public List<Komanda_vgnezdenaContext> komanda_vgnezdena() {
			return getRuleContexts(Komanda_vgnezdenaContext.class);
		}
		public Komanda_vgnezdenaContext komanda_vgnezdena(int i) {
			return getRuleContext(Komanda_vgnezdenaContext.class,i);
		}
		public List<TerminalNode> EXCLAMATION() { return getTokens(RoboLParser.EXCLAMATION); }
		public TerminalNode KW_AKO() { return getToken(RoboLParser.KW_AKO, 0); }
		public Nasoka_promenlivaContext nasoka_promenliva() {
			return getRuleContext(Nasoka_promenlivaContext.class,0);
		}
		public Ako_nasoka_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ako_nasoka_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterAko_nasoka_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitAko_nasoka_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitAko_nasoka_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ako_nasoka_blockContext ako_nasoka_block() throws RecognitionException {
		Ako_nasoka_blockContext _localctx = new Ako_nasoka_blockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ako_nasoka_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276); match(KW_AKO);
			setState(277); nasoka_promenliva();
			setState(278); match(EXCLAMATION);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ODI) | (1L << KW_LEVO) | (1L << KW_DESNO) | (1L << KW_ZEMI) | (1L << KW_OSTAVI) | (1L << KW_AKO) | (1L << KW_POVTORUVAJ) | (1L << ID))) != 0)) {
				{
				{
				setState(279); komanda_vgnezdena();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285); match(EXCLAMATION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ako_uslov_blockContext extends ParserRuleContext {
		public TerminalNode EXCLAMATION(int i) {
			return getToken(RoboLParser.EXCLAMATION, i);
		}
		public List<Komanda_vgnezdenaContext> komanda_vgnezdena() {
			return getRuleContexts(Komanda_vgnezdenaContext.class);
		}
		public Komanda_vgnezdenaContext komanda_vgnezdena(int i) {
			return getRuleContext(Komanda_vgnezdenaContext.class,i);
		}
		public List<TerminalNode> EXCLAMATION() { return getTokens(RoboLParser.EXCLAMATION); }
		public TerminalNode KW_AKO() { return getToken(RoboLParser.KW_AKO, 0); }
		public UslovContext uslov() {
			return getRuleContext(UslovContext.class,0);
		}
		public Ako_uslov_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ako_uslov_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterAko_uslov_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitAko_uslov_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitAko_uslov_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ako_uslov_blockContext ako_uslov_block() throws RecognitionException {
		Ako_uslov_blockContext _localctx = new Ako_uslov_blockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ako_uslov_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287); match(KW_AKO);
			setState(288); uslov();
			setState(289); match(EXCLAMATION);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ODI) | (1L << KW_LEVO) | (1L << KW_DESNO) | (1L << KW_ZEMI) | (1L << KW_OSTAVI) | (1L << KW_AKO) | (1L << KW_POVTORUVAJ) | (1L << ID))) != 0)) {
				{
				{
				setState(290); komanda_vgnezdena();
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296); match(EXCLAMATION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Komanda_povtoruvajContext extends ParserRuleContext {
		public Povtoruvaj_do_nasoka_blockContext povtoruvaj_do_nasoka_block() {
			return getRuleContext(Povtoruvaj_do_nasoka_blockContext.class,0);
		}
		public Povtoruvaj_do_zid_blockContext povtoruvaj_do_zid_block() {
			return getRuleContext(Povtoruvaj_do_zid_blockContext.class,0);
		}
		public Povtoruvaj_broj_pati_blockContext povtoruvaj_broj_pati_block() {
			return getRuleContext(Povtoruvaj_broj_pati_blockContext.class,0);
		}
		public Povtoruvaj_do_uslov_blockContext povtoruvaj_do_uslov_block() {
			return getRuleContext(Povtoruvaj_do_uslov_blockContext.class,0);
		}
		public Povtoruvaj_do_zeton_blockContext povtoruvaj_do_zeton_block() {
			return getRuleContext(Povtoruvaj_do_zeton_blockContext.class,0);
		}
		public Komanda_povtoruvajContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_komanda_povtoruvaj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterKomanda_povtoruvaj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitKomanda_povtoruvaj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitKomanda_povtoruvaj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Komanda_povtoruvajContext komanda_povtoruvaj() throws RecognitionException {
		Komanda_povtoruvajContext _localctx = new Komanda_povtoruvajContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_komanda_povtoruvaj);
		try {
			setState(303);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298); povtoruvaj_broj_pati_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299); povtoruvaj_do_zeton_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(300); povtoruvaj_do_zid_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(301); povtoruvaj_do_nasoka_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(302); povtoruvaj_do_uslov_block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Povtoruvaj_broj_pati_blockContext extends ParserRuleContext {
		public TerminalNode EXCLAMATION(int i) {
			return getToken(RoboLParser.EXCLAMATION, i);
		}
		public TerminalNode KW_POVTORUVAJ() { return getToken(RoboLParser.KW_POVTORUVAJ, 0); }
		public List<Komanda_vgnezdenaContext> komanda_vgnezdena() {
			return getRuleContexts(Komanda_vgnezdenaContext.class);
		}
		public TerminalNode KW_PATI() { return getToken(RoboLParser.KW_PATI, 0); }
		public Komanda_vgnezdenaContext komanda_vgnezdena(int i) {
			return getRuleContext(Komanda_vgnezdenaContext.class,i);
		}
		public List<TerminalNode> EXCLAMATION() { return getTokens(RoboLParser.EXCLAMATION); }
		public TerminalNode COLON() { return getToken(RoboLParser.COLON, 0); }
		public Broj_promenlivaContext broj_promenliva() {
			return getRuleContext(Broj_promenlivaContext.class,0);
		}
		public Povtoruvaj_broj_pati_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_povtoruvaj_broj_pati_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterPovtoruvaj_broj_pati_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitPovtoruvaj_broj_pati_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitPovtoruvaj_broj_pati_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Povtoruvaj_broj_pati_blockContext povtoruvaj_broj_pati_block() throws RecognitionException {
		Povtoruvaj_broj_pati_blockContext _localctx = new Povtoruvaj_broj_pati_blockContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_povtoruvaj_broj_pati_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305); match(KW_POVTORUVAJ);
			setState(306); broj_promenliva();
			setState(307); match(KW_PATI);
			setState(308); match(COLON);
			setState(309); match(EXCLAMATION);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ODI) | (1L << KW_LEVO) | (1L << KW_DESNO) | (1L << KW_ZEMI) | (1L << KW_OSTAVI) | (1L << KW_AKO) | (1L << KW_POVTORUVAJ) | (1L << ID))) != 0)) {
				{
				{
				setState(310); komanda_vgnezdena();
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(316); match(EXCLAMATION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Povtoruvaj_do_zeton_blockContext extends ParserRuleContext {
		public TerminalNode EXCLAMATION(int i) {
			return getToken(RoboLParser.EXCLAMATION, i);
		}
		public TerminalNode KW_DO() { return getToken(RoboLParser.KW_DO, 0); }
		public TerminalNode KW_POVTORUVAJ() { return getToken(RoboLParser.KW_POVTORUVAJ, 0); }
		public List<Komanda_vgnezdenaContext> komanda_vgnezdena() {
			return getRuleContexts(Komanda_vgnezdenaContext.class);
		}
		public Komanda_vgnezdenaContext komanda_vgnezdena(int i) {
			return getRuleContext(Komanda_vgnezdenaContext.class,i);
		}
		public List<TerminalNode> EXCLAMATION() { return getTokens(RoboLParser.EXCLAMATION); }
		public TerminalNode KW_ZHETON() { return getToken(RoboLParser.KW_ZHETON, 0); }
		public TerminalNode COLON() { return getToken(RoboLParser.COLON, 0); }
		public Povtoruvaj_do_zeton_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_povtoruvaj_do_zeton_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterPovtoruvaj_do_zeton_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitPovtoruvaj_do_zeton_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitPovtoruvaj_do_zeton_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Povtoruvaj_do_zeton_blockContext povtoruvaj_do_zeton_block() throws RecognitionException {
		Povtoruvaj_do_zeton_blockContext _localctx = new Povtoruvaj_do_zeton_blockContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_povtoruvaj_do_zeton_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318); match(KW_POVTORUVAJ);
			setState(319); match(KW_DO);
			setState(320); match(KW_ZHETON);
			setState(321); match(COLON);
			setState(322); match(EXCLAMATION);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ODI) | (1L << KW_LEVO) | (1L << KW_DESNO) | (1L << KW_ZEMI) | (1L << KW_OSTAVI) | (1L << KW_AKO) | (1L << KW_POVTORUVAJ) | (1L << ID))) != 0)) {
				{
				{
				setState(323); komanda_vgnezdena();
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329); match(EXCLAMATION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Povtoruvaj_do_zid_blockContext extends ParserRuleContext {
		public TerminalNode EXCLAMATION(int i) {
			return getToken(RoboLParser.EXCLAMATION, i);
		}
		public TerminalNode KW_DO() { return getToken(RoboLParser.KW_DO, 0); }
		public TerminalNode KW_POVTORUVAJ() { return getToken(RoboLParser.KW_POVTORUVAJ, 0); }
		public List<Komanda_vgnezdenaContext> komanda_vgnezdena() {
			return getRuleContexts(Komanda_vgnezdenaContext.class);
		}
		public TerminalNode KW_DZID() { return getToken(RoboLParser.KW_DZID, 0); }
		public Komanda_vgnezdenaContext komanda_vgnezdena(int i) {
			return getRuleContext(Komanda_vgnezdenaContext.class,i);
		}
		public List<TerminalNode> EXCLAMATION() { return getTokens(RoboLParser.EXCLAMATION); }
		public TerminalNode COLON() { return getToken(RoboLParser.COLON, 0); }
		public Povtoruvaj_do_zid_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_povtoruvaj_do_zid_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterPovtoruvaj_do_zid_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitPovtoruvaj_do_zid_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitPovtoruvaj_do_zid_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Povtoruvaj_do_zid_blockContext povtoruvaj_do_zid_block() throws RecognitionException {
		Povtoruvaj_do_zid_blockContext _localctx = new Povtoruvaj_do_zid_blockContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_povtoruvaj_do_zid_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331); match(KW_POVTORUVAJ);
			setState(332); match(KW_DO);
			setState(333); match(KW_DZID);
			setState(334); match(COLON);
			setState(335); match(EXCLAMATION);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ODI) | (1L << KW_LEVO) | (1L << KW_DESNO) | (1L << KW_ZEMI) | (1L << KW_OSTAVI) | (1L << KW_AKO) | (1L << KW_POVTORUVAJ) | (1L << ID))) != 0)) {
				{
				{
				setState(336); komanda_vgnezdena();
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342); match(EXCLAMATION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Povtoruvaj_do_nasoka_blockContext extends ParserRuleContext {
		public TerminalNode EXCLAMATION(int i) {
			return getToken(RoboLParser.EXCLAMATION, i);
		}
		public TerminalNode KW_DO() { return getToken(RoboLParser.KW_DO, 0); }
		public TerminalNode KW_POVTORUVAJ() { return getToken(RoboLParser.KW_POVTORUVAJ, 0); }
		public List<Komanda_vgnezdenaContext> komanda_vgnezdena() {
			return getRuleContexts(Komanda_vgnezdenaContext.class);
		}
		public Komanda_vgnezdenaContext komanda_vgnezdena(int i) {
			return getRuleContext(Komanda_vgnezdenaContext.class,i);
		}
		public List<TerminalNode> EXCLAMATION() { return getTokens(RoboLParser.EXCLAMATION); }
		public TerminalNode COLON() { return getToken(RoboLParser.COLON, 0); }
		public Nasoka_promenlivaContext nasoka_promenliva() {
			return getRuleContext(Nasoka_promenlivaContext.class,0);
		}
		public Povtoruvaj_do_nasoka_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_povtoruvaj_do_nasoka_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterPovtoruvaj_do_nasoka_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitPovtoruvaj_do_nasoka_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitPovtoruvaj_do_nasoka_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Povtoruvaj_do_nasoka_blockContext povtoruvaj_do_nasoka_block() throws RecognitionException {
		Povtoruvaj_do_nasoka_blockContext _localctx = new Povtoruvaj_do_nasoka_blockContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_povtoruvaj_do_nasoka_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344); match(KW_POVTORUVAJ);
			setState(345); match(KW_DO);
			setState(346); nasoka_promenliva();
			setState(347); match(COLON);
			setState(348); match(EXCLAMATION);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ODI) | (1L << KW_LEVO) | (1L << KW_DESNO) | (1L << KW_ZEMI) | (1L << KW_OSTAVI) | (1L << KW_AKO) | (1L << KW_POVTORUVAJ) | (1L << ID))) != 0)) {
				{
				{
				setState(349); komanda_vgnezdena();
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355); match(EXCLAMATION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Povtoruvaj_do_uslov_blockContext extends ParserRuleContext {
		public TerminalNode EXCLAMATION(int i) {
			return getToken(RoboLParser.EXCLAMATION, i);
		}
		public TerminalNode KW_DO() { return getToken(RoboLParser.KW_DO, 0); }
		public TerminalNode KW_POVTORUVAJ() { return getToken(RoboLParser.KW_POVTORUVAJ, 0); }
		public List<Komanda_vgnezdenaContext> komanda_vgnezdena() {
			return getRuleContexts(Komanda_vgnezdenaContext.class);
		}
		public Komanda_vgnezdenaContext komanda_vgnezdena(int i) {
			return getRuleContext(Komanda_vgnezdenaContext.class,i);
		}
		public List<TerminalNode> EXCLAMATION() { return getTokens(RoboLParser.EXCLAMATION); }
		public UslovContext uslov() {
			return getRuleContext(UslovContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RoboLParser.COLON, 0); }
		public Povtoruvaj_do_uslov_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_povtoruvaj_do_uslov_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterPovtoruvaj_do_uslov_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitPovtoruvaj_do_uslov_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitPovtoruvaj_do_uslov_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Povtoruvaj_do_uslov_blockContext povtoruvaj_do_uslov_block() throws RecognitionException {
		Povtoruvaj_do_uslov_blockContext _localctx = new Povtoruvaj_do_uslov_blockContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_povtoruvaj_do_uslov_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357); match(KW_POVTORUVAJ);
			setState(358); match(KW_DO);
			setState(359); uslov();
			setState(360); match(COLON);
			setState(361); match(EXCLAMATION);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ODI) | (1L << KW_LEVO) | (1L << KW_DESNO) | (1L << KW_ZEMI) | (1L << KW_OSTAVI) | (1L << KW_AKO) | (1L << KW_POVTORUVAJ) | (1L << ID))) != 0)) {
				{
				{
				setState(362); komanda_vgnezdena();
				}
				}
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(368); match(EXCLAMATION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Povik_proceduraContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RoboLParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(RoboLParser.RPAREN, 0); }
		public ParametriContext parametri() {
			return getRuleContext(ParametriContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RoboLParser.LPAREN, 0); }
		public Povik_proceduraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_povik_procedura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterPovik_procedura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitPovik_procedura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitPovik_procedura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Povik_proceduraContext povik_procedura() throws RecognitionException {
		Povik_proceduraContext _localctx = new Povik_proceduraContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_povik_procedura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370); match(ID);
			setState(371); match(LPAREN);
			setState(373);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NASOKA) | (1L << BROJ) | (1L << ID))) != 0)) {
				{
				setState(372); parametri();
				}
			}

			setState(375); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametriContext extends ParserRuleContext {
		public ParametarContext parametar(int i) {
			return getRuleContext(ParametarContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RoboLParser.COMMA); }
		public List<ParametarContext> parametar() {
			return getRuleContexts(ParametarContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(RoboLParser.COMMA, i);
		}
		public ParametriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterParametri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitParametri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitParametri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametriContext parametri() throws RecognitionException {
		ParametriContext _localctx = new ParametriContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_parametri);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377); parametar();
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(378); match(COMMA);
				setState(379); parametar();
				}
				}
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametarContext extends ParserRuleContext {
		public Nasoka_promenlivaContext nasoka_promenliva() {
			return getRuleContext(Nasoka_promenlivaContext.class,0);
		}
		public Broj_promenlivaContext broj_promenliva() {
			return getRuleContext(Broj_promenlivaContext.class,0);
		}
		public ParametarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).enterParametar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLListener ) ((RoboLListener)listener).exitParametar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLVisitor ) return ((RoboLVisitor<? extends T>)visitor).visitParametar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametarContext parametar() throws RecognitionException {
		ParametarContext _localctx = new ParametarContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_parametar);
		try {
			setState(387);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385); broj_promenliva();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386); nasoka_promenliva();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-\u0188\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\7\3W\n\3\f\3\16\3Z\13\3\3\3\3\3\3\4\3\4\5\4`\n\4\3\4\5\4c\n\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6q\n\6\f\6\16\6t\13\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\b\u0081\n\b\f\b\16\b\u0084"+
		"\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\5\13\u009a\n\13\3\13\3\13\3\13\7\13\u009f\n\13\f"+
		"\13\16\13\u00a2\13\13\3\13\3\13\3\f\3\f\3\f\7\f\u00a9\n\f\f\f\16\f\u00ac"+
		"\13\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u00b8\n\17\f"+
		"\17\16\17\u00bb\13\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\7\23\u00cb\n\23\f\23\16\23\u00ce\13\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00d6\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u00ee\n\31\3\32\3\32\3\32\3\32\5\32\u00f4\n\32\3\33\3\33\3"+
		"\33\5\33\u00f9\n\33\3\34\3\34\3\34\3\34\5\34\u00ff\n\34\3\35\3\35\3\35"+
		"\3\35\7\35\u0105\n\35\f\35\16\35\u0108\13\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\7\36\u0110\n\36\f\36\16\36\u0113\13\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\7\37\u011b\n\37\f\37\16\37\u011e\13\37\3\37\3\37\3 \3 \3 \3 \7 "+
		"\u0126\n \f \16 \u0129\13 \3 \3 \3!\3!\3!\3!\3!\5!\u0132\n!\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\7\"\u013a\n\"\f\"\16\"\u013d\13\"\3\"\3\"\3#\3#\3#\3#\3"+
		"#\3#\7#\u0147\n#\f#\16#\u014a\13#\3#\3#\3$\3$\3$\3$\3$\3$\7$\u0154\n$"+
		"\f$\16$\u0157\13$\3$\3$\3%\3%\3%\3%\3%\3%\7%\u0161\n%\f%\16%\u0164\13"+
		"%\3%\3%\3&\3&\3&\3&\3&\3&\7&\u016e\n&\f&\16&\u0171\13&\3&\3&\3\'\3\'\3"+
		"\'\5\'\u0178\n\'\3\'\3\'\3(\3(\3(\7(\u017f\n(\f(\16(\u0182\13(\3)\3)\5"+
		")\u0186\n)\3)\2\2*\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNP\2\7\3\2\n\13\3\2$%\4\2##%%\3\2\35\"\3\2\31\34\u0189"+
		"\2R\3\2\2\2\4T\3\2\2\2\6]\3\2\2\2\bf\3\2\2\2\nm\3\2\2\2\fw\3\2\2\2\16"+
		"}\3\2\2\2\20\u0087\3\2\2\2\22\u008d\3\2\2\2\24\u0095\3\2\2\2\26\u00a5"+
		"\3\2\2\2\30\u00ad\3\2\2\2\32\u00b0\3\2\2\2\34\u00b2\3\2\2\2\36\u00be\3"+
		"\2\2\2 \u00c0\3\2\2\2\"\u00c2\3\2\2\2$\u00c6\3\2\2\2&\u00d5\3\2\2\2(\u00d7"+
		"\3\2\2\2*\u00db\3\2\2\2,\u00e1\3\2\2\2.\u00e3\3\2\2\2\60\u00ed\3\2\2\2"+
		"\62\u00f3\3\2\2\2\64\u00f8\3\2\2\2\66\u00fe\3\2\2\28\u0100\3\2\2\2:\u010b"+
		"\3\2\2\2<\u0116\3\2\2\2>\u0121\3\2\2\2@\u0131\3\2\2\2B\u0133\3\2\2\2D"+
		"\u0140\3\2\2\2F\u014d\3\2\2\2H\u015a\3\2\2\2J\u0167\3\2\2\2L\u0174\3\2"+
		"\2\2N\u017b\3\2\2\2P\u0185\3\2\2\2RS\5\4\3\2S\3\3\2\2\2TX\5\6\4\2UW\5"+
		"\24\13\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2["+
		"\\\5\34\17\2\\\5\3\2\2\2]_\5\b\5\2^`\5\n\6\2_^\3\2\2\2_`\3\2\2\2`b\3\2"+
		"\2\2ac\5\16\b\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\5\22\n\2e\7\3\2\2\2fg"+
		"\7\3\2\2gh\7(\2\2hi\7$\2\2ij\7\'\2\2jk\7$\2\2kl\7)\2\2l\t\3\2\2\2mn\7"+
		"\4\2\2nr\7\5\2\2oq\5\f\7\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3"+
		"\2\2\2tr\3\2\2\2uv\7\6\2\2v\13\3\2\2\2wx\7-\2\2xy\7$\2\2yz\7$\2\2z{\7"+
		"\32\2\2{|\7$\2\2|\r\3\2\2\2}~\7\7\2\2~\u0082\7\5\2\2\177\u0081\5\20\t"+
		"\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7\6\2\2\u0086"+
		"\17\3\2\2\2\u0087\u0088\7(\2\2\u0088\u0089\7$\2\2\u0089\u008a\7\'\2\2"+
		"\u008a\u008b\7$\2\2\u008b\u008c\7)\2\2\u008c\21\3\2\2\2\u008d\u008e\7"+
		"\b\2\2\u008e\u008f\7#\2\2\u008f\u0090\7(\2\2\u0090\u0091\7$\2\2\u0091"+
		"\u0092\7\'\2\2\u0092\u0093\7$\2\2\u0093\u0094\7)\2\2\u0094\23\3\2\2\2"+
		"\u0095\u0096\7\t\2\2\u0096\u0097\7%\2\2\u0097\u0099\7(\2\2\u0098\u009a"+
		"\5\26\f\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2"+
		"\u009b\u009c\7)\2\2\u009c\u00a0\7\5\2\2\u009d\u009f\5\62\32\2\u009e\u009d"+
		"\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7\6\2\2\u00a4\25\3\2\2"+
		"\2\u00a5\u00aa\5\30\r\2\u00a6\u00a7\7\'\2\2\u00a7\u00a9\5\30\r\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\27\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\5\32\16\2\u00ae"+
		"\u00af\7%\2\2\u00af\31\3\2\2\2\u00b0\u00b1\t\2\2\2\u00b1\33\3\2\2\2\u00b2"+
		"\u00b3\7\t\2\2\u00b3\u00b4\7(\2\2\u00b4\u00b5\7)\2\2\u00b5\u00b9\7\5\2"+
		"\2\u00b6\u00b8\5\62\32\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bc\u00bd\7\6\2\2\u00bd\35\3\2\2\2\u00be\u00bf\t\3\2\2\u00bf\37"+
		"\3\2\2\2\u00c0\u00c1\t\4\2\2\u00c1!\3\2\2\2\u00c2\u00c3\5\36\20\2\u00c3"+
		"\u00c4\5.\30\2\u00c4\u00c5\5\36\20\2\u00c5#\3\2\2\2\u00c6\u00c7\7\27\2"+
		"\2\u00c7\u00cc\7%\2\2\u00c8\u00c9\7\'\2\2\u00c9\u00cb\7%\2\2\u00ca\u00c8"+
		"\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"%\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7%\2\2\u00d0\u00d1\7\30\2\2"+
		"\u00d1\u00d6\5\36\20\2\u00d2\u00d3\7%\2\2\u00d3\u00d4\7\30\2\2\u00d4\u00d6"+
		"\5 \21\2\u00d5\u00cf\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d6\'\3\2\2\2\u00d7"+
		"\u00d8\7%\2\2\u00d8\u00d9\7\30\2\2\u00d9\u00da\5\"\22\2\u00da)\3\2\2\2"+
		"\u00db\u00dc\7(\2\2\u00dc\u00dd\5\36\20\2\u00dd\u00de\5,\27\2\u00de\u00df"+
		"\5\36\20\2\u00df\u00e0\7)\2\2\u00e0+\3\2\2\2\u00e1\u00e2\t\5\2\2\u00e2"+
		"-\3\2\2\2\u00e3\u00e4\t\6\2\2\u00e4/\3\2\2\2\u00e5\u00ee\5\66\34\2\u00e6"+
		"\u00ee\5@!\2\u00e7\u00ee\5L\'\2\u00e8\u00ee\7\f\2\2\u00e9\u00ee\7\r\2"+
		"\2\u00ea\u00ee\7\16\2\2\u00eb\u00ee\7\17\2\2\u00ec\u00ee\7\20\2\2\u00ed"+
		"\u00e5\3\2\2\2\u00ed\u00e6\3\2\2\2\u00ed\u00e7\3\2\2\2\u00ed\u00e8\3\2"+
		"\2\2\u00ed\u00e9\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ec\3\2\2\2\u00ee\61\3\2\2\2\u00ef\u00f4\5\60\31\2\u00f0\u00f4\5$\23"+
		"\2\u00f1\u00f4\5&\24\2\u00f2\u00f4\5(\25\2\u00f3\u00ef\3\2\2\2\u00f3\u00f0"+
		"\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\63\3\2\2\2\u00f5"+
		"\u00f9\5\60\31\2\u00f6\u00f9\5&\24\2\u00f7\u00f9\5(\25\2\u00f8\u00f5\3"+
		"\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\65\3\2\2\2\u00fa"+
		"\u00ff\58\35\2\u00fb\u00ff\5:\36\2\u00fc\u00ff\5<\37\2\u00fd\u00ff\5>"+
		" \2\u00fe\u00fa\3\2\2\2\u00fe\u00fb\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00fd\3\2\2\2\u00ff\67\3\2\2\2\u0100\u0101\7\21\2\2\u0101\u0102\7\22"+
		"\2\2\u0102\u0106\7&\2\2\u0103\u0105\5\64\33\2\u0104\u0103\3\2\2\2\u0105"+
		"\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2"+
		"\2\2\u0108\u0106\3\2\2\2\u0109\u010a\7&\2\2\u010a9\3\2\2\2\u010b\u010c"+
		"\7\21\2\2\u010c\u010d\7\23\2\2\u010d\u0111\7&\2\2\u010e\u0110\5\64\33"+
		"\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7&\2\2\u0115"+
		";\3\2\2\2\u0116\u0117\7\21\2\2\u0117\u0118\5 \21\2\u0118\u011c\7&\2\2"+
		"\u0119\u011b\5\64\33\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f"+
		"\u0120\7&\2\2\u0120=\3\2\2\2\u0121\u0122\7\21\2\2\u0122\u0123\5*\26\2"+
		"\u0123\u0127\7&\2\2\u0124\u0126\5\64\33\2\u0125\u0124\3\2\2\2\u0126\u0129"+
		"\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u012a\u012b\7&\2\2\u012b?\3\2\2\2\u012c\u0132\5B\"\2\u012d"+
		"\u0132\5D#\2\u012e\u0132\5F$\2\u012f\u0132\5H%\2\u0130\u0132\5J&\2\u0131"+
		"\u012c\3\2\2\2\u0131\u012d\3\2\2\2\u0131\u012e\3\2\2\2\u0131\u012f\3\2"+
		"\2\2\u0131\u0130\3\2\2\2\u0132A\3\2\2\2\u0133\u0134\7\24\2\2\u0134\u0135"+
		"\5\36\20\2\u0135\u0136\7\26\2\2\u0136\u0137\7*\2\2\u0137\u013b\7&\2\2"+
		"\u0138\u013a\5\64\33\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139"+
		"\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e"+
		"\u013f\7&\2\2\u013fC\3\2\2\2\u0140\u0141\7\24\2\2\u0141\u0142\7\25\2\2"+
		"\u0142\u0143\7\22\2\2\u0143\u0144\7*\2\2\u0144\u0148\7&\2\2\u0145\u0147"+
		"\5\64\33\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2"+
		"\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c"+
		"\7&\2\2\u014cE\3\2\2\2\u014d\u014e\7\24\2\2\u014e\u014f\7\25\2\2\u014f"+
		"\u0150\7\23\2\2\u0150\u0151\7*\2\2\u0151\u0155\7&\2\2\u0152\u0154\5\64"+
		"\33\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\7&"+
		"\2\2\u0159G\3\2\2\2\u015a\u015b\7\24\2\2\u015b\u015c\7\25\2\2\u015c\u015d"+
		"\5 \21\2\u015d\u015e\7*\2\2\u015e\u0162\7&\2\2\u015f\u0161\5\64\33\2\u0160"+
		"\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2"+
		"\2\2\u0163\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166\7&\2\2\u0166"+
		"I\3\2\2\2\u0167\u0168\7\24\2\2\u0168\u0169\7\25\2\2\u0169\u016a\5*\26"+
		"\2\u016a\u016b\7*\2\2\u016b\u016f\7&\2\2\u016c\u016e\5\64\33\2\u016d\u016c"+
		"\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u0172\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0173\7&\2\2\u0173K\3\2\2\2\u0174"+
		"\u0175\7%\2\2\u0175\u0177\7(\2\2\u0176\u0178\5N(\2\u0177\u0176\3\2\2\2"+
		"\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\7)\2\2\u017aM\3\2"+
		"\2\2\u017b\u0180\5P)\2\u017c\u017d\7\'\2\2\u017d\u017f\5P)\2\u017e\u017c"+
		"\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"O\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0186\5\36\20\2\u0184\u0186\5 \21"+
		"\2\u0185\u0183\3\2\2\2\u0185\u0184\3\2\2\2\u0186Q\3\2\2\2\36X_br\u0082"+
		"\u0099\u00a0\u00aa\u00b9\u00cc\u00d5\u00ed\u00f3\u00f8\u00fe\u0106\u0111"+
		"\u011c\u0127\u0131\u013b\u0148\u0155\u0162\u016f\u0177\u0180\u0185";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}