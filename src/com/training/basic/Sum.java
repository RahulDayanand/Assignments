package com.training.basic;

public class Sum {
    public static void main(String[] args) {
        int[] array = {15, 12, 23, 40, 15, 36};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (float) sum / array.length);
    }
}
