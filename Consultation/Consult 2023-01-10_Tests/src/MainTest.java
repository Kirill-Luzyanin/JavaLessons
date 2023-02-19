import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

    @Test
    public void testGetListOfStringStartWith_shouldReturnListOfString(){
        /*

        ["Hello world", "Hello Andy", "Java is the best", "Hell", "Say hello!", "hello Java", "HelloJava"], "Hello" ->
        ("Hello world", "Hello Andy", "HelloJava")

        1. Подоготовка ИД для вызова тестируемого метода
        2. Вызываем тестируемый метод с ИД
        3. Сравнили результат работы метода с ожидаемым результатом

         */

        String[] strings = {
                "Hello world", "Hello Andy", "Java is the best", "Hell", "Say hello!", "hello Java", "HelloJava"
        };

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Hello world");
        expectedResult.add("Hello Andy");
        expectedResult.add("HelloJava");

        List<String> actualResult = Main.getListOfStringStartWith(strings,"Hello");

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void testGetListOfStringStartWith_checkCaseSensitive(){

        String[] strings = {
                "Hello world", "Hello Andy", "Java is the best", "Hell", "Say hello!", "hello Java", "HelloJava"
        };

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("hello Java");

        List<String> actualResult = Main.getListOfStringStartWith(strings,"hello");

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void testGetListOfStringStartWith_shouldReturnEmptyList(){

        String[] strings = {
                "Hello world", "Hello Andy", "Java is the best", "Hell", "Say hello!", "hello Java", "HelloJava"
        };

        List<String> expectedResult = new ArrayList<>();

        List<String> actualResult = Main.getListOfStringStartWith(strings,"Jack");

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void testGetListOfStringStartWith_shouldReturnEmptyListIsNull(){

        String[] strings = null;

        List<String> expectedResult = new ArrayList<>();

        List<String> actualResult = Main.getListOfStringStartWith(strings,"Jack");

        Assertions.assertEquals(expectedResult,actualResult);

    }

}
