package org.example;

public class employee {

    public static void main(String[] args) {
        //age of employee
        int age=20;
        //print the age of the employee
        System.out.println("The age of the employee is: " + age);

        //is manager
        boolean isManager=true;
        //print if the employee is a manager
        System.out.println("Is the employee a manager: " + isManager);

        //years of service of the employee
        int yearsOfService=5;
        //print the years of service of the employee
        System.out.println("The years of service of the employee is: " + yearsOfService);

        //salary of the employee
        double salary=50000.00;
        //print the salary of the employee
        System.out.println("The salary of the employee is: " + salary);

        //over time payments of the employee
        double overTimePayments=5000.00;
        //print the over time payments of the employee
        System.out.println("The over time payments of the employee is: " + overTimePayments);

        //bonus of the employee
        double bonus=5000.00;
        //print the bonus of the employee
        System.out.println("The bonus of the employee is: " + bonus);

        //total salary of the employee
        double totalSalary=salary+overTimePayments+bonus;
        //print the total salary of the employee
        System.out.println("The total salary of the employee is: " + totalSalary);


    }
}
