package org.example.generic;

public class MaximumProfitCalculator {

  private MaximumProfitCalculator() {}

  public static int calculateMaxProfit(int[] prices) {
    int length = prices.length;
    int min = prices[0];
    int maxProfit = 0;
    int i = 1;

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
