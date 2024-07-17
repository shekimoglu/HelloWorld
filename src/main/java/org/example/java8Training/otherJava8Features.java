package org.example.java8Training;

public class otherJava8Features {

    public static void main(String[] args) {
        //array parallel sorting
        //good when you have large arrays

        int[] numbers = {5, 3, 8, 2, 1, 4};
        System.out.println("Before sorting");
        for (int i : numbers) {
            System.out.println(i);
        }
        System.out.println("After sorting");
        java.util.Arrays.parallelSort(numbers);
        for (int i : numbers) {
            System.out.println(i);
        }


        //unassigned integer arithmetics
        int a = 5;
        int b = 3;
        int c = a + b;
        System.out.println(c);

        int resultDivide=Integer.divideUnsigned(a,b);
        System.out.println(resultDivide);

        int resultRemainder=Integer.remainderUnsigned(a,b);
        System.out.println(resultRemainder);

        int resultCompare=Integer.compareUnsigned(a,b);
        System.out.println(resultCompare);

    }
}
