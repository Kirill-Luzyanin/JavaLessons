package ListInList;

import java.util.*;

/*
Дано List< List<Integer>> , каждый элемент этого листа - отсортированный лист Integer.
Необходимо объединить все листы в один отсортированный лист.
*/
public class Main {
    public static void main(String[] args) {

        List<Integer> list1 = List.of(2, 4, 5, 8, 9);
        List<Integer> list2 = List.of(-2, 0, 18, 25, 90);
        List<Integer> list3 = List.of(2, 3, 6, 8, 9, 10, 11, 12);
        List<Integer> list4 = List.of(-5, -2, 0);

        List<List<Integer>> list = List.of(list1, list2, list3, list4);
        System.out.println(list);

        /*List<List<Integer>> listArrayList = new ArrayList<>();
                listArrayList.add(list1);
                listArrayList.add(list2);
                listArrayList.add(list3);
                listArrayList.add(list4);
                System.out.println(listArrayList);*/

        System.out.println(marge1(list));
        System.out.println(marge2(list));



    }

    public static List<Integer> marge1(List<List<Integer>> listInput) {
        List<Integer> res = new ArrayList<>();
        for (List<Integer> list : listInput) {
            res.addAll(list);
        }
        Collections.sort(res);
        return res;
    }

    public static List<Integer> marge2(List<List<Integer>> listInput) {
        PriorityQueue<Integer> priorityQueue= new PriorityQueue<>();
        for (List<Integer> list : listInput) {
            for (Integer i: list){ //addAll()
                priorityQueue.offer(i);
            }
        }
        List<Integer> res = new ArrayList<>();
        while (priorityQueue.size()>0) {
        //while (!priorityQueue.isEmpty()) {
            res.add(priorityQueue.poll());
        }
        return res;
    }



}
