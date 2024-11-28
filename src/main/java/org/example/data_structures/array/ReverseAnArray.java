package org.example.data_structures.array;

public class ReverseAnArray {

    public int[] reverseArray(int[] nums) {
        int i = 0, j = nums.length - 1;

        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

        return nums;
    }
}
