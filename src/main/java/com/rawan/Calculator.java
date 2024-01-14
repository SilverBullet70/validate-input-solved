package com.rawan;


public class Calculator {

    @ValidateInput
    public int add(Integer a, Integer b) {
        try {
            ValidationProcessor.validateAndExecute(this, "add", a, b);
            return a + b;
        } catch (ValidationException e) {
            System.err.println(e.getMessage());
            // Handle the validation error (e.g., log it or display a message)
            return 0; // Replace with appropriate error value
        } catch (Exception e) {
            // Handle other exceptions
            e.printStackTrace();
            return 0;
        }
    }
    
    @ValidateInput
    public int subtract(Integer a, Integer b) {
        try {
            ValidationProcessor.validateAndExecute(this, "subtract", a, b);
            return a - b;
        } catch (ValidationException e) {
            System.err.println(e.getMessage());
            // Handle the validation error (e.g., log it or display a message)
            return 0; // Replace with appropriate error value
        } catch (Exception e) {
            // Handle other exceptions
            e.printStackTrace();
            return 0;
        }
    }
}
