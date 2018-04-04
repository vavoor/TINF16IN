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
	 * Visit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link PipifaxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(PipifaxParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link PipifaxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleType(PipifaxParser.DoubleTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringType}
	 * labeled alternative in {@link PipifaxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringType(PipifaxParser.StringTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link PipifaxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(PipifaxParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code referenceType}
	 * labeled alternative in {@link PipifaxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(PipifaxParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayRefType}
	 * labeled alternative in {@link PipifaxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayRefType(PipifaxParser.ArrayRefTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PipifaxParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link PipifaxParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(PipifaxParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link PipifaxParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(PipifaxParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callStmt}
	 * labeled alternative in {@link PipifaxParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStmt(PipifaxParser.CallStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStmt}
	 * labeled alternative in {@link PipifaxParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(PipifaxParser.AssignStmtContext ctx);
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
	 * Visit a parse tree produced by the {@code bracketExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketExpr(PipifaxParser.BracketExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(PipifaxParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intCastExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntCastExpr(PipifaxParser.IntCastExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessExpr(PipifaxParser.LessExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(PipifaxParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpr(PipifaxParser.SubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(PipifaxParser.MultExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterEqualExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterEqualExpr(PipifaxParser.GreaterEqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessEqualExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessEqualExpr(PipifaxParser.LessEqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterExpr(PipifaxParser.GreaterExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleCastExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleCastExpr(PipifaxParser.DoubleCastExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(PipifaxParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(PipifaxParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(PipifaxParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegExpr(PipifaxParser.NegExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExpr(PipifaxParser.CompExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(PipifaxParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notEqualExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualExpr(PipifaxParser.NotEqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpr(PipifaxParser.DivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpr(PipifaxParser.CallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lvalExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalExpr(PipifaxParser.LvalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpr(PipifaxParser.EqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(PipifaxParser.AndExprContext ctx);
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