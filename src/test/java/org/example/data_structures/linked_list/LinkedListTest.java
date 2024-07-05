package org.example.data_structures.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

  @Test
  void constructor() {
    Node head = new Node(5);
    LinkedList linkedList = new LinkedList(head);

    assertEquals(5, linkedList.head.data);
    assertNull(linkedList.head.next);
  }

  @Test
  void add() {
    Node head = new Node(5);
    LinkedList linkedList = new LinkedList(head);

    Node node = linkedList.add(6);

    assertNotNull(node);
    assertEquals(6, node.data);
  }

  @Test
  void remove() {
    Node head = new Node(5);
    LinkedList linkedList = new LinkedList(head);
    linkedList.add(6);
    linkedList.add(7);

    Node node = linkedList.remove(6);

    assertEquals(6, node.data);
    assertNull(node.next);
    assertEquals(5, linkedList.head.data);
    assertEquals(7, linkedList.head.next.data);
  }

  @Test
  void length() {
    Node head = new Node(5);
    LinkedList linkedList = new LinkedList(head);
    linkedList.add(6);
    linkedList.add(7);
    linkedList.add(8);

    int length = linkedList.length();

    assertEquals(4, length);
  }

  @Test
  void find() {
    Node head = new Node(5);
    LinkedList linkedList = new LinkedList(head);
    linkedList.add(6);
    linkedList.add(7);
    linkedList.add(8);

    Node node = linkedList.find(7);

    assertEquals(7, node.data);
  }

  @Test
  void find_returns_null_when_not_found() {
    Node head = new Node(5);
    LinkedList linkedList = new LinkedList(head);
    linkedList.add(6);
    linkedList.add(7);
    linkedList.add(8);

    Node node = linkedList.find(9);

    assertNull(node);
  }
}
