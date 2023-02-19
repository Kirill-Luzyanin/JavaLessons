public class GroupOfApes {
    private String arial;
    private Ape[] apes;

    public GroupOfApes(String arial, Ape[] apes) {
        this.arial = arial;
        this.apes = apes;
    }

    public Ape[] getApes() {
        return apes;
    }

    @Override
    public String toString(){
        String apesStr="";
        for (Ape ape:apes) {
            apesStr+= "\n " + ape;
        }
        return String.format("Monkey group from %s %s", arial, apesStr);
    }
}
