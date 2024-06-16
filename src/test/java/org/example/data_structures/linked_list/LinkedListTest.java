package org.example.data_structures.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void default_initialize() {
        LinkedList linkedList = new LinkedList();

        assertNull(linkedList.head);
    }

    @Test
    void initialize_with_head() {
        LinkedList linkedList = new LinkedList(new Node(2));

        assertNotNull(linkedList.head);
        assertEquals(2, linkedList.head.data);
        assertNull(linkedList.head.next);
    }

    @Test
    void add_when_head_is_null() {
        LinkedList linkedList = new LinkedList();

        linkedList.add(2);

        assertEquals(1, linkedList.size());
        assertEquals(2, linkedList.head.data);
        assertNull(linkedList.head.next);
    }

    @Test
    void add_when_head_is_not_null() {
        LinkedList linkedList = new LinkedList(new Node(2));

        linkedList.add(2);

        assertEquals(2, linkedList.size());
        assertEquals(2, linkedList.head.data);
        assertEquals(2, linkedList.head.next.data);
        assertNull(linkedList.head.next.next);
    }

    @Test
    void delete_when_head_is_null() {
        LinkedList linkedList = new LinkedList();

        assertThrows(UnsupportedOperationException.class, () -> linkedList.delete(2));
    }

    @Test
    void delete_when_head_contains_target_value() {
        LinkedList linkedList = new LinkedList(new Node(14));
        linkedList.add(4);
        linkedList.add(17);
        linkedList.add(2);
        linkedList.add(19);

        linkedList.delete(14);

        assertEquals(4, linkedList.size());
    }

    @Test
    void delete() {
        LinkedList linkedList = new LinkedList(new Node(14));
        linkedList.add(4);
        linkedList.add(17);
        linkedList.add(2);
        linkedList.add(19);

        linkedList.delete(17);

        assertEquals(4, linkedList.size());
    }

    @Test
    void delete_when_target_not_found() {
        LinkedList linkedList = new LinkedList(new Node(14));
        linkedList.add(4);
        linkedList.add(17);
        linkedList.add(2);
        linkedList.add(19);

        linkedList.delete(7);

        assertEquals(5, linkedList.size());
    }
}