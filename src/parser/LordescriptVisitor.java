// Generated from Lordescript.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LordescriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LordescriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LordescriptParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LordescriptParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LordescriptParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LordescriptParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LordescriptParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(LordescriptParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LordescriptParser#cmdRead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdRead(LordescriptParser.CmdReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link LordescriptParser#cmdWrite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdWrite(LordescriptParser.CmdWriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link LordescriptParser#cmd_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_assign(LordescriptParser.Cmd_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link LordescriptParser#cmdLogic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdLogic(LordescriptParser.CmdLogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link LordescriptParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(LordescriptParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LordescriptParser#elif_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif_stmt(LordescriptParser.Elif_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LordescriptParser#else_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_stmt(LordescriptParser.Else_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LordescriptParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(LordescriptParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link LordescriptParser#do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while(LordescriptParser.Do_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link LordescriptParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(LordescriptParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LordescriptParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(LordescriptParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LordescriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LordescriptParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LordescriptParser#expr_mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_mult(LordescriptParser.Expr_multContext ctx);
	/**
	 * Visit a parse tree produced by {@link LordescriptParser#expr_sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_sum(LordescriptParser.Expr_sumContext ctx);
}