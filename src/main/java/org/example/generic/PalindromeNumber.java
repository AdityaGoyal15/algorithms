package org.example.generic;

public class PalindromeNumber {

  public boolean validate(int number) {
    String str = String.valueOf(number);
    int left = 0;
    int right = str.length() - 1;
    boolean result = true;

    while (left <= right) {
      char chLeft = str.charAt(left);
      char chRight = str.charAt(right);

      if (chLeft != chRight) {
        return false;
      }
      left++;
      right--;
    }

    return result;
  }
}
