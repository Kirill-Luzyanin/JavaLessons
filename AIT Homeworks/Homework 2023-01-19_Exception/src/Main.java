/*
1.      Допустим, у вас в программе есть класс Programmer. Кроме имени у нег есть поле String status; и этот статус
может иметь значение «доступен», «занят» и «не доступен».  Вам необходимо реализовать метод String doWork(String taskMsg)
который в качестве результата, либо возвращает stringMsg большими буквами, либо ProgrammerBusyException,
либо ProgrammerUnavailableNowException в зависимости от текущего состояния программера.
В зависимости от результата, вызывающий main выводить результат работы или
сообщение «Программист занят другой задачей» или «Программист не доступен».

 */

import java.awt.color.ProfileDataException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Programmer programmer1 = new Programmer("Kirill");

        programmer1.setNotAvailable();
        try {

            System.out.println(programmer1.doWork("dfdfdsfsd"));
        } catch (ProgrammerBusyException e){
            System.out.println("Программист занят!");
            System.out.println(e.getMessage());
        } catch (ProgrammerUnavailableNowException e) {
            System.out.println("Программист не доступен");
            System.out.println(e.getMessage());
        }
    }
}