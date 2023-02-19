import java.util.Arrays;
import java.util.Scanner;

/*

Exception
Exception в Java представляют собой объект, генерируемый при возникновении исключительной ситуаций и содержащий информацию о ней.
Исключительная ситуация - аномальная ситуация, возникающая при работе программы и мешающая нормальному ходу выполнения программы.
Например: не найден файл, перепонен диск при записи, прислали некорректные данные и т.д.

try…catch….finally
В джаве предусмотрен встроенный механизм обработки исключений:

try{
       // код, при выполнение которого может произойти исключительная ситуация
   }
catch (Exception e){
      // код, который оббрабатывае исключительную ситуацию
  }
finally {
     //код, который должен быть выполнен при любом развитии событий
}
Блок try содержит контролируемый код, т.е. код который может привести к появлению Exception
Цель блока catch — исправление исключительных ситуаций, логирование события при необходимости и продолжение
нормальной работы программы. Блок finally выполняется в любом случае.

Концептуально, конструкция try…catch отделяет нормальный поток выполнения программы от кода обработки исключительных ситуаций.

 */


public class Main {
    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4};
        int index = 1;
        int index2 = 10;

        Scanner scanner = new Scanner(System.in);
        //getElementByIndex(arr, index);

        try {
            //scanner.nextInt();
            //getElementByIndex(arr, index);
            System.out.println(Arrays.toString(subArray(arr, index, index2)));

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception обработан!");
        }

    }

    public static int[] subArray(int[] array, int i1, int i2) {
        int res[] = new int[i2 - i1];
        int j = 0;
        try {
            for (int i = i1; i < i2; i++) {
                //res[j] = array[i]; //вместо такой записи используем строку ниже. Глупо, но для наглядности Exception
                res[j] = getElementByIndex(array, i);
                j++;
            }

        } catch (ArrayIndexOutOfBoundsException e){
            throw new GetSubArrayException(e);
        }

        return res;
    }

    public static int getElementByIndex(int[] array, int index) {
        /*
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException();
        }
         */
        return array[index];
    }

}