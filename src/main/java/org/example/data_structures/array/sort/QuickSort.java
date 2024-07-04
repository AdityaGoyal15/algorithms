package org.example.data_structures.array.sort;

public class QuickSort {

  public void sort(int[] arr) {
    quickSort(arr, 0, arr.length - 1);
    // printArray(arr);
  }

  private void quickSort(int[] arr, int lowIndex, int highIndex) {
    // if there is only one element left in the array, then return
    if (lowIndex >= highIndex) {
      return;
    }
    // choose a pivot
    int pivot = arr[highIndex];
    int leftPointer = 0;
    int rightPointer = highIndex;
    // proceed while left pointer run into right pointer
    while (leftPointer < rightPointer) {
      // move forward while value at left pointer is less than pivot
      while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
        leftPointer++;
      }
      // move backward while value at right pointer is greater than pivot
      while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
        rightPointer--;
      }
      // swap when value at left pointer is greater and at right pointer less than compared to pivot
      swap(arr, leftPointer, rightPointer);
    }
    // swap the element where left and right pointer meet with the pivot
    swap(arr, leftPointer, highIndex);
    // sort the elements in the left subarray
    quickSort(arr, lowIndex, leftPointer - 1);
    // sort the elements in the right subarray
    quickSort(arr, leftPointer + 1, highIndex);
  }

  // swap
  private void swap(int[] arr, int leftPointer, int rightPointer) {
    int temp = arr[leftPointer];
    arr[leftPointer] = arr[rightPointer];
    arr[rightPointer] = temp;
  }
}
