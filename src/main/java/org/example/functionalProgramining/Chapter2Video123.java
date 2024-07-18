package org.example.functionalProgramining;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Chapter2Video123 {

    protected static class MyMath {
        public static Integer triple(Integer x) {
            return x * 3;
        }
    }
    public static void main(String[] args) {
        Function<Integer, Integer> triple = MyMath::triple;
        System.out.println(triple.apply(3));

        Function<Integer, Integer> absoluteValue = (x) -> x < 0 ? -x : x;
        System.out.println(absoluteValue.apply(-10));
        System.out.println(absoluteValue.apply(10));

        //if else
        Function<Integer, Integer> absoluteValue2 = (x) -> {
            if (x < 0) {
                return -x;
            } else {
                return x;
            }
        };

        System.out.println(absoluteValue2.apply(-10));
        System.out.println(absoluteValue2.apply(10));

        //bifunctions
        BiFunction <Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(3, 4));

        //java doesnt have more then 2 function arguments
        //use tuple or create a class to hold the arguments


        TriFunction<Integer, Integer, Integer, Integer> add3 = (a, b, c) -> a + b + c;
        System.out.println(add3.apply(3, 4, 5));

        NoArgFunction<String> noArgFunction = () -> "Hello";
        System.out.println(noArgFunction.apply());


    }


}
