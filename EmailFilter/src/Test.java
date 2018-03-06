import java.util.ArrayList;

class Test {
    public static void main(String[] args) {
        ArrayList<Matcher> matchers = new ArrayList<>();
        
        matchers.add(new FromMatcher("Mayer","Schulz"));
        matchers.add(new ToMatcher("Mueller","Schmidt"));
        matchers.add(new SubjectMatcher("Hilfe"));
        
        MailSelector s = new MailSelector(matchers);
        
        Email m = new Email();
        
        if (s.isSelected(m)) {
            System.out.println("MATCH");
        }
        else {
            System.out.println("No match :-(");
        }
    }
}
