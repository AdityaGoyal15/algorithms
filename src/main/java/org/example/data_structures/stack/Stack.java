package org.example.data_structures.stack;

public class Stack {

  int[] arr;
  int capacity;
  int top;

  public Stack(int capacity) {
    this.arr = new int[capacity];
    this.capacity = capacity;
    this.top = -1;
  }

  public int push(int value) {
    // throw exception when stack is full
    if (top == capacity - 1) {
      throw new RuntimeException("Stack is full");
    }
    // increment the top -> store the value at the top -> return top element
    arr[++top] = value;
    return arr[top];
  }

  public int pop() {
    // throw exception when stack is empty
    if (top == -1) {
      throw new RuntimeException("Stack is empty");
    }
    // return the top element -> decrement the top
    return arr[top--];
  }
}
