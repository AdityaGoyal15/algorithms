package org.example.data_structures.array.search;

public class BinarySearch {

  private BinarySearch() {}

  public static int search(int[] arr, int data) {
    int start = 0;
    int end = arr.length - 1;

    while (end >= start) {
      int pivotIndex = start + ((end - start) / 2);

      if (data < arr[pivotIndex]) {
        end = pivotIndex - 1;
      } else if (data > arr[pivotIndex]) {
        start = pivotIndex + 1;
      } else {
        return pivotIndex;
      }
    }
    return -1;
  }
}
