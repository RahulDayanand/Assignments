package com.training.scanner;

import java.util.Scanner;

public class TwoDim {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[][] array = new String[n][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = in.next();
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j].startsWith("s")) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
