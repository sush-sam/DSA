package basics;

/**
 * Patterns class contains methods to print different patterns. 
 * Ref : https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
 */
public class Patterns {
    /**
     * Prints following pattern: 
     *****
     *****
     *****
     *****
     *****
     */
    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Prints following pattern:
     * 
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     */
    public static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Prints following pattern:
     * * * * *
     * * * *
     * * *
     * *
     *
     */
    public static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Prints following pattern:
     * 
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     * 1 2 3 4 5
     */
    public static void pattern4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
    }

    /**
     * Prints following pattern:
     * 
     * 1 2 3 4 5
     * 1 2 3 4
     * 1 2 3
     * 1 2
     * 1
     */
    public static void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
    }

    /**
     * Prints following pattern:
     * 
     * 1
     * 2 2
     * 3 3 3
     * 4 4 4 4
     * 5 5 5 5 5
     */
    public static void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((i + 1) + " ");
            }
            System.out.println();
        }
    }

    /**
     * Prints following pattern:
     *    *
     *   ***
     *  *****
     * *******
     */
    public static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            //Print spaces
            for(int j=0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /**
     * Prints following pattern:
     * 
     * *******
     *  *****
     *   ***
     *    *
     */
    public static void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }
            //Print spaces
            for(int j=0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /**
     * Prints following pattern:
     * 
     *    *
     *   ***
     *  *****
     * *******
     * *******
     *  *****
     *   ***
     *    *
     */
    public static void pattern9(int n) {
        pattern7(n);
        pattern8(n);
    }

    /**
     * Prints following pattern:
     * 
     * *
     * **
     * ***
     * ****
     * *****
     * ****
     * ***
     * **
     * *
     */
    public static void pattern10(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(j<=i)
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
          System.out.println();
       }
       for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-1; j++) {
                if(j<=n-i-1)
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
         System.out.println();
        }
    }

    /**
     * Prints following pattern:
     * 
     * 1
     * 0 1
     * 1 0 1
     * 0 1 0 1
     * 1 0 1 0 1
     */
    public static void pattern11(int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }

    /**
     * Prints following pattern:
     * 
     * 1             1
     * 1 2         2 1
     * 1 2 3     3 2 1
     * 1 2 3 4 4 3 2 1
     * 1 2 3 4 5 4 3 2 1
     */
    public static void pattern12(int n) {
        for (int i = 0; i < n; i++) {
            // Print first part (1 to i+1)
            for (int j = 0; j <= i; j++) {
                System.out.print((j + 1) + " ");
            }
            
            // Print spaces
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print("  ");
            }
            
            // Print second part (i+1 to 1)
            for (int j = i; j >= 0; j--) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
    }

    /**
     * Prints following pattern:
     * 
     * 1
     * 2 3
     * 4 5 6
     * 7 8 9 10
     * 11 12 13 14 15
     */
    public static void pattern13(int n) {
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    /**
     * Prints following pattern:
     * 
     * A
     * A B
     * A B C
     * A B C D
     * A B C D E
     */
    public static void pattern14(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)('A' + j) + " ");
            }
            System.out.println();
        }
    }

    /**
     * Prints following pattern:
     * 
     * A B C D E
     * A B C D
     * A B C
     * A B
     * A
     */
    public static void pattern15(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print((char)('A' + j) + " ");
            }
            System.out.println();
        }
    }

    /**
     * Prints following pattern:
     * 
     * A
     * B B
     * C C C
     * D D D D
     * E E E E E
     */
    public static void pattern16(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)('A' + i) + " ");
            }
            System.out.println();
        }
    }

    /**
     * Prints following pattern:
     * 
     *         A
     *       A B A
     *     A B C B A
     *   A B C D C B A
     * A B C D E D C B A
     */
    public static void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" " + " ");
            }
            
            // Print letters in ascending and descending order
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j <= i) {
                    System.out.print((char)('A' + j) + " ");
                } else {
                    System.out.print((char)('A' + (2 * i - j)) + " ");
                }
            }
            
            // Print trailing spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" " + " ");
            }
            
            System.out.println();
        }
    }

    /**
     * Prints following pattern:
     * 
     * E
     * E D
     * E D C
     * E D C B
     * E D C B A
     */
    public static void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + (n - j - 1)) + " ");
            }
            System.out.println();
        }
    }

    /**
     * Prints given stars followed by spaces and then stars
     * @param stars
     * @param spaces
     */
    public static void printStarsAndSpaces(int stars, int spaces) {
        for (int j = 0; j < stars; j++) {
            System.out.print("*" + " ");
        }
        for (int j = 0; j < spaces; j++) { 
            System.out.print(" " + " ");            
        }
        for (int j = 0; j < stars; j++) {
            System.out.print("*" + " ");
        }
    }

    /**
     * Prints following pattern:
     * 
     * * * * * * * * * * * 
     * * * *      * * * * 
     * * *          * * * 
     * *              * * 
     *                  * 
     *                  * 
     * *              * * 
     * * *          * * * 
     * * * *      * * * * 
     * * * * *  * * * * * 
     * * * * * * * * * * *
     */
    public static void pattern19(int n) {
        for (int i = 0; i < n; i++) {
            printStarsAndSpaces(n - i, 2 * i);
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            printStarsAndSpaces(i, 2 * (n - i));
            System.out.println();
        }
    }

    /**
     * Prints following pattern:
     * 
     * *                 * 
     * * *             * * 
     * * * *         * * * 
     * * * *       * * * * 
     * * * * *   * * * * * 
     * * * * *   * * * * *
     * * * *       * * * *
     * * *           * * *
     * *               * * 
     *                   * 
     * 
     */
    public static void pattern20(int n) {
        for (int i = 1; i <= n; i++) {
            printStarsAndSpaces(i, 2 * (n - i));
            System.out.println();
        }
        // To avoid printing the middle row twice
        n--;

        for (int i = 0; i < n; i++) {
            printStarsAndSpaces(n - i, 2 * i);
            System.out.println();
        }
    }

    /**
     * Prints following pattern:
     * 
     * *****
     * *   *
     * *   *
     * *   *
     * *****
     */
    public static void pattern21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Prints following pattern:
     * 
     * 4444444
     * 4333334
     * 4322234
     * 4321234
     * 4322234
     * 4333334
     * 4444444
     */
    public static void pattern22(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int left = j;
                int right = (2 * n - 1) - j - 1;
                int top = i;
                int bottom = (2 * n - 1) - i - 1;
                int minimumDistance = Math.min(Math.min(left, right), Math.min(top, bottom));
                System.out.print(n - minimumDistance);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);
        System.out.println();
        pattern7(5);
        System.out.println();
        pattern8(5);
        System.out.println();
        pattern9(5);
        System.out.println();
        pattern10(5);
        System.out.println();
        pattern11(5);
        System.out.println();
        pattern12(5);
        System.out.println();
        pattern13(5);
        System.out.println();
        pattern14(5);
        System.out.println();
        pattern15(5);
        System.out.println();
        pattern16(5);
        System.out.println();
        pattern17(5);
        System.out.println();
        pattern18(5); 
        System.out.println();
        pattern19(5);
        System.out.println();
        pattern20(5);
        System.out.println();
        pattern21(5);
        System.out.println();
        pattern22(4);
    }
}
