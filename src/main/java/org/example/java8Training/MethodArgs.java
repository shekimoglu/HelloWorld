package org.example.java8Training;

public class MethodArgs {
    public static void main(String[] args) {
        // Call the static method
        System.out.println("The result of the test is: " + runTester((str) -> str.length() > 5, "Hello World"));

        System.out.println("The result of the test is: " + runTester((str) -> {
            String s = str.substring(0, 5);
            return s.equals("Hello");
        }, "Hello World"));

        System.out.println(runTester(str -> str.startsWith("x"), "Hello World"));
    }

    public static boolean runTester(Tester t,String x){
        return t.test(x);
    }
}
