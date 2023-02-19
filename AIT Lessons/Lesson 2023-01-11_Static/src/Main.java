public class Main {
    public static void main(String[] args) {

        // static
        StaticDemo.staticMethod();
        StaticDemo.staticField = 10; // без объекта данного класса


        // non static
        StaticDemo obj1 = new StaticDemo();
        obj1.nonStaticMethod();
        obj1.nonStaticField = 20;

        StaticDemo obj2 = new StaticDemo();
        obj2.nonStaticField = 30;
        StaticDemo.staticField=100;
        obj1.staticField=101; // из любого объекта можно поменять для всех статичных

        System.out.println("Obj1 :" + obj1);
        System.out.println("Obj2 :" + obj2);



        Person[] people = {
                new Person("Jack"),
                new Person("John"),
                new Person("Ann"),
                new Person("Lena"),
                new Person("Alex"),
        };

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);

        }


    }


}