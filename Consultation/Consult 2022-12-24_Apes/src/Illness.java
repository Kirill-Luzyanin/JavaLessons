public class Illness {
    private String title;

    public Illness(String title) {
        this.title = title;
    }

    public String toString(){
        return "\n\t" +  title;
    }
}
