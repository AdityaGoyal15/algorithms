package org.example.generic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowTest {

  @Test
  void find_max_sum_test_1() {
    int[] arr = {5, -1, 3, 4, 2, 1, 3};
    int N = 3;
    SlidingWindow solution = new SlidingWindow();

    int maxSum = solution.findMaxSum(N, arr);

    assertEquals(9, maxSum);
  }

  @Test
  void find_max_sum_test_2() {
    int[] arr = {9, 7, 7, 9, 7, 7, 9};
    int N = 7;
    SlidingWindow solution = new SlidingWindow();

    int maxSum = solution.findMaxSum(N, arr);

    assertEquals(55, maxSum);
  }

  @Test
  void find_max_sum_test_3() {
    int[] arr = {1, 2, 3, 4, 5, 6, 1};
    int N = 3;
    SlidingWindow solution = new SlidingWindow();

    int maxSum = solution.findMaxSum(N, arr);

    assertEquals(12, maxSum);
  }
}
