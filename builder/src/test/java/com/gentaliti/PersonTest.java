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
        Person person = Person.builder().withFirstName("Test").withLastName("Test").withCity("Prishtina").build();
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
        Person person = Person.builder().withGender("Test").withSalary(12222).withStreetAddress("Test").build();
        Assert.assertNotNull(person);
        Assert.assertEquals("Test", person.getGender());
        Assert.assertEquals(12222, person.getSalary());
        Assert.assertEquals("Test", person.getStreetAddress());
        Assert.assertNull(person.getFirstName());
        Assert.assertNull(person.getLastName());
        Assert.assertNull(person.getCity());
    }
}
