
public class ToMatcher extends Matcher {
    
    public ToMatcher(String... phrases) {
        super(phrases);
    }
    
    protected boolean match(String phrase, Email mail) {
        return mail.toContains(phrase);
    }
}
