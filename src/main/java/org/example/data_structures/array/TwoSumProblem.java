package org.example.data_structures.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
    public int[] findPair(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                int j = map.get(diff);
                result[0] = j;
                result[1] = i;
                break;
            } else {
                map.put(nums[i], i);
            }
        }

        return result;
    }
}
