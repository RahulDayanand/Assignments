package com.training.basic;

public class Greatest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int greatest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > greatest) {
                greatest = array[i];
            }
        }

        System.out.println("com.training.basic.ScanGreater in an array = " + greatest);
    }
}
