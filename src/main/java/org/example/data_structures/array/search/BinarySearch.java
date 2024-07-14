package org.example.data_structures.array.search;

public class BinarySearch {

  private BinarySearch() {}

  // The input array must be sorted
  public static int search(int[] arr, int data) {
    int start = 0;
    int end = arr.length - 1;
    // Iterate while high index is greater than or equal to low index
    while (end >= start) {
      // Calculate the pivot
      int pivotIndex = start + ((end - start) / 2);
      // Check if element to be searched is greater than the element at the pivot index
      if (data < arr[pivotIndex]) {
        // If true, the high index is pivot index - 1
        end = pivotIndex - 1;
      } else if (data > arr[pivotIndex]) {
        // If false, the low index is pivot index - 1
        start = pivotIndex + 1;
      } else {
        // If equal, return the pivot index
        return pivotIndex;
      }
    }
    return -1;
  }
}
