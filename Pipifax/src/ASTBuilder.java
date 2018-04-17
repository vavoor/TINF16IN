import pfx.*;


public class ASTBuilder extends PipifaxBaseVisitor<Node> {
    
    private Function fn;
    private Program program;
    
    /**
	 * Visit a parse tree produced by {@link PipifaxParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitProgram(PipifaxParser.ProgramContext ctx) {
        program = new Program();
        
        for (PipifaxParser.Gvar_declContext c : ctx.gvar_decl()) {
            GlobalVariable v = (GlobalVariable) c.accept(this);
            program.add(v);
        }
        
        for (PipifaxParser.Fn_defContext c : ctx.fn_def()) {
            Function f = (Function) c.accept(this);
            program.add(f);
        }
        
        return program;
    }
    
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitGvar_decl(PipifaxParser.Gvar_declContext ctx) {
        String name = ctx.Identifier().getText();
        Type type = (Type) ctx.type().accept(this);
        GlobalVariable n = new GlobalVariable(name,type);
        return n;
    }
    
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#fn_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitFn_def(PipifaxParser.Fn_defContext ctx) {
        String name = ctx.Identifier().getText();
        
        PipifaxParser.TypeContext typeCtx = ctx.type();
        Type type = typeCtx!=null? (Type) typeCtx.accept(this) : Type.voidType();
        
        Stmt stmt = (Stmt) ctx.block().accept(this);
        
        PipifaxParser.Param_declsContext params = ctx.param_decls();
        if (params!=null) {
            params.accept(this);
        }
        fn = new Function(name,type,stmt);
        return fn;
    }
    
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#param_decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitParam_decls(PipifaxParser.Param_declsContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#param_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitParam_decl(PipifaxParser.Param_declContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link PipifaxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitIntType(PipifaxParser.IntTypeContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link PipifaxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitDoubleType(PipifaxParser.DoubleTypeContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code stringType}
	 * labeled alternative in {@link PipifaxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitStringType(PipifaxParser.StringTypeContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link PipifaxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitArrayType(PipifaxParser.ArrayTypeContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code referenceType}
	 * labeled alternative in {@link PipifaxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitReferenceType(PipifaxParser.ReferenceTypeContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code arrayRefType}
	 * labeled alternative in {@link PipifaxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitArrayRefType(PipifaxParser.ArrayRefTypeContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitBlock(PipifaxParser.BlockContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link PipifaxParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitIfStmt(PipifaxParser.IfStmtContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link PipifaxParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitWhileStmt(PipifaxParser.WhileStmtContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code callStmt}
	 * labeled alternative in {@link PipifaxParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitCallStmt(PipifaxParser.CallStmtContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code assignStmt}
	 * labeled alternative in {@link PipifaxParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitAssignStmt(PipifaxParser.AssignStmtContext ctx) { return null; }
    
	/**
	 * Visit a parse tree produced by the {@code blockStmt}
	 * labeled alternative in {@link PipifaxParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitBlockStmt(PipifaxParser.BlockStmtContext ctx) { return null; }
    
    /**
	 * Visit a parse tree produced by {@link PipifaxParser#lvar_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	public Node visitLvar_decl(PipifaxParser.Lvar_declContext ctx) { return null; }
    
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
     
    public Node visitIf_stmt(PipifaxParser.If_stmtContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitWhile_stmt(PipifaxParser.While_stmtContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#fn_call_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitFn_call_stmt(PipifaxParser.Fn_call_stmtContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitAssignment(PipifaxParser.AssignmentContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitLvalue(PipifaxParser.LvalueContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code bracketExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitBracketExpr(PipifaxParser.BracketExprContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitIntLiteral(PipifaxParser.IntLiteralContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code intCastExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitIntCastExpr(PipifaxParser.IntCastExprContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code lessExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitLessExpr(PipifaxParser.LessExprContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitOrExpr(PipifaxParser.OrExprContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitSubExpr(PipifaxParser.SubExprContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitMultExpr(PipifaxParser.MultExprContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code greaterEqualExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitGreaterEqualExpr(PipifaxParser.GreaterEqualExprContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code lessEqualExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitLessEqualExpr(PipifaxParser.LessEqualExprContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code greaterExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitGreaterExpr(PipifaxParser.GreaterExprContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code doubleCastExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitDoubleCastExpr(PipifaxParser.DoubleCastExprContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitNotExpr(PipifaxParser.NotExprContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitStringLiteral(PipifaxParser.StringLiteralContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitAddExpr(PipifaxParser.AddExprContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code negExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitNegExpr(PipifaxParser.NegExprContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitCompExpr(PipifaxParser.CompExprContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitDoubleLiteral(PipifaxParser.DoubleLiteralContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code notEqualExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitNotEqualExpr(PipifaxParser.NotEqualExprContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitDivExpr(PipifaxParser.DivExprContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitCallExpr(PipifaxParser.CallExprContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code lvalExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitLvalExpr(PipifaxParser.LvalExprContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code equalExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitEqualExpr(PipifaxParser.EqualExprContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitAndExpr(PipifaxParser.AndExprContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#fn_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitFn_call(PipifaxParser.Fn_callContext ctx) { return null; }
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    public Node visitArgs(PipifaxParser.ArgsContext ctx) { return null; }
}
