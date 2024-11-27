package org.example.data_structures.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {

  @Test
  void return_true_if_input_string_has_balanced_brackets() {
    BalancedBrackets solution = new BalancedBrackets();

    boolean validated = solution.validate("[()]{}{[()()]()}");

    assertTrue(validated);
  }

  @Test
  void return_false_if_input_string_does_not_have_balanced_brackets() {
    BalancedBrackets solution = new BalancedBrackets();

    boolean validated = solution.validate("[(])");

    assertTrue(validated);
  }
}
