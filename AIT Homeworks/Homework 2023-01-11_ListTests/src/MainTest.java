import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MainTest {


    // 1.
    @Test
    public void stringFromStringListTest1() {

        ArrayList<String> testWords = new ArrayList<>();
        testWords.add("I");
        testWords.add("do");
        testWords.add("my");
        testWords.add("homework");

        String expectedResult = "I do my homework";

        String actualResult = Main.stringFromStringList(testWords);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void stringFromStringListTest2() {

        ArrayList<String> testWords = new ArrayList<>();
        testWords.add("I");
        testWords.add("do");
        testWords.add(null);
        testWords.add("homework");

        String expectedResult = "I do homework";

        String actualResult = Main.stringFromStringList(testWords);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void stringFromStringListTest3() {

        ArrayList<String> testWords = new ArrayList<>();
        testWords.add("I");
        testWords.add("do");
        testWords.add("");
        testWords.add("homework");

        String expectedResult = "I do homework";

        String actualResult = Main.stringFromStringList(testWords);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    // 2.
    @Test
    public void userToStringTest() {
        User u1 = new User("Joe", "Sakic", 33);

        String actualResult = u1.toString();
        String expectedResult = "Joe Sakic (33)";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void changeNamesTest() {
        User testUser = new User("Sakic", "Joe", 33);

        User actualResultUser = Main.changeNames(testUser);
        User expectedResultUser = new User("Joe", "Sakic", 33);

        Assertions.assertEquals(expectedResultUser, actualResultUser);
    }


}
