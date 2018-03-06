

public class ToMatcher extends Matcher {
    
    public ToMatcher(String... phrases) {
        super(phrases);
    }
    
    public boolean isSelected(Email m) {
        for (String s : phrases) {
            if (m.toContains(s)) {
                return true;
            }
        }
        return false;
    }
	
}

