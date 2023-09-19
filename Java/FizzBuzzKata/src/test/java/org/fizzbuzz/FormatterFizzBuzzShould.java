package org.fizzbuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FormatterFizzBuzzShould {

    @ParameterizedTest
    @CsvSource({"1,1", "2,2", "4,4"})
    void Return_The_Number_Given_NonMatchingNumber(int number, String expectedResult) {
        var formatter = new NumberFormatter();

        var result = formatter.FizzBuzz(number);

        assertEquals(expectedResult, result);
    }
}
