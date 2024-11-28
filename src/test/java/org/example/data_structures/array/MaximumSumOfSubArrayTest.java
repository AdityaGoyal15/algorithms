package org.example.data_structures.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSumOfSubArrayTest {

    @Test
    public void testMaximumSumOfSubArray() {
        MaximumSumOfSubArray maximumSumOfSubArray = new MaximumSumOfSubArray();
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maximumSumOfSubArray.findMaxSum(arr);

        assertEquals(6, result);
    }

}