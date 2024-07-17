package org.example.java8Training;

public class LambdaExpressions
{

    public static void main(String[] args) {

        //lambda expression to add 2 numbers
        Calculator2 add = (a, b) ->  a + b;
        Calculator2 add2= (double a,double b) ->  {return a + b;};
        System.out.println("The sum of 2 and 3 is: " + add.calc(2, 3));

        Creator theCreator = () -> "Hello World";
        System.out.println(theCreator.create());

        Tester theTester = str -> str.length() > 5;
        System.out.println(theTester.test("Hello World"));

        Tester theTester2 = str -> {
            if (str.length() > 5) {
                return true;
            } else {
                return false;
            }
        };

        Tester theTester3 = str -> {
           String s= str.substring(0,5);
           if (s.equals("Hello")){
               return true;}else {
               return false;
           }
        };

        System.out.println(theTester2.test("Hello World"));
        System.out.println(theTester3.test("Hello World"));






    }
}
