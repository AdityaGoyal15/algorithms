package org.example.data_structures.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

  @Test
  void constructor() {
    Node node = new Node(5);

    assertNull(node.next);
    assertEquals(5, node.data);
  }
}
