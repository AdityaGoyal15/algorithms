package org.example.generic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumProfitCalculatorTest {

  @Test
  void find_max_profit() {
    int[] prices = {7, 1, 5, 3, 6, 4};

    int maxProfit = MaximumProfitCalculator.calculateMaxProfit(prices);

    assertEquals(5, maxProfit);
  }

  @Test
  void find_max_profit_when_price_never_increase() {
    int[] prices = {7, 6, 5, 5, 3, 2};

    int maxProfit = MaximumProfitCalculator.calculateMaxProfit(prices);

    assertEquals(0, maxProfit);
  }
}
