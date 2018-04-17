package pfx;

public class Type extends Node {
    private static Type theVoidType = new VoidType();
    private static Type theIntegerType = new IntegerType();
    private static Type theDoubleType = new DoubleType();
    private static Type theStringType = new StringType();
    
    public static Type voidType() {
        return theVoidType;
    }
    
    public static Type integerType() {
        return theIntegerType;
    }
    
    public static Type doubleTyoe() {
        return theDoubleType;
    }
    
    public static Type stringType() {
        return theStringType;
    }
}
