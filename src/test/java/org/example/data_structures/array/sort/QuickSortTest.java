package org.example.data_structures.array.sort;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class QuickSortTest {

  @Test
  void sort() {
    int[] arr = {
      332, 1, 43, 12, 21, 54, 4,
    };
    QuickSort sorter = new QuickSort();

    sorter.sort(arr);

    String result = "";
    for (int i : arr) {
      result = "%s%d ".formatted(result, i);
    }
    assertEquals("1 4 12 21 43 54 332 ", result);
  }
}
