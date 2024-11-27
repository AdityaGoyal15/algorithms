package org.example.data_structures.array;

public class MergeSortedArrays {

    public int[] merge(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            result[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
        }

        while (i < nums1.length) {
            result[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            result[k++] = nums2[j++];
        }

        return result;
    }
}
