
public class BodyMatcher extends Matcher {
    
    public BodyMatcher(String... phrases) {
        super(phrases);
    }
    
    protected boolean match(String phrase, Email mail) {
        return mail.bodyContains(phrase);
    }
}
