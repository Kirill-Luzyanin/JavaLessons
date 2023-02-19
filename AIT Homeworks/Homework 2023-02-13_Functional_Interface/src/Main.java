/*
В программе задан список Person{ String fName, String lName, String email, String
phone, Address address}. Address{String postcode, String city, String street, String
house}
Реализовать следующие функции:
-получить список всех ФИО
-получить список всех e-mail
-получить список всех телефонов
-получить список всех адресов в виде строки адреса

Естественно, все вышеперечисленные функции может и должен реализовать
один метод, в который в качестве параметра должен приходить список Person и
реализация необходимого способа обработки.

*/


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Address address1 = new Address("610020", "Kirov", "Karl Marx", "30A");
        Address address2 = new Address("610000", "Moscow", "Lenina", "65A");
        Address address3 = new Address("119214", "Moscow", "Pilugina", "26");

        Person p1 = new Person("Kirill", "Petrov", "kp@yahoo.com", "5556", address1);
        Person p2 = new Person("Olga", "Ivanova", "oi@gmail.com", "1111", address2);
        Person p3 = new Person("Elena", "Pushkina", "push@mail.ru", "3333", address3);

        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i));
        }

        // ФИО
        System.out.println(getSomeList(personList, (Person p) -> {
            return p.getFirstName()+ " " +p.getLastName();
        } ));

        // Email
        System.out.println(getSomeList(personList, (Person p) -> {
            return p.getEmail();
        } ));

        // Адрес
        System.out.println(getSomeList(personList, (Person p) -> {
            return String.valueOf(p.getAddress());
        } ));

    }

    public static List<String> getSomeList (List<Person> personList, PersonToStringFunction function){
        List<String> result = new ArrayList<>();

        for (Person p:personList) {
            result.add(function.personToString(p));
        }

        return result;
    }

}