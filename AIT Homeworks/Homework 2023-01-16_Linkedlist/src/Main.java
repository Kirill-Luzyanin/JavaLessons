/*
1. Реализовать метод, который добавляет в List<Integer>  1000000 целых чисел.

2. Реализовать метод, который добавляет в List<Integer>  1000000 целых чисел, но
каждое следующее значение должно добавляться в случайную позицию листа.

 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {
    private static final int LIMIT = 50_000;
    private static final Random RND=new Random();
    private static long start;
    private static long finish;


    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        //List<Integer> list = new ArrayList<>(LIMIT);
        startTimer();
        addNumbersToRndPosition(list);
        stopTimer();
        //System.out.println(list);
        System.out.println("Done. List.size() ="+list.size());
        System.out.println(getTimer());

    }


    public static void startTimer(){
        start= System.nanoTime();
    }

    public static void stopTimer(){
        finish= System.nanoTime();
    }
    public static long getTimer(){
        long time = finish-start;
        return TimeUnit.MILLISECONDS.convert(time,TimeUnit.NANOSECONDS);
    }

    // 1.
    public static void addNumbers(List<Integer> list){
        for (int i = 0; i < LIMIT; i++) {
            list.add(RND.nextInt());
        }
    }

    // 2.
    //  выполнили метод сдвигая элементы вправо
    public static void addNumbersToRndPosition(List<Integer> list){
        list.add(RND.nextInt()); // создали лист длиной 1 элемент
        for (int i = 1; i < LIMIT; i++) {
            list.add(RND.nextInt(list.size()),RND.nextInt(-100,100)); //добавляем в рандомное значение листа рандомное значение от -100 до 100
        }
    }

    // выполнили метод через set. никаких сдвигов элементов. Замена одного значения по индексу
    // и данный метод быстрее!
    public static void addNumbersToRndPosition2(List<Integer> list){
        List<Integer> arr = new ArrayList<>(LIMIT);
        for (int i = 0; i < LIMIT; i++) {
            arr.add(i);
            list.add(null); //создали лист неизменной длины, заполнили все его элемменты null
        }

        for (int i = 0; i < LIMIT; i++) {
            int rndIdx = RND.nextInt(LIMIT - i);
            int rndFromList = arr.remove(rndIdx);
            list.set(rndFromList, RND.nextInt());
        }

    }

}