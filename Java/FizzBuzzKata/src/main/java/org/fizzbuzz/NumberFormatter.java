package org.fizzbuzz;

class NumberFormatter {
    String FizzBuzz(int number){
        String result = "";

        if(NumberExtensions.IsDivisibleBy(number,3))
        {
            result += "Fizz";
        }

        if(NumberExtensions.IsDivisibleBy(number,5))
        {
            result += "Buzz";
        }

        if(result == "") {
            result = String.valueOf(number);
        }

        return result;
    }
}

