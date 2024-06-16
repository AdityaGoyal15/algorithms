package org.example.data_structures.queue;

import java.lang.reflect.Array;

public class LinearQueue<T> {
  private int front;
  private int rear;
  private final int capacity;
  private int size;
  private final T[] items;

  public LinearQueue(Class<T> type, int capacity) {
    this.capacity = capacity;
    this.items = (T[]) Array.newInstance(type, capacity);
    this.front = 0;
    this.rear = capacity - 1;
    this.size = 0;
  }

  public int getFront() {
    return front;
  }

  public int getRear() {
    return rear;
  }

  public int getCapacity() {
    return capacity;
  }

  public int getSize() {
    return size;
  }

  public T[] getItems() {
    return items;
  }

  public void enqueue(T item) {
    if (size == capacity) {
      throw new UnsupportedOperationException("Queue is full");
    }

    rear = (rear + 1) % capacity;
    items[rear] = item;
    size++;
  }

  public T dequeue() {
    if (size == 0) {
      throw new UnsupportedOperationException("Queue is empty");
    }

    T item = items[front];
    front = (front + 1) % capacity;
    size--;

    return item;
  }
}
