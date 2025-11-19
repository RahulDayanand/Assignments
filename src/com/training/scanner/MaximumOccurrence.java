package com.training.scanner;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccurrence {
    public static void main(String[] args) {
        String word = "asdladwsda";

        Map<Character, Integer> map = new HashMap<>();

        char maxChar = '\0';
        int maxCount = 0;

        for (char ch: word.toCharArray()) {
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }

        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("Maximum Occurrence of a character = " + maxChar);
        System.out.println("Maximum Count of a character = " + maxCount);
    }
}
