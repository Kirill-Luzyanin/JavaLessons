
/*
Дан список Person(name,age) необходимо написать метод, который возвращает Map<Person,Integer>,
где ключ это сам Person, а значение – сколько раз он встретился в списке.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {

        /*Stream<Person> persons = Stream.of(
                new Person("Кирилл", 35),
                new Person("Кирилл", 30),
                new Person("Толя", 16),
                new Person("Виктор", 44),
                new Person("Виктор", 40),
                new Person("Вика", 54)
        );*/

        Person p1 = new Person("Кирилл", 35);
        Person p2 = new Person("Кирилл", 35);
        Person p3 = new Person("Толя", 16);
        Person p4 = new Person("Толя", 16);
        Person p5 = new Person("Виктор", 44);
        Person p6 = new Person("Виктор", 60);
        Person p7 = new Person("Вика", 54);

        Map<Person, Long> personss = Stream.of(p1, p2, p3, p4, p5, p6,p7)
                .collect(Collectors.groupingBy(s->s,Collectors.counting()));

        System.out.println(personss);


        Map<Person, Long> collect = Stream.of(
                        new Person("Кирилл", 35),
                        new Person("Кирилл", 35),
                        new Person("Толя", 16),
                        new Person("Толя", 16),
                        new Person("Виктор", 44),
                        new Person("Виктор", 60),
                        new Person("Вика", 54)
                )
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        System.out.println(collect);

        //System.out.println(newMap(persons));

    }

    /*
    public static Map<Person,Integer> newMap(Stream<Person> persons) {
        //Map<Person,Integer> result = new HashMap<>();

        persons.collect(Collectors)

        return persons.collect(Collectors.groupingBy(s->s, s->s.le))
        //return result;
    }

     */

}