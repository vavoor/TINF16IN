
public class SubjectMatcher extends Matcher {
    
    public SubjectMatcher(String... phrases) {
        super(phrases);
    }
    
    protected boolean match(String phrase, Email mail) {
        return mail.subjectContains(phrase);
    }
}
