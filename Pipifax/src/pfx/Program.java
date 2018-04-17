package pfx;

import java.util.Map;
import java.util.HashMap;

public class Program extends Node {
    private Map<String,GlobalVariable> variables = new HashMap<String,GlobalVariable>();
    private Map<String,Function> functions = new HashMap<String,Function>();
    
    public void add(GlobalVariable v) {
        variables.put(v.name(),v);
    }
    
    public void add(Function f) {
        functions.put(f.name(),f);
    }
}
