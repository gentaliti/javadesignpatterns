package com.gentaliti;

import org.apache.log4j.Logger;

/*
 * @author Gent Aliti <aliti.genti@gmail.com>
 */
public class AppInit {
    private static Logger logger = Logger.getLogger(AppInit.class);

    public static void main(String[] args) {
        Singleton firstInstance = Singleton.getInstance();
        Singleton secondInstance = Singleton.getInstance();

        if (firstInstance == secondInstance) {
            logger.info("This is the same instance");
        }
    }
}
