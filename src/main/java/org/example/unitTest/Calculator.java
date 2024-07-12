package org.example.unitTest;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b==0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    public boolean isEven(int i){
        return i % 2 == 0;
    }

    public int[] incrementArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i]++;
        }
        return arr;
    }
}
