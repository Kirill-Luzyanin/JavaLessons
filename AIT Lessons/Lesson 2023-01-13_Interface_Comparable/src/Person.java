public class Person implements Comparable<Person>{
    private String name1;
    private String name2;
    private int age;
    private double weight;

    public Person(String name1, String name2, int age, double weight) {
        this.name1 = name1;
        this.name2 = name2;
        this.age = age;
        this.weight = weight;
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

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name1='" + name1 + '\'' +
                ", name2='" + name2 + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }


    // для сортировки по возрасту
    @Override
    public int compareTo(Person o) {
        return this.age-o.age; // так только для интов можно
    }

    /*
    // для сортировки по имени
    @Override
    public int compareTo(Person o) {
        return this.name1.compareTo(o.name1);
    }
     */


    /*
    // для сортировки по числам (в данном случае weight)
    @Override
    public int compareTo(Person o) {
        if (this.weight>o.weight) return -1;
        if (this.weight<o.weight) return 1;
        return 0;
    }
     */

}
