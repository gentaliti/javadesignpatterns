package com.gentaliti;

import org.junit.Test;

import static org.junit.Assert.*;

/*
 * @author Gent Aliti <aliti.genti@gmail.com>
 */
public class SingletonTest {

    @Test
    public void testGetInstance() {
        Singleton singleton = Singleton.getInstance();
        assertNotNull(singleton);
    }

    @Test
    public void testIsTheSameInstance() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        assertEquals(singleton1, singleton2);
    }
}
