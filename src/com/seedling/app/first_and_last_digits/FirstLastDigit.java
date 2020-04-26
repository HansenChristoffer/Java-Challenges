package com.seedling.app.first_and_last_digits;

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
