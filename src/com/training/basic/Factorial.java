package com.training.basic;

public class Factorial {

    public static long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
//        long factorial = 1;
//        for (int i = 1; i <= n; i++) {
//            factorial *= i;
//        }

        if (n < 0) {
            System.out.println("No negative numbers for factorial");
        } else {
            long result = factorial(n);
            System.out.println("Factorial of " + n + " is " + result);
        }
    }
}
