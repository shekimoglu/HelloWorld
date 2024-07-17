package org.example.java8Training;

public class StaticMethods {

    public static void main(String[] args) {
        // Call the static method
        System.out.println("The sum of 2 and 3 is: " + sum(2, 3));

        //call static method in the interface
        //Static methods in interfaces are similar to static methods in classes.
        // They can be called using the interface name without creating an instance of the interface.
        // Static methods in interfaces are defined using the static keyword.
        // Static methods in interfaces are commonly used for utility methods that are not specific to an instance of the interface.
        // To call a static method in an interface, you can use the interface name followed by the method name:
        StaticMethodsInterface.sum(2, 3);
        StaticMethodsInterface.multiply(2, 3);
    }

    // Define a static method
    public static int sum(int a, int b) {
        return a + b;
    }

    // Define another static method
    public static int multiply(int a, int b) {
        return a * b;
    }

    //static methods vs default methods
    //Static methods are methods that are associated with a class rather than
    // with an instance of the class. They can be called without creating an
    // instance of the class. Static methods are defined using the static keyword.
    //Default methods are methods that are defined in an interface with a default
    // implementation. They can be overridden by classes that implement the interface.
    // Default methods are defined using the default keyword.
    //Static methods can be called using the class name, while
    // default methods can be called using an instance of the class that implements the interface.
    //Static methods cannot be overridden, while default methods can be overridden by classes that implement the interface.
    //Static methods are used for utility methods that are not specific to an instance of a class,
    // while default methods are used to provide a default implementation for methods in an interface.
    //Static methods are commonly used for factory methods, utility methods, and helper methods.
    // Default methods are commonly used to add new methods to existing interfaces without breaking existing implementations.


    //create functinal interface
    //A functional interface is an interface that contains only one abstract method.
    // It can have multiple default and static methods, but only one abstract method.

    //example of functional interface

    // Define a functional interface





}
