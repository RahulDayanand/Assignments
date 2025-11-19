package com.training.scanner;

import java.util.Scanner;

public class ScanSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
           sum += array[i];
        }

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + sum / array.length);
    }
}
