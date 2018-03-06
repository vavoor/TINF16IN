abstract class Matcher {
    protected String[] phrases;
    
    public Matcher(String... phrases) {
        this.phrases = phrases;
    }
    
    public abstract boolean isSelected(Email mail);
}
