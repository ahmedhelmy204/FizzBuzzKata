package org.fizzbuzz;

class NumberFormatter {
    String FizzBuzz(int number){
        String result = "";

        if(NumberExtensions.IsDivisibleBy(number,3))
        {
            result = "Fizz";
        }

        if(result == "") {
            result = String.valueOf(number);
        }

        return result;
    }
}

