public class Person {
    private String name;
    private int age;
    private String title;

    public Person(String name, int age, String title) {
        this.name = name;
        this.age = age;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s %d %s", name, age, title);
    }
}
