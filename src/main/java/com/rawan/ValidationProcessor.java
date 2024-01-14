package com.rawan;

import java.lang.reflect.Method;
import java.util.Arrays;

public class ValidationProcessor {
    public static void validateAndExecute(Object obj, String methodName, Object... args) throws Exception {
        Method method = obj.getClass().getMethod(methodName, getParameterTypes(args));
        if (method.isAnnotationPresent(ValidateInput.class)) {
            ValidateInput annotation = method.getAnnotation(ValidateInput.class);
            validateArguments(args); // Add your specific validation logic here (e.g., non-negative numbers)
        }
        // method.setAccessible(true);
        // method.invoke(obj, args); // no need to invoke here because the caller will invoke the logic (add mehtod)
    }

    static Class<?>[] getParameterTypes(Object... args) throws ClassNotFoundException  {
        Class<?>[] types = new Class<?>[args.length];
        for (int i = 0; i < args.length; i++) {
            types[i] = args[i].getClass();          
        }
        return types;
    }

    

    static void validateArguments(Object... args) throws ValidationException {
        //test that the numbers non-negative
        if (Arrays.stream(args).filter(arg -> arg instanceof Integer).anyMatch(arg -> (Integer)arg < 0)) {
            throw new ValidationException("Negative number");
            
        }

        //test that the string has only letters
    }
}