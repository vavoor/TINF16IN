
public class FromMatcher extends Matcher {
    
    public FromMatcher(String... phrases) {
        super(phrases);
    }
    
    protected boolean match(String phrase, Email mail) {
        return mail.fromContains(phrase);
    }
}
