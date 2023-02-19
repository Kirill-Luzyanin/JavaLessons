import java.util.ArrayList;

public class Ape {
    private String name;
    private ArrayList<Flea> fleas;

    public Ape(String name, ArrayList<Flea> fleas) {
        this.name = name;
        this.fleas = fleas;
    }

    public ArrayList<Flea> getFleas() {
        return fleas;
    }

    public String toString(){
        String fleasStr="";
        for (Flea flea:fleas) {
            fleasStr+= "\n " + flea;
        }
        return String.format("\n Ape %s \n  Fleas: %s", name, fleasStr);
    }
}
