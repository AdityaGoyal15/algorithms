package org.example.data_structures.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DynamicArrayTest {

  @Test
  void insert() {
    DynamicArray array = new DynamicArray(3);

    array.insert(1);
    array.insert(2);
    array.insert(3);
    array.insert(4);

    assertEquals(6, array.data.length);
    array.print();
  }
}
