package org.example.data_structures.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void initialize() {
        Node node = new Node(1);

        assertEquals(1, node.data);
        assertNull(node.next);
    }
}