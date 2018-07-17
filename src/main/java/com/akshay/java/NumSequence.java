package com.akshay.java;

public class NumSequence {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println("The sequence of the numbers are:");
        System.out.println(num1);
        System.out.println(num2);

        for (int i = 0; i < 14; i++) {
            int sumOfPrevTwo = num1+num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            System.out.println(sumOfPrevTwo);
        }

    }
}