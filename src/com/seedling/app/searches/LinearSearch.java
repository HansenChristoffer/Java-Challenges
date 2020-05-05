package com.seedling.app.searches;

public class LinearSearch {

    public static int linearSearch(int[] arr, int e)  {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == e) {
                return i;
            }
        }

        return -1;
    }

    public static int linearSearch(double[] arr, double e)  {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == e) {
                return i;
            }
        }

        return -1;
    }

    public static int linearSearch(String[] arr, String e)  {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(e)) {
                return i;
            }
        }

        return -1;
    }

    public static int linearSearch(String[] arr, String e, boolean strict)  {
        for (int i = 0; i < arr.length; i++) {
            if (strict) {
                if (arr[i].equals(e)) {
                    return i;
                }
            } else {
                if (arr[i].equalsIgnoreCase(e)) {
                    return i;
                }
            }
        }

        return -1;
    }

}
