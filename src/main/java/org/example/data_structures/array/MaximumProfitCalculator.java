package org.example.data_structures.array;

public class MaximumProfitCalculator {

  private MaximumProfitCalculator() {}

  public static int calculateMaxProfit(int[] prices) {
    int length = prices.length;
    int min = prices[0];
    int maxProfit = 0;
    int i = 1;
    // Move forward and keep updating the minimum value from the array and the maximum difference between the next
    // elements
    while (i < length) {
      if (prices[i] < min) {
        min = prices[i];
      }
      int diff = prices[i] - min;

      if (diff > maxProfit) {
        maxProfit = diff;
      }
      i++;
    }
    return maxProfit;
  }
}
