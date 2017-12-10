package com.gentaliti.strategy;

import org.apache.log4j.Logger;

/*
 * @author Gent Aliti <aliti.genti@gmail.com>
 */
public class NoFly implements FlyStrategy {

    private static Logger logger = Logger.getLogger(NoFly.class);

    @Override
    public void fly() {
        logger.info("I can't fly.");
    }
}
