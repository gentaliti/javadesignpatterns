package com.gentaliti.strategy;

import org.apache.log4j.Logger;

/*
 * @author Gent Aliti <aliti.genti@gmail.com>
 */
public class AppInit {
    private static Logger logger = Logger.getLogger(AppInit.class);
    public static void main(String[] args) {
        Duck cityDuck = new Duck(new SimpleFly());
        Duck noFlyDuck = new Duck(new NoFly());
        cityDuck.fly();
        noFlyDuck.fly();
        // Java 8 implementation
        logger.info("= Java 8 Implementation =");
        cityDuck = new Duck(() -> logger.info("Flying in simple way."));
        noFlyDuck = new Duck(() -> logger.info("I can't fly."));
        cityDuck.fly();
        noFlyDuck.fly();
    }
}
