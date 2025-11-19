package com.training.basic;

public class SecondLargest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != secondLargest) {
                secondLargest = array[i];
            }
        }
        System.out.println(secondLargest);
    }
}
