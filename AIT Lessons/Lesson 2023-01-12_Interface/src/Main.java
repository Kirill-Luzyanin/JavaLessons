import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Swimable> list = new ArrayList<>();
        list.add(new Duck("Donald", 10));
        list.add(new Person("Jack"));

        for (Swimable swimable: list) {
            swimable.swim();
        }
    }
}