import java.awt.geom.Arc2D;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        int a = 567; // 4 байта памяти для a, в которых лежит 567
        Integer aa = 567; // объект класса int, который в поле содержит 567
        // от аа уже можно вызывать методы
        // на самом деле это происходит:
        //Integer aa = new Integer(567);
        //Integer aa = Integer.valueOf(567); // тоже самое

        // классы обертки для разных типов:
        //Float f = 10.4f;
        Double d = 30.7;
        Boolean b = true;
        Short s = 10;
        Byte g = 7;
        Character ch = 'r';


        Float f = Float.valueOf(10.4f);

        double ddd = aa + f;


        System.out.println("------------------------");
        Integer i1 = 128;
        Integer i2 = 128;
        int i3 = 128;

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
        System.out.println(i1 == i3);
        System.out.println(i1.equals(i3));


        /////////////////////
        // 1.
        List<Integer> list = new ArrayList<>();
        list.add(null);
        list.add(14);
        list.add(45);
        list.add(16);
        list.add(null);
        list.add(17);
        list.add(234);
        list.add(-34);

        System.out.println();
        System.out.println("1 задача");
        System.out.println(list);

        if (list != null) { // проверка list на null
            System.out.println(findMaxValue(list));
        }

        // 2. и 2.1
        List<Person> personList = new ArrayList<>();
        personList.add (new Person("Vasya", 22));
        personList.add (new Person("Kolya", 45));
        personList.add (new Person("Masha", 22));
        personList.add (new Person("Sveta", 33));
        personList.add (new Person("Vasya", 22));
        //personList.add (new Person(null, 22));
        //personList.add (null);
        System.out.println();
        System.out.println("2 задача");
        System.out.println(findPersonByName(personList, "Vasya"));

        System.out.println();
        System.out.println("2.1 задача");
        System.out.println(howManyPersonsInList(personList, new Person("Sveta", 33)));

    }


    // 1. Найти макисмальное значение в листе
    public static int findMaxValue(List<Integer> list) {
        //if (list ==null || list.size()==0){
        // new Exception - будем чуть позже изучать
        //}

        int res = Integer.MIN_VALUE;
        System.out.println(res);
        for (Integer num : list) {
            if (num != null) { // проверка ячеек в листе на null
                if (num > res) {
                    res = num;
                }
            }
        }
        return res;
    }

    // 2. Найти в листе Персону по имени
    public static List<Person> findPersonByName (List<Person> list, String name){
        List<Person> result = new ArrayList<>();
        for (Person p : list) {
            if (p != null && p.getName() != null && p.getName().equals(name)) {
                result.add(p);
            }
        }
        return result;
    }

    // 2.1 (икать по Персону и говорить есть ли такой и сколько встречается в листе)
    public static int howManyPersonsInList(List<Person> list, Person p) {
        int result=0;
        for (int i = 0; i < list.size(); i++) {
            if (p.equals(list.get(i))) {
                result++;
            }
        }
        return result;
    }

}