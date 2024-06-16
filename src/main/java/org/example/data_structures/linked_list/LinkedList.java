package org.example.data_structures.linked_list;

public class LinkedList {

    Node head;

    public LinkedList() {
    }

    public LinkedList(Node head) {
        this.head = head;
    }


    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node ptr = head;

            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = newNode;
        }
    }

    public int size() {
        if (head == null) {
            return 0;
        } else {
            Node ptr = head;
            int size = 0;

            while (ptr != null) {
                ptr = ptr.next;
                size++;
            }
            return size;
        }
    }

    public void delete(int data) {
        if (head == null) {
            throw new UnsupportedOperationException("List is empty");
        }

        if (head.data == data) {
            head = head.next;
        }
        Node ptr = head;
        Node prev = null;

        while (ptr != null && ptr.data != data) {
            prev = ptr;
            ptr = ptr.next;
        }

        if (ptr == null) {
            return;
        }

        if (prev == null) {
            return;
        }
        prev.next = ptr.next;
    }
}
