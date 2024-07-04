package org.example.data_structures.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

  @Test
  void throw_exception_when_stack_is_full() {
    Stack stack = new Stack(3);
    stack.push(1);
    stack.push(2);
    stack.push(3);

    RuntimeException exception = assertThrows(RuntimeException.class, () -> stack.push(4));
    assertEquals("Stack is full", exception.getMessage());
  }

  @Test
  void push() {
    Stack stack = new Stack(5);

    int result = stack.push(10);

    assertEquals(10, result);
  }

  @Test
  void throw_exception_when_stack_is_empty() {
    Stack stack = new Stack(5);

    RuntimeException exception = assertThrows(RuntimeException.class, stack::pop);
    assertEquals("Stack is empty", exception.getMessage());
  }

  @Test
  void pop() {
    Stack stack = new Stack(5);
    stack.push(10);
    stack.push(20);

    int result = stack.pop();

    assertEquals(20, result);
  }
}
