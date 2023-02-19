/*
Дан массив из строк.
Необходимо сформировать лист из строк, которые начинаются на заданную подстроку.
Варианты:

["Hello world", "Hello Andy", "Java is the best", "Hell", "Say hello!", "hello Java", "HelloJava"], "Hello" ->
("Hello world", "Hello Andy", "HelloJava")

["Hello world", "Hello Andy", "Java is the best", "Hell", "Say hello!", "hello Java"], "hello" ->
("hello Java")

["Hello world", "Hello Andy", "Java is the best", "Hell", "Say hello!", "hello Java"], "  Hello  " ->
()

[], "Hello" -> ()

null, "Hello" -> ()

 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] strings = {};
        getListOfStringStartWith(null, "hello");

    }

    public static ArrayList<String> getListOfStringStartWith(String[] strings, String prefix){

        ArrayList<String> res = new ArrayList<>();
        if (strings != null) {
            for (int i = 0; i < strings.length; i++) {
                if (strings[i].startsWith(prefix)) {
                    res.add(strings[i]);
                }
            }
        }
        return res;
    }

}