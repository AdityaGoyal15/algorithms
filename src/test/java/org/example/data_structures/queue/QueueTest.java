package org.example.data_structures.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    public void enqueue() {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        assertEquals(1, queue.front.data);
        assertEquals(4, queue.rear.data);
    }

    @Test
    public void dequeue() {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        int poppedValue = queue.dequeue();

        assertEquals(1, poppedValue);
        assertEquals(2, queue.front.data);
        assertEquals(4, queue.rear.data);
    }

    @Test
    public void isEmpty_1() {
        Queue queue = new Queue();

        assertTrue(queue.isEmpty());
    }


    @Test
    public void isEmpty_2() {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        assertFalse(queue.isEmpty());
    }

    @Test
    public void isEmpty_3() {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        assertFalse(queue.isEmpty());
    }
}