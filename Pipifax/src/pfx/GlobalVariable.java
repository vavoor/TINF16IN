package pfx;

public class GlobalVariable extends Node {
    private String name;
    private Type type;
    
    public GlobalVariable(String name, Type type) {
        this.name = name;
        this.type = type;
    }
}
