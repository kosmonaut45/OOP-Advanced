package com.enorkus.academy.entity;


import java.math.BigDecimal;

public class Customer {

    private String id;

    //Mandatory
    private String firstName;
    private String lastName;
    private String personalNumber;

    //Optional
    private String middleName;
    private int age;
    private String countryCode;
    private String city;
    private BigDecimal monthlyIncome;
    private String employer;
    private String gender;
    private String maritalStatus;

    private Customer() {
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getAge() {
        return age;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCity() {
        return city;
    }

    public BigDecimal getMonthlyIncome() {
        return monthlyIncome;
    }

    public String getEmployer() {
        return employer;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static class CustomerBuilder {

        private String firstName;
        private String lastName;
        private String personalNumber;
        private String middleName;
        private int age;
        private String countryCode;
        private String city;
        private BigDecimal monthlyIncome;
        private String employer;
        private String gender;
        private String maritalStatus;

        public CustomerBuilder(String firstName, String lastName, String personalNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.personalNumber = personalNumber;
        }

        public CustomerBuilder withMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public CustomerBuilder atAge(int age) {
            this.age = age;
            return this;
        }

        public CustomerBuilder withCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        public CustomerBuilder inCity(String city) {
            this.city = city;
            return this;
        }

        public CustomerBuilder withMonthlyIncome(BigDecimal monthlyIncome) {
            this.monthlyIncome = monthlyIncome;
            return this;
        }

        public CustomerBuilder withEmployer(String employer) {
            this.employer = employer;
            return this;
        }

        public CustomerBuilder withGender(String gender) {
            this.gender = gender;
            return this;
        }

        public CustomerBuilder withMaritalStatus(String maritalStatus) {
            this.maritalStatus = maritalStatus;
            return this;
        }

        public Customer build() {
            Customer newCustomer = new Customer();
            newCustomer.firstName = this.firstName;
            newCustomer.lastName = this.lastName;
            newCustomer.personalNumber = this.personalNumber;
            newCustomer.middleName = this.middleName;
            newCustomer.age = this.age;
            newCustomer.countryCode = this.countryCode;
            newCustomer.city = this.city;
            newCustomer.monthlyIncome = this.monthlyIncome;
            newCustomer.employer = this.employer;
            newCustomer.gender = this.gender;
            newCustomer.maritalStatus = this.maritalStatus;
            return newCustomer;
        }
    }
}