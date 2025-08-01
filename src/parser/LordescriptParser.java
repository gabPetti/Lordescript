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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		DUAL=46, PERGAMINHO=47, INTEIRO=48, FRACIONARIO=49, CAPITULAR=50, ID=51, 
		PLUS=52, MINUS=53, MULT=54, DIV=55, ABRE_P=56, FECHA_P=57, SEMICOLON=58, 
		COLON=59, COMMA=60, DOT=61, STRING=62, BOOL=63, FLOAT=64, INTEGER=65, 
		WS=66, SERA=67, COMMENT=68, HIPOTESE=69, CONTRARIO=70, COMPARE=71;
	public static final int
		RULE_prog = 0, RULE_block = 1, RULE_cmd = 2, RULE_cmdRead = 3, RULE_cmdWrite = 4, 
		RULE_cmd_assign = 5, RULE_cmdLogic = 6, RULE_if_stmt = 7, RULE_elif_stmt = 8, 
		RULE_else_stmt = 9, RULE_while_stmt = 10, RULE_do_while_stmt = 11, RULE_type = 12, 
		RULE_expr = 13, RULE_expr_mult = 14, RULE_expr_sum = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "block", "cmd", "cmdRead", "cmdWrite", "cmd_assign", "cmdLogic", 
			"if_stmt", "elif_stmt", "else_stmt", "while_stmt", "do_while_stmt", "type", 
			"expr", "expr_mult", "expr_sum"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Caro'", "'compilador'", "'Assinado'", "'com'", "'distin\\u00E7\\u00E3o'", 
			"'Lordescript'", "'Ordeno'", "'que'", "'mostre'", "'ao'", "'mundo'", 
			"'o'", "'valor de'", "'Redijo'", "'humildemente'", "'Declaro'", "'agraciado'", 
			"'valor'", "'Se'", "'porventura'", "'logo'", "'Assim'", "'finaliza-se'", 
			"'a'", "'Por\\u00E9m'", "'se'", "'Caso'", "'Enquanto'", "'raz\\u00E3o'", 
			"'permitir'", "', '", "'cumpra'", "'At\\u00E9'", "'sacro'", "'scriptum'", 
			"'demonstre'", "'sua'", "'invalidez'", "'Que'", "'execute'", "'esmero'", 
			"'m\\u00E9todo'", "'assim'", "'exigir'", "'e'", "'dual'", "'pergaminho'", 
			"'inteiro'", "'fracion\\u00E1rio'", "'capitular'", null, "'+'", "'-'", 
			"'*'", "'/'", "'('", "')'", "';'", "':'", "','", "'.'", null, null, null, 
			null, null, "'ser\\u00E1'", null, "'hip\\u00F3tese'", "'contr\\u00E1rio'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "DUAL", "PERGAMINHO", 
			"INTEIRO", "FRACIONARIO", "CAPITULAR", "ID", "PLUS", "MINUS", "MULT", 
			"DIV", "ABRE_P", "FECHA_P", "SEMICOLON", "COLON", "COMMA", "DOT", "STRING", 
			"BOOL", "FLOAT", "INTEGER", "WS", "SERA", "COMMENT", "HIPOTESE", "CONTRARIO", 
			"COMPARE"
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
		public TerminalNode EOF() { return getToken(LordescriptParser.EOF, 0); }
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
			setState(32);
			match(T__0);
			setState(33);
			match(T__1);
			setState(34);
			match(COMMA);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 432926110664102529L) != 0)) {
				{
				setState(35);
				block();
				}
			}

			setState(38);
			match(T__2);
			setState(39);
			match(T__3);
			setState(40);
			match(T__4);
			setState(41);
			match(COMMA);
			setState(42);
			match(T__5);
			setState(43);
			match(EOF);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(45);
					cmd();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(48); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Do_while_stmtContext do_while_stmt() {
			return getRuleContext(Do_while_stmtContext.class,0);
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
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				cmdRead();
				}
				break;
			case ID:
			case ABRE_P:
			case FLOAT:
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				cmdLogic();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				cmdWrite();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				cmd_assign();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				if_stmt();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				while_stmt();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 7);
				{
				setState(56);
				do_while_stmt();
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
		public TerminalNode SEMICOLON() { return getToken(LordescriptParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(LordescriptParser.ID, 0); }
		public TerminalNode STRING() { return getToken(LordescriptParser.STRING, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__6);
			setState(60);
			match(T__7);
			setState(61);
			match(T__8);
			setState(62);
			match(T__9);
			setState(63);
			match(T__10);
			setState(64);
			match(T__11);
			setState(65);
			match(T__12);
			setState(66);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(67);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
			setState(69);
			match(T__13);
			setState(70);
			match(T__14);
			setState(71);
			match(T__11);
			setState(72);
			match(T__12);
			setState(73);
			type();
			setState(74);
			match(ID);
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
	public static class Cmd_assignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LordescriptParser.ID, 0); }
		public TerminalNode SERA() { return getToken(LordescriptParser.SERA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LordescriptParser.SEMICOLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__15);
			setState(78);
			match(T__7);
			setState(79);
			match(T__11);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2181431069507584L) != 0)) {
				{
				setState(80);
				type();
				}
			}

			setState(83);
			match(ID);
			setState(84);
			match(SERA);
			setState(85);
			match(T__16);
			setState(86);
			match(T__3);
			setState(87);
			match(T__11);
			setState(88);
			match(T__17);
			setState(89);
			expr();
			setState(90);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(92);
				match(ID);
				}
				break;
			case 2:
				{
				setState(93);
				expr();
				}
				break;
			}
			setState(96);
			match(COMPARE);
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(97);
				match(ID);
				}
				break;
			case 2:
				{
				setState(98);
				expr();
				}
				break;
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
		public List<Else_stmtContext> else_stmt() {
			return getRuleContexts(Else_stmtContext.class);
		}
		public Else_stmtContext else_stmt(int i) {
			return getRuleContext(Else_stmtContext.class,i);
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
			setState(101);
			match(T__18);
			setState(102);
			match(T__19);
			setState(103);
			cmdLogic();
			setState(104);
			match(T__20);
			setState(105);
			match(COLON);
			setState(106);
			block();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(107);
				elif_stmt();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(113);
				else_stmt();
				}
				break;
			}
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(116);
				else_stmt();
				}
			}

			setState(119);
			match(T__21);
			setState(120);
			match(T__22);
			setState(121);
			match(T__23);
			setState(122);
			match(HIPOTESE);
			setState(123);
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
		public CmdLogicContext cmdLogic() {
			return getRuleContext(CmdLogicContext.class,0);
		}
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
			setState(125);
			match(T__24);
			setState(126);
			match(T__25);
			setState(127);
			cmdLogic();
			setState(128);
			match(T__20);
			setState(129);
			match(COLON);
			setState(130);
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
			setState(132);
			match(T__26);
			setState(133);
			match(CONTRARIO);
			setState(134);
			match(COLON);
			setState(135);
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
	public static class While_stmtContext extends ParserRuleContext {
		public CmdLogicContext cmdLogic() {
			return getRuleContext(CmdLogicContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LordescriptParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DOT() { return getToken(LordescriptParser.DOT, 0); }
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LordescriptVisitor ) return ((LordescriptVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__27);
			setState(138);
			match(T__23);
			setState(139);
			match(T__28);
			setState(140);
			match(T__29);
			setState(141);
			match(T__7);
			setState(142);
			cmdLogic();
			setState(143);
			match(T__30);
			setState(144);
			match(T__7);
			setState(145);
			match(T__25);
			setState(146);
			match(T__31);
			setState(147);
			match(COLON);
			setState(148);
			block();
			setState(149);
			match(T__32);
			setState(150);
			match(T__7);
			setState(151);
			match(T__11);
			setState(152);
			match(T__33);
			setState(153);
			match(T__34);
			setState(154);
			match(T__35);
			setState(155);
			match(T__36);
			setState(156);
			match(T__37);
			setState(157);
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
	public static class Do_while_stmtContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(LordescriptParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CmdLogicContext cmdLogic() {
			return getRuleContext(CmdLogicContext.class,0);
		}
		public TerminalNode DOT() { return getToken(LordescriptParser.DOT, 0); }
		public Do_while_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).enterDo_while_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).exitDo_while_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LordescriptVisitor ) return ((LordescriptVisitor<? extends T>)visitor).visitDo_while_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_stmtContext do_while_stmt() throws RecognitionException {
		Do_while_stmtContext _localctx = new Do_while_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_do_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__38);
			setState(160);
			match(T__25);
			setState(161);
			match(T__39);
			setState(162);
			match(T__3);
			setState(163);
			match(T__40);
			setState(164);
			match(COLON);
			setState(165);
			block();
			setState(166);
			match(T__27);
			setState(167);
			match(T__11);
			setState(168);
			match(T__41);
			setState(169);
			match(T__42);
			setState(170);
			match(T__11);
			setState(171);
			match(T__43);
			setState(172);
			match(T__44);
			setState(173);
			cmdLogic();
			setState(174);
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
			setState(176);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2181431069507584L) != 0)) ) {
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
	public static class ExprContext extends ParserRuleContext {
		public Expr_multContext expr_mult() {
			return getRuleContext(Expr_multContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(LordescriptParser.PLUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(LordescriptParser.MINUS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LordescriptVisitor ) return ((LordescriptVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				expr_mult();
				setState(179);
				match(PLUS);
				setState(180);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				expr_mult();
				setState(183);
				match(MINUS);
				setState(184);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				expr_mult();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_multContext extends ParserRuleContext {
		public Expr_sumContext expr_sum() {
			return getRuleContext(Expr_sumContext.class,0);
		}
		public TerminalNode MULT() { return getToken(LordescriptParser.MULT, 0); }
		public Expr_multContext expr_mult() {
			return getRuleContext(Expr_multContext.class,0);
		}
		public TerminalNode DIV() { return getToken(LordescriptParser.DIV, 0); }
		public Expr_multContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).enterExpr_mult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).exitExpr_mult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LordescriptVisitor ) return ((LordescriptVisitor<? extends T>)visitor).visitExpr_mult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_multContext expr_mult() throws RecognitionException {
		Expr_multContext _localctx = new Expr_multContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr_mult);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				expr_sum();
				setState(190);
				match(MULT);
				setState(191);
				expr_mult();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				expr_sum();
				setState(194);
				match(DIV);
				setState(195);
				expr_mult();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				expr_sum();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_sumContext extends ParserRuleContext {
		public TerminalNode ABRE_P() { return getToken(LordescriptParser.ABRE_P, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FECHA_P() { return getToken(LordescriptParser.FECHA_P, 0); }
		public TerminalNode FLOAT() { return getToken(LordescriptParser.FLOAT, 0); }
		public TerminalNode INTEGER() { return getToken(LordescriptParser.INTEGER, 0); }
		public TerminalNode ID() { return getToken(LordescriptParser.ID, 0); }
		public Expr_sumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).enterExpr_sum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LordescriptListener ) ((LordescriptListener)listener).exitExpr_sum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LordescriptVisitor ) return ((LordescriptVisitor<? extends T>)visitor).visitExpr_sum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_sumContext expr_sum() throws RecognitionException {
		Expr_sumContext _localctx = new Expr_sumContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr_sum);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_P:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(ABRE_P);
				setState(201);
				expr();
				setState(202);
				match(FECHA_P);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(FLOAT);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				match(INTEGER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				match(ID);
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

	public static final String _serializedATN =
		"\u0004\u0001G\u00d2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000%\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0004\u0001/\b\u0001\u000b\u0001\f\u00010\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002:\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005R\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0003\u0006_\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006d\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007m\b\u0007\n\u0007"+
		"\f\u0007p\t\u0007\u0001\u0007\u0003\u0007s\b\u0007\u0001\u0007\u0003\u0007"+
		"v\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00bc\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00c7"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00d0\b\u000f\u0001\u000f\u0000\u0000\u0010"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e\u0000\u0002\u0002\u000033>>\u0001\u0000.2\u00d6\u0000 \u0001"+
		"\u0000\u0000\u0000\u0002.\u0001\u0000\u0000\u0000\u00049\u0001\u0000\u0000"+
		"\u0000\u0006;\u0001\u0000\u0000\u0000\bE\u0001\u0000\u0000\u0000\nM\u0001"+
		"\u0000\u0000\u0000\f^\u0001\u0000\u0000\u0000\u000ee\u0001\u0000\u0000"+
		"\u0000\u0010}\u0001\u0000\u0000\u0000\u0012\u0084\u0001\u0000\u0000\u0000"+
		"\u0014\u0089\u0001\u0000\u0000\u0000\u0016\u009f\u0001\u0000\u0000\u0000"+
		"\u0018\u00b0\u0001\u0000\u0000\u0000\u001a\u00bb\u0001\u0000\u0000\u0000"+
		"\u001c\u00c6\u0001\u0000\u0000\u0000\u001e\u00cf\u0001\u0000\u0000\u0000"+
		" !\u0005\u0001\u0000\u0000!\"\u0005\u0002\u0000\u0000\"$\u0005<\u0000"+
		"\u0000#%\u0003\u0002\u0001\u0000$#\u0001\u0000\u0000\u0000$%\u0001\u0000"+
		"\u0000\u0000%&\u0001\u0000\u0000\u0000&\'\u0005\u0003\u0000\u0000\'(\u0005"+
		"\u0004\u0000\u0000()\u0005\u0005\u0000\u0000)*\u0005<\u0000\u0000*+\u0005"+
		"\u0006\u0000\u0000+,\u0005\u0000\u0000\u0001,\u0001\u0001\u0000\u0000"+
		"\u0000-/\u0003\u0004\u0002\u0000.-\u0001\u0000\u0000\u0000/0\u0001\u0000"+
		"\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u00001\u0003"+
		"\u0001\u0000\u0000\u00002:\u0003\u0006\u0003\u00003:\u0003\f\u0006\u0000"+
		"4:\u0003\b\u0004\u00005:\u0003\n\u0005\u00006:\u0003\u000e\u0007\u0000"+
		"7:\u0003\u0014\n\u00008:\u0003\u0016\u000b\u000092\u0001\u0000\u0000\u0000"+
		"93\u0001\u0000\u0000\u000094\u0001\u0000\u0000\u000095\u0001\u0000\u0000"+
		"\u000096\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u000098\u0001\u0000"+
		"\u0000\u0000:\u0005\u0001\u0000\u0000\u0000;<\u0005\u0007\u0000\u0000"+
		"<=\u0005\b\u0000\u0000=>\u0005\t\u0000\u0000>?\u0005\n\u0000\u0000?@\u0005"+
		"\u000b\u0000\u0000@A\u0005\f\u0000\u0000AB\u0005\r\u0000\u0000BC\u0007"+
		"\u0000\u0000\u0000CD\u0005:\u0000\u0000D\u0007\u0001\u0000\u0000\u0000"+
		"EF\u0005\u000e\u0000\u0000FG\u0005\u000f\u0000\u0000GH\u0005\f\u0000\u0000"+
		"HI\u0005\r\u0000\u0000IJ\u0003\u0018\f\u0000JK\u00053\u0000\u0000KL\u0005"+
		":\u0000\u0000L\t\u0001\u0000\u0000\u0000MN\u0005\u0010\u0000\u0000NO\u0005"+
		"\b\u0000\u0000OQ\u0005\f\u0000\u0000PR\u0003\u0018\f\u0000QP\u0001\u0000"+
		"\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0005"+
		"3\u0000\u0000TU\u0005C\u0000\u0000UV\u0005\u0011\u0000\u0000VW\u0005\u0004"+
		"\u0000\u0000WX\u0005\f\u0000\u0000XY\u0005\u0012\u0000\u0000YZ\u0003\u001a"+
		"\r\u0000Z[\u0005:\u0000\u0000[\u000b\u0001\u0000\u0000\u0000\\_\u0005"+
		"3\u0000\u0000]_\u0003\u001a\r\u0000^\\\u0001\u0000\u0000\u0000^]\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`c\u0005G\u0000\u0000ad\u0005"+
		"3\u0000\u0000bd\u0003\u001a\r\u0000ca\u0001\u0000\u0000\u0000cb\u0001"+
		"\u0000\u0000\u0000d\r\u0001\u0000\u0000\u0000ef\u0005\u0013\u0000\u0000"+
		"fg\u0005\u0014\u0000\u0000gh\u0003\f\u0006\u0000hi\u0005\u0015\u0000\u0000"+
		"ij\u0005;\u0000\u0000jn\u0003\u0002\u0001\u0000km\u0003\u0010\b\u0000"+
		"lk\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000"+
		"\u0000no\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000"+
		"\u0000\u0000qs\u0003\u0012\t\u0000rq\u0001\u0000\u0000\u0000rs\u0001\u0000"+
		"\u0000\u0000su\u0001\u0000\u0000\u0000tv\u0003\u0012\t\u0000ut\u0001\u0000"+
		"\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0005"+
		"\u0016\u0000\u0000xy\u0005\u0017\u0000\u0000yz\u0005\u0018\u0000\u0000"+
		"z{\u0005E\u0000\u0000{|\u0005=\u0000\u0000|\u000f\u0001\u0000\u0000\u0000"+
		"}~\u0005\u0019\u0000\u0000~\u007f\u0005\u001a\u0000\u0000\u007f\u0080"+
		"\u0003\f\u0006\u0000\u0080\u0081\u0005\u0015\u0000\u0000\u0081\u0082\u0005"+
		";\u0000\u0000\u0082\u0083\u0003\u0002\u0001\u0000\u0083\u0011\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0005\u001b\u0000\u0000\u0085\u0086\u0005F\u0000"+
		"\u0000\u0086\u0087\u0005;\u0000\u0000\u0087\u0088\u0003\u0002\u0001\u0000"+
		"\u0088\u0013\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u001c\u0000\u0000"+
		"\u008a\u008b\u0005\u0018\u0000\u0000\u008b\u008c\u0005\u001d\u0000\u0000"+
		"\u008c\u008d\u0005\u001e\u0000\u0000\u008d\u008e\u0005\b\u0000\u0000\u008e"+
		"\u008f\u0003\f\u0006\u0000\u008f\u0090\u0005\u001f\u0000\u0000\u0090\u0091"+
		"\u0005\b\u0000\u0000\u0091\u0092\u0005\u001a\u0000\u0000\u0092\u0093\u0005"+
		" \u0000\u0000\u0093\u0094\u0005;\u0000\u0000\u0094\u0095\u0003\u0002\u0001"+
		"\u0000\u0095\u0096\u0005!\u0000\u0000\u0096\u0097\u0005\b\u0000\u0000"+
		"\u0097\u0098\u0005\f\u0000\u0000\u0098\u0099\u0005\"\u0000\u0000\u0099"+
		"\u009a\u0005#\u0000\u0000\u009a\u009b\u0005$\u0000\u0000\u009b\u009c\u0005"+
		"%\u0000\u0000\u009c\u009d\u0005&\u0000\u0000\u009d\u009e\u0005=\u0000"+
		"\u0000\u009e\u0015\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\'\u0000\u0000"+
		"\u00a0\u00a1\u0005\u001a\u0000\u0000\u00a1\u00a2\u0005(\u0000\u0000\u00a2"+
		"\u00a3\u0005\u0004\u0000\u0000\u00a3\u00a4\u0005)\u0000\u0000\u00a4\u00a5"+
		"\u0005;\u0000\u0000\u00a5\u00a6\u0003\u0002\u0001\u0000\u00a6\u00a7\u0005"+
		"\u001c\u0000\u0000\u00a7\u00a8\u0005\f\u0000\u0000\u00a8\u00a9\u0005*"+
		"\u0000\u0000\u00a9\u00aa\u0005+\u0000\u0000\u00aa\u00ab\u0005\f\u0000"+
		"\u0000\u00ab\u00ac\u0005,\u0000\u0000\u00ac\u00ad\u0005-\u0000\u0000\u00ad"+
		"\u00ae\u0003\f\u0006\u0000\u00ae\u00af\u0005=\u0000\u0000\u00af\u0017"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0007\u0001\u0000\u0000\u00b1\u0019"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003\u001c\u000e\u0000\u00b3\u00b4"+
		"\u00054\u0000\u0000\u00b4\u00b5\u0003\u001a\r\u0000\u00b5\u00bc\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0003\u001c\u000e\u0000\u00b7\u00b8\u0005"+
		"5\u0000\u0000\u00b8\u00b9\u0003\u001a\r\u0000\u00b9\u00bc\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bc\u0003\u001c\u000e\u0000\u00bb\u00b2\u0001\u0000"+
		"\u0000\u0000\u00bb\u00b6\u0001\u0000\u0000\u0000\u00bb\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bc\u001b\u0001\u0000\u0000\u0000\u00bd\u00be\u0003\u001e"+
		"\u000f\u0000\u00be\u00bf\u00056\u0000\u0000\u00bf\u00c0\u0003\u001c\u000e"+
		"\u0000\u00c0\u00c7\u0001\u0000\u0000\u0000\u00c1\u00c2\u0003\u001e\u000f"+
		"\u0000\u00c2\u00c3\u00057\u0000\u0000\u00c3\u00c4\u0003\u001c\u000e\u0000"+
		"\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c7\u0003\u001e\u000f\u0000"+
		"\u00c6\u00bd\u0001\u0000\u0000\u0000\u00c6\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u001d\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u00058\u0000\u0000\u00c9\u00ca\u0003\u001a\r\u0000\u00ca"+
		"\u00cb\u00059\u0000\u0000\u00cb\u00d0\u0001\u0000\u0000\u0000\u00cc\u00d0"+
		"\u0005@\u0000\u0000\u00cd\u00d0\u0005A\u0000\u0000\u00ce\u00d0\u00053"+
		"\u0000\u0000\u00cf\u00c8\u0001\u0000\u0000\u0000\u00cf\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d0\u001f\u0001\u0000\u0000\u0000\f$09Q^cnru\u00bb\u00c6"+
		"\u00cf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}