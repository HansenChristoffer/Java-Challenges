package com.seedling.app.maths;

public class FirstLastDigit {

    public static long firstDigit(int n) {
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }

    public static long lastDigit(int n) {
        return n % 10;
    }

}
