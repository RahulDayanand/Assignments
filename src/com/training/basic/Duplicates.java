package com.training.basic;

import java.util.HashMap;
import java.util.Map;

public class Duplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4, 5, 4, 1, 6, 2};

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i],0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
            }
        }
    }
}
