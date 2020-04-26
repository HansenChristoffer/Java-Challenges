package com.seedling.app.sorts;

public class Sort {

    public static void sortInt(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int k = i; k < arr.length; k++) {
                if (arr[i] > arr[k]) {
                    int t = arr[i];
                    arr[i] = arr[k];
                    arr[k] = t;
                }
            }
        }
    }

    public static void sortString(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i].compareTo(arr[k]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }
    }

}
