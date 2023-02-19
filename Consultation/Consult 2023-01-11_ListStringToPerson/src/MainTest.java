import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MainTest {

    @Test
    @DisplayName("Should return List<Person>")
    void listNamesToListPerson1(){

        ArrayList<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Maria");
        names.add("Stephan");
        names.add("John");
        names.add("Amalia");

        ArrayList<Person> expected = new ArrayList<>();
        expected.add(new Person("Maria"));
        expected.add(new Person("Stephan"));
        expected.add(new Person("Amalia"));

        Assertions.assertEquals(expected, Main.listNamesToListPerson(names));

    }

    @Test
    @DisplayName("Should return EmptyList")
    void listNamesToListPerson2(){

        ArrayList<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("John");

        Assertions.assertTrue(Main.listNamesToListPerson(names).isEmpty());

    }


}
