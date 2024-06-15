package org.example.data_structures;

public class LinkedList<T> {

  private Node<T> head;

  public LinkedList() {}

  public LinkedList(Node<T> head) {
    this.head = head;
  }

  public void add(T data) {
    if (head == null) {
      head = new Node<>(data);
    } else {
      Node<T> newNode = new Node<>(data);
      Node<T> current = head;

      while (current.getNext() != null) {
        current = current.getNext();
      }
      current.setNext(newNode);
    }
  }

  public int size() {
    if (head == null) {
      return 0;
    }

    int size = 0;
    Node<T> current = head;

    while (current != null) {
      current = current.getNext();
      size++;
    }

    return size;
  }

  public Node<T> getHead() {
    return head;
  }
}
