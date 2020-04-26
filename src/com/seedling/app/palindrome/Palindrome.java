package com.seedling.app.palindrome;

public class Palindrome {

    public static boolean isPalindrome(String word) {
        String reversedWord = "";

        for (int i = word.length()-1; i >= 0; i--) {
            reversedWord = reversedWord.concat(String.valueOf(word.charAt(i)));
        }

        return word.equalsIgnoreCase(reversedWord);
    }
}
