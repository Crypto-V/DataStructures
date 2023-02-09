package org.example;

import java.util.NoSuchElementException;

public class QueueImplLinkedList<T> {
    private static class Node<T> {
        private T data; // data stored in the node
        private Node<T> next; // reference to the next node in the linked list

        // constructor to create a new node with given data
        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> first; // reference to the node at the front of the queue
    private Node<T> last; // reference to the node at the end of the queue

    // method to add an element to the end of the queue
    public void add(T item) {
        Node<T> newNode = new Node<>(item); // create a new node with the given data
        if (last != null) { // if the queue is not empty
            last.next = newNode; // make the last node's next reference point to the new node
        }
        last = newNode; // update last to reference the new node, making it the new last node in the queue
        if (first == null) { // if the queue is empty
            first = last; // both first and last references should point to the new node
        }
    }

    // method to remove the element from the front of the queue and return it
    public T remove() {
        if (first == null) { // check if the queue is empty
            throw new NoSuchElementException("Queue is empty."); // throw an exception if the queue is empty
        }

        T item = first.data; // retrieve the data from the node at the front of the queue
        first = first.next; // update first to reference the next node, effectively removing the current first node
        if (first == null) { // if the queue is now empty
            last = null; // both first and last references should be set to null
        }
        return item; // return the data of the removed node
    }

    // method to retrieve the element from the front of the queue without removing it
    public T peek() {
        if (first == null) { // check if the queue is empty
            throw new NoSuchElementException("Queue is empty."); // throw an exception if the queue is empty
        }

        return first.data; // return the data of the node at the front of the queue
    }

    // method to check if the queue is empty
    public boolean isEmpty() {
        return first == null; // return true if first is null, indicating that the queue is empty
    }

    // method to get the number of elements in the queue
    public int size() {
        int count = 0; // counter for the number of elements in the queue
        Node<T> current = first; // reference to traverse the linked list
        while (current != null) { // traverse the linked list until the end is reached
            count++; // increment the count for each node
            current = current.next; // move to the next node
        }
        return count; // return the total count of nodes
    }
}
