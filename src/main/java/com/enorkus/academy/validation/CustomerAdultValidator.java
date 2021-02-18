package com.enorkus.academy.validation;

import com.enorkus.academy.exception.ValidationException;

public class CustomerAdultValidator extends Validator<Integer> {

    public CustomerAdultValidator() {
    }

    @Override
    public void validate(Integer attribute, String message) {
        if (attribute < 18) {
            throw new ValidationException(message);
        }
    }
}
