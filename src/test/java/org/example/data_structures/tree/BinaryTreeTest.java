package org.example.data_structures.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void initialize_with_null_root() {
        BinaryTree tree = new BinaryTree();

        assertNull(tree.root);
    }

    @Test
    void initialize_with_root() {
        BinaryTree tree = new BinaryTree(new Node(1));

        assertEquals(1, tree.root.data);
        assertNull(tree.root.left);
        assertNull(tree.root.right);
    }

    @Test
    void add_when_root_is_null() {
        BinaryTree tree = new BinaryTree();

        tree.add(1);

        assertEquals(1, tree.root.data);
        assertNull(tree.root.left);
        assertNull(tree.root.right);
    }

    @Test
    void add_left() {
        BinaryTree tree = new BinaryTree(new Node(2));

        tree.add(1);

        assertEquals(2, tree.root.data);
        assertNotNull(tree.root.left);
        assertEquals(1, tree.root.left.data);
        assertNull(tree.root.right);
    }

    @Test
    void add_right() {
        BinaryTree tree = new BinaryTree(new Node(4));

        tree.add(7);

        assertEquals(4, tree.root.data);
        assertNull(tree.root.left);
        assertNotNull(tree.root.right);
        assertEquals(7, tree.root.right.data);
    }

    @Test
    void find_returns_true_when_element_is_found() {
        BinaryTree tree = new BinaryTree(new Node(21));
        tree.add(1);
        tree.add(27);
        tree.add(2);
        tree.add(31);

        boolean found = tree.find(2);

        assertTrue(found);
    }

    @Test
    void find_returns_false_when_element_is_found() {
        BinaryTree tree = new BinaryTree(new Node(21));
        tree.add(1);
        tree.add(27);
        tree.add(2);
        tree.add(31);

        boolean found = tree.find(65);

        assertFalse(found);
    }

    @Test
    void delete() {
        BinaryTree tree = new BinaryTree(new Node(21));
        tree.add(1);
        tree.add(27);
        tree.add(2);
        tree.add(31);

        tree.delete(2);

        assertFalse(tree.find(2));
    }

    @Test
    void height() {
        Node root = new Node(21);
        BinaryTree tree = new BinaryTree(root);
        tree.add(1);
        tree.add(27);
        tree.add(2);
        tree.add(31);
        tree.add(7);

        int height = tree.height(root);

        assertEquals(4, height);
    }

    @Test
    void breadth_first_search() {
        BinaryTree tree = new BinaryTree(new Node(21));
        tree.add(1);
        tree.add(27);
        tree.add(2);
        tree.add(31);

        tree.bfs();
    }
}