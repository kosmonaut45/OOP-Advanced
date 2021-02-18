package com.enorkus.academy.validation;

import com.enorkus.academy.entity.Customer;
import com.enorkus.academy.exception.ValidationException;
import org.apache.commons.lang3.StringUtils;


public class CustomerValidator {

    CountryCodeValidator countryCodeValidator;
    CustomerAdultValidator customerAdultValidator;
    MandatoryValueValidator mandatoryValueValidator;

    public CustomerValidator() {
        countryCodeValidator = new CountryCodeValidator();
        customerAdultValidator = new CustomerAdultValidator();
        mandatoryValueValidator = new MandatoryValueValidator();
    }

    public void validateCustomer(Customer customer){
        mandatoryValueValidator.validate(customer.getFirstName(), "First name is a mandatory field.");
        mandatoryValueValidator.validate(customer.getLastName(), "Last name is a mandatory field.");
        mandatoryValueValidator.validate(customer.getPersonalNumber(), "Personal number is a mandatory field.");
        customerAdultValidator.validate(customer.getAge(), "This customer is underage/age is not inserted.");
        countryCodeValidator.validate(customer.getCountryCode(), "Country code is incorrect.");
    }

}
