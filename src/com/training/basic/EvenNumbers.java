package com.training.basic;

public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Even Numbers up to 20 are ");
        for (int i = 0; i <= 20 ; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
