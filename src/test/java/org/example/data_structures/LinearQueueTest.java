package org.example.data_structures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearQueueTest {

  @Test
  void initialize() {
    LinearQueue<Integer> queue = new LinearQueue<>(Integer.class, 5);

    assertEquals(0, queue.getSize());
    assertEquals(0, queue.getFront());
    assertEquals(4, queue.getRear());
    assertEquals(5, queue.getItems().length);
    assertEquals(5, queue.getCapacity());
  }

  @Test
  void enqueue() {
    LinearQueue<Integer> queue = new LinearQueue<>(Integer.class, 5);

    queue.enqueue(1);

    assertEquals(0, queue.getFront());
    assertEquals(0, queue.getRear());
    assertEquals(1, queue.getSize());
    assertEquals(5, queue.getCapacity());
    assertEquals(5, queue.getItems().length);
    assertEquals(1, queue.getItems()[0]);
  }

  @Test
  void enqueue_throws_exception_when_queue_is_full() {
    LinearQueue<Integer> queue = new LinearQueue<>(Integer.class, 5);
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    queue.enqueue(5);

    UnsupportedOperationException exception =
        assertThrows(UnsupportedOperationException.class, () -> queue.enqueue(6));

    assertEquals("Queue is full", exception.getMessage());
  }

  @Test
  void dequeue() {
    LinearQueue<Integer> queue = new LinearQueue<>(Integer.class, 5);
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    queue.enqueue(5);

    Integer dequeued = queue.dequeue();

    assertEquals(1, dequeued);
    assertEquals(1, queue.getFront());
    assertEquals(4, queue.getRear());
    assertEquals(5, queue.getItems().length);
    assertEquals(5, queue.getCapacity());
    assertEquals(4, queue.getSize());
  }

  @Test
  void dequeue_throws_exception_when_queue_is_empty() {
    LinearQueue<Integer> queue = new LinearQueue<>(Integer.class, 5);

    UnsupportedOperationException exception =
        assertThrows(UnsupportedOperationException.class, queue::dequeue);

    assertEquals("Queue is empty", exception.getMessage());
  }
}
