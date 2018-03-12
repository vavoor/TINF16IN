abstract class Matcher {
    protected String[] phrases;
    
    public Matcher(String... phrases) {
        this.phrases = phrases;
    }
    
    public boolean isSelected(Email mail) {
        for (String phrase : phrases) {
            if (match(phrase,mail)) {
                return true;
            }
        }
        return false;
    }
    
    abstract protected boolean match(String phrase,Email mail); 
}
