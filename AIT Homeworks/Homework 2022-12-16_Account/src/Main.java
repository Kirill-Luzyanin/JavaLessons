/*
1) Допустим, у вас есть класс Account со следующими полями String IBAN, double balance, Person client.
Person имеет следующие поля: String firstName, String lastName. Вам дан массив из Account.
Вам необходимо реализовать метод findAccountsByPerson, который принимает объект Person и выводит
на экран все Account принадлежащие данному пользователю.

2) Доработать этот метод таким образом, что бы он возвращал массив String c номерами IBAN
для заданного пользователя

3) Используя код написанный в классе, добавить в проекте про Accaunt
сортировку массива Account по значению поля balance

4) Используя код написанный в классе, добавить в проекте про Accaunt
сортировку массива Account по возрасту клиента
*/

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String str = "fdsfsd";

        Person p1 = new Person("Ivan", "Ivanov", 45);
        Person p2 = new Person("Petr", "Petrov", 25);

        Account acc1 = new Account("DE3000000000", 1_000, p1);
        Account acc2 = new Account("DE1234567890", 5_000, p2);
        Account acc3 = new Account("DE3000000001", 200, p1);

        Account[] accounts = {acc1,
                acc2,
                acc3,
                new Account("DE3222222222", 1_000_000, new Person("Jack", "Johnson", 70)),
                new Account("DE5555555522", 500_000, new Person("Ilya", "Smit", 30)),
                new Account("DE5555555525", 500_000, new Person("Ilya", "Smit", 30))
        };


        // 1.
        printAccountsByPerson(accounts, p1); // метод выдает необходимые позиции
        System.out.println(Arrays.toString(findAccountsByPerson(accounts,p1))); // метод возвращает массив

        // 2.
        System.out.println();
        System.out.println(Arrays.toString(findIBANSByPerson(accounts,p1)));

        // 3.
        System.out.println();
        System.out.println(Arrays.toString(accounts));
        sortByBalance(accounts);
        System.out.println(Arrays.toString(accounts));

        // 4.
        System.out.println();
        System.out.println(Arrays.toString(accounts));
        sortByAge(accounts);
        System.out.println(Arrays.toString(accounts));


    }

    // 1.
    // выводим просто
    public static void printAccountsByPerson(Account[] accounts, Person p){
        for (Account acc: accounts) {
            if (acc.getClient().equals(p)) {
                System.out.println(acc);
            }
        }

    }
    // выводим массив
    public static Account[] findAccountsByPerson(Account[] accounts, Person p) {
        // считаем
        int counter = 0;
        for (Account acc : accounts) {
            if (acc.getClient().equals(p)) {
                counter++;
            }
        }
        Account[] res = new Account[counter];
        // заполняем массив результата
        int index = 0;
        for (Account acc : accounts) {
            if (acc.getClient().equals(p)) {
                res[index++] = acc;
            }
        }
        return res;
    }

    public static Account[] findAccountsByPerson2(Account[] accounts, Person person) {
        AccountsArray res = new AccountsArray();
        for (Account acc : accounts) {
            if (acc.getClient().equals(person)) {
                res.add(acc);
            }
        }
        return res.getAsArray();
    }

    // 2.
    public static String[] findIBANSByPerson(Account[] accounts, Person p) {
        // считаем
        int counter = 0;
        for (Account acc : accounts) {
            if (acc.getClient().equals(p)) {
                counter++;
            }
        }
        String[] res = new String[counter];
        // заполняем массив результата
        int index = 0;
        for (Account acc : accounts) {
            if (acc.getClient().equals(p)) {
                res[index++] = acc.getIBAN();
            }
        }
        return res;
    }


    // 3.
    public static void sortByBalance(Account[] arr) {
        boolean flag = true;

        for (int j = 0; j < arr.length - 1 && flag; j++) {

            flag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (isSwapNeeded(arr, i + 1, i)) {
                    swap(arr, i, i + 1);
                    flag = true;
                }
            }
        }
    }

    private static boolean isSwapNeeded(Account[] arr, int i1, int i2) {
        return arr[i1].getBalance() < arr[i2].getBalance();
    }


    private static void swap(Account[] arr, int i1, int i2) {
        Account temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }


    // 4.
    public static void sortByAge(Account[] arr) {
        boolean flag = true;

        for (int j = 0; j < arr.length - 1 && flag; j++) {

            flag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (isSwapNeeded2(arr, i + 1, i)) {
                    swap2(arr, i, i + 1);
                    flag = true;
                }
            }
        }
    }

    private static boolean isSwapNeeded2(Account[] arr, int i1, int i2) {
        return arr[i1].getClient().getAge() < arr[i2].getClient().getAge();
    }


    private static void swap2(Account[] arr, int i1, int i2) {
        Account temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

}