package com.seedling.app.reverse;

public class ReverseWord {

    public static String reverseWord(String s) {
        String reversedString = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversedString = reversedString.concat(String.valueOf(s.charAt(i)));
        }

        return reversedString;
    }

}
