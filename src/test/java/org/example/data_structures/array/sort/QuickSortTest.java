package org.example.data_structures.array.sort;

import org.junit.jupiter.api.Test;

class QuickSortTest {

  @Test
  void quickSort() {
      int[] arr = {1, 21, 2, 34, 131, 1343, 121, 24, 5};
      QuickSort qs = new QuickSort();

      qs.quickSort(arr, 0, arr.length - 1);

      qs.print(arr);
  }
}
