package com.codurance.fizzBuzzKata;

public class FizzBuzzGenerator {
    public static String generate(int inputNumber) {

        if (inputNumber % 3 == 0) {
            return "Fizz";
        }

        if (inputNumber % 5 == 0) {
            return "Buzz";
        }

        return "1";
    }
}
