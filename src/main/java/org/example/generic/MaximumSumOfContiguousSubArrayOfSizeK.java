package org.example.generic;

public class MaximumSumOfContiguousSubArrayOfSizeK {

    // This is more widely known as sliding window problem
    public int findMaxSum(int N, int[] arr) {
        int maxSum;
        int tempSum = 0;
        // Calculate the sum of last N elements
        for (int i = arr.length - 1; i > arr.length - N - 1; i--) {
            tempSum += arr[i];
        }
        maxSum = tempSum;

        // Start adding elements from start and removing from end. Check the sum and set value.
        for (int i = 0; i < N; i++) {
            tempSum = tempSum - arr[arr.length - N + i] + arr[i];

            if (tempSum > maxSum) {
                maxSum = tempSum;
            }
        }

        return maxSum;
    }
}
