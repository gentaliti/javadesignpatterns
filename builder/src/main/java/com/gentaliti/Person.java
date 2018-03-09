package com.gentaliti;

/*
 * @author Gent Aliti <aliti.genti@gmail.com>
 */
public class Person {
    private String lastName;
    private String firstName;
    private String middleName;
    private int salary;
    private String gender;
    private String streetAddress;
    private String city;
    private String state;

    private Person() {
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
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

    public static final class PersonBuilder {
        private String lastName;
        private String firstName;
        private String middleName;
        private int salary;
        private String gender;
        private String streetAddress;
        private String city;
        private String state;

        private PersonBuilder() {
        }

        public PersonBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder withMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder withSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public PersonBuilder withGender(String gender) {
            this.gender = gender;
            return this;
        }

        public PersonBuilder withStreetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }

        public PersonBuilder withCity(String city) {
            this.city = city;
            return this;
        }

        public PersonBuilder withState(String state) {
            this.state = state;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.salary = this.salary;
            person.city = this.city;
            person.firstName = this.firstName;
            person.lastName = this.lastName;
            person.gender = this.gender;
            person.streetAddress = this.streetAddress;
            person.state = this.state;
            person.middleName = this.middleName;
            return person;
        }
    }
}
