 /*
 Есть список с именами (List<String>).
 Написать метод, который вернет список Person (String name),
 в котором не содержатся Person c именами из исходного списка, с длиной 4.

 List<String> -> List<Person>

 Для каждого имени:
 - проверить условие (длина);
 - создать Persona;
 - добавить в лист результата.
  */

 import java.awt.image.AreaAveragingScaleFilter;
 import java.util.ArrayList;

 public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Maria");
        names.add("Stephan");
        names.add("John");
        names.add("Amalia");

        System.out.println(listNamesToListPerson(names));

    }

    public static ArrayList<Person> listNamesToListPerson(ArrayList<String> names){
        ArrayList<Person> people = new ArrayList<>();

        for (String name:names){
            if (name.length()>4){
                people.add(new Person(name));
            }
        }
        return people;
    }
}