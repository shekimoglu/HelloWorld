package org.example;

import java.util.List;

public class ForLoops {

    public static void main(String[] args) {
        //loop through numbers 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        //int array prime numbers
        int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        //loop through prime numbers
        for (int i = 0; i < primeNumbers.length; i++) {
            System.out.println(primeNumbers[i]);
        }
        //foreach loop
        for (int primeNumber : primeNumbers) {
            System.out.println(primeNumber);
        }

        //loop through weekdays
        //list weekdays
        List<String> weekdaysList = List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        //loop
        for (int i = 0; i < weekdaysList.size(); i++) {
            System.out.println(weekdaysList.get(i));
        }

    }
}
