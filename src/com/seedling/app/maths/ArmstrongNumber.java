package com.seedling.app.maths;

import java.util.ArrayList;

import static com.seedling.app.maths.AllDigits.getDigits;

/**
 * An Armstrong number is the sum of the cubes of all its digits equal to the number itself.
 * Example: The number 370, 3³+7³+0³ = 370. 370 is a Armstrong number
 *
 * @author Christoffer Hansen
 * @see AllDigits
 * @since 1.0
 */
public class ArmstrongNumber {

    /**
     * getDigits() will return a ArrayList<Integer> of all the digits of n
     * It will "stream" through the arraylist, maps the "part" to a int
     * Iterate through every digit, digit to the power of 3
     * Sum it all together to get the total and then compare it to n
     * If the total is the same as n then return true otherwise return false
     *
     * @param n The integer that you will use and also compare to
     */
    public static boolean isArmstrongNumber(int n) {
        if (n >= 0) {
            return (getDigits(n, new ArrayList<>()).stream().mapToInt(digit -> (int) Math.pow(digit, 3)).sum()) == n;
        }
        return false;
    }
}
