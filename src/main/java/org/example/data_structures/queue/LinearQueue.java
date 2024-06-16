package org.example.data_structures.queue;

public class LinearQueue {

    int front;
    int rear;
    int size;
    int capacity;
    int[] items;

    public LinearQueue(int capacity) {
        this.capacity = capacity;
        this.items = new int[capacity];
        this.front = 0;
        this.rear = capacity - 1;
        this.size = 0;
    }

    public void enqueue(int item) {
        if (size == capacity) {
            throw new UnsupportedOperationException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        items[rear] = item;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            throw new UnsupportedOperationException("Queue is empty");
        }
        int item = items[front];
        front = (front + 1) % capacity;
        size--;

        return item;
    }
}
