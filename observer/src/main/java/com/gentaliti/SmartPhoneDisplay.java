package com.gentaliti;

import org.apache.log4j.Logger;

/*
 * @author Gent Aliti <aliti.genti@gmail.com>
 */
public class SmartPhoneDisplay implements WeatherObserver, Display {

    private static Logger logger = Logger.getLogger(SmartPhoneDisplay.class);
    private String currentWeather;

    @Override
    public void display() {
        logger.info("Current weather is: " + currentWeather);
    }

    @Override
    public void update(WeatherObservable o) {
        this.currentWeather = o.getWeather();
        display();
    }
}
