public class Handler3 implements PersonHandler{
    @Override
    public boolean test(Person p) {
        return p.getAge()<=20;
    }

    @Override
    public void action(Person p) {
        p.incAge();
    }
}
