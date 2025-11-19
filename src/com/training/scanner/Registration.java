package com.training.scanner;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        String[] names = {"Rahul", "Rathish", "Inchara", "Rachana", "Chirag", "Ganesh", "Keerthiraj"};

        Scanner in = new Scanner(System.in);
        System.out.println("Enter name to register ");
        String userName = in.next();
        boolean exists = false;

        for (String name : names) {
            if (name.equalsIgnoreCase(userName)) {
                exists = true;
            }
        }

        if (exists) {
            System.out.println("Name is not unique");
        } else {
            System.out.println("You are registered");
        }
    }
}
