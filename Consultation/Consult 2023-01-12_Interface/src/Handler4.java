public class Handler4 implements PersonHandler {
    @Override
    public boolean test(Person p) {
        return p.getAge()%2==0 && p.getName1().startsWith("N");
    }

    @Override
    public void action(Person p) {

    }
}
