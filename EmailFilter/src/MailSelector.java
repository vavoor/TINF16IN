import java.util.List;

class MailSelector {
    private List<Matcher> matchers;
    
    public MailSelector(List<Matcher> matchers) {
        this.matchers = matchers;
    }
    
    public boolean isSelected(Email mail) {
        for (Matcher m : matchers) {
            if (!m.isSelected(mail)) {
                return false;
            }
        }
        return true;
    }
}
