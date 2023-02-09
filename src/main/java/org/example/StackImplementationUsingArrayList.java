package org.example;

import java.util.ArrayList;

public class StackImplementationUsingArrayList<T> {
    private final ArrayList<T> items; // an array list to store the elements in the stack

    public StackImplementationUsingArrayList() {
        items = new ArrayList<>(); // initialize the array list
    }

    // method to push an element onto the top of the stack
    public void push(T item) {
        items.add(item); // add the element to the end of the array list
    }

    // method to remove the element from the top of the stack and return it
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }

        return items.remove(items.size() - 1); // remove and return the last element in the array list
    }

    // method to retrieve the element from the top of the stack without removing it
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }

        return items.get(items.size() - 1); // return the last element in the array list
    }

    // method to check if the stack is empty
    public boolean isEmpty() {
        return items.isEmpty(); // return true if the array list is empty, false otherwise
    }

    // method to get the number of elements in the stack
    public int size() {
        return items.size(); // return the size of the array list
    }
}
