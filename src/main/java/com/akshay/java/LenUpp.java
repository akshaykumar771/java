package com.akshay.java;

public class LenUpp {
    public static void main(String[] args) {

        String string1 = args[0].toUpperCase();
        StringBuilder reverseString = new StringBuilder();

        for(int i= string1.length()-1; i>=0; i--){
            reverseString.append(string1.charAt(i));
        }


        if(reverseString.toString().equals(string1)){
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
        System.out.println("The length of the string is " + args.length);
        System.out.println(reverseString.reverse());

    }
}

