public class Main {
    public static void main(String[] args) {

        // Написать метод, который возвращает n-ное число в последовательности Фибоначчи
        //0 1 1 2 3 5 8 13 21 .....
        //fib(n)= fib(n-1)+fib(n-2);
        System.out.println(nNumberFibonacci(9));

    }

    public static int nNumberFibonacci(int n) {
        if (n == 1) {
            return 0;
        } if (n == 2) {
            return 1;
        } else {
            return nNumberFibonacci(n-1)+nNumberFibonacci(n-2);
        }
    }

}