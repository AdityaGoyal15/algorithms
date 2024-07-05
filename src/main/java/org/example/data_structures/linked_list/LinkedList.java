package org.example.data_structures.linked_list;

public class LinkedList {

  Node head;

  public LinkedList(Node head) {
    this.head = head;
  }

  public Node add(int data) {
    Node newNode = new Node(data);
    Node pointer = head;
    // Iterate the list until a node is found with next of it as null (last node)
    while (pointer.next != null) {
      pointer = pointer.next;
    }
    // Set the next of last node as new node with data equal to input
    pointer.next = newNode;
    // Return the last node (which is the new node that is added to the list)
    return pointer.next;
  }

  public Node remove(int data) {
    Node pointer = head;
    Node previousNode = null;
    // Iterate while a node with data equivalent to input is not found
    // Keep track of previous node because the next node of the previous node will have to point to
    // the next of the node with input
    while (pointer.next != null && pointer.data != data) {
      previousNode = pointer;
      pointer = pointer.next;
    }
    // If previous node is not null, then set the next of previous node to the next of node with
    // data equal to the input
    // Set the next of node with input to null to make it orphan
    if (previousNode != null) {
      previousNode.next = pointer.next;
      pointer.next = null;
    }

    return pointer;
  }

  public int length() {
    Node pointer = head;
    int length = 0;
    // Set the pointer at the head and move it until it reached the last node. Keep incrementing the
    // length while doing this
    while (pointer != null) {
      length++;
      pointer = pointer.next;
    }

    return length;
  }

  public Node find(int data) {
    Node pointer = head;

    while (pointer != null && pointer.data != data) {
      pointer = pointer.next;
    }

    return pointer;
  }
}
