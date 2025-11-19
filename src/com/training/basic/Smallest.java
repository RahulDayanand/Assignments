package com.training.basic;

public class Smallest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        System.out.println("com.training.basic.ScanSmaller in an array = " + smallest);
    }
}
