package org.example.functionalProgramining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Chp3 {

    //map

    public static void main(String[] args) {
        //map in java
        Integer [] intArray = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> list = new ArrayList<>(Arrays.asList(intArray));

        Function<Integer, Integer> doubleIt = a -> a * 2;

        List<Integer> doubled = list.stream().map(doubleIt).collect(Collectors.toList());

        System.out.println(doubled);

        //filter in java
        List<Integer> even = list.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
        System.out.println(even);

        //reduce in java
        Integer sum = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        //reduce in java
        Integer product = list.stream().reduce(1, (a, b) -> a * b);
        System.out.println(product);

        //reduce in java
        Integer max = list.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(max);

        //reduce in java
        Integer min = list.stream().reduce(0, (a, b) -> a < b ? a : b);
        System.out.println(min);

        //collect in java
        List<Integer> doubled2 = list.stream().map(doubleIt).collect(Collectors.toList());
        System.out.println(doubled2);

        //collect in java
        List<Integer> even2 = list.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
        System.out.println(even2);
    }
}
