package org.example.data_structures.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumProblem {

    public List<List<Integer>> findTriplets(int[] arr) {
        // Sort the array
        // Fix i at 0, j at i + 1, k at arr.length - 1
        // Check if arr[i] + arr[j] + arr[k] is equal to 0. If true, it is the target triplet. Add it to result.
        // If false, check if sum is greater than 0. Then we need a smaller sum in the next iteration. So, we move k towards left.
        // If false, check if sum is smaller than 0. Then we need a greater sum in the next iteration. So, we move j towards right.
        // Then we move i and loop remaining values of arr[i] to check the same.
        // Improvement in processing time: Skip elements when arr[i] == arr[i-1]. They will have the same sum as previous iteration.

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                i++;
                continue;
            }
            int j = i + 1;
            int k = arr.length - 1;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == 0) {
                    res.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    do {
                        j++;
                    } while (j < k && arr[j] == arr[j + 1]);
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return res;
    }
}
