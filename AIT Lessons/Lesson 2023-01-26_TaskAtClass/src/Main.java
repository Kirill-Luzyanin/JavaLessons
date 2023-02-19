import java.util.*;

/*
из 2 листов String сформировать лист из одинаковых элементов:
  1,2,3
  0,2,6,1
-->
  1,2

*/

public class Main {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Один");
        list1.add("Два");
        list1.add("Три");

        List<String> list2 = List.of("Ноль", "Два", "Шесть", "Один");

        //System.out.println(newListOfSameElements(list1, list2));

        System.out.println(newListOfSameElements2(list1, list2));
        System.out.println();
        //System.out.println(newListOfSameElements3(list1, list2));

        List<String> intersection = newListOfSameElements3(list1, list2);
        Iterator<String> iterator = intersection.iterator(); // с помощью итератора выведем
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        ListIterator<String> stringListIterator = intersection.listIterator(2); //это только у листов
        while (stringListIterator.hasNext()){
            System.out.println(stringListIterator.next());
        }

    }

    // не довел свое решение
    public static List<String> newListOfSameElements(List<String> list1, List<String> list2) {
        List<String> resultlist = new ArrayList<>();
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < list1.size(); i++) {
            hashSet.add(list1.get(i));
            for (int j = 0; j < list2.size(); j++) {
                if (hashSet.contains(list2.get(j))) {
                    resultlist.add(list2.get(j));
                }
            }
        }
        return resultlist;
    }


    public static List<String> newListOfSameElements2(List<String> list1, List<String> list2) {
        HashSet<String> hashSet = new HashSet<>();
        for (String s : list1) {
            if (list2.contains(s)) {
                hashSet.add(s);
            }
        }
        List<String> resultList = new ArrayList<>(hashSet);
        return resultList;
    }


    public static List<String> newListOfSameElements3(List<String> list1, List<String> list2) {
        HashSet<String> set = new HashSet<>(list1);
        set.retainAll(new HashSet<>(list2));
        return new ArrayList<>(set);
    }


}