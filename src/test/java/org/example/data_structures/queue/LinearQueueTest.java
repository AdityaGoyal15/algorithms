package org.example.data_structures.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearQueueTest {

    @Test
    void initialize() {
        LinearQueue linearQueue = new LinearQueue(5);

        assertEquals(0, linearQueue.size);
        assertEquals(0, linearQueue.front);
        assertEquals(4, linearQueue.rear);
        assertEquals(5, linearQueue.items.length);
        assertEquals(5, linearQueue.capacity);
    }

    @Test
    void enqueue() {
        LinearQueue linearQueue = new LinearQueue(5);

        linearQueue.enqueue(2);

        assertEquals(1, linearQueue.size);
        assertEquals(0, linearQueue.front);
        assertEquals(0, linearQueue.rear);
        assertEquals(5, linearQueue.items.length);
        assertEquals(2, linearQueue.items[0]);
    }

    @Test
    void enqueue_throws_exception_when_queue_is_full() {
        LinearQueue linearQueue = new LinearQueue(2);
        linearQueue.enqueue(2);
        linearQueue.enqueue(2);

        assertThrows(UnsupportedOperationException.class, () -> linearQueue.enqueue(1));
    }

    @Test
    void dequeue_throws_exception_when_queue_is_empty() {
        LinearQueue linearQueue = new LinearQueue(2);

        assertThrows(UnsupportedOperationException.class, linearQueue::dequeue);
    }

    @Test
    void dequeue() {
        LinearQueue linearQueue = new LinearQueue(2);
        linearQueue.enqueue(2);
        linearQueue.enqueue(4);

        int dequeued = linearQueue.dequeue();

        assertEquals(2, dequeued);
        assertEquals(1, linearQueue.front);
        assertEquals(1, linearQueue.rear);
        assertEquals(1, linearQueue.size);
        assertEquals(2, linearQueue.items.length);
    }
}