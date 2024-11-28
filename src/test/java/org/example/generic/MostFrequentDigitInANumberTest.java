package org.example.generic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MostFrequentDigitInANumberTest {

    @Test
    public void test() {
        MostFrequentDigitInANumber obj = new MostFrequentDigitInANumber();

        int result = obj.find(423253433);

        assertEquals(3, result);
    }

}