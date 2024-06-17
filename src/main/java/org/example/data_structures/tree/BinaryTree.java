package org.example.data_structures.tree;

public class BinaryTree {

    Node root;

    public BinaryTree() {
    }

    public BinaryTree(Node root) {
        this.root = root;
    }

    public void add(int data) {
        root = addRecursive(root, data);
    }

    private Node addRecursive(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (node.data == data) {
            return node;
        } else if (data < node.data) {
            node.left = addRecursive(node.left, data);
        } else {
            node.right = addRecursive(node.right, data);
        }

        return node;
    }

    public boolean find(int data) {
        return findRecursive(root, data);
    }

    private boolean findRecursive(Node node, int data) {
        if (node == null) {
            return false;
        }

        if (node.data == data) {
            return true;
        } else if (data < node.data) {
            return findRecursive(node.left, data);
        } else {
            return findRecursive(node.right, data);
        }
    }

    public void delete(int data) {
        root = deleteRecursive(root, data);
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
            } else {
                int smallestValue = findSmallestValue(node.right);
                node.data = smallestValue;
                node.right = deleteRecursive(node.right, smallestValue);

                return node;
            }
        }

        if (data < node.data) {
            node.left = deleteRecursive(node.left, data);
        } else {
            node.right = deleteRecursive(node.right, data);
        }

        return node;
    }

    private int findSmallestValue(Node node) {
        return root.left == null ? root.data : findSmallestValue(node.left);
    }
}
