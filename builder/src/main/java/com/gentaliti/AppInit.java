package com.gentaliti;

import org.apache.log4j.Logger;

/**
 * For demonstration purposes I took a very simple example of implementing Builder pattern.
 * @author Gent Aliti <aliti.genti@gmail.com>
 * */
public class AppInit {

    private static Logger logger = Logger.getLogger(AppInit.class);

    public static void main(String[] args) {
        Person person = new Person.Builder().setFirstName("John").setLastName("Doe").build();
        logger.info(person.toString());
    }
}
