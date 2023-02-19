import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringsList = new ArrayList<>(1000);
        stringsList.add("hello");
        stringsList.add("hello1");
        stringsList.add("hello2");
        System.out.println(stringsList);
        System.out.println(stringsList.size());

        //iterate
        System.out.println("iterate stringList:");
        for (int i = 0; i < stringsList.size(); i++) {
            System.out.println(stringsList.get(i));
        }

        System.out.println();
        System.out.println("iterate stringList with for each:");
        for (String str: stringsList){
            System.out.println(str);
        }

        Person p1 = new Person("Ivan", 44, "Ser");
        Person p2 = new Person("Oleg", 20, "Mr");
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);

        System.out.println();
        System.out.println("iterate personList:");
        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i).getName());
        }

        System.out.println();
        System.out.println("iterate personList with for each:");
        for (Person person:personList) {
            System.out.println(person.getName());
        }

        System.out.println();
        printStringList(stringsList);

        System.out.println();
        printPersonList(personList);

    }

    public static void printStringList(ArrayList<String> list){
        System.out.println("--------printStringList--------");
        System.out.println("size: " + list.size());
        for (String str:list){
            System.out.println(str);
        }
    }

    public static void printPersonList(ArrayList<Person> list){
        System.out.println("--------printPersonList--------");
        System.out.println("size: " + list.size());
        for (Person str:list){
            System.out.println(str);
        }
    }


}