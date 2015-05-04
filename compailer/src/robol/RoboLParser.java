package robol;

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
		ID_ERROR=41, ERROR=42;
	public static final String[] tokenNames = {
		"<INVALID>", "KW_OKOLINA", "KW_OKOLINA_DZID", "KW_POCHETOK", "KW_KRAJ", 
		"KW_OKOLINA_ZHETON", "KW_ROBOT", "KW_PROCEDURA", "KW_BROJ", "KW_NASOKA", 
		"KW_ODI", "KW_LEVO", "KW_DESNO", "KW_ZEMI", "KW_OSTAVI", "KW_AKO", "KW_ZHETON", 
		"KW_DZID", "KW_POVTORUVAJ", "KW_DO", "KW_PATI", "KW_PROMENLIVA", "OP_ASSIGN", 
		"OP_ADD", "OP_MINUS", "OP_MULTIPLY", "OP_DIVIDE", "OP_EQUAL", "OP_NOTEQUAL", 
		"OP_GREATER", "OP_LESS", "OP_GREATEREQUAL", "OP_LESSEQUAL", "NASOKA", 
		"BROJ", "ID", "EXCLAMATION", "COMMA", "LPAREN", "RPAREN", "COLON", "ID_ERROR", 
		"ERROR"
	};
	public static final int
		RULE_start = 0, RULE_definiranje_okolina_block = 1, RULE_okolina_block = 2;
	public static final String[] ruleNames = {
		"start", "definiranje_okolina_block", "okolina_block"
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
		public Definiranje_okolina_blockContext definiranje_okolina_block() {
			return getRuleContext(Definiranje_okolina_blockContext.class,0);
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
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6); definiranje_okolina_block();
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
	}

	public final Definiranje_okolina_blockContext definiranje_okolina_block() throws RecognitionException {
		Definiranje_okolina_blockContext _localctx = new Definiranje_okolina_blockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definiranje_okolina_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8); okolina_block();
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
	}

	public final Okolina_blockContext okolina_block() throws RecognitionException {
		Okolina_blockContext _localctx = new Okolina_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_okolina_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10); match(KW_OKOLINA);
			setState(11); match(LPAREN);
			setState(12); match(BROJ);
			setState(13); match(COMMA);
			setState(14); match(BROJ);
			setState(15); match(RPAREN);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\24\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\2\2\5\2\4\6"+
		"\2\2\20\2\b\3\2\2\2\4\n\3\2\2\2\6\f\3\2\2\2\b\t\5\4\3\2\t\3\3\2\2\2\n"+
		"\13\5\6\4\2\13\5\3\2\2\2\f\r\7\3\2\2\r\16\7(\2\2\16\17\7$\2\2\17\20\7"+
		"\'\2\2\20\21\7$\2\2\21\22\7)\2\2\22\7\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}