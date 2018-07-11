package com.akshay.java;

public class Rectangle {
    float length;
    float breadth;
    float area;
    float perimeter;

    Rectangle() {
        length = 1;
        breadth = 1;
    }

     public Rectangle(float length, float breadth) throws Exception {
        if(length<0.0f || breadth>=20.0f){
            throw new Exception("Length should be greater than 0 and breadth should be less than 20");
        }
         this.length = length;
        this.breadth = breadth;
    }



    public float getLength() {
        return length;
    }

    public void setPermiter(float perimeter) {
        perimeter = ((getLength()*2) * (getBreadth()*2));
    }

    public float getBreadth() {
        return breadth;
    }

    public void setArea(float area)
    {
        area = (getLength()) * (getBreadth());
    }
    public float getPerimeter() {
        return perimeter;
    }

    public float getArea() {
        return area;
    }

    void areaOfRectangle()
    {
        area = length * breadth;
    }
    void perimeterOfRectangle() {
        perimeter = (2 * (length * breadth));
    }

    void displayAreaOfRectangle()
    {
        System.out.println("Area of rectangle is: " + area);

    }
    void displayPerimeterOfRectangle()
    {
        System.out.println("Perimeter of rectangle is :" + perimeter);
    }


}
