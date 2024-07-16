package org.example.generic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class MissingPositiveNumberEnhanced {

  public int find1(int[] arr) {
    int[] temp = new int[arr.length];

    IntStream.range(0, arr.length)
        .forEach(
            i -> {
              if (arr[i] > 0) {
                temp[arr[i]] = temp[arr[i]] + 1;
              } else {
                temp[i] = arr[i];
              }
            });
    return IntStream.range(0, temp.length)
        .filter(i -> temp[i] == 0 && i > 0)
        .findFirst()
        .orElse(-1);
  }

  public int find2(int[] arr) {
    Map<Integer, Integer> map = new HashMap<>();

    Arrays.stream(arr)
        .forEach(
            j -> {
              if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
              } else {
                map.put(j, 1);
              }
            });

    return IntStream.range(0, arr.length)
        .filter(i -> !map.containsKey(i) && i > 0)
        .findFirst()
        .orElse(-1);
  }
}
