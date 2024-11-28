package org.example.generic;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentDigitInANumber {

    public int find(int number) {
        Map<Integer, Integer> frequencies = new HashMap<>();

        while (number % 10 > 0) {
            int key = number % 10;
            if (frequencies.containsKey(key)) {
                frequencies.put(key, frequencies.get(key) + 1);
            } else {
                frequencies.put(key, 1);
            }

            number = number / 10;
        }

        System.out.println(frequencies);

        int result = 0;

        for (int key : frequencies.keySet()) {
            if (frequencies.get(key) > result) {
                result = key;
            }
        }

        return result;
    }
}
