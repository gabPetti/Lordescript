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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, ESCREVO=30, SERA=31, 
		COMMENT=32, HIPOTESE=33, CONTRARIO=34, LOGO=35, COMPARE=36, DUAL=37, PERGAMINHO=38, 
		INTEIRO=39, FRACIONARIO=40, CAPITULAR=41, ID=42, VALUE=43, STRING=44, 
		BOOL=45, INTEGER=46, FLOAT=47, EXPR=48, T=49, F=50, PLUS=51, MINUS=52, 
		MULT=53, DIV=54, ABRE_P=55, FECHA_P=56, SEMICOLON=57, COLON=58, COMMA=59, 
		DOT=60, WS=61;
	public static final int
		RULE_prog = 0, RULE_block = 1, RULE_cmd = 2, RULE_cmdRead = 3, RULE_cmdWrite = 4, 
		RULE_cmd_assign = 5, RULE_cmdLogic = 6, RULE_if_stmt = 7, RULE_elif_stmt = 8, 
		RULE_else_stmt = 9, RULE_while = 10, RULE_do_while = 11, RULE_type = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "block", "cmd", "cmdRead", "cmdWrite", "cmd_assign", "cmdLogic", 
			"if_stmt", "elif_stmt", "else_stmt", "while", "do_while", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Caro'", "'compilador'", "'Assinado'", "'com'", "'distin\\u00E7\\u00E3o'", 
			"'Lordescript'", "'Ordeno'", "'que'", "'mostre'", "'ao'", "'mundo'", 
			"'o'", "'valor de'", "'Declaro'", "'agraciado'", "'valor'", "'Se'", "'porventura'", 
			"'Assim'", "'finaliza-se'", "'a'", "'Contudo'", "'se'", "'Caso'", "'Enquanto'", 
			"', logo:'", "'e repita at\\u00E9 que a condi\\u00E7\\u00E3o n\\u00E3o seja mais verdadeira;'", 
			"'Seria conveniente que as seguintes medidas sejam tomadas:'", "'Enquanto '", 
			null, "'ser\\u00E1'", null, "'hip\\u00F3tese'", "'contr\\u00E1rio'", 
			"'logo'", null, "'dual'", "'pergaminho'", "'inteiro'", "'fracion\\u00E1rio'", 
			"'capitular'", null, null, null, null, null, null, null, null, null, 
			"'+'", "'-'", "'*'", "'/'", "'('", "')'", "';'", "':'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "ESCREVO", "SERA", "COMMENT", "HIPOTESE", 
			"CONTRARIO", "LOGO", "COMPARE", "DUAL", "PERGAMINHO", "INTEIRO", "FRACIONARIO", 
			"CAPITULAR", "ID", "VALUE", "STRING", "BOOL", "INTEGER", "FLOAT", "EXPR", 
			"T", "F", "PLUS", "MINUS", "MULT", "DIV", "ABRE_P", "FECHA_P", "SEMICOLON", 
			"COLON", "COMMA", "DOT", "WS"
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
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
			setState(26);
			match(T__0);
			setState(27);
			match(T__1);
			setState(28);
			match(COMMA);
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13195213422720L) != 0)) {
				{
				setState(29);
				block();
				}
			}

			setState(32);
			match(T__2);
			setState(33);
			match(T__3);
			setState(34);
			match(T__4);
			setState(35);
			match(COMMA);
			setState(36);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LordescriptVisitor ) return ((LordescriptVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				cmd();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 13195213422720L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdContext extends ParserRuleContext {
		public CmdReadContext cmdRead() {
			return getRuleContext(CmdReadContext.class,0);
		}
		public CmdLogicContext cmdLogic() {
			return getRuleContext(CmdLogicContext.class,0);
		}
		public CmdWriteContext cmdWrite() {
			return getRuleContext(CmdWriteContext.class,0);
		}
		public Cmd_assignContext cmd_assign() {
			return getRuleContext(Cmd_assignContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LordescriptVisitor ) return ((LordescriptVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cmd);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				cmdRead();
				}
				break;
			case ID:
			case VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				cmdLogic();
				}
				break;
			case ESCREVO:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				cmdWrite();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				cmd_assign();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				if_stmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdReadContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LordescriptParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(LordescriptParser.SEMICOLON, 0); }
		public CmdReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).enterCmdRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).exitCmdRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LordescriptVisitor ) return ((LordescriptVisitor<? extends T>)visitor).visitCmdRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdReadContext cmdRead() throws RecognitionException {
		CmdReadContext _localctx = new CmdReadContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cmdRead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__6);
			setState(51);
			match(T__7);
			setState(52);
			match(T__8);
			setState(53);
			match(T__9);
			setState(54);
			match(T__10);
			setState(55);
			match(T__11);
			setState(56);
			match(T__12);
			setState(57);
			match(ID);
			setState(58);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdWriteContext extends ParserRuleContext {
		public TerminalNode ESCREVO() { return getToken(LordescriptParser.ESCREVO, 0); }
		public TerminalNode ID() { return getToken(LordescriptParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(LordescriptParser.SEMICOLON, 0); }
		public CmdWriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWrite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).enterCmdWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).exitCmdWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LordescriptVisitor ) return ((LordescriptVisitor<? extends T>)visitor).visitCmdWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdWriteContext cmdWrite() throws RecognitionException {
		CmdWriteContext _localctx = new CmdWriteContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cmdWrite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(ESCREVO);
			setState(61);
			match(ID);
			setState(62);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Cmd_assignContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LordescriptParser.ID, 0); }
		public TerminalNode SERA() { return getToken(LordescriptParser.SERA, 0); }
		public TerminalNode VALUE() { return getToken(LordescriptParser.VALUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(LordescriptParser.SEMICOLON, 0); }
		public Cmd_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).enterCmd_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).exitCmd_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LordescriptVisitor ) return ((LordescriptVisitor<? extends T>)visitor).visitCmd_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_assignContext cmd_assign() throws RecognitionException {
		Cmd_assignContext _localctx = new Cmd_assignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmd_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__13);
			setState(65);
			match(T__7);
			setState(66);
			match(T__11);
			setState(67);
			type();
			setState(68);
			match(ID);
			setState(69);
			match(SERA);
			setState(70);
			match(T__14);
			setState(71);
			match(T__3);
			setState(72);
			match(T__11);
			setState(73);
			match(T__15);
			setState(74);
			match(VALUE);
			setState(75);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdLogicContext extends ParserRuleContext {
		public TerminalNode COMPARE() { return getToken(LordescriptParser.COMPARE, 0); }
		public List<TerminalNode> ID() { return getTokens(LordescriptParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LordescriptParser.ID, i);
		}
		public List<TerminalNode> VALUE() { return getTokens(LordescriptParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(LordescriptParser.VALUE, i);
		}
		public CmdLogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLogic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).enterCmdLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).exitCmdLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LordescriptVisitor ) return ((LordescriptVisitor<? extends T>)visitor).visitCmdLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdLogicContext cmdLogic() throws RecognitionException {
		CmdLogicContext _localctx = new CmdLogicContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdLogic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==VALUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(78);
			match(COMPARE);
			setState(79);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==VALUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_stmtContext extends ParserRuleContext {
		public CmdLogicContext cmdLogic() {
			return getRuleContext(CmdLogicContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LordescriptParser.COMMA, 0); }
		public TerminalNode LOGO() { return getToken(LordescriptParser.LOGO, 0); }
		public TerminalNode COLON() { return getToken(LordescriptParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode HIPOTESE() { return getToken(LordescriptParser.HIPOTESE, 0); }
		public TerminalNode DOT() { return getToken(LordescriptParser.DOT, 0); }
		public List<Elif_stmtContext> elif_stmt() {
			return getRuleContexts(Elif_stmtContext.class);
		}
		public Elif_stmtContext elif_stmt(int i) {
			return getRuleContext(Elif_stmtContext.class,i);
		}
		public Else_stmtContext else_stmt() {
			return getRuleContext(Else_stmtContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LordescriptVisitor ) return ((LordescriptVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__16);
			setState(82);
			match(T__17);
			setState(83);
			cmdLogic();
			setState(84);
			match(COMMA);
			setState(85);
			match(LOGO);
			setState(86);
			match(COLON);
			setState(87);
			block();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(88);
				elif_stmt();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(94);
				else_stmt();
				}
			}

			setState(97);
			match(T__18);
			setState(98);
			match(T__19);
			setState(99);
			match(T__20);
			setState(100);
			match(HIPOTESE);
			setState(101);
			match(DOT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Elif_stmtContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(LordescriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LordescriptParser.COMMA, i);
		}
		public CmdLogicContext cmdLogic() {
			return getRuleContext(CmdLogicContext.class,0);
		}
		public TerminalNode LOGO() { return getToken(LordescriptParser.LOGO, 0); }
		public TerminalNode COLON() { return getToken(LordescriptParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Elif_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).enterElif_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).exitElif_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LordescriptVisitor ) return ((LordescriptVisitor<? extends T>)visitor).visitElif_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_stmtContext elif_stmt() throws RecognitionException {
		Elif_stmtContext _localctx = new Elif_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elif_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__21);
			setState(104);
			match(COMMA);
			setState(105);
			match(T__22);
			setState(106);
			cmdLogic();
			setState(107);
			match(COMMA);
			setState(108);
			match(LOGO);
			setState(109);
			match(COLON);
			setState(110);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Else_stmtContext extends ParserRuleContext {
		public TerminalNode CONTRARIO() { return getToken(LordescriptParser.CONTRARIO, 0); }
		public TerminalNode COLON() { return getToken(LordescriptParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).enterElse_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).exitElse_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LordescriptVisitor ) return ((LordescriptVisitor<? extends T>)visitor).visitElse_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_stmtContext else_stmt() throws RecognitionException {
		Else_stmtContext _localctx = new Else_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_else_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__23);
			setState(113);
			match(CONTRARIO);
			setState(114);
			match(COLON);
			setState(115);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public CmdLogicContext cmdLogic() {
			return getRuleContext(CmdLogicContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LordescriptVisitor ) return ((LordescriptVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__24);
			setState(118);
			cmdLogic();
			setState(119);
			match(T__25);
			setState(120);
			block();
			setState(121);
			match(T__26);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Do_whileContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CmdLogicContext cmdLogic() {
			return getRuleContext(CmdLogicContext.class,0);
		}
		public Do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).enterDo_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).exitDo_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LordescriptVisitor ) return ((LordescriptVisitor<? extends T>)visitor).visitDo_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_whileContext do_while() throws RecognitionException {
		Do_whileContext _localctx = new Do_whileContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_do_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__27);
			setState(124);
			block();
			setState(125);
			match(T__28);
			setState(126);
			cmdLogic();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode DUAL() { return getToken(LordescriptParser.DUAL, 0); }
		public TerminalNode PERGAMINHO() { return getToken(LordescriptParser.PERGAMINHO, 0); }
		public TerminalNode INTEIRO() { return getToken(LordescriptParser.INTEIRO, 0); }
		public TerminalNode FRACIONARIO() { return getToken(LordescriptParser.FRACIONARIO, 0); }
		public TerminalNode CAPITULAR() { return getToken(LordescriptParser.CAPITULAR, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LordescriptVisitor ) return ((LordescriptVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4260607557632L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\u0004\u0001=\u0083\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"\u001f\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0004\u0001(\b\u0001\u000b\u0001\f\u0001)\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00021\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007Z\b\u0007\n\u0007"+
		"\f\u0007]\t\u0007\u0001\u0007\u0003\u0007`\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u0000\u0002\u0001\u0000*+\u0001\u0000%)}\u0000\u001a"+
		"\u0001\u0000\u0000\u0000\u0002\'\u0001\u0000\u0000\u0000\u00040\u0001"+
		"\u0000\u0000\u0000\u00062\u0001\u0000\u0000\u0000\b<\u0001\u0000\u0000"+
		"\u0000\n@\u0001\u0000\u0000\u0000\fM\u0001\u0000\u0000\u0000\u000eQ\u0001"+
		"\u0000\u0000\u0000\u0010g\u0001\u0000\u0000\u0000\u0012p\u0001\u0000\u0000"+
		"\u0000\u0014u\u0001\u0000\u0000\u0000\u0016{\u0001\u0000\u0000\u0000\u0018"+
		"\u0080\u0001\u0000\u0000\u0000\u001a\u001b\u0005\u0001\u0000\u0000\u001b"+
		"\u001c\u0005\u0002\u0000\u0000\u001c\u001e\u0005;\u0000\u0000\u001d\u001f"+
		"\u0003\u0002\u0001\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001e\u001f"+
		"\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 !\u0005\u0003"+
		"\u0000\u0000!\"\u0005\u0004\u0000\u0000\"#\u0005\u0005\u0000\u0000#$\u0005"+
		";\u0000\u0000$%\u0005\u0006\u0000\u0000%\u0001\u0001\u0000\u0000\u0000"+
		"&(\u0003\u0004\u0002\u0000\'&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*\u0003\u0001"+
		"\u0000\u0000\u0000+1\u0003\u0006\u0003\u0000,1\u0003\f\u0006\u0000-1\u0003"+
		"\b\u0004\u0000.1\u0003\n\u0005\u0000/1\u0003\u000e\u0007\u00000+\u0001"+
		"\u0000\u0000\u00000,\u0001\u0000\u0000\u00000-\u0001\u0000\u0000\u0000"+
		"0.\u0001\u0000\u0000\u00000/\u0001\u0000\u0000\u00001\u0005\u0001\u0000"+
		"\u0000\u000023\u0005\u0007\u0000\u000034\u0005\b\u0000\u000045\u0005\t"+
		"\u0000\u000056\u0005\n\u0000\u000067\u0005\u000b\u0000\u000078\u0005\f"+
		"\u0000\u000089\u0005\r\u0000\u00009:\u0005*\u0000\u0000:;\u00059\u0000"+
		"\u0000;\u0007\u0001\u0000\u0000\u0000<=\u0005\u001e\u0000\u0000=>\u0005"+
		"*\u0000\u0000>?\u00059\u0000\u0000?\t\u0001\u0000\u0000\u0000@A\u0005"+
		"\u000e\u0000\u0000AB\u0005\b\u0000\u0000BC\u0005\f\u0000\u0000CD\u0003"+
		"\u0018\f\u0000DE\u0005*\u0000\u0000EF\u0005\u001f\u0000\u0000FG\u0005"+
		"\u000f\u0000\u0000GH\u0005\u0004\u0000\u0000HI\u0005\f\u0000\u0000IJ\u0005"+
		"\u0010\u0000\u0000JK\u0005+\u0000\u0000KL\u00059\u0000\u0000L\u000b\u0001"+
		"\u0000\u0000\u0000MN\u0007\u0000\u0000\u0000NO\u0005$\u0000\u0000OP\u0007"+
		"\u0000\u0000\u0000P\r\u0001\u0000\u0000\u0000QR\u0005\u0011\u0000\u0000"+
		"RS\u0005\u0012\u0000\u0000ST\u0003\f\u0006\u0000TU\u0005;\u0000\u0000"+
		"UV\u0005#\u0000\u0000VW\u0005:\u0000\u0000W[\u0003\u0002\u0001\u0000X"+
		"Z\u0003\u0010\b\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000"+
		"[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000^`\u0003\u0012\t\u0000_^\u0001\u0000\u0000"+
		"\u0000_`\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0005\u0013"+
		"\u0000\u0000bc\u0005\u0014\u0000\u0000cd\u0005\u0015\u0000\u0000de\u0005"+
		"!\u0000\u0000ef\u0005<\u0000\u0000f\u000f\u0001\u0000\u0000\u0000gh\u0005"+
		"\u0016\u0000\u0000hi\u0005;\u0000\u0000ij\u0005\u0017\u0000\u0000jk\u0003"+
		"\f\u0006\u0000kl\u0005;\u0000\u0000lm\u0005#\u0000\u0000mn\u0005:\u0000"+
		"\u0000no\u0003\u0002\u0001\u0000o\u0011\u0001\u0000\u0000\u0000pq\u0005"+
		"\u0018\u0000\u0000qr\u0005\"\u0000\u0000rs\u0005:\u0000\u0000st\u0003"+
		"\u0002\u0001\u0000t\u0013\u0001\u0000\u0000\u0000uv\u0005\u0019\u0000"+
		"\u0000vw\u0003\f\u0006\u0000wx\u0005\u001a\u0000\u0000xy\u0003\u0002\u0001"+
		"\u0000yz\u0005\u001b\u0000\u0000z\u0015\u0001\u0000\u0000\u0000{|\u0005"+
		"\u001c\u0000\u0000|}\u0003\u0002\u0001\u0000}~\u0005\u001d\u0000\u0000"+
		"~\u007f\u0003\f\u0006\u0000\u007f\u0017\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0007\u0001\u0000\u0000\u0081\u0019\u0001\u0000\u0000\u0000\u0005"+
		"\u001e)0[_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}