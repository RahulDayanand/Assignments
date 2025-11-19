package com.training.basic;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {1, 9, 7, 8, 5, 4, 2, 3, 6};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
