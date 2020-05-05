package com.seedling.app;

import com.seedling.app.collections.MaxValue;
import com.seedling.app.collections.datastructures.QueueArrayList;
import com.seedling.app.collections.datastructures.StackArrayList;
import com.seedling.app.maths.Fibonacci;
import com.seedling.app.reverse.ReverseArray;
import com.seedling.app.searches.LinearSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.seedling.app.collections.MaxValue.getLargestValue;
import static com.seedling.app.collections.MaxValue.getLargestValueIndex;
import static com.seedling.app.maths.Fibonacci.fibonacciSequenceWhile;
import static com.seedling.app.maths.AllDigits.getDigits;
import static com.seedling.app.maths.ArmstrongNumber.isArmstrongNumber;
import static com.seedling.app.maths.FirstLastDigit.firstDigit;
import static com.seedling.app.maths.FirstLastDigit.lastDigit;
import static com.seedling.app.maths.Multiple.isMultiple;
import static com.seedling.app.maths.SumOfDivThreeFive.sumOfDivisibleThreeAndFive;
import static com.seedling.app.palindrome.Palindrome.isPalindrome;
import static com.seedling.app.reverse.ReverseWord.reverseWord;
import static com.seedling.app.searches.BinarySearch.binarySearch;
import static com.seedling.app.searches.LinearSearch.linearSearch;
import static com.seedling.app.sorts.Sort.sortInt;
import static com.seedling.app.sorts.Sort.sortString;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {

//        Demonstrations
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
//        queueArrayListDemonstration();
//        fibonacciSequenceDemonstration();
//        allDigitsDemonstration();
//        armstrongNumberDemonstration();
//        maxValueDemonstration();
//        linearSearchDemonstration();
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

    private void fibonacciSequenceDemonstration() {
        Fibonacci.fibonacciSequenceFor(30);
        fibonacciSequenceWhile(900000);
    }

    private void allDigitsDemonstration() {
        List<Integer> digits = getDigits(1234, new ArrayList<>());
        digits.forEach(i -> System.out.println("i = " + i));
    }

    private void armstrongNumberDemonstration() {
        System.out.println("isArmstrongNumber(0) = " + isArmstrongNumber(0)); // true
        System.out.println("isArmstrongNumber(1) = " + isArmstrongNumber(1)); // true
        System.out.println("isArmstrongNumber(153) = " + isArmstrongNumber(153)); // true
        System.out.println("isArmstrongNumber(370) = " + isArmstrongNumber(370)); // true
        System.out.println("isArmstrongNumber(1234) = " + isArmstrongNumber(1234)); // false
        System.out.println("isArmstrongNumber(4321) = " + isArmstrongNumber(4321)); // false
    }

    private void maxValueDemonstration() {
        System.out.println("getLargestValue(" +
                "new ArrayList<Integer>(Arrays.asList(12, 32, 42, 22, 86, " +
                "734, 0, 23, 75, 733, 827, 2391, 847, 123456))); = " +
                getLargestValue(new ArrayList<Integer>(Arrays.asList(
                        12, 32, 42, 22, 86, 734, 0, 23, 75, 733, 827, 2391, 847, 123456)))); // Expected: 123456

        System.out.println("getLargestValueIndex(" +
                "new ArrayList<Integer>(Arrays.asList(12, 32, 42, 22, 86, " +
                "734, 0, 23, 75, 733, 827, 2391, 847, 123456))) = " +
                getLargestValueIndex(new ArrayList<Integer>(Arrays.asList(
                        12, 32, 42, 22, 86, 734, 0, 23, 75, 733, 827, 2391, 847, 123456)))); // Expected: 13
    }

    private void linearSearchDemonstration() {
        int[] lIntTestArr = {12, 32, 4, 23, 76, 763, 872, -12, -746, 0, 7236};
        int e = 763;

        System.out.format("Searching for %d and found it at index %d%n", e, linearSearch(lIntTestArr, e));

        double[] lDouTestArr = {12.32, 32.04, 4.23, 23.0076, 76.763, 763.872, 872.012, -12.0746, -746.0, 0.7236, 7236.987000043};
        double eDou = 763.872;

        System.out.format("Searching for %f and found it at index %d%n", eDou, linearSearch(lDouTestArr, eDou));

        String[] lStrTestArr = {"Hello", "World", "I", "Would", "Love", "A", "Job", "!"};
        String eStr = "WouLD";

        System.out.format("Searching for %s, non-strict and found it at index %d%n", eStr, linearSearch(lStrTestArr, eStr, false));
        System.out.format("Searching for %s, strict and found it at index %d%n", eStr, linearSearch(lStrTestArr, eStr, true));
        System.out.format("Searching for %s, default strictness and found it at index %d%n", eStr, linearSearch(lStrTestArr, eStr));


    }

}