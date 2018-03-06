
public class FromMatcher extends Matcher {
    
    public FromMatcher(String... phrases) {
        super(phrases);
    }
    
    public boolean isSelected(Email m) {
        for (String s : phrases) {
            if (m.fromContains(s)) {
                return true;
            }
        }
        return false;
    }
	
}
