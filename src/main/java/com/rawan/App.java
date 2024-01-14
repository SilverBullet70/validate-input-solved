package com.rawan;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        // StringValidation sValidation = new StringValidation();
        // sValidation.validateStringHasLetters("hello");

        //  sValidation.validateStringHasLetters("123");

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 3)); // Should add successfully
        System.out.println(calculator.subtract(10, 2)); // Should subtract successfully
        calculator.add(-2, 4); // Should throw a ValidationException due to negative number
        
    }
}
