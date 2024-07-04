package org.example.data_structures.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

  @Test
  void constructor() {
    Stack<Integer> stack = new Stack<>(Integer.class, 5);

    assertEquals(-1, stack.top);
    assertEquals(5, stack.capacity);
    assertEquals(5, stack.elements.length);
  }

  @Test
  void push() {
    Stack<Integer> stack = new Stack<>(Integer.class, 5);

    int topElement = stack.push(10);

    assertEquals(0, stack.top);
    assertEquals(10, topElement);
  }

  @Test
  void throws_exception_when_stack_is_full() {
    Stack<Integer> stack = new Stack<>(Integer.class, 5);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);

    RuntimeException exception = assertThrows(RuntimeException.class, () -> stack.push(6));
    assertEquals(4, stack.top);
    assertEquals("Stack is full", exception.getMessage());
  }

  @Test
  void throw_exception_when_stack_is_empty() {
    Stack<Integer> stack = new Stack<>(Integer.class, 5);

    RuntimeException exception = assertThrows(RuntimeException.class, () -> stack.pop());
    assertEquals("Stack is empty", exception.getMessage());
  }

  @Test
  void pop() {
    Stack<Integer> stack = new Stack<>(Integer.class, 5);
    stack.push(10);
    stack.push(20);

    int topElement = stack.pop();

    assertEquals(20, topElement);
    assertEquals(0, stack.top);
  }
}
