
public class BodyMatcher extends Matcher {
    
    public BodyMatcher(String... phrases) {
        super(phrases);
    }
    
    public boolean isSelected(Email m) {
        for (String s : phrases) {
            if (m.bodyContains(s)) {
                return true;
            }
        }
        return false;
    }
}
