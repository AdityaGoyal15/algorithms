package org.example.generic;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumSolutionTest {

  @Test
  void find_triplets() {
    int[] arr = {-4, -1, -1, 0, 1, 2};
    ThreeSumSolution solution = new ThreeSumSolution();

    List<List<Integer>> result = solution.findTriplets(arr);

    assertEquals(2, result.size());
  }
}
