package org.example.generic;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class FirstNonRepeatingCharacter {


    public char find(String input) {
        Map<Character, Integer> map = new HashMap<>();

        IntStream.range(0, input.length()).forEach(i -> {
            char c = input.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        });

        for (int i = 0; i < input.length(); i++) {
            Integer count = map.get(input.charAt(i));

            if (count == 1) {
                return input.charAt(i);
            }
        }

        return input.charAt(0);
    }
}
