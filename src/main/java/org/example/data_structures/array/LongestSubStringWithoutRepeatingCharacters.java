package org.example.data_structures.array;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingCharacters {
    public int findLongestSubStringWithoutRepeatingCharacters(String s) {
        int result = 0;
        int left = 0;
        Map<Character, Integer> characterToLastFoundIndex = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            Character ch = s.charAt(right);
            if (characterToLastFoundIndex.containsKey(ch) && characterToLastFoundIndex.get(ch) >= left) {
                left = characterToLastFoundIndex.get(ch) + 1;
            }

            result = Math.max(result, right - left + 1);
            characterToLastFoundIndex.put(ch, right);
        }

        return result;
    }
}
