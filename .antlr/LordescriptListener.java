// Generated from /home/gabpetti/repos/Lordescript/Lordescript.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LordescriptParser}.
 */
public interface LordescriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LordescriptParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LordescriptParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LordescriptParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LordescriptParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LordescriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LordescriptParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LordescriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LordescriptParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LordescriptParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(LordescriptParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LordescriptParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(LordescriptParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LordescriptParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void enterCmdRead(LordescriptParser.CmdReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link LordescriptParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void exitCmdRead(LordescriptParser.CmdReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link LordescriptParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void enterCmdWrite(LordescriptParser.CmdWriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LordescriptParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void exitCmdWrite(LordescriptParser.CmdWriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link LordescriptParser#cmd_assign}.
	 * @param ctx the parse tree
	 */
	void enterCmd_assign(LordescriptParser.Cmd_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link LordescriptParser#cmd_assign}.
	 * @param ctx the parse tree
	 */
	void exitCmd_assign(LordescriptParser.Cmd_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link LordescriptParser#cmdLogic}.
	 * @param ctx the parse tree
	 */
	void enterCmdLogic(LordescriptParser.CmdLogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link LordescriptParser#cmdLogic}.
	 * @param ctx the parse tree
	 */
	void exitCmdLogic(LordescriptParser.CmdLogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link LordescriptParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(LordescriptParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LordescriptParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(LordescriptParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LordescriptParser#elif_stmt}.
	 * @param ctx the parse tree
	 */
	void enterElif_stmt(LordescriptParser.Elif_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LordescriptParser#elif_stmt}.
	 * @param ctx the parse tree
	 */
	void exitElif_stmt(LordescriptParser.Elif_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LordescriptParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void enterElse_stmt(LordescriptParser.Else_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LordescriptParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void exitElse_stmt(LordescriptParser.Else_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LordescriptParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(LordescriptParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link LordescriptParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(LordescriptParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link LordescriptParser#do_while}.
	 * @param ctx the parse tree
	 */
	void enterDo_while(LordescriptParser.Do_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link LordescriptParser#do_while}.
	 * @param ctx the parse tree
	 */
	void exitDo_while(LordescriptParser.Do_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link LordescriptParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LordescriptParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LordescriptParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LordescriptParser.TypeContext ctx);
}