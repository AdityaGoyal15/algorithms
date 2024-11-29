package org.example.data_structures.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

    public int[] findPair(int[] nums, int sum) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = sum - nums[i];

            if (!map.containsKey(diff)) {
                map.put(nums[i], i);
            } else {
                result[0] = map.get(diff);
                result[1] = i;

                break;
            }
        }

        return result;
    }
}
