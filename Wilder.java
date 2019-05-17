public class Wilder {
    //attributes
    private String firstname;
    private boolean aware;

    //constructors
    public Wilder (String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    //getters
    public String getFirstName() {
        return this.firstname;
    }

    public boolean isAware() {
        return this.aware;
    }
    //setters
    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    //methods
    public String whoAmI() {
        if (this.aware == true) {
            return "Je m'appelle " + this.firstname + " et je suis aware";
        }else{
            return "Je m'appelle " + this.firstname + " et je ne suis pas aware";
        }
    }
}