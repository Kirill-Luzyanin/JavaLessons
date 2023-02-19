import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestTask2 {

    @Test
    public void listShouldBeSorted() {
        List<Integer> list = Task2_with_sort.generateSortedList(100);
        boolean sorted = true;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) {
                sorted = false;
                break;
            }
        }
        Assertions.assertTrue(sorted); // проверка ожидания (что sorted true)
    }

    @Test
    public void insertToEnd(){
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(19);
        list.add(25);
        list.add(31);

        Task2_with_sort.insert(list, 60);

        boolean res = list.get(4) == 60 &&
                      list.get(0) == 15 &&
                      list.get(1) == 19 &&
                      list.get(2) == 25 &&
                      list.get(3) == 31;
        Assertions.assertTrue(res); // проверка, что добавляем в конец и что лист тот же
    }

    @Test
    public void insertToEnd1(){
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(19);
        list.add(25);
        list.add(31);

        List<Integer> expectedlist = new ArrayList<>();
        expectedlist.add(15);
        expectedlist.add(19);
        expectedlist.add(25);
        expectedlist.add(31);
        expectedlist.add(60);

        Task2_with_sort.insert(list, 60);

        Assertions.assertEquals(expectedlist,list); //таже проверка через equals
    }

    // проверка добавления в середину
    @Test
    public void insertToMid(){
        List<Integer> list = new ArrayList<>(); // 15, 19, 25, 31
        list.add(15);
        list.add(19);
        list.add(25);
        list.add(31);

        List<Integer> expectedlist = new ArrayList<>(); // 15, 19, 22, 25, 31
        expectedlist.add(15);
        expectedlist.add(19);
        expectedlist.add(22);
        expectedlist.add(25);
        expectedlist.add(31);

        Task2_with_sort.insert(list, 22);

        Assertions.assertEquals(expectedlist,list);
    }

    @Test
    public void getIndexToInsertTest(){
        /*
        - создали ИД для вызова тестируемого метода
        - вызвали тестируемый метод с ИД
        - сравнили результат работы метода с ожидаемым результатом
         */

        List<Integer> inputList = new ArrayList<>();
        inputList.add(15);
        inputList.add(19);
        inputList.add(40);
        inputList.add(48);
        inputList.add(50);

        int value = 12;

        int expectedResult = 0;
        int actualResult = Task2_with_sort.getIndexToInsert(inputList, value);

        Assertions.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void getIndexToInsertTest1(){

        List<Integer> inputList = new ArrayList<>();
        inputList.add(15);
        inputList.add(19);
        inputList.add(40);
        inputList.add(48);
        inputList.add(50);

        int value = 30;

        int expectedResult = 2;
        int actualResult = Task2_with_sort.getIndexToInsert(inputList, value);

        Assertions.assertEquals(actualResult,expectedResult);
    }
}
