package com.seedling.app.maths;

/**
 * Fibonacci sequence with two different "end conditions".
 * The first Fibonacci function will continue until you've reached n iteration. (For loop)
 * The second Fibonacci function will continue until x value exceeds n value. (While loop)
 *
 * @author  Christoffer Hansen
 * @since 1.0
 */
public class Fibonacci {

    /**
     * Fibonacci Sequence function that continues until the loop has iterated n times
     *
     * @param n Number of times the sequence shall fire
     */
    public static void fibonacciSequenceFor(long n) {
        long x1 = 0;
        long x2 = 1;
        long x = 0;

        for (int i = 0; i < n; i++) {
            System.out.print(x + " ");
            x = x1 + x2;
            x1 = x2;
            x2 = x;
        }

        // Makes sure to push the terminal onto new line after Fibonacci is completed
        System.out.println();
    }

    /**
     * Fibpnacci Sequence function that continues until x values exceeds n value
     *
     * @param n Value that the x value is not allowed to exceed
     */
    public static void fibonacciSequenceWhile(long n) {
        long x = 0;
        long x1 = 0;
        long x2 = 1;

        while (x <= n) {
            System.out.print(x + " ");
            x = x1 + x2;
            x1 = x2;
            x2 = x;
        }

        // Makes sure to push the terminal onto new line after Fibonacci is completed
        System.out.println();
    }
}
