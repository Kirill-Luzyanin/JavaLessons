import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
//import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        System.out.println(List.of("1gsg", "4ss", "6aaa", "2www", "1")
                .stream()
                .filter(s -> s.length() > 3)
                .map(s -> {
                    System.out.println("hi");
                    return s.length();
                }).toList()
        );

        //.map((s)->s.indexOf("a"));
        ///.filter(i->i%2==0)
        //person1->person1.age>10


        ///flatMap
        List<Person> people = List.of(
                new Person("p1", 13, List.of("acc1", "acc2", "acc3")),
                new Person("p2", 20, List.of("bcc4", "acc5", "acc6")),
                new Person("p3", 19, List.of("acc7", "bcc8", "acc9")),
                new Person("p4", 6, List.of("acc10", "acc11", "acc13")),
                new Person("p5", 18, List.of("acc456"))
        );

        people.stream()
                .filter(p -> p.getAge() > 16)
                .filter(p -> p.getAccounts().size() > 2)
                .flatMap(person -> person.getAccounts().stream())
                .filter(acc -> acc.startsWith("b"))

                .forEach(a -> System.out.println(a));


        Stream.concat(List.of(1, 3, 4).stream(), List.of(6, 98, 0).stream()); // объединение

        Stream.iterate(10, s -> s + 10)
                .limit(20)
                .forEach(s -> System.out.println(s));

        System.out.println("------------------------");
        System.out.println(IntStream.iterate(10, s -> s + 10)
                .limit(20)
                .sum());
        /*
        System.out.println("------------------------");
        System.out.println(Stream.iterate(10, s -> s + 10)
                .limit(20)
                .reduce((acc, i) -> acc + i));
        */

        System.out.println("------------------------");
        System.out.println(Stream.of(1,2,4,5)
                .reduce(100,(acc, i) -> acc + i));  // acc=0 i=1
                                                            // acc=1 i=2
                                                            // acc=3 i=4

        System.out.println("------------------------");
        System.out.println(Stream.of("qwe", "qwa", "asqw", "uyte")
                .reduce("", (acc, str) -> (str.startsWith("a") ? str : acc)));


        System.out.println("------------------------");
        System.out.println(Stream.of("qwe", "qwa", "asqw", "uyte").collect(Collectors.toSet()));


    }

    public static void mm(int[] arr) {
        Arrays.stream(arr);
    }

}