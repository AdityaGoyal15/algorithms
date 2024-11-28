package org.example.data_structures.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseAnArrayTest {

    @Test
    public void reverseAnArray() {
        ReverseAnArray reverseAnArray = new ReverseAnArray();
        int[] array = new int[]{1, 2, 3, 4, 5, 6};

        int[] result = reverseAnArray.reverseArray(array);

        assertArrayEquals(result, array);
    }
}