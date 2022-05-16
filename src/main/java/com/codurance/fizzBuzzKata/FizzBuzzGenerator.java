package com.codurance.fizzBuzzKata;

public class FizzBuzzGenerator {
    public static String generate(int inputNumber) {

        if (divisibleByThree(inputNumber) && divisibleByFive(inputNumber)) {
            return "FizzBuzz";
        }

        if (divisibleByThree(inputNumber)) {
            return "Fizz";
        }

        if (divisibleByFive(inputNumber)) {
            return "Buzz";
        }

        return "1";
    }

    private static boolean divisibleByThree(int inputNumber) {
        return inputNumber % 3 == 0;
    }

    private static boolean divisibleByFive(int inputNumber) {
        return inputNumber % 5 == 0;
    }
}
