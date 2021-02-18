package com.enorkus.academy.service;

import com.enorkus.academy.entity.Customer;
import com.enorkus.academy.repository.MemoryCustomerRepository;
import com.enorkus.academy.repository.CustomerRepository;
import com.enorkus.academy.validation.CustomerValidator;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class CustomerService {

    private CustomerRepository memoryCustomerRepository;
    private CustomerValidator customerValidator;

    public CustomerService() {
        memoryCustomerRepository = new MemoryCustomerRepository();
        customerValidator = new CustomerValidator();
    }


    public List<Customer> fetchCustomers() {
        return memoryCustomerRepository.findAll();
    }


    public void insertCustomer(Customer customer) {
        customerValidator.validateCustomer(customer);
        Customer anotherCustomer = new Customer.CustomerBuilder(
                capitalize(customer.getFirstName()),
                capitalize(customer.getLastName()),
                formatPersonalNumber(customer.getPersonalNumber()))
                .withMiddleName(customer.getMiddleName())
                .atAge(customer.getAge())
                .withCountryCode(customer.getCountryCode())
                .inCity(customer.getCity())
                .withMonthlyIncome(customer.getMonthlyIncome())
                .withEmployer(customer.getEmployer())
                .withGender(customer.getGender())
                .withMaritalStatus(customer.getMaritalStatus())
                .build();
        memoryCustomerRepository.insert(anotherCustomer);
    }


    public void deleteCustomer(String customerId) {
        memoryCustomerRepository.deleteById(customerId);
    }

    public String capitalize(String string) {
        if (string.isEmpty()) {
            return string;
        } else {
            return string.substring(0, 1).toUpperCase() + string.substring(1);
        }

    }

    public String formatPersonalNumber(String personalNumber) {
        if (StringUtils.isNotBlank(personalNumber) && personalNumber.length() >= 4) {
            return personalNumber.substring(0, 4) + "-" + personalNumber.substring(4);
        }
        return personalNumber;
    }
}
