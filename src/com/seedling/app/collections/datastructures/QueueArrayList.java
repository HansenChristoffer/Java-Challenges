package com.seedling.app.collections.datastructures;

import java.util.*;

/**
 * My own try at the Queue ArrayList. Very similar to my attempt at the StackArrayList.
 * A Queue follows the FiFo principle, which stands for "First in First out". First element added is first out!
 *
 * @param <T> Type of the Queue
 *
 * @author  Christoffer Hansen
 * @see     Collection
 * @see     List
 * @see     LinkedList
 * @see     Vector
 * @since 1.0
 */
public class QueueArrayList<T> {

    public final List<T> Queue;

    /**
     * Default constructor that initializes the internal List object and makes it an ArrayList
     */
    public QueueArrayList() {
        Queue = new ArrayList<T>();
    }

    /**
     * Constructor will initialize the internal List object with the argument List object
     * @param Queue List object that will be added into the Queue
     */
    public QueueArrayList(List<T> Queue) {
        this.Queue = Queue;
    }

    /**
     * Push element into the Queue
     *
     * @param e Element to add to the Queue
     */
    public void push(T e) {
        Queue.add(e);
    }

    /**
     * Push the content of an array into the Queue
     *
     * @param eArr Array to push into the Queue
     */
    public void pushAll(T[] eArr) {
        Queue.addAll(Arrays.asList(eArr));
    }

    /**
     * Push the content of a List object into the Queue
     *
     * @param eList List object to push into the Queue
     */
    public void pushAll(List<T> eList) {
        Queue.addAll(eList);
    }

    /**
     * This will return the first element of the Queue and then remove it
     *
     * @return First element of the Queue
     */
    public T pop() {
        if (!Queue.isEmpty()) {
            T e = Queue.get(0);
            Queue.remove(0);
            return e;
        } else {
            return null;
        }
    }

    /**
     * This will return the first element of the Queue without removing it. Allowing you throw a sneak peak on what the first element is
     *
     * @return First element of the Queue
     */
    public T peek() {
        if (!Queue.isEmpty()) {
            return Queue.get(0);
        } else {
            return null;
        }
    }

    /**
     * Checks if the Queue is empty
     *
     * @return Boolean on if it is empty
     */
    public boolean isEmpty() {
        return Queue.isEmpty();
    }

    /**
     * Goes through the Queue to see if the argument exists in the Queue somewhere
     *
     * @param e ELement to search for
     * @return Boolean on if element exists within the Queue
     */
    public boolean contains(T e) {
        return Queue.contains(e);
    }

    /**
     * Will return the total size of the Queue
     *
     * @return Integer corresponding the total size of the Queue
     */
    public int size() {
        return Queue.size();
    }

    /**
     * Clears the whole Queue. Essentially removing every single element
     */
    public void clear() {
        Queue.clear();
    }

    /**
     * This will return the hashcode of the Queue
     * @return Integer corresponding the hashcode of the Queue
     */
    @Override
    public int hashCode() {
        return Objects.hash(Queue);
    }
}