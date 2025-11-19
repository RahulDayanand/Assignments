package com.training.scanner;

public class PalindromeString {
    public static void main(String[] args) {
        String word = "Madam".toLowerCase();
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
           reverse += word.charAt(i);
        }

        if (word.equals(reverse)) {
            System.out.println(word + " is a palindrome word " + reverse);
        } else {
            System.out.println(word + " is not a palindrome word " + reverse);
        }
    }
}
