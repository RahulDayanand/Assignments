package com.training.scanner;

import java.util.Scanner;

public class ScanSmaller {
    public static void main(String[] args) {
       int smallest = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter First Number ");
        int n1 = in.nextInt();

        System.out.println("Enter Second Number ");
        int n2 = in.nextInt();

        System.out.println("Enter Third Number ");
        int n3 = in.nextInt();

        if (n1 < n2 && n1 < n3) {
            smallest = n1;
        } else if (n2 < n1 && n2 < n3) {
            smallest = n2;
        } else {
            smallest = n3;
        }

        System.out.println(smallest);
    }
}
