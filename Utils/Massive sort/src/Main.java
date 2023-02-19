public class Main {
    public static void main(String[] args) {

        int[] arr1 = new int[15];
        fillArray(arr1, 1, 100);
        printArray(arr1);

        int minIndexInArray = indexMinInRange(arr1, 5);
        System.out.println(minIndexInArray);

        selectionSort(arr1);
        printArray(arr1);

        //int indexOfValue=binarySearch(arr1, 75);
        //System.out.println(indexOfValue);

    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = indexMinInRange(arr, i + 1);
            if (arr[i] > arr[index]) {
                int t = arr[i];
                arr[i] = arr[index];
                arr[index] = t;

            }
        }
    }

    public static int binarySearch (int [] arr, int value){
        int left=0;
        int right=arr.length-1;
        while (left<=right) {
            int mid = (left + right) / 2;
            if(arr[mid]==value){
                return mid;
            }
            if (arr[mid]>value){
                right=mid-1;
            }
            else {
                left=mid+1;
            }
        }
        return -1;
        //System.out.println("Нет такого числа");

    }

    /**
     * поиск индекса минимального значения в диапазоне с заданного индекса
     *
     * @param arr
     * @param startIndex
     * @return
     */
    public static int indexMinInRange(int[] arr, int startIndex) {
        int index = startIndex; // по умолчанию заводим индекс, который является минимальным по умолчанию
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[index] > arr[i]) {
                index = i;
            }
        }
        return index;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Arr [" + i + "]" + "=" + arr[i]);
        }
        System.out.println("**************");
    }

    public static void fillArray(int[] arr, int min, int max) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (min + Math.random() * (max + 1 - min));
        }
    }
}