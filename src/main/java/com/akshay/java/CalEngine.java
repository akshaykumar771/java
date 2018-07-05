package com.akshay.java;

public class CalEngine {

    public static void main(String[] args) {
        double[] leftVals = {100.0d, 50.0d, 25.0d, 45.0d};
        double[] rightVals = {34.0d, 45.0d, 56.0d, 80.0d};
        char[] opCodes = {'a', 'd', 'm', 's'};
        double[] results = new double[opCodes.length];
//        double val1 = 100.0d;
//        double val2 = 50.0d;
//        double result;
//        char opCode = 'f';
        for (int i = 0; i < opCodes.length; i++) {
            if (opCodes[i] == 'a')
                results[i] = leftVals[i] + rightVals[i];
            else if (opCodes[i] == 's')
                results[i] = leftVals[i] - rightVals[i];
            else if (opCodes[i] == 'm')
                results[i] = leftVals[i] * rightVals[i];
            else if (opCodes[i] == 'd')
                results[i] = leftVals[i] / rightVals[i];
            else {
                System.out.println("Error - invalid opCode");
                results[i] = 0.0d;
            }
            System.out.println(results[i]);
        }
    }
}
