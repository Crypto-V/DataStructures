package org.example;

public class StackImplementationUsingLinkedList<T>{
    private static class Node<T> {
        private final T data; // data stored in the node
        private Node<T> next; // reference to the next node in the linked list

        // constructor to create a new node with given data
        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> top; // reference to the node at the top of the stack

    // method to push an element onto the top of the stack
    public void push(T item) {
        Node<T> newNode = new Node<>(item); // create a new node with the given data
        newNode.next = top; // make the new node's next reference point to the current top node
        top = newNode; // update top to reference the new node, making it the new top of the stack
    }

    // method to remove the element from the top of the stack and return it
    public T pop() {
        if (isEmpty()) { // check if the stack is empty
            throw new IllegalStateException("Stack is empty."); // throw an exception if the stack is empty
        }

        T item = top.data; // retrieve the data from the node at the top of the stack
        top = top.next; // update top to reference the next node, effectively removing the current top node
        return item; // return the data of the removed node
    }

    // method to retrieve the element from the top of the stack without removing it
    public T peek() {
        if (isEmpty()) { // check if the stack is empty
            throw new IllegalStateException("Stack is empty."); // throw an exception if the stack is empty
        }

        return top.data; // return the data of the node at the top of the stack
    }

    // method to check if the stack is empty
    public boolean isEmpty() {
        return top == null; // return true if top is null, indicating that the stack is empty
    }

    // method to get the number of elements in the stack
    public int size() {
        int count = 0; // counter for the number of elements in the stack
        Node<T> current = top; // reference to traverse the linked list
        while (current != null) { // traverse the linked list until the end is reached
            count++; // increment the count for each node
            current = current.next; // move to the next node
        }
        return count; // return the total count of nodes
    }
}
