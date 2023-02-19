import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        /*
        Получить List из N случайных чисел
         */
        int n = 10;
        List<Integer> list1 = new ArrayList<>(n);
        //fillList(list1, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(list1);

        // для рандома есть отдельный класс Random
        Random rnd = new Random(System.currentTimeMillis());
        rnd.nextInt(); // от мин до макс интеджера
        rnd.nextInt(Integer.MAX_VALUE); // от 0 до макс интеджера не включительно


    }

    public static int getRnd(Random random, int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    /*
    public static void fillList(List<Integer> list, int min, int max) {
        for (int i = 0; i < list.size(); i++) {
            list.set() = (int) (min + Math.random() * ((long)max - min + 1));
        }
    }
    */

    /*
    public static void bubbleSort(List<Integer> list){
        for (int i=0; i< list.size()-1; i++){
            for (int j = 0; j < list.size()-1; j++) {
                if (list.get(j) > list.get(j + 1) {
                    int temp = list.get(j);
                    list.get(j) = list.get(j + 1);
                    list.get(j + 1) = temp;
                }

            }
        }
    }
    */

}