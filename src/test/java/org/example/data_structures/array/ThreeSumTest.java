package org.example.data_structures.array;

import org.example.data_structures.array.generic.ThreeSum;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

  @Test
  void return_triplet_with_sum_of_elements_zero() {
    int[] arr = {-2, -1, 0, 1, 2, 3, 4};
    ThreeSum threeSum = new ThreeSum();

    List<List<Integer>> triplets = threeSum.findTriplets(arr);

    assertEquals(3, triplets.size());
  }
}
