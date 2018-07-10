package com.akshay.java;

public class Rectangle {
    int length;
    int breadth;
    int area;

    Rectangle() {
        length = 0;
        breadth = 0;
    }

     Rectangle(int i, int i1) {
        length = i;
        breadth = i1;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    void areaOfRectangle()
    {
        area = length * breadth;
    }

    void displayAreaOfRectangle()
    {
        System.out.println("Area of rectangle is: " + area);
    }
}
