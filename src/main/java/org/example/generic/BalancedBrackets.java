package org.example.generic;

import org.example.data_structures.stack.Stack;

// The problem can be solved using stacks; when opening bracket is found, we push it in the stack;
// when closing bracket is found, we pop an element from stack
// At the end, if stack is empty, we can conclude that the input string has balanced brackets;
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
