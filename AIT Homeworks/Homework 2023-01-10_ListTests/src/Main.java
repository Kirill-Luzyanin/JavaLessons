import java.util.ArrayList;
import java.util.List;

/*
Дан лист из Person (fName, lName, age). Необходимо получить лист из строк (String) вида (Иванов И., 45) для всех людей, младше заданного возраста.
В рамках данной задачи считаем, что исходный list не содержит значения null. Необходимо реализовать тесты.
 */

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Ivan", "Ivanov", 45);
        Person p2 = new Person("Petr", "Petrov", 25);
        Person p3 = new Person("Olga", "Vasileva", 55);
        Person p4 = new Person("Alla", "Andreeva", 48);

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);

        System.out.println(personList);

        // Вывод листа персонов:
        //System.out.println(personListYoungerThan(personList, 45));

        // Вывод листа String:
        List<String> personsAsStringList = getPersonsAsStringList(personListYoungerThan(personList, 45));
        System.out.println(personsAsStringList);

    }

    public static List<Person> personListYoungerThan(List<Person> persons, int ageValue) {
        List<Person> resList = new ArrayList<>();
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getAge() <= ageValue) {
                resList.add(persons.get(i));
            }
        }
        return resList;
    }

    public static List<String> getPersonsAsStringList (List<Person> people){
        List <String> list = new ArrayList<>();
        for (Person person:people) {
            list.add(person.toString());
        }
        return list;
    }

}