package basics;

public class Recursion {
    
    /**
     * This function checks if the string s is a palindrome.
     * @param s the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String s) {
        if(s == "" || s.length() == 1) {
            return true;
        }
        if(s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        }
        return false;
    }
    
    /**
     * This function reverses the array arr.
     * @param arr
     * @param i the index to start reversing from
     */
    public static void reverseArray(int arr[], int i) {
        if(i == (arr.length / 2)) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
        reverseArray(arr, i + 1);
    }

    /**
     * This function reverses the array arr.
     * @param arr
     */
    public static void reverseArray(int arr[]) {
       reverseArray(arr, 0);
    }

    /**
     * This function generates the Fibonacci number given n.
     * @param n the position in the Fibonacci sequence
     * @return the Fibonacci number at position n
     */
    public static int fibonacci(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("hello")); // false
        System.out.println(isPalindrome("racecar")); // true
        int arr[] = {1, 2, 3, 4, 5};
        reverseArray(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(fibonacci(5)); // 5
    }
}
