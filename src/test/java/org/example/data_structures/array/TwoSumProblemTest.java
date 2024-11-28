package org.example.data_structures.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumProblemTest {

    @Test
    public void twoSum() {
        int[] arr = {3, 2, 4};
        int target = 6;

        TwoSumProblem twoSumProblem = new TwoSumProblem();
        int[] result = twoSumProblem.findPair(arr, target);

        int[] expected = {1, 2};
        assertArrayEquals(expected, result);
    }
}