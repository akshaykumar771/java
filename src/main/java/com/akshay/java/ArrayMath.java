package com.akshay.java;

public class ArrayMath {



    public static int sum(int[] array)
    {
        int sum = 0;
        for (int num : array) {
            sum = sum + num;
        }
        return sum;
    }

    public static double average(int[] array)
    {
        double avg;
        int sum = sum(array);
        avg = sum/16;
        return avg;
    }

    public static int findSmall(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int array[] = {3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
        int sum = sum(array);
        double avg = average(array);
        int small = findSmall(array);

        array[15] = sum;
        array[16] = (int) avg;
        array[17] = small;


        System.out.println("Array is:");
        for (int i : array) {
            System.out.println(i);
        }



    }




}
