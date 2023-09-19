package org.fizzbuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FormatterFizzBuzzShould {

    @ParameterizedTest
    @CsvSource({"1,1", "2,2", "4,4"})
    void Return_The_Number_Given_NonMatchingNumber(int number, String expectedResult) {
        var formatter = new NumberFormatter();

        var result = formatter.FizzBuzz(number);

        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6})
    public void Return_Fizz_Given_NumberDivisibleByThree(int number)
    {
        var formatter = new NumberFormatter();

        var result = formatter.FizzBuzz(number);

        assertEquals("Fizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10})
    public void Return_Buzz_Given_NumberDivisibleByFive(int number)
    {
        var formatter = new NumberFormatter();

        var result = formatter.FizzBuzz(number);

        assertEquals("Buzz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {15})
    public void Return_FizzBuzz_Given_NumberDivisibleByThreeAndFive(int number)
    {
        var formatter = new NumberFormatter();

        var result = formatter.FizzBuzz(number);

        assertEquals("FizzBuzz", result);
    }
}