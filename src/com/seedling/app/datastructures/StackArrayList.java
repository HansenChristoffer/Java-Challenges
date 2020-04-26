package com.seedling.app.datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * My own try at making a Stack ArrayList. By also using generics it is not type set and can be of any type essentially.
 *
 * StackArrayList stack = new StackArrayList</>();
 * @param <T> Type
 */
public class StackArrayList<T> {

    private final List<T> stack;

    /**
     * Default constructor that initializes the internal List object and makes it an ArrayList
     */
    public StackArrayList() {
        stack = new ArrayList<T>();
    }

    /**
     * Constructor will initialize the internal List object with the argument List object
     * @param stack List object that will be added onto the stack
     */
    public StackArrayList(List<T> stack) {
        this.stack = stack;
    }

    /**
     * Push element onto the stack
     *
     * @param e Element to add to the stack
     */
    public void push(T e) {
        stack.add(e);
    }

    /**
     * Push the content of an array onto the stack
     *
     * @param eArr Array to push onto the stack
     */
    public void pushAll(T[] eArr) {
        stack.addAll(Arrays.asList(eArr));
    }

    /**
     * Push the content of a List object onto the stack
     *
     * @param eList List object to push onto the stack
     */
    public void pushAll(List<T> eList) {
        stack.addAll(eList);
    }

    /**
     * This will return the top element of the stack and then remove it
     *
     * @return Top element of the stack
     */
    public T pop() {
        if (!stack.isEmpty()) {
            T e = stack.get(stack.size() - 1);
            stack.remove(stack.size()-1);
            return e;
        } else {
            return null;
        }
    }

    /**
     * This will return the top element of the stack without removing it. Allowing you throw a sneak peak on what the top element is
     *
     * @return Top element of the stack
     */
    public T peek() {
        if (!stack.isEmpty()) {
            return stack.get(stack.size() - 1);
        } else {
            return null;
        }
    }

    /**
     * Checks if the stack is empty
     *
     * @return Boolean on if it is empty
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    /**
     * Goes through the stack to see if the argument exists in the stack somewhere
     *
     * @param e ELement to search for
     * @return Boolean on if element exists within the stack
     */
    public boolean contains(T e) {
        return stack.contains(e);
    }

    /**
     * Will return the total size of the stack
     *
     * @return Integer corresponding the total size of the stack
     */
    public int size() {
        return stack.size();
    }

    /**
     * Clears the whole stack. Essentially removing every single element
     */
    public void clear() {
        stack.clear();
    }

    /**
     * This will return the hashcode of the stack
     * @return Integer corresponding the hashcode of the stack
     */
    @Override
    public int hashCode() {
        return Objects.hash(stack);
    }
}
