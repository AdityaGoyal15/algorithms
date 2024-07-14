package org.example.data_structures.tree;

public class BinaryTree {
  Node root;

  public BinaryTree(Node root) {
    this.root = root;
  }

  public Node add(int data) {
    return addRecursively(root, data);
  }

  private Node addRecursively(Node node, int data) {
    if (node == null) {
      return new Node(data);
    }

    if (data < node.data) {
      node.left = addRecursively(node.left, data);
    } else if (data > node.data) {
      node.right = addRecursively(node.right, data);
    }
    return node;
  }

  public Node find(int data) {
    return findRecursive(root, data);
  }

  private Node findRecursive(Node node, int data) {
    if (node == null) {
      return null;
    }

    if (data < node.data) {
      return findRecursive(node.left, data);
    } else if (data > node.data) {
      return findRecursive(node.right, data);
    }
    return node;
  }

  public Node delete(int data) {
    return deleteRecursive(root, data);
  }

  private Node deleteRecursive(Node node, int data) {
    if (node == null) {
      return null;
    }

    if (data == node.data) {
      if (node.left == null && node.right == null) {
        return null;
      } else if (node.left == null) {
        return node.right;
      } else if (node.right == null) {
        return node.left;
      }
      int smallest = findSmallestValue(node.right);
      node.right = deleteRecursive(node.right, smallest);
      return node;
    } else if (data < node.data) {
      node.left = deleteRecursive(node.left, data);
    } else {
      node.right = deleteRecursive(node.right, data);
    }
    return node;
  }

  private int findSmallestValue(Node node) {
    if (node.left == null) {
      return node.data;
    } else {
      return findSmallestValue(node.left);
    }
  }

  public int height(Node node) {
    int lHeight;
    int rHeight;

    if (node != null) {
      lHeight = height(node.left);
      rHeight = height(node.right);
      return 1 + Math.max(rHeight, lHeight);
    } else {
      return 0;
    }
  }

  public void dfsInOrder(Node node) {
    if (node != null) {
      dfsInOrder(node.left);
      System.out.print(node.data + " ");
      dfsInOrder(node.right);
    }
  }

  public void dfsPreOrder(Node node) {
    if (node != null) {
      System.out.print(node.data + " ");
      dfsInOrder(node.left);
      dfsInOrder(node.right);
    }
  }

  public void dfsPostOrder(Node node) {
    if (node != null) {
      dfsInOrder(node.left);
      dfsInOrder(node.right);
      System.out.print(node.data + " ");
    }
  }
}
