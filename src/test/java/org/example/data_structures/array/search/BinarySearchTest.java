package org.example.data_structures.array.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

  @Test
  void search_when_input_array_is_empty() {
    int[] arr = new int[0];

    int index = BinarySearch.search(arr, 72);

    assertEquals(-1, index);
  }

  @Test
  void search() {
    int[] arr = {1, 24, 35, 76, 101, 632};

    int index = BinarySearch.search(arr, 76);

    assertEquals(3, index);
  }
}
