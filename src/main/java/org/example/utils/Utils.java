package org.example.utils;

import java.util.Arrays;

public class Utils {

  public static void printArray(int[] arr) {
    Arrays.stream(arr).mapToObj(i -> i + " ").forEach(System.out::print);
  }
}
