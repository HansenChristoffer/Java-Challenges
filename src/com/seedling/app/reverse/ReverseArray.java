package com.seedling.app.reverse;

public class ReverseArray<T> {

    public T[] reverse(T[] n) {
        T t;
        for (int i = 0; i < n.length / 2; i++) {
            t = n[i];
            n[i] = n[(n.length - 1) - i];
            n[(n.length - 1) - i] = t;
        }
        return n;
    }
}
