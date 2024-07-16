package org.example.generic;

public class DynamicArray {
  int[] data;
  int size;
  int capacity;

  public DynamicArray(int capacity) {
    this.capacity = capacity;
    this.size = 0;
    this.data = new int[capacity];
  }

  public void insert(int num) {
    if (size == capacity) {
      int[] temp = new int[capacity * 2];
      int i;

      for (i = 0; i < data.length; i++) {
        temp[i] = data[i];
      }
      data = temp;
    }
    data[size++] = num;
  }

  public void print() {
    for (int j : data) {
      System.out.print(j + " ");
    }
  }
}
