import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("1 task");
        System.out.println(cube(101_001_001));

        System.out.println();
        System.out.println("2 task");
        System.out.println(getLastDigit(-13458));

        System.out.println();
        System.out.println("3 task");
        System.out.println(Arrays.toString(getEven(7, 3)));

        System.out.println();
        System.out.println("4 task");
        //int[] array = {5, 9, -1, 6, 10, 1, 8};
        System.out.println(maxDigitIndex(new int[]{5, 9, -1, 6, 0, 1, 8}));

        System.out.println();
        System.out.println("5 task");
        String[] array1 = {null, "Nicolaus", "Ann"};
        System.out.println(maxLengthString(array1));

        System.out.println();
        System.out.println("6 task");
        Person p1 = new Person("John", 23);
        Person p2 = new Person("Nicolaus", 45);
        Person p3 = new Person("Ann", 21);
        Person[] array2 = {p1, p2, p3};
        System.out.println(showTheOldest(array2));

        System.out.println();
        System.out.println("7 task");
        String pp1 = new String("Ivan Ivanov");
        String pp2 = new String("Petr Petrov");
        String pp3 = new String("Luis Rosario De Lima Ronaldo");
        String[] array3 = {pp1, pp2, pp3};
        System.out.println(Arrays.toString(shortFirstName(array3)));

        System.out.println();
        System.out.println("8 task");
        String ppp1 = new String("Ivan Ivanov");
        String ppp2 = new String("Petr Petrov Petov");
        String ppp3 = new String("Oleg-Ylia Olegov");
        String ppp4 = new String("O.Nick Oleg-Petrov");
        String ppp5 = new String("Petrov");
        String[] array4 = {ppp1, ppp2, ppp3, ppp4, ppp5};
        System.out.println(Arrays.toString(stringsArrayToStudentsArray(array4)));

        System.out.println();
        System.out.println("9 task");
        System.out.println(sumDigits(3459));

        System.out.println();
        System.out.println("10 task");
        getPrimeNumbers(10);

        System.out.println();
        System.out.println();
        System.out.println("11 task");
        String[] array5 = {"John", "Nicolaus", "Ann"};
        //true -> {“John”, “Ann”}
        System.out.println(Arrays.toString(getNewsStringArray(array5, true)));
        System.out.println(Arrays.toString(getNewsStringArray(array5, false)));

        System.out.println();
        System.out.println("12 task");
        int[] array6 = {10, 5, 3, 12, -5, 18, 23, 1};
        System.out.println(Arrays.toString(array6));
        sort(array6);
        System.out.println(Arrays.toString(array6));

    }

    // 1. Написать метод, который принимает параметр типа int и возвращает третью степень этого числа.
    public static long cube(int a) {
        long b = (long) a;
        return b * b * b;
    }


    // 2. Написать метод, который возвращает значение последнего разряда числа.     Например:
    //getLastDigit(175) -> 5
    //getLastDigit(17) -> 7
    //getLastDigit(1529) -> 9
    public static int getLastDigit(int a) {
        return Math.abs(a % 10);
    }


    // 3. Написать метод, который создает массив из n целых четных чисел больше или равных заданному числу  a. Например:
    //getEven(n=7, a=4) -> {4,6,8,10,12,14,16}
    public static int[] getEven(int n, int minDigit) {
        if (minDigit % 2 != 0) {
            minDigit++;
        }

        if (n <= 0) {
            return new int[0];
        }

        // int[] res = new int[n]; // можно так задать массив
        int array[] = new int[n];

        for (int i = 0, j = minDigit; i < array.length; i++, j += 2) {
            array[i] = j;
        }
        return array;
    }


    // 4. Написать метод, который принимает массив целых чисел и возвращает индекс наибольшего числа в этом массиве. Например:
    //{5, 9, -1, 6, 10, 1, 8} -> 4
    public static int maxDigitIndex(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }


    // 5. Написать метод, который принимает массив строк и возвращает самую длинную строку в этом массиве. Например:
    //{“John”, “Nicolaus”, “Ann”} -> “Nicolaus”
    public static String maxLengthString(String[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        //String res = "";
        String maxlenght = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {                          //проверка на null в массиве
                if (arr[i].length() > maxlenght.length()) {
                    maxlenght = arr[i];
                }
            }
        }
        return maxlenght;
    }


    // 6. Написать метод, который принимает массив Person(String name, int age) и возвращает самого взрослого человека в этом массиве. Например:
    //{John 23  , Nicolaus 45, Ann 21} -> Nicolaus 45
    public static Person showTheOldest(Person[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        Person oldestPerson = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] != null) {
                if (array[i].getAge() > oldestPerson.getAge()) {
                    oldestPerson = array[i];
                }
            }
        }
        return oldestPerson;
    }


    // 7. Написать метод, который принимает массив строк вида “Иван Иванов”, т.е. имя и фамилия, а в качестве результата возвращает массив строк вида «И.Иванов» . Например:
    //{“Иван Иванов”, “Николай Николаев”, “Петр Петров”} -> {“И.Иванов”, “Н.Николаев”, “П.Петров”}
    public static String[] shortFirstName(String[] names) {
        String[] res = new String[names.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = getShortName(names[i]);
        }
        return res;
    }

    private static String getShortName(String name) {
        String[] words = name.split(" ", 2);    //c 1 не работает. Это же будет массив с длиной 1.
        String res = "";
        if (words.length >= 1) {
            res = String.valueOf(words[0].charAt(0)) + "." + words[1];
            return res;
        } else {
            res = name;
        }
        return res;
    }


    // 8. Написать метод, который принимает массив строк вида “Иван Иванов”, т.е. имя и фамилия,
    // а в качестве результата возвращает массив объектов типа Student{String firstName, String lastName}.

    public static Student[] stringsArrayToStudentsArray(String[] names) {
        Student[] res = new Student[names.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = getStudentByName(names[i]);
        }
        return res;
    }

    private static Student getStudentByName(String name) {
        // name != null - проверка на null
        String firstName = "";
        String lastName = "";
        String[] words = name.trim().split(" ");
        // !name.isEmpty() - проверка на пустую строку
        lastName = words[words.length - 1];
        for (int i = 0; i < words.length - 1; i++) {
            firstName += words[i] + " ";
        }
        return new Student(firstName.trim(), lastName);
    }


    // 9. Дано целое число num. Необходимо написать метод,
    // который посчитает сумму разрядов этого числа. Например: 3459 -> 21

    //var.1
    public static int sumDigits(int num) {
        int res = 0;
        num = Math.abs(num);
        while (num != 0) {
            res += num % 10;
            num = num / 10;
        }
        return res;
    }

    // var.2
    public static int sumDigits2(int num) {
        int sum = 0;
        num = Math.abs(num);
        String str = String.valueOf(num);
        for (int i = 0; i < str.length(); i++) {
            //sum += Character.getNumericValue(str.charAt(i));

        }
        return sum;
    }


    // 10. Число называется простым, если делиться без остатка только на единицу или на само себя.
    // Реализовать метод, который выводит n простых чисел. Например:
    // getPrimeNumbers(10) -> 1   2   3   5   7   11   13   17    19	23
    public static void getPrimeNumbers(int n) {
        int num = 1;
        while (n > 0) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                n--;
            }
            num++;
        }
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 11. Дан массив строк. Написать метод, который принимает данный массив и параметр boolean flag.
    // Метод должен возвращать новый массив строк, но, в зависимости от значения flag,
    // метод должен возвращать либо массив, содержащий все элементы исходного массива с четными индексами,
    // либо, наоборот, с нечетными индексами.
    //Например:
    //{“John”, “Nicolaus”, “Ann”}, true -> {“John”, “Ann”}
    //{“John”, “Nicolaus”, “Ann”}, false -> {“Nicolaus”}

    // flag == true - четные индексы
    // flag == false - нечетные индексы

    //1. нечетное кол-во элементов в массиве
    // flag = true
    // array.length/2+1
    // flag = false
    // array.length/2

    //2. четное кол-во элементов в массиве
    // flag = true
    // array.length/2
    // flag = false
    // array.length/2

    public static String[] getNewsStringArray(String[] array, boolean flag) {
        int len = array.length / 2;
        if (flag && array.length % 2 != 0) {
            len++;
        }
        String[] res = new String[len];
        int index = 0;
        if (flag == false) {
            index = 1;
        }
        for (int i = 0; i < res.length; i++) {
            res[i] = array[index];
            index += 2;
        }
        return res;
    }


    /*
    1 - 1
    5 - 25
    10 - 100
    1000 - 1000000
    1500 -2 250 000
    O(1)
    O(n)
    O(n^2)
    O(log n)
     */


    // O(n^2)

    // 12. Дан массив целых чисел. Написать метод, который сортирует данный массив в порядке возрастания.
    // Использовать любой известный вам алгоритм сортировки.
    public static void sort(int[] arr) {
        boolean flag = true;
        for (int i = 0; i < arr.length - 1 && flag == true; i++) {
            flag = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (isSwapNeeded(arr, j + 1, j)) {
                    swap(arr, j, j + 1);
                    flag = true;
                }
            }
        }
    }

    private static boolean isSwapNeeded(int[] arr, int i1, int i2) {
        return arr[i1] < arr[i2];
    }

    private static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }


    /*
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    // swap (array, j, j+1);  - можно так будет swap написать
                }
            }
        }
    }
    */


}