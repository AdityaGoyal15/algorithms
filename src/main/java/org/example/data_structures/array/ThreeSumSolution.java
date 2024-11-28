package org.example.data_structures.array;

import org.example.data_structures.array.sort.QuickSort;

import java.util.ArrayList;
import java.util.List;

public class ThreeSumSolution {

    public List<List<Integer>> findTriplets(int[] arr) {
        // Sort the array
        // Fix i at 0, j at i + 1, k at arr.length - 1
        // Check if arr[i] + arr[j] + arr[k] is equal to 0. If true, it is the target triplet. Add it to result.
        // If false, check if sum is greater than 0. Then we need a smaller sum in the next iteration. So, we move k towards left.
        // If false, check if sum is smaller than 0. Then we need a greater sum in the next iteration. So, we move j towards right.
        // Then we move i and loop remaining values of arr[i] to check the same.
        // Improvement in processing time: Skip elements when arr[i] == arr[i-1]. They will have the same sum as previous iteration.

        List<List<Integer>> result = new ArrayList<>();
        new QuickSort().sort(arr);
        int length = arr.length;
        int i = 0;

        while (i < length) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                i++;
                continue;
            }

            int j = i + 1;
            int k = length - 1;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];

                if (sum == 0) {
                    result.add(List.of(arr[i], arr[j], arr[k]));
                    do {
                        j++;
                    } while (j < k && arr[j] == arr[j - 1]);
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
            i++;
        }

        return result;
    }
}
