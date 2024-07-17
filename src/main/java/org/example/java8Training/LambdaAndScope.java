package org.example.java8Training;

public class LambdaAndScope {

    public static void main(String[] args) {

        int c=5;
        //variable had to be final in lambda expression??
        //c = 10; // This will not compile

        Calculator2 calculator2 = (a, b) -> {
            // c = 10; // This will not compile
            return  b + c;
        };

        System.out.println(calculator2);
    }
}
