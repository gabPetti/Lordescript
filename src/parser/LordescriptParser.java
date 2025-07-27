// Generated from Lordescript.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LordescriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, BLOCK=7, CMD=8, CMD_READ=9, 
		CMD_WRITE=10, CMD_ASSIGN=11, SERA=12, CMD_LOGIC=13, COMMENT=14, IF=15, 
		HIPOTESE=16, ELIF=17, ELSE=18, CONTRARIO=19, LOGO=20, WHILE=21, DO_WHILE=22, 
		COMPARE=23, TYPE=24, FRACIONARIO=25, ID=26, VALUE=27, STRING=28, BOOL=29, 
		INTEGER=30, FLOAT=31, EXPR=32, T=33, F=34, PLUS=35, MINUS=36, MULT=37, 
		DIV=38, ABRE_P=39, FECHA_P=40, SEMICOLON=41, COLON=42, COMMA=43, DOT=44, 
		WS=45;
	public static final int
		RULE_prog = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Caro'", "'compilador'", "'Assinado'", "'com'", "'distin\\u00E7\\u00E3o'", 
			"'Lordescript'", null, null, null, null, null, "'ser\\u00E1'", null, 
			null, null, "'hip\\u00F3tese'", null, null, "'contr\\u00E1rio'", "'logo'", 
			null, null, null, null, "'fracion\\u00E1rio'", null, null, null, null, 
			null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'('", "')'", 
			"';'", "':'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "BLOCK", "CMD", "CMD_READ", 
			"CMD_WRITE", "CMD_ASSIGN", "SERA", "CMD_LOGIC", "COMMENT", "IF", "HIPOTESE", 
			"ELIF", "ELSE", "CONTRARIO", "LOGO", "WHILE", "DO_WHILE", "COMPARE", 
			"TYPE", "FRACIONARIO", "ID", "VALUE", "STRING", "BOOL", "INTEGER", "FLOAT", 
			"EXPR", "T", "F", "PLUS", "MINUS", "MULT", "DIV", "ABRE_P", "FECHA_P", 
			"SEMICOLON", "COLON", "COMMA", "DOT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Lordescript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LordescriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(LordescriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LordescriptParser.COMMA, i);
		}
		public TerminalNode BLOCK() { return getToken(LordescriptParser.BLOCK, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LordescriptVisitor ) return ((LordescriptVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(T__0);
			setState(3);
			match(T__1);
			setState(4);
			match(COMMA);
			setState(6);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BLOCK) {
				{
				setState(5);
				match(BLOCK);
				}
			}

			setState(8);
			match(T__2);
			setState(9);
			match(T__3);
			setState(10);
			match(T__4);
			setState(11);
			match(COMMA);
			setState(12);
			match(T__5);
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
		"\u0004\u0001-\u000f\u0002\u0000\u0007\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\u0007\b\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001"+
		"\u0000\u0000\u0000\u000e\u0000\u0002\u0001\u0000\u0000\u0000\u0002\u0003"+
		"\u0005\u0001\u0000\u0000\u0003\u0004\u0005\u0002\u0000\u0000\u0004\u0006"+
		"\u0005+\u0000\u0000\u0005\u0007\u0005\u0007\u0000\u0000\u0006\u0005\u0001"+
		"\u0000\u0000\u0000\u0006\u0007\u0001\u0000\u0000\u0000\u0007\b\u0001\u0000"+
		"\u0000\u0000\b\t\u0005\u0003\u0000\u0000\t\n\u0005\u0004\u0000\u0000\n"+
		"\u000b\u0005\u0005\u0000\u0000\u000b\f\u0005+\u0000\u0000\f\r\u0005\u0006"+
		"\u0000\u0000\r\u0001\u0001\u0000\u0000\u0000\u0001\u0006";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}