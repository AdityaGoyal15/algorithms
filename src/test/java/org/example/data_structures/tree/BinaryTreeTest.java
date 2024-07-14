package org.example.data_structures.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

  @Test
  void add() {
    Node root = new Node(5);
    BinaryTree tree = new BinaryTree(root);

    Node node = tree.add(8);

    assertNotNull(node);
    assertEquals(5, node.data);
    assertNotNull(root.right);
    assertEquals(8, root.right.data);
  }

  @Test
  void find() {
    Node root = new Node(5);
    BinaryTree tree = new BinaryTree(root);
    tree.add(8);
    tree.add(18);
    tree.add(51);
    tree.add(231);

    Node node = tree.find(51);

    assertNotNull(node);
    assertEquals(51, node.data);
  }

  @Test
  void delete() {
    Node root = new Node(5);
    BinaryTree tree = new BinaryTree(root);
    tree.add(8);
    tree.add(18);
    tree.add(51);
    tree.add(231);

    tree.delete(51);

    assertNull(tree.find(51));
  }

  @Test
  void height() {
    Node root = new Node(9);
    BinaryTree tree = new BinaryTree(root);
    tree.add(1);
    tree.add(2);
    tree.add(3);
    tree.add(4);
    tree.add(5);
    tree.add(8);
    tree.add(18);
    tree.add(51);
    tree.add(231);

    int height = tree.height(root);

    assertEquals(7, height);
  }

  @Test
  void dfs_in_order() {
    Node root = new Node(9);
    BinaryTree tree = new BinaryTree(root);
    tree.add(1);
    tree.add(2);
    tree.add(3);
    tree.add(4);
    tree.add(5);
    tree.add(8);
    tree.add(18);
    tree.add(51);
    tree.add(231);

    tree.dfsInOrder(root);
  }

  @Test
  void dfs_pre_order() {
    Node root = new Node(9);
    BinaryTree tree = new BinaryTree(root);
    tree.add(1);
    tree.add(2);
    tree.add(3);
    tree.add(4);
    tree.add(5);
    tree.add(8);
    tree.add(18);
    tree.add(51);
    tree.add(231);

    tree.dfsPreOrder(root);
  }

  @Test
  void dfs_post_order() {
    Node root = new Node(9);
    BinaryTree tree = new BinaryTree(root);
    tree.add(1);
    tree.add(2);
    tree.add(3);
    tree.add(4);
    tree.add(5);
    tree.add(8);
    tree.add(18);
    tree.add(51);
    tree.add(231);

    tree.dfsPostOrder(root);
  }
}
