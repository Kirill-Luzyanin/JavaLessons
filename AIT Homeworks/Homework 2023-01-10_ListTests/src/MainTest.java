import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

    @Test
    public void personListYoungerThanTest(){
        /*

        [""Ivan", "Ivanov", 45", "Petr", "Petrov", 25, "Olga", "Vasileva", 55, "Alla", "Andreeva", 48], ->
        (Ivanov I., 45, Petrov P., 25)

        1. Подоготовка ИД для вызова тестируемого метода
        2. Вызываем тестируемый метод с ИД
        3. Сравнили результат работы метода с ожидаемым результатом

         */

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Ivan", "Ivanov", 45));
        persons.add(new Person("Petr", "Petrov", 25));
        persons.add(new Person("Olga", "Vasileva", 55));
        persons.add(new Person("Alla", "Andreeva", 48));

        List<Person> actualResult = Main.personListYoungerThan(persons,45);

        List<Person> expectedResult = new ArrayList<>();
        expectedResult.add(new Person("Ivan", "Ivanov", 45));
        expectedResult.add(new Person("Petr", "Petrov", 25));

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void getPersonsAsStringListTest(){

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Ivan", "Ivanov", 45));
        persons.add(new Person("Petr", "Petrov", 25));
        //persons.add(new Person("Ivan", "Ivanovммм", 55));
        //persons.add(new Person("Petr", "Petrovммм", 65));

        List<String> actualResult = Main.getPersonsAsStringList(persons);

        // тут сразу 2 метода. Но это не очень хорошо для теста
        //List<String> actualResult = Main.getPersonsAsStringList(Main.personListYoungerThan(persons, 45));

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add(new String("Ivanov I., 45"));
        expectedResult.add(new String("Petrov P., 25"));

        Assertions.assertEquals(expectedResult,actualResult);

    }

}
