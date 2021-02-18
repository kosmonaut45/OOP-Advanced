package com.enorkus.academy.validation;

import com.enorkus.academy.exception.ValidationException;
import org.apache.commons.lang3.StringUtils;

public class MandatoryValueValidator extends Validator<String> {

    public MandatoryValueValidator() {
    }

    @Override
    public void validate(String attribute, String message) {
        if (StringUtils.isEmpty(attribute.trim())) {
            throw new ValidationException(message);
        }
    }
}
