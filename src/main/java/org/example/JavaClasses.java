package org.example;

public class JavaClasses {
    public JavaClasses() {
    }

    public void printMessage() {
        System.out.printf("Hello and welcome!");
    }

    @Override
    public String toString() {
        return "JavaClasses{}";
    }

    public static void main(String[] args) {
        JavaClasses javaClasses = new JavaClasses();
        javaClasses.printMessage();

        System.out.println();
        triangle t = new triangle(  10,  20,  30,  40,  50);
        t.printMessage();
        System.out.println("Area of triangle is: " + t.area());

        triangle t2 = new triangle(  30,  20,  30,  40,  50);
        t2.printMessage();
        System.out.println("Area of triangle is: " + t2.area());
  ;  }
}

class triangle{

    //non static variables are called instance variables or fields
    // instance variables are declared inside the class but outside the method
    // instance variables are declared without the static keyword
    // instance variables are created when an object is created with the use of the keyword 'new' and destroyed when the object is destroyed

    //static variables are declared using the static keyword within a class but outside any method
    // static variables are created when the program starts and destroyed when the program stops
    // static variables are used to refer to the common property of all objects (which is not unique for each object),
    // for example, the company name of employees, college name of students, etc.
    // static variables are shared among all the objects of the class

    //instance variables
    double base;
    double height;
    double side1;
    double side2;
    double side3;

    public triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    //find areav //instance method //non static   vs //class method //static
    public double area(){
        return 0.5*base*height;
    }

    public void printMessage() {
        System.out.printf("Hello and welcome! Triangle");
    }


    //class method //static method  //static method can be called without creating an object of the class

    //class field //static field //static field can be called without creating an object of the class
    //
}