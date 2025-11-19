package com.training.basic;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 61;
        int rev = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            rev = rev * 10 + d;
        }

        System.out.println(rev);
    }
}
