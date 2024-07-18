package org.example.functionalProgramining;

import java.util.function.Function;

public class Advance {

    public static void main(String[] args) {
        //partial application and currying
        //partial application is when you dont provide all the arguments a function needs to run
        //currying is when you take a function that takes multiple arguments and turn it into a chain of functions that each take a single argument
        //currying is a form of partial application

        //partial application

        //currying


        TriFunction<Integer, Integer, Integer, Integer> add = (a, b, c) -> a + b + c;
        Function<Integer, Function<Integer ,Function <Integer,Integer>>> addPartial =(a) -> (b) -> (c) -> add.apply(a,b,c);
        Function<Integer, Function<Integer,Integer>> add5 = addPartial.apply(5);
        Function<Integer,Integer> add5And6 = add5.apply(6);
        Integer result = add5And6.apply(7);
        System.out.println(result);

        //recursion
        //recursion is when a function calls itself
        //recursion is a way to solve problems by defining the solution of a problem in terms of solutions for smaller instances of the same problem

        //composition
        //composition is when you take 2 functions and combine them to produce a new function


    }
}
