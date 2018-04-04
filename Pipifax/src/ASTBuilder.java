import pfx.*;


public class ASTBuilder extends PipifaxBaseVisitor<Node> {
    
    public Node visitProgram(PipifaxParser.ProgramContext ctx) {
        
    }
    
    public Node visitVar_decl(PipifaxParser.Var_declContext ctx) {
        String name = ctx.Identifier().getText();
        Type type = (Type) ctx.type().accept(this);
        GlobalVariable n = new GlobalVariable(name,type);
        return n;
    }
}
