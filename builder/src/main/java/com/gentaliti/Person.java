package com.gentaliti;

/*
 * @author Gent Aliti <aliti.genti@gmail.com>
 */
public class Person {
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final int salary;
    private final String gender;
    private final String streetAddress;
    private final String city;
    private final String state;

    public Person(Builder builder) {
        this.lastName = builder.lastName;
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.salary = builder.salary;
        this.gender = builder.gender;
        this.streetAddress = builder.streetAddress;
        this.city = builder.city;
        this.state = builder.state;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getSalary() {
        return salary;
    }

    public String getGender() {
        return gender;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public static class Builder {
        private String lastName;
        private String firstName;
        private String middleName;
        private int salary;
        private String gender;
        private String streetAddress;
        private String city;
        private String state;

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder setSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setStreetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setState(String state) {
            this.state = state;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
