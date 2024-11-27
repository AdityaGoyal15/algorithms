package org.example.data_structures.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArraysTest {

    @Test
    public void mergeSortedArrays() {
        int[] nums1 = {1, 2, 4, 6};
        int[] nums2 = {3, 5};

        MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();
        int[] result = mergeSortedArrays.merge(nums1, nums2);

        assertEquals(6, result.length);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, result);
    }
}