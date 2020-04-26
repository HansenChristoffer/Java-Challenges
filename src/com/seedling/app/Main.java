package com.seedling.app;

import com.seedling.app.datastructures.QueueArrayList;
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

        // Demonstrations
//        palindromeDemonstration();
//        multipleDemontration();
//        sumOfAllDivisiblesDemonstration();
//        getFirstAndLastDigitDemonstration();
//        reverseWordDemonstration();
//        reverseStringArrayDemonstration();
//        reverseIntegerArrayDemonstration();
//        sortAndBinarySearchIntArrayDemonstration();
//        sortAndBinarySearchStringArrayDemonstration();
//        stackArrayListDemonstration();
        queueArrayListDemonstration();

    }

    private void palindromeDemonstration() {
        // Find out if String is a palindrome demonstrations
        System.out.println("isPalindrome(\"Hannah\") = " + isPalindrome("Hannah"));
        System.out.println("isPalindrome(\"Anna\") = " + isPalindrome("Anna"));
        System.out.println("isPalindrome(\"Stoffe\") = " + isPalindrome("Stoffe"));
    }

    private void multipleDemontration() {
        // Find out if a number is a multiple of given integer demonstrations
        System.out.println("isMultiple(30, 3) = " + isMultiple(30, 3));
        System.out.println("isMultiple(31, 3) = " + isMultiple(31, 3));
        System.out.println("isMultiple(33, 3) = " + isMultiple(33, 3));
    }

    private void sumOfAllDivisiblesDemonstration() {
        // Get sum of all integers divisible by three and five demonstrations
        System.out.println("sumOfDivisibleByThreeAndFive(100) = " + sumOfDivisibleThreeAndFive(100));
        System.out.println("sumOfDivisibleThreeAndFive(1000) = " + sumOfDivisibleThreeAndFive(1000));
        System.out.println("sumOfDivisibleThreeAndFive(10000) = " + sumOfDivisibleThreeAndFive(10000));
    }

    private void getFirstAndLastDigitDemonstration() {
        // Get first and last digit of a integer demonstrations
        System.out.println("firstDigit(12345) = " + firstDigit(12345));
        System.out.println("firstDigit(54321) = " + firstDigit(54321));
        System.out.println("lastDigit(12345) = " + lastDigit(12345));
        System.out.println("lastDigit(54321) = " + lastDigit(54321));
    }

    private void reverseWordDemonstration() {
        // Reverse a String demonstrations
        System.out.println("reverseWord(\"Hello\") = " + reverseWord("Hello"));
        System.out.println("reverseWord(\"Christoffer\") = " + reverseWord("Christoffer"));
        System.out.println("reverseWord(\"012 324 Chris 238 954\") = " + reverseWord("012 324 Chris 238 954"));
    }

    private void reverseStringArrayDemonstration() {
        // Reverse String array demonstrations
        String[] x = {"hello", "pelle", "chris", "Stoffe", "telephone", "AbC", "DcE", "OkI", "Xavier"};
        System.out.println("Before reversed = " + Arrays.toString(x));
        ReverseArray<String> rvStringArray = new ReverseArray<>();
        x = rvStringArray.reverse(x);
        System.out.println("After reversed = " + Arrays.toString(x));
        rvStringArray = null;
    }

    private void reverseIntegerArrayDemonstration() {
        // Reverse Integer array demonstrations
        Integer[] y = {100, 234, 23, 98, 0, 23, 77, 68, 59, 12, 17, 1};
        System.out.println("Before reversed = " + Arrays.toString(y));
        ReverseArray<Integer> rvIntArray = new ReverseArray<>();
        y = rvIntArray.reverse(y);
        System.out.println("After reversed = " + Arrays.toString(y));
        rvIntArray = null;
    }

    private void sortAndBinarySearchIntArrayDemonstration() {
        // Sorting int array and Binary searching int array demonstrations
        int[] sortIntArray = { 2, 10, 8, 4, 1 };
        System.out.println("Before sorting = " + Arrays.toString(sortIntArray));
        sortInt(sortIntArray);
        System.out.println("After sorting = " + Arrays.toString(sortIntArray));

        int[] binIntArray = { 1, 2, 5, 8, 10, 12, 24, 36, 38 };
        System.out.println("Before searching = " + Arrays.toString(binIntArray));
        System.out.println("Searching for = 36 |> Is at Index = " + binarySearch(binIntArray, 36));
    }

    private void sortAndBinarySearchStringArrayDemonstration() {
        // Sorting String array and Binary searching String array demonstrations
        String[] binStringArray = { "abc", "mno", "pqr", "def", "jkl", "ghi", "stu"};
        System.out.println("Before sorting = " + Arrays.toString(binStringArray));
        sortString(binStringArray);
        System.out.println("After sorting = " + Arrays.toString(binStringArray));

        System.out.println("Before searching = " + Arrays.toString(binStringArray));
        System.out.println("Searching for = pqr |> Is at Index = " + binarySearch(binStringArray, "pqr"));
    }

    private void stackArrayListDemonstration() {
        // StackArrayList demonstrations
        StackArrayList<String> stringStack = new StackArrayList<>();
        String[] tempArray = { "abc", "mno", "pqr", "def", "jkl", "ghi", "stu"};

        System.out.println("stringStack.size() = " + stringStack.size());
        System.out.println("stringStack.sneakPeek() = " + stringStack.peek());

        stringStack.push("Hello");
        System.out.println("stringStack.size() = " + stringStack.size());
        System.out.println("stringStack.sneakPeek() = " + stringStack.peek());

        stringStack.pushAll(tempArray);
        System.out.println("stringStack.size() = " + stringStack.size());
        System.out.println("stringStack.sneakPeek() = " + stringStack.peek());

        ArrayList<String> tempList = new ArrayList<>(Arrays.asList("Test", "list", "pewpew"));
        stringStack.pushAll(tempList);
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

    private void queueArrayListDemonstration() {
        // QueueArrayList demonstrations
        QueueArrayList<String> stringQueue = new QueueArrayList<>();
        String[] tempArray = { "abc", "mno", "pqr", "def", "jkl", "ghi", "stu"};

        System.out.println("stringQueue.size() = " + stringQueue.size());
        System.out.println("stringQueue.sneakPeek() = " + stringQueue.peek());

        stringQueue.push("Hello");
        System.out.println("stringQueue.size() = " + stringQueue.size());
        System.out.println("stringQueue.sneakPeek() = " + stringQueue.peek());

        stringQueue.pushAll(tempArray);
        System.out.println("stringQueue.size() = " + stringQueue.size());
        System.out.println("stringQueue.sneakPeek() = " + stringQueue.peek());

        ArrayList<String> tempList = new ArrayList<>(Arrays.asList("Test", "list", "pewpew"));
        stringQueue.pushAll(tempList);
        System.out.println("stringQueue.size() = " + stringQueue.size());
        System.out.println("stringQueue.sneakPeek() = " + stringQueue.peek());

        System.out.println("stringQueue.contains(\"Hello\") = " + stringQueue.contains("Hello"));
        System.out.println("stringQueue.contains(\"pqr\") = " + stringQueue.contains("pqr"));

        String popString = stringQueue.pop();
        System.out.println("popString = " + popString);
        System.out.println("stringQueue.contains(popString) = " + stringQueue.contains(popString));
        System.out.println("stringQueue.sneakPeek() = " + stringQueue.peek());

        System.out.println("stringQueue.hashCode() = " + stringQueue.hashCode());

        System.out.println("stringQueue.isEmpty() = " + stringQueue.isEmpty());
        System.out.println("stringQueue.size() = " + stringQueue.size());
        stringQueue.clear();
        System.out.println("stringQueue.size() = " + stringQueue.size());
        System.out.println("stringQueue.isEmpty() = " + stringQueue.isEmpty());
    }

}