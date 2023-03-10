import java.util.*;

public class Main {
    public static void main(String[] args) {

        Car car1= new Car("Audi", 78_000,"Electro");
        Car car2= new Car("Lada", 8_000,"Gibrid");

        List<Car> list1 = new ArrayList<>();
        list1.add(car1);
        list1.add(car2);

        List<Car> list2 = new LinkedList<>(list1);
        Set<Car> set1 = new HashSet<>(list1);

        System.out.println(car1 + " hashCode: " + car1.hashCode()%12);
        //set1.remove(car1);
        list1.get(0).setPrice(130_000); //взяли объект из структуры, поменяли значение, и оно поменялось везде (и в аррэе, и в линкеде, и в сэте), все ссылки на один heap
        //set1.add(car1);
        System.out.println(car1 + " hashCode: " + car1.hashCode()%12);
        System.out.println();

        System.out.println("list1=" + list1);
        System.out.println("list2=" + list2);
        System.out.println("set1=" + set1);

        System.out.println("-------------------");
        System.out.println("is "+ car1 + " contains: "+ set1.contains(car1));

    }
}