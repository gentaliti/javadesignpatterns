package com.gentaliti;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

/*
 * @author Gent Aliti <aliti.genti@gmail.com>
 */
public class PersonTest {

    @Test
    public void test() {
        Person person = new Person.Builder().setFirstName("Test").setLastName("Test").setCity("Prishtina").build();
        Assert.assertNotNull(person);
        Assert.assertEquals("Test", person.getFirstName());
        Assert.assertEquals("Test", person.getLastName());
        Assert.assertEquals("Prishtina", person.getCity());
        Assert.assertNull(person.getMiddleName());
        Assert.assertNull(person.getState());
        Assert.assertNull(person.getGender());
        Assert.assertNull(person.getStreetAddress());
    }

    @Test
    public void testMethods() {
        Person person = new Person.Builder().setGender("Test").setSalary(12222).setStreetAddress("Test").build();
        Assert.assertNotNull(person);
        Assert.assertEquals("Test", person.getGender());
        Assert.assertEquals(12222, person.getSalary());
        Assert.assertEquals("Test", person.getStreetAddress());
        Assert.assertNull(person.getFirstName());
        Assert.assertNull(person.getLastName());
        Assert.assertNull(person.getCity());
    }
}
