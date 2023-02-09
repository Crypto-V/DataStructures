package org.example;

import org.jetbrains.annotations.NotNull;

import java.util.Queue;

public class QueueSimpleArray {
    private int front, rear, size;
    private final int capacity;
    private final int[] array;

    // Constructor to initialize the queue
    public QueueSimpleArray(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }

    // Function to check if the queue is full
    public boolean isFull(@NotNull QueueSimpleArray queue) {
        return (queue.size == queue.capacity);
    }

    // Function to check if the queue is empty
    public boolean isEmpty(@NotNull QueueSimpleArray queue) {
        return (queue.size == 0);
    }

    // Function to add an item to the queue
    public void enqueue(int item) {
        if (isFull(this)) {
            return;
        }
        this.rear = (this.rear + 1) % this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
        System.out.println(item + " enqueued to queue");
    }

    // Function to remove an item from the queue
    public int dequeue() {
        if (isEmpty(this)) {
            return Integer.MIN_VALUE;
        }
        int item = this.array[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        return item;
    }

    // Function to get the front item from the queue
    public int front() {
        if (isEmpty(this)) {
            return Integer.MIN_VALUE;
        }
        return this.array[this.front];
    }

    // Function to get the rear item from the queue
    public int rear() {
        if (isEmpty(this)) {
            return Integer.MIN_VALUE;
        }
        return this.array[this.rear];
    }
}
