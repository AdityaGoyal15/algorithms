package org.example.data_structures.array;

public class MaximumSumOfSubArray {

    public int findMaxSum(int[] arr) {
        int total = 0;
        int maxSum = 0;

        for (int j : arr) {
            if (total < 0) {
                total = 0;
            }
            total += j;

            if (total > maxSum) {
                maxSum = total;
            }
        }

        return maxSum;
    }
}
