package org.example.generic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstNonRepeatingCharacterTest {

    @Test
    public void firstNonRepeatingCharacter() {
        String input = "abacddddcc";
        FirstNonRepeatingCharacter firstNonRepeatingCharacter = new FirstNonRepeatingCharacter();

        char ch = firstNonRepeatingCharacter.find(input);

        assertEquals('b', ch);
    }
}