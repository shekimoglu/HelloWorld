package org.example.java8Training;

public interface StaticMethodsInterface {


    public static void main(String[] args) {
        // Call the static method
        System.out.println("The sum of 2 and 3 is: " + sum(2, 3));

    }

    // Define a static method
    public static int sum(int a, int b) {
        return a + b;
    }

    // Define another static method
    public static int multiply(int a, int b) {
        return a * b;
    }

}
