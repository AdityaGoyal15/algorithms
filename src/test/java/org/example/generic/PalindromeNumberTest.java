package org.example.generic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

  @Test
  void return_true_when_number_is_a_palindrome() {
      PalindromeNumber solution = new PalindromeNumber();

      boolean validated = solution.validate(1234321);

      assertTrue(validated);
  }

    @Test
    void return_false_when_number_is_not_a_palindrome() {
        PalindromeNumber solution = new PalindromeNumber();

        boolean validated = solution.validate(12345321);

        assertFalse(validated);
    }
}
