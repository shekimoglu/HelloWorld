package org.example.Core;

public class Training {

    public static void main(String[] args) {

        //function call to print the message "Hello and welcome!"
        printMessage();

        //function call to print the message "Hello and welcome!"
        printMessage();

        double mealCost = 100;
        double tip = tipCalculator(mealCost, 0.15);
        //function call to calculate the total cost of the meal
        double totalCost = totalCostCalculator(mealCost, tip);
        System.out.println("The total cost of the meal is: " + totalCost);


    }

    private static double totalCostCalculator(double mealCost, double tip ) {
        double tax=mealCost*0.08;
        return mealCost + tip + tax;
    }

    private static double tipCalculator(double price, double tipPercentage ) {
        return price * tipPercentage  ;
    }

    private static void printMessage() {
        System.out.printf("Hello and welcome!");
    }
}
