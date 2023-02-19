import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person ("Jack1", "Jack2", 20));
        people.add(new Person ("John1", "John2", 25));
        people.add(new Person ("Nick1", "Nick2", 45));
        people.add(new Person ("Klod1", "Klod2", 22));
        people.add(new Person ("Ann1", "Ann2", 30));
        people.add(new Person ("Nick11", "Nick22", 44));

        //System.out.println(getListPersonByAge(people));
        //System.out.println("--".repeat(50));
        //System.out.println(getListPersonByAgeWithPrint(people));
        //System.out.println("--".repeat(50));
        //System.out.println(getListPersonByNameWithPrint(people));

        System.out.println(listPersonHandler(people, new Handler1()));
        System.out.println("--".repeat(50));

        System.out.println(listPersonHandler(people, new Handler2()));
        System.out.println("--".repeat(50));

        System.out.println(people);
        System.out.println(listPersonHandler(people, new Handler3()));
        doSomethingWithPerson(people.get(0),new Handler3()); // уже не будет выполняться, поскольку при выполнении предыдущего метода у первого человека возраст стал 21
        System.out.println(people);
        System.out.println("--".repeat(50));

        System.out.println(listPersonHandler(people, new Handler4()));
    }



    public static ArrayList<Person> listPersonHandler (ArrayList<Person> people, PersonHandler handler){
        ArrayList<Person> result = new ArrayList<>();
        for (Person p: people){
            if (handler.test(p)) {
                handler.action(p);
                result.add(p);
            }
        }
        return result;
    }

    public static void doSomethingWithPerson (Person p, PersonHandler personHandler){
        if (personHandler.test(p)) {
            personHandler.action(p);
        }
    }

    /*
    public static ArrayList<Person> getListPersonByAge (ArrayList<Person> people){
        ArrayList<Person> result = new ArrayList<>();
        for (Person p: people){
            if (p.getAge() < 30) {
                result.add(p);
            }
        }
        return result;
    }

    public static ArrayList<Person> getListPersonByAgeWithPrint (ArrayList<Person> people){
        ArrayList<Person> result = new ArrayList<>();
        for (Person p: people){
            if (p.getAge() < 30) {
                p.printFull();
                result.add(p);
            }
        }
        return result;
    }

    public static ArrayList<Person> getListPersonByNameWithPrint (ArrayList<Person> people){
        ArrayList<Person> result = new ArrayList<>();
        for (Person p: people){
            if (p.getName1().equals("John1")) {
                p.incAge();
                result.add(p);
            }
        }
        return result;
    }
    */

}