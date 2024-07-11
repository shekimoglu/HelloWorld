package org.example.Core;

import java.util.Scanner;

public class Training1 {
    public static void main(String[] args) {

        int age=20;
        if(age>18){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are a minor");
        }
        double gpa=3.5;
        if(gpa>3.0){
            System.out.println("You are a good student");
        }
        else{
            System.out.println("You are a bad student");
        }
        char fInitial='A';
        char lInitial='B';

        boolean attendance=true;
        if(attendance){
            System.out.println("You are present");
        }
        else{
            System.out.println("You are absent");
        }

        //primitive data
        //int double boolen char
        // reference types string
        //non primitive data types  array, class, interface, enum

        String firstName="John";
        String lastName="Doe";

        fInitial=firstName.charAt(0);
        lInitial=lastName.charAt(0);

        System.out.println(firstName + " " +  lastName  + " " + fInitial + " " + lInitial);


        Scanner input=new Scanner(System.in);
        System.out.println("Enter your gpa");
        gpa= input.nextDouble();
        System.out.println("Your gpa is " + gpa);

        //if control flow

        //if condition
        //if block action
        //else block action

        if (gpa>3.0){
            System.out.println("You are a good student");
        }
        else{
            System.out.println("You are a bad student");
        }


        // while loop   while(condition){action} //pretest loop  //action is executed only if the condition is true

        String password="password";
        while ( !password.equals("password")){
            System.out.println("Enter your password");
            password=input.next();
        }
    }
}
