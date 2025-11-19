package com.training.basic;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n == 0) return 0;

        if (n == 1) return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
//        int n1 = 0, n2 = 1;
//        System.out.print(n1 + " " + n2);
        for (int i = 0; i < 100; i++) {
            System.out.print(fibonacci(i) + " ");
//            int n3 = n1 + n2;
//            System.out.print(" " + n3);
//            n1 = n2;
//            n2 = n3;
        }
    }
}
