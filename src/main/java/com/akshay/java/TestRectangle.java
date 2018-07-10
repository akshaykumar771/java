package com.akshay.java;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int i = sc.nextInt();
        System.out.println("enter breadth");
        int i1 = sc.nextInt();
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setLength(i);
        rectangle1.setBreadth(i1);
        System.out.println("Length is " + rectangle1.getLength());
        System.out.println("Breadth is " + rectangle1.getBreadth());
        rectangle1.areaOfRectangle();
        rectangle1.displayAreaOfRectangle();
    }
}
