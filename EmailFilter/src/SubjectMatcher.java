
public class SubjectMatcher extends Matcher {
    
    public SubjectMatcher(String... phrases) {
        super(phrases);
    }
    
    public boolean isSelected(Email m) {
        for (String s : phrases) {
            if (m.subjectContains(s)) {
                return true;
            }
        }
        return false;
    }
	
}
