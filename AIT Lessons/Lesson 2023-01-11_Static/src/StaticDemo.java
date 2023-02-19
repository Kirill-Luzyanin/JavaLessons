public class StaticDemo {

    public int nonStaticField;

    public static int staticField;

    public static void staticMethod(){
        System.out.println(" StaticDemo: Static method!"); // не нужно создавать объект, но не можем обращаться к полям класса
    }

    public void nonStaticMethod(){
        System.out.println(" StaticDemo: nonStatic method!"); // нужно создавать объект данного класса
    }

    @Override
    public String toString() {
        return "StaticDemo{" +
                "nonStaticField=" + nonStaticField +
                " StaticField=" + staticField +
                '}';
    }
}
