package com.training.scanner;

import java.util.Arrays;
import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        Double[] array = new Double[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextDouble();
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.sqrt(array[i]);
        }

        System.out.println(Arrays.toString(array));
    }
}
