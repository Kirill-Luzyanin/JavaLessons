import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Дан список Account{Person person, String iban, double balance}.
Необходимо сформировать Map<Person, Account>, где ключом будет Person,
а значением список его счетов.
 */

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Кирилл", 35);
        Person person2 = new Person("Толя", 16);
        Person person3 = new Person("Виктор", 44);
        Person person4 = new Person("Вика", 54);

        // 1. Через groupingBy. Но так значанием будет лист аккаунтов?

        Map<Person, List<Account>> map1 = Stream.of(
                        new Account(person1, "DE1111", 5_000),
                        new Account(person1, "RU4444", 2_222),
                        new Account(person2, "ES0001", 1_000),
                        new Account(person2, "UA3333", 50_500),
                        new Account(person3, "FR8888", 100),
                        new Account(person3, "US7777", 333),
                        new Account(person4, "IT6666", 1_000),
                        new Account(person4, "ES5555", 777)
                )
                .collect(Collectors.groupingBy(s -> s. getPerson()));

        System.out.println("ДЗ №1 (через groupingBy): " + map1);


        // 2. Через toMap.

        Map<Person, Account> map2 = Stream.of(
                        new Account(person1, "DE1111", 5_000),
                        new Account(person1, "RU4444", 2_222),
                        new Account(person2, "ES0001", 1_000),
                        new Account(person2, "UA3333", 50_500),
                        new Account(person3, "FR8888", 100),
                        new Account(person3, "US7777", 333),
                        new Account(person4, "IT6666", 1_000),
                        new Account(person4, "ES5555", 777)
                )
                //.collect(Collectors.toMap(s -> s.getPerson(), s -> s ));
                //.collect(Collectors.toMap(s -> s.getPerson(), s -> s, (s1, s2) -> (s1 + "|" + s2) ));
                .collect(Collectors.toMap(s -> s.getPerson(), s->s, (s1,s2) -> s1 ));

        System.out.println("ДЗ №1 (через toMap): " + map2);

        //map1.forEach(System.out::println);

    }
}