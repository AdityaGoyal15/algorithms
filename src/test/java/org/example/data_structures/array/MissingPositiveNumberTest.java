package org.example.data_structures.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingPositiveNumberTest {

  @Test
  void find() {
    int[] arr = {2, 1, 5, 7, 6, 4, 8};
    MissingPositiveNumber solution = new MissingPositiveNumber();

    int result = solution.find(arr);

    assertEquals(3, result);
  }
}
