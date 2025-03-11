package basics;

public class Sorting {

    /**
     * This function sorts an array using the selection sort algorithm.
     * @param arr the array to sort
     */
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minimumIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minimumIndex]) {
                    minimumIndex = j; 
                }
            }
            if (minimumIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minimumIndex];
                arr[minimumIndex] = temp;
            }
        }
    }

    /**
     * This function sorts an array using the bubble sort algorithm.
     * @param arr the array to sort
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * This function sorts an array using the insertion sort algorithm.
     * @param arr the array to sort
     */
    public static void insertionSort(int[] arr) {
       for(int i = 1; i< arr.length; i++) {
           int key = arr[i];
           int j = i - 1;
           while(j >= 0 && arr[j] > key) {
               arr[j + 1] = arr[j];
               j = j - 1;
           }
           arr[j + 1] = key;
       }
    }

    public static void main(String[] args) { 
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println("Sorted array using selection sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        } 
        System.out.println();

        int[] arr2 = {64, 25, 12, 22, 11};
        bubbleSort(arr2);
        System.out.println("Sorted array using bubble sort:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] arr3 = {64, 25, 12, 22, 11};
        insertionSort(arr3);
        System.out.println("Sorted array using insertion sort:");
        for (int num : arr3) {
            System.out.print(num + " ");
        }
}
}