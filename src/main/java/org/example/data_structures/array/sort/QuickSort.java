package org.example.data_structures.array.sort;

public class QuickSort {

  void quickSort(int[] array, int low, int high) {
    if (low < high) {
      int pivot = partition(array, low, high);
      quickSort(array, low, pivot - 1);
      quickSort(array, pivot + 1, high);
    }
  }

  private int partition(int[] array, int low, int high) {
    int pivot = array[high];
    int i = low - 1;

    for (int j = low; j < high; j++) {
      if (array[j] < pivot) {
        i++;
        swap(array, i, j);
      }
    }
    swap(array, i + 1, high);

    return i + 1;
  }

  private void swap(int[] array, int low, int high) {
    int temp = array[low];
    array[low] = array[high];
    array[high] = temp;
  }

  public void print(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
