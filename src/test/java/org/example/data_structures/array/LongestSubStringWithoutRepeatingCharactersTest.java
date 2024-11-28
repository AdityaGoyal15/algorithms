package org.example.data_structures.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubStringWithoutRepeatingCharactersTest {

    @Test
    public void longestSubstring() {
        LongestSubStringWithoutRepeatingCharacters obj = new LongestSubStringWithoutRepeatingCharacters();

        int result = obj.findLongestSubStringWithoutRepeatingCharacters("pwwkew");

        assertEquals(3, result);
    }
}