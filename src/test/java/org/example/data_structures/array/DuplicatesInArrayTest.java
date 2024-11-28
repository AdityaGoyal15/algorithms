package org.example.data_structures.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicatesInArrayTest {

    @Test
    public void duplicatesInArray() {
        DuplicatesInArray duplicatesInArray = new DuplicatesInArray();
        int[] array = new int[]{1, 10, 2, 2, 3, 4, 7, 5, 6, 7, 8, 9, 10};

        int[] result = duplicatesInArray.findDuplicates(array);

        /*for (int j : result) {
            System.out.print(j + " ");
        }*/

        assertEquals(3, result.length);
    }

}