public class Handler1 implements PersonHandler{
    @Override
    public boolean test(Person p) {
        return p.getAge()<30;
    }

    @Override
    public void action(Person p) {

    }
}
