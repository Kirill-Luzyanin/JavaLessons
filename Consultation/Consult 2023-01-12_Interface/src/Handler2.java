public class Handler2 implements PersonHandler{

    @Override
    public boolean test(Person p) {
        return p.getName1().startsWith("J");
    }

    @Override
    public void action(Person p) {
        System.out.println(p);
    }
}
