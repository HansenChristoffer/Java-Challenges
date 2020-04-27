package com.seedling.app.maths;

import java.util.List;

public class AllDigits {

    public static List<Integer> getDigits(int n, List<Integer> digits) {
        if (n > 0) {
            getDigits(n / 10, digits);
            digits.add(n % 10);
        }

        return digits;
    }

}
