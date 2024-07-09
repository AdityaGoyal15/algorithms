package org.example.utils;

import java.util.Arrays;

public class Utility {

  public static void printArray(int[] arr) {
    Arrays.stream(arr).mapToObj(i -> i + " ").forEach(System.out::print);
  }
}
