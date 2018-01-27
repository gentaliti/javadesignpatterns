package com.gentaliti;

import org.apache.log4j.Logger;

/**
 * @author Gent Aliti <aliti.genti@gmail.com>
 * */
public class Comet implements GameObstacle {

    private static Logger logger = Logger.getLogger(Comet.class);

    @Override
    public void doSomething() {
        logger.info("I'm a Comet!");
    }
}
