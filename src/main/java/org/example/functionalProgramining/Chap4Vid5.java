package org.example.functionalProgramining;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Chap4Vid5 {
    // Function<Integer, Function<Integer, Integer>>  signature of a function that takes an integer as an argument and returns a function look like this
    // Function<Integer, Integer>  signature of a function that takes an integer as an argument and returns an integer look like this
    // Function<Function<Integer, Integer>, Integer> signature of a function that takes a function as an argument and returns an integer look like this
    // Function<Function<Integer, Integer>, Function<Integer, Integer>> signature of a function that takes a function as an argument and returns a function look like this


//passing function as arguments
    public static void main(String[] args) {
        NoArgFunction<String> f1 = () -> "Hello";
        NoArgFunction<String> f2 = () -> "World";
        System.out.println(f1.apply() + " " + f2.apply());

        System.out.println(MyMath.combine2And3(MyMath::add));
        System.out.println(MyMath.combine2And3(MyMath::subtract));

        System.out.println(MyMath.combine2And3((a, b) -> a * b));

        NoArgFunction <NoArgFunction<String>> createPrinter = () -> () -> "Hello";
        NoArgFunction<String> printer = createPrinter.apply();
        System.out.println(printer.apply());


        Function<Integer, Integer> times2 = MyMath.createMultiplier(2);
        Function<Integer, Integer> times3 = MyMath.createMultiplier(3);
        Function<Integer, Integer> times4 = MyMath.createMultiplier(4);

        System.out.println(times2.apply(5));
        System.out.println(times3.apply(5));
        System.out.println(times4.apply(5));

    }

    protected static class MyMath {
        public static Integer add(Integer a, Integer b) {
            return a + b;
        }

        public static Integer subtract(Integer a, Integer b) {
            return a - b;
        }

        public static Integer combine2And3(BiFunction<Integer, Integer, Integer> combine) {
            return combine.apply(2, 3);
        }

        //times 2
        public static Integer times2(Integer a){
            return a*2;
        }

        //times 3
        public static Integer times3(Integer a){
            return a*3;
        }

        //times 4
        public static Integer times4(Integer a){
            return a*4;
        }

        public static Function<Integer, Integer> createMultiplier(Integer y){
            return (Integer x) -> x * y;
        }


    }

}
