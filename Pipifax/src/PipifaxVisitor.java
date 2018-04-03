// Generated from Pipifax.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PipifaxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PipifaxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PipifaxParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(PipifaxParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#fn_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFn_def(PipifaxParser.Fn_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#param_decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_decls(PipifaxParser.Param_declsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#param_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_decl(PipifaxParser.Param_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PipifaxParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#param_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_type(PipifaxParser.Param_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PipifaxParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(PipifaxParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(PipifaxParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(PipifaxParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#fn_call_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFn_call_stmt(PipifaxParser.Fn_call_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(PipifaxParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(PipifaxParser.LvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PipifaxParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#fn_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFn_call(PipifaxParser.Fn_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(PipifaxParser.ArgsContext ctx);
}