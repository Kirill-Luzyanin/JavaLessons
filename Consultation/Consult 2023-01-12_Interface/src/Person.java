import java.util.SortedMap;

public class Person {

    private String name1;
    private String name2;
    private int age;

    public Person(String name1, String name2, int age) {
        this.name1 = name1;
        this.name2 = name2;
        this.age = age;
    }

    public void printFull() {
        System.out.println(name1 + " " + name2 + " " + age);
    }

    public void incAge() {
        age++;
    }


    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name1='" + name1 + '\'' +
                ", name2='" + name2 + '\'' +
                ", age=" + age +
                '}';
    }
}
