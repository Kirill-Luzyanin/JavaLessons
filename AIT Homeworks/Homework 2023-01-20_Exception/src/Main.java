/*

1 . У вас в программе создается User. Класс User имеет следующие поля:
{
String firstName,
  	String lastName,
   	int age,
   	String email}
).
При этом, в качестве исходных данных приходит строка, вида:
“John;Lennon;40;lennon@mail.com”
Система должна либо создавать объект, либо cформировать Exception.
При этом, должна быть возможность получить все ошибки, которые привели к не созданию объекта.
Например:
Некорректный формат строки. В строке не хватает данных
Поле не задано (пустое)
email имеет неправильный формат: короче 4 символов или не содержит символ @.
Поле возраст некорректно
В строке больше полей, чем необходимо


 */

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String str1 = "John;K;20;lennon@mail.com";
        //System.out.println(createUser(str1));


        try {
            System.out.println(createUser(str1));
        } catch (IncorrectInputException e) {
            System.out.println("Ошибка ввода!");
            System.out.println(e.getMessage());
            //System.out.println(e.getMessage());
        }

    }

    public static User createUser (String string) throws IncorrectInputException {
        User newUser = new User();

        string.split(";");

        String[] array = string.split(";"); // разделяем через указанный символ
        System.out.println(Arrays.toString(array));

        newUser.setFirstName(array[0]);
        newUser.setLastName(array[1]);
        newUser.setAge(Integer.parseInt(array[2]));
        newUser.setEmail(array[3]);

        if (newUser.getFirstName().equals("") || // можно и так newUser.getFirstName().isEmpty()
                newUser.getLastName().isEmpty() ||
                // (Integer.toString(newUser.getAge())).equals("") ||
                // (Integer.toString(newUser.getAge())).isEmpty() ||
                // newUser.getAge()==null  ||
                        newUser.getEmail().isEmpty()) throw new IncorrectInputException("Одно из полей пустое");

        return newUser;

    }


}