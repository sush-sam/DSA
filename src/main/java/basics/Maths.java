package basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Maths class refereshes basic mathematical concepts.
 */
public class Maths {
    
    /**
     * This function checks how many digits in the number n evenly divide n.
     * @param n the number to check
     * @return the count of digits that evenly divide n
     */
    public static int evenlyDivides(int n) {
        int count = 0;
        int originalNumber = n;
        
        while (n > 0) {
            int digit = n % 10;
            if (digit > 0 && originalNumber % digit == 0) {
                count++;
            }
            n /= 10;
        }
        
        return count;
    }

    /**
     * This function reverses the digits of the number n.
     * @param n the number to reverse
     * @return the number with its digits reversed
     */
    public static int reverseDigits(int n) {
        int reversed = 0;
        
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        
        return reversed;
    }

    /**
     * This function checks if the number n is a palindrome.
     * @param n the number to check
     * @return true if the number is a palindrome, false otherwise
     */
    public static boolean isPalindrome(int n) {
        return n == reverseDigits(n);
    }

    /**
     * This function checks if the number n is an Armstrong number.
     * @param n the number to check
     * @return true if the number is an Armstrong number, false otherwise
     */
    public static boolean isArmstrong(int n) {
        int sum = 0;
        int originalNumber = n;
        int numberOfDigits = String.valueOf(n).length();
        
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, numberOfDigits);
            n /= 10;
        }
        
        return sum == originalNumber;
    }

    /**
     * This function returns all divisors of the number n.
     * @param n the number to find divisors for
     * @return a list of divisors of n
     */
    public static List<Integer> getDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (n / i != i) {
                    divisors.add(n / i);
                }
            }
        }
        Collections.sort(divisors);
        return divisors;
    }

    /**
     * This function checks if the number n is a prime number.
     * @param n the number to check
     * @return true if the number is a prime number, false otherwise
     */
    public static boolean isPrime(int n) {
        List<Integer> divisors = getDivisors(n);
        return divisors.size() == 2; // A prime number has exactly two divisors: 1 and itself
    }

    /**
     * This function finds the greatest common divisor (GCD) of two numbers.
     * @param a the first number
     * @param b the second number
     * @return the GCD of a and b
     */
    public static int gcd(int a, int b) {
        while (b != 0 && a != 0) {
            if(a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
         return a!=0 ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(evenlyDivides(120)); // 2
        System.out.println(reverseDigits(12345)); // 54321
        System.out.println(isPalindrome(121)); // true
        System.out.println(isPalindrome(123)); // false
        System.out.println(isArmstrong(153)); // true
        System.out.println(isArmstrong(123)); // false
        System.out.println(getDivisors(28)); // [1, 2, 4, 7, 14, 28]
        System.out.println(isPrime(29)); // true
        System.out.println(isPrime(28)); // false
        System.out.println(gcd(48, 18)); // 6
    }
}
