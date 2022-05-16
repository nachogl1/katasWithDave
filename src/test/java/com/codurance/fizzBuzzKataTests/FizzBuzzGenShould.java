package com.codurance.fizzBuzzKataTests;

import com.codurance.fizzBuzzKata.FizzBuzzGenerator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzGenShould {

    private FizzBuzzGenerator fizzBuzzGen;

    @BeforeEach
    void setUp() {
        fizzBuzzGen = new FizzBuzzGenerator();
    }

    @Test
    void returnOne() {
        String result = fizzBuzzGen.generate(1);
        assertThat(result).isEqualTo("1");
    }

    @Test
    void returnFizzWhenThreeIsPassed() {
        String result = fizzBuzzGen.generate(3);
        assertThat(result).isEqualTo("Fizz");
    }
}
