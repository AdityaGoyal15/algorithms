package org.example.data_structures.array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumProblemTest {

  @Test
  void find_triplets() {
    int[] arr = {-4, -1, -1, 0, 1, 2};
    ThreeSumProblem solution = new ThreeSumProblem();

    List<List<Integer>> result = solution.findTriplets(arr);

    assertEquals(2, result.size());
  }
}
