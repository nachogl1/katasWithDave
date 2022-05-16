package com.codurance.fizzBuzzKataTests;

import com.codurance.fizzBuzzKata.FizzBuzzGenerator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzGenShould {

    @Test
    void returnOne() {
        String result = FizzBuzzGenerator.generate(1);
        assertThat(result).isEqualTo("1");
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


}
