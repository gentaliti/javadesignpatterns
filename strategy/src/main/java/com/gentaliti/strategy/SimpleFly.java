package com.gentaliti.strategy;

import org.apache.log4j.Logger;

/*
 * @author Gent Aliti <aliti.genti@gmail.com>
 */
public class SimpleFly implements FlyStrategy {

    private static Logger logger = Logger.getLogger(SimpleFly.class);

    @Override
    public void fly() {
        logger.info("Flying in simple way.");
    }
}
