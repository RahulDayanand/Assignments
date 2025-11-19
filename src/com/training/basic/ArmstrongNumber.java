package com.training.basic;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int originalNumber = n;
        int result = 0;
        int digits = String.valueOf(n).length();

        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            result += Math.pow(digit, digits);
        }

        if (result == originalNumber) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}
