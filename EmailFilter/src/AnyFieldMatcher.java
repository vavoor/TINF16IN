public class AnyFieldMatcher extends Matcher {
    public AnyFieldMatcher(String... phrases) {
        super(phrases);
    }
    
    protected boolean match(String phrase, Email mail) {
        return mail.fromContains(phrase)
            || mail.toContains(phrase)
            || mail.bodyContains(phrase)
            || mail.subjectContains(phrase);
    }
}
