package com.rawan;

public class StringValidation {
    
    @ValidateInput
    public void validateStringHasLetters(String str, int x){
        try {
            ValidationProcessor.validateAndExecute(this, "validateStringHasLetters", str, x);
            System.out.println("It is only letters");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
