/*
Реализовать по образу и подобию написанного в классе MyLinkedList, линкед лист для Person

2. Добавить метод boolean addFirst(Person person), который позволяет добавить элемент в начало списка пользователей.

3. Добавить метод Person remove(int index), который возвращает персона по индексу и удаляет его из списка.

4. Добавить метод boolean remove(Person person), который возвращает true, если заданный персон присутствует в списке и
удаляет этого персона. Иначе метод возвращает false

 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //List<String> list = new LinkedList<>();

        MyLinkedList linkedList = new MyLinkedList();

        linkedList.add(new Person("Roger", "Federer", 40));
        linkedList.add(new Person("Rafa", "Nadal", 38));
        linkedList.add(new Person("Novak", "Djokovic", 37));
        linkedList.add(new Person("Daniil", "Medvedev", 26));
        System.out.println("Size = " + linkedList.size());
        linkedList.print();

        System.out.println();
        linkedList.addFirst(new Person("Marat", "Safin", 41));
        System.out.println("-----------------");
        linkedList.print();

        System.out.println();
        System.out.println("----------toArray-------");
        System.out.println(Arrays.toString(linkedList.toArray()));

        //System.out.println();
        //System.out.println("---------значаение по индексу в листе--------");
        //System.out.println(linkedList.get(4));

        //System.out.println();
        //System.out.println("----------test NodeFind(by index)--------"); // для проверки работы этого метода надо исправить на public
        //System.out.println(linkedList.find(1).getPerson()); //

        //System.out.println();
        //System.out.println("----------test NodeFind(by person)--------"); // для проверки работы этого метода надо исправить на public
        //System.out.println(linkedList.find(new Person("Rafa", "Nadal", 38)).getPerson());

        //System.out.println();
        //System.out.println("----------test remove(by node)--------"); // для проверки работы этого метода надо исправить на public
        //Node node = linkedList.find(1);
        //linkedList.remove(node);
        //System.out.println(linkedList);
        //System.out.println(linkedList.size());

        System.out.println();
        System.out.println("----------test remove Person (by index)-------");
        linkedList.remove(2);
        linkedList.print();

        System.out.println();
        System.out.println("----------test boolean remove (by person)-------");
        linkedList.remove(new Person("Daniil", "Medvedev", 26));
        linkedList.print();

    }

}