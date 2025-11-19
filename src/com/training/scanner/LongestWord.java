package com.training.scanner;

import java.util.Arrays;
import java.util.List;

public class LongestWord {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Rahul", "Rathish", "Inchara", "Rachana", "Chirag", "Ganesh", "Keerthiraj", "ShankarGuru");

        if (words.isEmpty() || words == null) {
            System.out.println("No words available");;
        }

        String longestWord = words.get(0);
        for (String word: words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println(longestWord);

    }
}
