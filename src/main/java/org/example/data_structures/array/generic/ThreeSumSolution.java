package org.example.data_structures.array.generic;

import org.example.data_structures.array.sort.QuickSort;

import java.util.ArrayList;
import java.util.List;

public class ThreeSumSolution {

  public List<List<Integer>> findTriplets(int[] arr) {
    List<List<Integer>> result = new ArrayList<>();
    new QuickSort().sort(arr);

    for (int i = 0; i < arr.length; i++) {
      if (i > 0 && arr[i] == arr[i - 1]) {
        continue;
      }
      int j = i + 1;
      int k = arr.length - 1;

      while (j < k) {
        int sum = arr[i] + arr[j] + arr[k];
        if (sum == 0) {
          result.add(List.of(arr[i], arr[j], arr[k]));
          do {
            j++;
          } while (arr[j] == arr[j - 1]);
        } else if (sum < 0) {
          j++;
        } else {
          k--;
        }
      }
    }
    return result;
  }
}
