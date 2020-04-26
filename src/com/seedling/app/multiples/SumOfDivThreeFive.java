package com.seedling.app.multiples;

import static com.seedling.app.multiples.Multiple.isMultiple;

public class SumOfDivThreeFive {

    public static long sumOfDivisibleThreeAndFive(int n) {
        long total = 0;

        for (int i = 0; i < n; i++) {
            if (isMultiple(i, 3) || isMultiple(i, 5)) {
                total += i;
            }
        }

        return total;
    }

}
