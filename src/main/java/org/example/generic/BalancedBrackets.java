package org.example.generic;

import org.example.data_structures.stack.Stack;

public class BalancedBrackets {

  public boolean validate(String str) {
    Stack<Character> stack = new Stack<>(Character.class, str.length());
    int length = str.toCharArray().length;

    int i = 0;
    while (i < length) {
      char element = str.charAt(i);
      if (element == '(' || element == '{' || element == '[') {
        stack.push(element);
      } else if (element == ')' || element == '}' || element == ']') {
        stack.pop();
      }
      i++;
    }
    return stack.getTop() == -1;
  }
}
