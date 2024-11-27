package org.example.data_structures.array;

public class MissingPositiveNumber {

  public int find(int[] arr) {
    int max = arr[0];
    int sum = 0;

    for (int j : arr) {
      sum = sum + j;

      if (j > max) {
        max = j;
      }
    }
    return (max * (max + 1) / 2) - sum;
  }
}
