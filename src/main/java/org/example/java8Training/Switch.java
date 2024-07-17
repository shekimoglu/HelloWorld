package org.example.java8Training;

public class Switch {

    public static void main(String[] args) {


        String language = "Java";

        switch (language) {
            case "Java":
                System.out.println("Best Programming Language");
                break;
            case "Python":
                System.out.println("Best Programming Language for Data Science");
                break;
            case "JavaScript":
                System.out.println("Best Programming Language for Web Development");
                break;
            default:
                System.out.println("Doesn't match any programming language");
        }

    }
}
