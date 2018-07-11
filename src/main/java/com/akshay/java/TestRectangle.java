package com.akshay.java;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) throws Exception {
        Rectangle rectangle1 = new Rectangle(3.2f,21f);
        //Rectangle rectangle2 = new Rectangle(20f,21f);
        rectangle1.areaOfRectangle();
        rectangle1.displayAreaOfRectangle();
        rectangle1.perimeterOfRectangle();
        rectangle1.displayPerimeterOfRectangle();
    }
}
