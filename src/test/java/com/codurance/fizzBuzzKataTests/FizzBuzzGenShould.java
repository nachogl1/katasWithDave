package com.codurance.fizzBuzzKataTests;

import com.codurance.fizzBuzzKata.FizzBuzzGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzGenShould {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 16, 101})
    void returnNumberPassedAsArgument(int inputParam) {
        String result = FizzBuzzGenerator.generate(inputParam);
        assertThat(result).isEqualTo(String.valueOf(inputParam));
    }

    @Test
    void returnFizzWhenThreeIsPassed() {
        String result = FizzBuzzGenerator.generate(3);
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void returnBuzzWhenFiveIsPassed() {
        String result = FizzBuzzGenerator.generate(5);
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    void returnFizzBuzzWhenFifteenIsPassed() {
        String result = FizzBuzzGenerator.generate(15);
        assertThat(result).isEqualTo("FizzBuzz");
    }
}
