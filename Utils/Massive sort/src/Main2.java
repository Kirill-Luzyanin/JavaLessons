public class Main2 {
    public static void main(String[] args) {

        int[] arr1 = new int[10];
        //arr1[2] = 14;
        //System.out.println(arr1[2]);

        fillArray(arr1, -5, 20);
        printArray(arr1);
        // bubble(arr1);
        // printArray(arr1);
        // bubbleSort(arr1);
        // printArray(arr1);
        bubbleSort1(arr1);
        printArray(arr1);

    }

    /**
     *
     * @param array
     */
    public static void bubbleSort1(int[] array){
        for (int i=0; i<array.length-1; i++){
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }
        }
    }

    public static void bubbleSort(int[] array) {
        while (bubble(array)) ;
    }

    public static boolean bubble(int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                flag = true;
            }
        }
        return flag;

    }

    public static void fillArray(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (min + Math.random() * (max + 1 - min));
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("------------");
    }
}