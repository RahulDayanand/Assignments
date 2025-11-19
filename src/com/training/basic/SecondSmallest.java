package com.training.basic;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                secondSmallest = smallest;
                smallest = array[i];
            } else if (array[i] < secondSmallest && array[i] != smallest) {
                secondSmallest = array[i];
            }
        }

//        if (secondSmallest == Integer.MAX_VALUE) {
//            System.out.println("No second smallest element found.");
//        } else {
//            System.out.println("Second smallest element is: " + secondSmallest);
//        }

        System.out.println(secondSmallest);
    }
}
