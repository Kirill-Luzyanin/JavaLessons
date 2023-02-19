import java.util.ArrayList;
import java.util.List;

/*
1) Из списка стрингов в список интов (каждый элемент - длина каждого слова из исходного списка)
2) Аналогично, но только гласные буквы из кадого стринга.
3) Каждой строке исходного списка соответсвует количество слов в соответсвующей строке исходного списка.


*/


public class Main {
    public static void main(String[] args) {

        List<String> stringList = List.of("Hello world", "как твои дела", "3", "34");
        List<String> stringList2 = List.of("Hello", "world");

        List<String> stringListItog = new ArrayList<>(stringList);
        stringListItog.addAll(stringList2);
        System.out.println(stringListItog);

        // 1
        System.out.println(stringToInteger(stringList));

        // 2
        System.out.println(stringToIntegerOfVowelsMy(stringList));
        System.out.println(stringToIntegerOfVowels(stringList));
        System.out.println(stringToIntegerOfVowels2(stringList));

        // 3
        System.out.println(stringToIntegerAll(stringListItog));


    }

    // 1
    public static List<Integer> stringToInteger(List<String> listOfString) {
        List<Integer> res = new ArrayList<>();

        for (String s : listOfString) {
            res.add(s.length());
        }
        return res;
    }

    // 2 - мой
    public static List<Integer> stringToIntegerOfVowelsMy(List<String> listOfString) {
        List<Integer> res = new ArrayList<>();
        for (String s : listOfString) {
            int counter = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.valueOf(s.charAt(i)).equalsIgnoreCase("a") ||
                        s.valueOf(s.charAt(i)).equalsIgnoreCase("e") ||
                        s.valueOf(s.charAt(i)).equalsIgnoreCase("i") ||
                        s.valueOf(s.charAt(i)).equalsIgnoreCase("o") ||
                        s.valueOf(s.charAt(i)).equalsIgnoreCase("u")) {
                    counter++;
                }
            }
            res.add(counter);
        }
        return res;
    }

    // 2 на уроке
    public static List<Integer> stringToIntegerOfVowels(List<String> listOfString) {
        List<Integer> vowelList = new ArrayList<>();
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
        for (String s : listOfString) {
            int counter = 0;
            for (int i = 0; i < s.length(); i++) {
                if (vowels.contains(s.charAt(i))) counter++;
            }
            vowelList.add(counter);
        }
        return vowelList;
    }

    public static List<Integer> stringToIntegerOfVowels2(List<String> listOfString) {
        List<Integer> vowelList = new ArrayList<>();
        String vowels = "aeiou";
        for (String s : listOfString) {
            int counter = 0;
            for (int i = 0; i < s.length(); i++) {
                if (vowels.indexOf((int) s.charAt(i)) > 0) counter++;
            }
            vowelList.add(counter);
        }
        return vowelList;
    }

    // 3
    public static List<Integer> stringToIntegerAll(List<String> listOfString) {
        List<Integer> listOfInteger = new ArrayList<>();
        for (String s : listOfString) {
            if (s != "" && s != null) {
                listOfInteger.add(s.split(" ").length);
            } else {
                listOfInteger.add(0);
            }
        }
        return listOfInteger;
    }


}