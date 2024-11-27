package org.example.data_structures.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingPositiveNumberEnhancedTest {

  @Test
  void find1() {
    int[] arr = {1, -1, -2, 4, 7, 9, 6, 8, 2, 5};
    MissingPositiveNumberEnhanced solution = new MissingPositiveNumberEnhanced();

    int result = solution.find1(arr);

    assertEquals(3, result);
  }

  @Test
  void find1_1() {
    int[] arr = {100, 101};
    MissingPositiveNumberEnhanced solution = new MissingPositiveNumberEnhanced();

    int result = solution.find1(arr);

    assertEquals(1, result);
  }

  @Test
  void find2() {
    int[] arr = {1, -1, -2, 4, 7, 9, 6, 8, 2, 5};
    MissingPositiveNumberEnhanced solution = new MissingPositiveNumberEnhanced();

    int result = solution.find2(arr);

    assertEquals(3, result);
  }

  @Test
  void find2_1() {
    int[] arr = {100, 101};
    MissingPositiveNumberEnhanced solution = new MissingPositiveNumberEnhanced();

    int result = solution.find2(arr);

    assertEquals(1, result);
  }
}
