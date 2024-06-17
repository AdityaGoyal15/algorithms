package org.example.data_structures.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void initialize() {
        Node node = new Node(1);

        assertEquals(1, node.data);
        assertNull(node.left);
        assertNull(node.right);
    }
}