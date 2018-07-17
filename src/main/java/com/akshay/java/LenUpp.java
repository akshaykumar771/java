package com.akshay.java;

public class LenUpp {
    public static void main(String[] args) {
        int length = args.length;
        for (int i =0;i<length;i++) {
            System.out.println(args[i].toUpperCase());
        }
        System.out.println("The length of the string is " + args.length);
    }
}
