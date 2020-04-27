package com.seedling.app.collections;

import java.util.ArrayList;

/**
 * Class that has 2 functions. One will get you the largest value of an ArrayList<Integer> and the other
 * function will return the index that the largest value is at
 *
 * @author Christoffer Hansen
 * @see java.util.Collection
 * @see java.util.stream.Stream
 * @see java.util.stream.IntStream
 * @see java.util.OptionalInt
 * @since 1.0
 */
public class MaxValue {

    /**
     * Goes through the nList ArrayList portion by portion, maps those portions to integers.
     * Every number is checked if it is greater than the already found largest value,
     * if the number is higher than n then n will be assigned the new high number.
     * Then when it has gone through every index you will have the largest value available in the arraylist!
     *
     * @param nList ArrayList with all the integers
     * @return The largest integer value in the given ArrayList
     */
    public static int getLargestValue(ArrayList<Integer> nList) {
        return nList.stream().mapToInt(n -> n).filter(n -> n >= 0).max().orElse(0);
    }

    /**
     * This function iterates through the arraylist index by index and
     * checks if that integer is greater than the already saved index positions value.
     * If it is greater than the saved index positions value will change to the new found index.
     * Then when done then you should have the index of the largest value in the arraylist!
     *
     * @param nList ArrayList with all the integers
     * @return The largest integer values position in the given ArrayList
     */
    public static int getLargestValueIndex(ArrayList<Integer> nList) {
        int index = 0;

        for (int i = 1; i < nList.size(); i++) {
            if (nList.get(i) > nList.get(index)) {
                index = i;
            }
        }
        return index;
    }

}
