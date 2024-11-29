package org.example.data_structures.queue;

import org.example.data_structures.linked_list.Node;

public class Queue {
    Node front;
    Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return front == null && rear == null;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);

        if (isEmpty()) {
            front = rear = newNode;

            return;
        }
        rear.next = newNode;
        rear = newNode;

    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");

            return -1;
        } else {
            int value = front.data;
            front = front.next;

            return value;
        }
    }
}
