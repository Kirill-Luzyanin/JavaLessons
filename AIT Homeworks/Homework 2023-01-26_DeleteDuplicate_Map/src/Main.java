/*
1. Дан лист объектов (любой, по вашему выбору: Person, Panda, Car и т.д.)
Необходимо реализовать метод void deleteDuplicate(list), которая удаляет повторяющиеся объекты,
при этом сохраняя порядок элементов исходного листа. Решить задачу всеми известными вам способами.


2. Дан лист строк, необходимо получить Map<String,Integer> такой, что ключом является строка из исходного листа,
значением, сколько раз она встречается в листе.

*/

import javax.swing.plaf.IconUIResource;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Cat");
        list.add("Dog");
        list.add("Mouse");
        list.add("Bear");
        list.add("Mouse");
        list.add("Owl");
        list.add("Cat");
        list.add("Cat");

        for (String str : list) {
            System.out.println(str);
        }

        System.out.println(newMap(list));

    }

    // 2.
    public static Map<String, Integer> newMap(List<String> list) {

        Map<String, Integer> map = new HashMap<>();
        HashSet<String> hashSet = new HashSet<>();
        int counter=1;
        for (String str: list) {
            if (!hashSet.add(str)) {
                counter++;
            }
            map.put(str, counter);
            /*if (hashSet.add(str)) {
                map.put(str, 1);
            }*/
        }

        /*for (int i = 0; i < list.size(); i++) {
            if (!hashSet.add(list.get(i))) {
                counter++;
            }
            map.put(list.get(i), counter);
        }*/

        return map;
    }
}