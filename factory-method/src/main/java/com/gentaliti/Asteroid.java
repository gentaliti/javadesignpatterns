package com.gentaliti;

import org.apache.log4j.Logger;

/**
 * @author Gent Aliti <aliti.genti@gmail.com>
 * */
public class Asteroid implements GameObstacle{

    private static Logger logger = Logger.getLogger(Asteroid.class);

    @Override
    public void doSomething() {
        logger.info("I'm an Asteroid!");
    }
}
