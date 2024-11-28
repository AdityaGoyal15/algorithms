package org.example.data_structures.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicatesInArray {

    public int[] findDuplicates(int[] array) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> frequencies = new HashMap<>();

        for (int j : array) {
            if (frequencies.containsKey(j)) {
                frequencies.put(j, frequencies.get(j) + 1);
            } else {
                frequencies.put(j, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
            if (entry.getValue() > 1) {
                list.add(entry.getKey());
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
