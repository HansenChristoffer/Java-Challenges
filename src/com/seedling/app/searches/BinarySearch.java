package com.seedling.app.searches;

public class BinarySearch {

    public static int binarySearch(int[] nArr, int n) {
        int index = -1;
        int m = nArr.length / 2;

        while (m >= 0 && m < nArr.length) {
            if (nArr[m] == n) {
                index = m;
                break;
            } else if (nArr[m] > n) {
                m -= 1;
            } else {
                m += 1;
            }
        }

        return index;
    }

    public static int binarySearch(String[] nArr, String str) {
        int index = -1;
        int m = nArr.length / 2;

        while (m >= 0 && m < nArr.length) {
            if (nArr[m].compareTo(str) == 0) {
                index = m;
                break;
            } else if (nArr[m].compareTo(str) > 0) {
                m -= 1;
            } else {
                m += 1;
            }
        }

        return index;
    }

}
