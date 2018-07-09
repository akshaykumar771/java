package com.akshay.java;

import java.util.Scanner;

public class AssignmentOne {
    public static void main(String[] args) {
        System.out.println("Enter the value of n :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Invalid number");
        }


    }
}
