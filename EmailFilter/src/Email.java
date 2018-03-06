class Email {
    public boolean toContains(String s) {
        return s.equals("Schmidt");
    }
    
    public boolean fromContains(String s) {
        return s.equals("Schulz");
    }
    
    public boolean subjectContains(String s) {
        return s.equals("Hilfe");
    }
    
    public boolean bodyContains(String s) {
        return s.equals("Kursinhalt");
    }
}
