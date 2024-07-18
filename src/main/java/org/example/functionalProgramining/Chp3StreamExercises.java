package org.example.functionalProgramining;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Chp3StreamExercises {


    public static void main(String[] args) {
        //get a list that contains all the people's names
        List<Person> people = Arrays.asList(new Person("John", 30), new Person("Sara", 21), new Person("Jane", 25), new Person("Greg", 35));
        List<String> names = people.stream().map(person -> person.name).collect(Collectors.toList());
        System.out.println(names);
        //use stream
        //get a list that contains all the people's names
        List<Person> people2 = Arrays.asList(new Person("John", 30), new Person("Sara", 21), new Person("Jane", 25), new Person("Greg", 35));
        List<String> names2 = people2.stream().map(person -> person.name).collect(Collectors.toList());
        System.out.println(names2);


        //find the sum of all of the employee's salaries
        List<Employee> employees = Arrays.asList(new Employee("John", 30), new Employee("Sara", 21), new Employee("Jane", 25), new Employee("Greg", 35));
        int sum = employees.stream().map(employee -> employee.salary).reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        //use stream
        //find the sum of all of the employee's salaries
        List<Employee> employees2 = Arrays.asList(new Employee("John", 30), new Employee("Sara", 21), new Employee("Jane", 25), new Employee("Greg", 35));
        int sum2 = employees2.stream().map(employee -> employee.salary).reduce(0, (a, b) -> a + b);
        System.out.println(sum2);

        //find all the blue cars
        List<Car> cars = Arrays.asList(new Car("blue", "bmw", 20), new Car("red", "audi", 30), new Car("blue", "fiat", 40), new Car("green", "ford", 50));
        List<Car> blueCars = cars.stream().filter(car -> car.make.equals("blue")).collect(Collectors.toList());
        System.out.println(blueCars);

        Car[] carsArray = {new Car("blue", "bmw", 20), new Car("red", "audi", 30), new Car("blue", "fiat", 40), new Car("green", "ford", 50)};
        List<Car> carsList = Arrays.asList(carsArray);
        List<Car> blueCars2 = carsList.stream().filter(car -> car.make.equals("blue")).collect(Collectors.toList());
        System.out.println(blueCars2);


        //combine list functions
        List<Car> cars2 = Arrays.asList(new Car("blue", "bmw", 20), new Car("red", "audi", 30), new Car("blue", "fiat", 40), new Car("green", "ford", 50));
        int sum3 = cars2.stream().filter(car -> car.make.equals("blue")).map(car -> car.price).reduce(0, (a, b) -> a + b);
        System.out.println(sum3);

    }

    protected static class  Person{
        private String name;
        private int age;

        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }
    }

    protected static class DataLoader{
        public final NoArgFunction<Person> loadPerson;

        public DataLoader(boolean isReal){
            this.loadPerson = isReal
                    ? this::loadPerson
                    : this::loadFakePerson;
        }

        private Person loadPerson(){
            System.out.println("Loading real person");
            return new Person("John", 30);
        }

        private Person loadFakePerson(){
            System.out.println("Loading fake person");
            return new Person("x", 30);
        }

        public static void main(String[] args) {
            final  Boolean isReal = true;

            DataLoader dataLoader = new DataLoader(isReal);
            dataLoader.loadPerson.apply();
        }
    }

    //car class
    protected static class Car{
        private String make;
        private String model;
        private int price;

        public Car(String make, String model, int price){
            this.make = make;
            this.model = model;
            this.price = price;
        }

        public String toString(){
            return make + " " + model + " " + price;
        }
    }

    //employee class
    protected static class Employee{
        private String name;
        private int salary;

        public Employee(String name, int salary){
            this.name = name;
            this.salary = salary;
        }
    }




}
