package org.example.java8Training.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NonStream {

    public static void main(String[] args) {

        String [] names = {"Sam", "Pamela", "Dave", "Pascal", "Erik"};
        List<String> nameList =new ArrayList<>();

        for (String name : names) {
            if (!name.equals("Sam")) {
                nameList.add(name);
            }
        }

        System.out.println(nameList);

        List<String> nameList2 =new ArrayList<>();
        for (String name : names) {
            nameList2.add(name);
        }

        //ways of creating streams

        //stream based on array
        Stream<String> nameStream = Arrays.stream(names);

        //stream based on collection
        Stream<String> nameStream2 = nameList2.stream();

        //stream based on generate methods
        Stream<Integer> nameStream3 = Stream.generate(() -> 4);

        //stream based on iterate methods
        Stream<Integer> nameStream4 = Stream.iterate(1, n -> n + 1);


        //how ro print streams
        //???


        //terminal operations
        //forEach
        nameStream.forEach(System.out::println);

        //count
        long count = nameStream2.count();
        System.out.println(count);

//        //collect
//        List<String> nameList3 = nameStream2.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
//        System.out.println(nameList3);
//
//        //reduce
//        String result = nameStream2.reduce("", (a, b) -> a + b);
//        System.out.println(result);
//
//        //min
//        String min = nameStream2.min(String::compareTo).get();
//        System.out.println(min);
//
//        //max
//        String max = nameStream2.max(String::compareTo).get();
//        System.out.println(max);

        




    }
}
