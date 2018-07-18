package com.akshay.java;

public class Bingo {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int arr1[] = {7,25,5,19,39};
        boolean flag = false;
        if(num1>0 && num2<40)
            System.out.println("The numbers are " +  num1 + "\t"+  num2 );
        for(int i =0;i<arr1.length;i++ )
        {
            if (arr1[i] == num1)
            {
                for(int j =0;j<arr1.length;j++ )
                {
                    if(arr1[j] == num2)
                    {
                        flag = true;
                        break;
                    }
                }


            }

        }
        if(flag){
            System.out.println("BINGO!!");
        }
        else {
            System.out.println("Not BINGO!");
        }
        }
    }

