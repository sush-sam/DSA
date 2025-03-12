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
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    /**
     * This function sorts an array using the merge sort algorithm.
     * @param arr the array to sort
     */
    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int k = low;
        int i = low;
        int j = mid + 1;

        int[] leftArray = new int[mid - low + 1];
        int[] rightArray = new int[high - mid];

        for (int x = 0; x < leftArray.length; x++) {
            leftArray[x] = arr[low + x];
        }
        for (int x = 0; x < rightArray.length; x++) {
            rightArray[x] = arr[mid + 1 + x];
        }
        i = 0;
        j = 0;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < leftArray.length) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rightArray.length) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    /**
     * This function sorts an array using the quick sort algorithm.
     * @param arr the array to sort
     * @param low the starting index
     * @param high the ending index
     */
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] < pivot && i < high) {
                i++;
            }
            while (arr[j] > pivot && j >= low) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return j;
    }

    /**
     * This function sorts an array using the recursive insertion sort algorithm.
     * @param arr the array to sort
     * @param n the size of the array
     */
    public static void recursiveInsertionSort(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
        recursiveInsertionSort(arr, i + 1);
    }

    /**
     * This function sorts an array using the recursive bubble sort algorithm.
     * @param arr the array to sort
     * @param n the size of the array
     */
    public static void recursiveBubbleSort(int[] arr, int i) {
        if(i == arr.length) {
            return;
        }
        for (int j = 0; j < arr.length - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        recursiveBubbleSort(arr, i + 1);
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
        System.out.println();

        int[] arr4 = {64, 25, 12, 22, 11};
        mergeSort(arr4, 0, arr4.length - 1);
        System.out.println("Sorted array using merge sort:");
        for (int num : arr4) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] arr5 = {64, 25, 12, 22, 11};
        quickSort(arr5, 0, arr5.length - 1);
        System.out.println("Sorted array using quick sort:");
        for (int num : arr5) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] arr6 = {64, 25, 12, 22, 11};
        recursiveInsertionSort(arr6, 0);
        System.out.println("Sorted array using recursive insertion sort:");
        for (int num : arr6) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] arr7 = {64, 25, 12, 22, 11};
        recursiveBubbleSort(arr7, 0);
        System.out.println("Sorted array using recursive bubble sort:");
        for (int num : arr7) {
            System.out.print(num + " ");
        }
    }
}