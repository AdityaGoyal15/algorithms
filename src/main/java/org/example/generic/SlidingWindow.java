package org.example.generic;

public class SlidingWindow {

  // This is more widely known as sliding window problem
  public int findMaxSum(int N, int[] arr) {
    int tempSum = 0;
    int length = arr.length;
    // Calculate the sum of last N elements from the array
    for (int i = length - 1; i > length - N - 1; i--) {
      tempSum = tempSum + arr[i];
    }
    // Assign that sum to the maximum sum variable
    int maxSum = tempSum;
    // Start adding elements from the beginning of the array one by one and subtracting elements
    // from the end one by one
    for (int i = 0; i < N; i++) {
      tempSum = tempSum - arr[length - N + i] + arr[i];
      // If sum is found to be greater than maximum sum, then assign that value to the maximum sum
      if (tempSum > maxSum) {
        maxSum = tempSum;
      }
    }
    return maxSum;
  }
}
