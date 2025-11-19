package com.training.scanner;

import java.util.Scanner;

public class ScanGreater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();

        int greatest = (n1 > n2) ? ((n1 > n2) ? n1 : n2) : ((n2 > n3) ? n2 : n3);
        System.out.println(greatest);
    }
}
