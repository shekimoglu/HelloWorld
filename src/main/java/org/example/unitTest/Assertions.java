package org.example.unitTest;

public class Assertions {

    //Introduction to AssertJ
    //AssertJ is a library that provides a fluent interface for writing assertions in Java.
    // It is an alternative to JUnit's built-in assertion methods and offers more flexibility and readability in writing test assertions.

    //types of assertions
    //AssertJ provides a wide range of assertion methods for different types of objects, including primitive types, collections, and custom objects.
    //examples of some commonly used assertion methods in AssertJ:
    //assertThat(actual).isEqualTo(expected) - asserts that the actual value is equal to the expected value.
    //assertThat(actual).isNotEqualTo(expected) - asserts that the actual value is not equal to the expected value.
    //assertThat(actual).isTrue() - asserts that the actual value is true.
    //assertThat(actual).isFalse() - asserts that the actual value is false.
    //assertThat(actual).isNotNull() - asserts that the actual value is not null.
    //assertThat(actual).isNull() - asserts that the actual value is null.
    //assertThat(actual).isInstanceOf(expectedClass) - asserts that the actual value is an instance of the expected class.
    //assertThat(actual).contains(expectedValue) - asserts that the actual value contains the expected value.
    //assertThat(actual).hasSize(expectedSize) - asserts that the actual value has the expected size.
    //assertThat(actual).startsWith(expectedPrefix) - asserts that the actual value starts with the expected prefix.
    //assertThat(actual).endsWith(expectedSuffix) - asserts that the actual value ends with the expected suffix.
    //assertThat(actual).isBetween(start, end) - asserts that the actual value is between the start and end values.
    //assertThat(actual).isGreaterThan(expectedValue) - asserts that the actual value is greater than the expected value.
    //assertThat(actual).isLessThan(expectedValue) - asserts that the actual value is less than the expected value.
    //assertThat(actual).isCloseTo(expectedValue, offset) - asserts that the actual value is close to the expected value within a specified offset.
    //assertThat(actual).isNotEmpty() - asserts that the actual value is not empty.
    //assertThat(actual).isEmpty() - asserts that the actual value is empty.
    //assertThat(actual).containsExactly(expectedValues) - asserts that the actual value contains exactly the expected values in the same order.
    //assertThat(actual).containsOnly(expectedValues) - asserts that the actual value contains only the expected values in any order.
    //assertThat(actual).containsExactlyInAnyOrder(expectedValues) - asserts that the actual value contains exactly the expected values in any order.
    //assertThat(actual).containsOnlyOnce(expectedValue) - asserts that the actual value contains the expected value only once.

    //array assertions
    //AssertJ provides specific assertion methods for arrays, such as assertArrayEquals, assertArrayContains, and assertArrayHasSize.
    //examples of array assertions in AssertJ:
    //assertThat(actualArray).containsExactly(expectedArray) - asserts that the actual array contains exactly the same elements as the expected array in the same order.
    //assertThat(actualArray).containsOnly(expectedArray) - asserts that the actual array contains only the elements of the expected array in any order.
    //assertThat(actualArray).contains(expectedElement) - asserts that the actual array contains the expected element.
    //assertThat(actualArray).hasSize(expectedSize) - asserts that the actual array has the expected size.
    //assertThat(actualArray).isEmpty() - asserts that the actual array is empty.


    //@TestInstance Annotation in JUnit 5
    //In JUnit 5, the @TestInstance annotation can be used to configure the lifecycle of test instances.
    // By default, JUnit creates a new instance of the test class for each test method.
    // However, with the @TestInstance annotation, you can configure JUnit to reuse the same instance of the test class for all test methods in the class.
    // This can be useful when you want to share state between test methods or reduce the overhead of creating new instances for each test method.
    // The @TestInstance annotation can be applied at the class level to specify the test instance lifecycle mode.
    // The possible values for the @TestInstance annotation are:
    // TestInstance.Lifecycle.PER_CLASS - Reuses the same instance of the test class for all test methods in the class.
    // TestInstance.Lifecycle.PER_METHOD - Creates a new instance of the test class for each test method (default behavior).
    // Here's an example of using the @TestInstance annotation with the PER_CLASS mode:

    /*
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    public class MyTestClass {
        private int value;

        @BeforeAll
        void setUp() {
            value = 42;
        }

        @Test
        void testValue() {
            assertThat(value).isEqualTo(42);
        }

        @Test
        void testIncrement() {
            value++;
            assertThat(value).isEqualTo(43);
        }

    }
     */


    // @beforeAll and @afterAll annotations
    //In JUnit 5, the @BeforeAll and @AfterAll annotations can be used to define methods that should be executed before and after all test methods in a test class.
    //beforeclass and afterclass in junit4


    //order of execution of test methods
    //In JUnit 5, the order of execution of test methods is not guaranteed by default.
    // However, you can specify the order of test methods using the @TestMethodOrder annotation with one of the predefined order modes.
    // The possible order modes are:
    // MethodOrderer.Default - Default order, which is not guaranteed.
    // MethodOrderer.Alphanumeric - Orders test methods alphabetically by method name.
    // MethodOrderer.Random - Orders test methods randomly.
    // MethodOrderer.OrderAnnotation - Orders test methods based on the @Order annotation.
    // To specify the order mode, you can use the @TestMethodOrder annotation at the class level:
    //@order annotation in junit4



}
