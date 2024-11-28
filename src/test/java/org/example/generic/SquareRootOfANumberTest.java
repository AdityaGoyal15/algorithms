package org.example.generic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareRootOfANumberTest {

    @Test
    public void squareRootOfANumber() {
        SquareRootOfANumber sqr = new SquareRootOfANumber();

        double sqrt = sqr.sqrt(49.0);

        assertEquals(7, (int) sqrt);
    }

}