/*
1
Дан List строк. Написать метод, который возвращает строку, которая есть результат объединения всех строк исходного листа через пробел.
Например: {“I”, “do”, “my”, ”homework”} -> “I do my homework”. Написать тесты.

2
Пусть дан список List объектов типа User{String fName, String lName, int age }. Предположим, при чтение User-ов из базы данных случилась ошибка
и у всех пользователей из списка поменялись местами fName и lName.
Необходимо написать метод, который исправит данную ситуацию. Написать тесты

 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // 1.
        ArrayList<String> words = new ArrayList<>();
        words.add("I");
        words.add("do");
        words.add("my");
        words.add("homework");

        System.out.println(words);
        System.out.println(stringFromStringList(words));

        System.out.println("----------------2----------------");
        // 2.
        User u1 = new User ("Sakic", "Joe", 33);
        User u2 = new User ("Pupkin", "Vasya", 25);
        System.out.println(u1);

        changeNames(u1);
        changeNames(u2);
        System.out.println(u1);
        System.out.println(u2);

        ArrayList<User> users = new ArrayList<>();
        users.add(u1);
        //users.add(u2);
        //users.add(u3);
        //users.add(u4);
    }

    // 1.
    public static String stringFromStringList(ArrayList<String> str) {
        String res = "";
        for (int i = 0; i < str.size(); i++) {
            if (str.get(i) != null && !str.get(i).equals("")) {
                if (i == str.size() - 1) {
                    res += str.get(i);
                } else
                    res += str.get(i) + " ";
            }
        }
        return res;
        //return res.trim();
    }

    // 2.
    public static User changeNames (User user){
        //User renewedUser = new User(user.getLastName(), user.getFirstName(), user.getAge());
        String temp = user.getFirstName();
        user.setFirstName(user.getLastName());
        user.setLastName(temp);
        return user;
        //return renewedUser;
    }

}