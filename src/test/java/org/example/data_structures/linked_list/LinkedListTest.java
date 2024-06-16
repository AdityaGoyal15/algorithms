package org.example.data_structures.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

  @Test
  void add_when_head_is_null() {
    LinkedList<Integer> list = new LinkedList<>();

    list.add(1);

    assertEquals(1, list.size());
    Node<Integer> head = list.getHead();
    assertEquals(1, head.getData());
    assertNull(head.getNext());
  }

  @Test
  void add() {
    LinkedList<Integer> list = new LinkedList<>(new Node<>(1));

    list.add(2);

    assertEquals(2, list.size());
    Node<Integer> head = list.getHead();
    assertEquals(1, head.getData());
    Node<Integer> next = head.getNext();
    assertEquals(2, next.getData());
    assertNull(next.getNext());
  }

  @Test
  void size_when_head_is_null() {
    LinkedList<Integer> list = new LinkedList<>();

    assertEquals(0, list.size());
  }

  @Test
  void size() {
    Node<Integer> head = new Node<>(1);
    LinkedList<Integer> list = new LinkedList<>(head);

    list.add(2);
    list.add(3);

    assertEquals(3, list.size());
  }
}
