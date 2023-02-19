/*
Дан лист строк (String).
Написать метод, который возвращает лист строк, где каждый элемент теперь в скобках.
qwe->(qwe)
vdssdvs; cdas ->(vdssdvs; cdas )

 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("jack");
        words.add("nick");
        words.add("lena");

        System.out.println(words);
        System.out.println(stringToStringWithRoundBrackets(words));
        System.out.println(stringToStringWithRoundBracketsToUpperCase(words));
        System.out.println(stringToStringWithSquareBracketsToUpperCase(words));

    }

    public static String wordTransformerAddRoundBrackets (String str){
        return "("+str+")";
    }

    public static List<String> stringToStringWithRoundBrackets (List<String> str){
        String res = "";
        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.size(); i++) {
            res = wordTransformerAddRoundBrackets(str.get(i));
            list.add(res);
        }

        return list;
    }

    public static List<String> stringToStringWithRoundBracketsToUpperCase (List<String> str){
        String res = "";
        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.size(); i++) {
            //res = "(" + str.get(i).toUpperCase().charAt(0) + ")"; // так только для первой буквы
            res = "(" + str.get(i).substring(0,1).toUpperCase()+str.get(i).substring(1) + ")";
            list.add(res);
        }

        return list;
    }

    public static List<String> stringToStringWithSquareBracketsToUpperCase (List<String> str){
        String res = "";
        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.size(); i++) {
            res = "[" + str.get(i).substring(0,1).toUpperCase()+str.get(i).substring(1) + "]";
            list.add(res);
        }

        return list;
    }

}