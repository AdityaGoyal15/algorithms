package org.example.data_structures.stack;

import java.lang.reflect.Array;

public class Stack<T> {

  int top;
  int capacity;
  T[] elements;

  // initialize the top as -1 (as stack will be empty initially) -> set the capacity -> initialize
  // the array to store the elements as empty array of initialized capacity
  public Stack(Class<T> clazz, int capacity) {
    this.top = -1;
    this.capacity = capacity;
    this.elements = (T[]) Array.newInstance(clazz, capacity);
  }

  // throw exception when stack is full
  // increment the top -> store the element at the top -> return the top element
  public T push(T element) {
    if (top == capacity - 1) {
      throw new RuntimeException("Stack is full");
    }

    elements[++top] = element;
    return elements[top];
  }

  // throw exception when stack is empty
  // return the top element -> decrement the top
  public T pop() {
    if (top == -1) {
      throw new RuntimeException("Stack is empty");
    }

    return elements[top--];
  }

  public int getTop() {
    return top;
  }
}
