package org.example.data_structures.array;

public class MaximumSumOfSubArray {
    public int findMaxSum(int[] arr) {
        int total = 0;
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (total < 0) {
                total = 0;
            }

            total += arr[i];
            if (total > result) {
                result = total;
            }
        }

        return result;
    }
}
