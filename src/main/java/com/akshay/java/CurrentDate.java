package com.akshay.java;

import java.util.Scanner;

public class CurrentDate {
    int day;
    int month;
    long year;
    private CurrentDate(){
        this.day = 13;
        this.month = 05;
        this.year = 1994;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        CurrentDate date = new CurrentDate();

        if(n>0 && n<=31) {

            int i = date.getDay() + n;
            System.out.println("The current date is " +i + "/" + date.getMonth() + "/" + date.getYear());

        }

    }
}
