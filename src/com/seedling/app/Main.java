package com.seedling.app;

import com.seedling.app.datastructures.StackArrayList;
import com.seedling.app.reverse.ReverseArray;

import java.util.ArrayList;
import java.util.Arrays;

import static com.seedling.app.first_and_last_digits.FirstLastDigit.firstDigit;
import static com.seedling.app.first_and_last_digits.FirstLastDigit.lastDigit;
import static com.seedling.app.multiples.Multiple.isMultiple;
import static com.seedling.app.multiples.SumOfDivThreeFive.sumOfDivisibleThreeAndFive;
import static com.seedling.app.palindrome.Palindrome.isPalindrome;
import static com.seedling.app.reverse.ReverseWord.reverseWord;
import static com.seedling.app.searches.BinarySearch.binarySearch;
import static com.seedling.app.sorts.Sort.sortInt;
import static com.seedling.app.sorts.Sort.sortString;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        // Find out if String is a palindrome demonstrations
        System.out.println("isPalindrome(\"Hannah\") = " + isPalindrome("Hannah"));
        System.out.println("isPalindrome(\"Anna\") = " + isPalindrome("Anna"));
        System.out.println("isPalindrome(\"Stoffe\") = " + isPalindrome("Stoffe"));

        // Find out if a number is a multiple of given integer demonstrations
        System.out.println("isMultiple(30, 3) = " + isMultiple(30, 3));
        System.out.println("isMultiple(31, 3) = " + isMultiple(31, 3));
        System.out.println("isMultiple(33, 3) = " + isMultiple(33, 3));

        // Get sum of all integers divisible by three and five demonstrations
        System.out.println("sumOfDivisibleByThreeAndFive(100) = " + sumOfDivisibleThreeAndFive(100));
        System.out.println("sumOfDivisibleThreeAndFive(1000) = " + sumOfDivisibleThreeAndFive(1000));
        System.out.println("sumOfDivisibleThreeAndFive(10000) = " + sumOfDivisibleThreeAndFive(10000));

        // Get first and last digit of a integer demonstrations
        System.out.println("firstDigit(12345) = " + firstDigit(12345));
        System.out.println("firstDigit(54321) = " + firstDigit(54321));
        System.out.println("lastDigit(12345) = " + lastDigit(12345));
        System.out.println("lastDigit(54321) = " + lastDigit(54321));

        // Reverse String array demonstrations
        String[] x = {"hello", "pelle", "chris", "Stoffe", "telephone", "AbC", "DcE", "OkI", "Xavier"};
        System.out.println("Before reversed = " + Arrays.toString(x));
        ReverseArray<String> rvStringArray = new ReverseArray<>();
        x = rvStringArray.reverse(x);
        System.out.println("After reversed = " + Arrays.toString(x));
        rvStringArray = null;

        // Reverse Integer array demonstrations
        Integer[] y = {100, 234, 23, 98, 0, 23, 77, 68, 59, 12, 17, 1};
        System.out.println("Before reversed = " + Arrays.toString(y));
        ReverseArray<Integer> rvIntArray = new ReverseArray<>();
        y = rvIntArray.reverse(y);
        System.out.println("After reversed = " + Arrays.toString(y));
        rvIntArray = null;

        // Reverse a String demonstrations
        System.out.println("reverseWord(\"Hello\") = " + reverseWord("Hello"));
        System.out.println("reverseWord(\"Christoffer\") = " + reverseWord("Christoffer"));
        System.out.println("reverseWord(\"012 324 Chris 238 954\") = " + reverseWord("012 324 Chris 238 954"));

        // Sorting int array and Binary searching int array demonstrations
        int[] sortIntArray = { 2, 10, 8, 4, 1 };
        System.out.println("Before sorting = " + Arrays.toString(sortIntArray));
        sortInt(sortIntArray);
        System.out.println("After sorting = " + Arrays.toString(sortIntArray));

        int[] binIntArray = { 1, 2, 5, 8, 10, 12, 24, 36, 38 };
        System.out.println("Before searching = " + Arrays.toString(binIntArray));
        System.out.println("Searching for = 36 |> Is at Index = " + binarySearch(binIntArray, 36));

        // Sorting String array and Binary searching String array demonstrations
        String[] binStringArray = { "abc", "mno", "pqr", "def", "jkl", "ghi", "stu"};
        System.out.println("Before sorting = " + Arrays.toString(binStringArray));
        sortString(binStringArray);
        System.out.println("After sorting = " + Arrays.toString(binStringArray));

        System.out.println("Before searching = " + Arrays.toString(binStringArray));
        System.out.println("Searching for = pqr |> Is at Index = " + binarySearch(binStringArray, "pqr"));

        // StackArrayList demonstrations
        StackArrayList<String> stringStack = new StackArrayList<>();
        System.out.println("stringStack.size() = " + stringStack.size());
        System.out.println("stringStack.sneakPeek() = " + stringStack.peek());
        stringStack.push("Hello");
        System.out.println("stringStack.size() = " + stringStack.size());
        System.out.println("stringStack.sneakPeek() = " + stringStack.peek());
        stringStack.pushAll(binStringArray);
        System.out.println("stringStack.size() = " + stringStack.size());
        System.out.println("stringStack.sneakPeek() = " + stringStack.peek());
        ArrayList<String> testList = new ArrayList<>(Arrays.asList("Test", "list", "pewpew"));
        stringStack.pushAll(testList);
        System.out.println("stringStack.size() = " + stringStack.size());
        System.out.println("stringStack.sneakPeek() = " + stringStack.peek());
        System.out.println("stringStack.contains(\"Hello\") = " + stringStack.contains("Hello"));
        System.out.println("stringStack.contains(\"pqr\") = " + stringStack.contains("pqr"));
        String popString = stringStack.pop();
        System.out.println("popString = " + popString);
        System.out.println("stringStack.contains(popString) = " + stringStack.contains(popString));
        System.out.println("stringStack.sneakPeek() = " + stringStack.peek());
        System.out.println("stringStack.hashCode() = " + stringStack.hashCode());
        System.out.println("stringStack.isEmpty() = " + stringStack.isEmpty());
        System.out.println("stringStack.size() = " + stringStack.size());
        stringStack.clear();
        System.out.println("stringStack.size() = " + stringStack.size());
        System.out.println("stringStack.isEmpty() = " + stringStack.isEmpty());
    }
}