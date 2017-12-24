package com.gentaliti;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class WeatherStationTest {

    WeatherStation weatherStation;
    WeatherObserver wo;

    @Before
    public void setup(){
        weatherStation = new WeatherStation("Test");
        wo = mock(SmartPhoneDisplay.class);
    }

    @Test
    public void add() throws Exception {
        weatherStation.add(wo);
        assertEquals(wo, weatherStation.getWeatherObservers().get(0));
    }

    @Test
    public void remove() throws Exception {
        weatherStation.add(wo);
        weatherStation.remove(wo);
        assertEquals(0, weatherStation.getWeatherObservers().size());
    }

    @Test
    public void notifyObservers() throws Exception {
        weatherStation.add(wo);
        weatherStation.notifyObservers();
        verify(wo, times(1)).update(weatherStation);

    }

    @Test
    public void getWeather() throws Exception {
        weatherStation.setWeather("Test");
        assertEquals("Test", weatherStation.getWeather());
    }

    @Test
    public void setWeather() throws Exception {
        weatherStation.setWeather("Test");
        assertEquals("Test", weatherStation.getWeather());
    }

    @Test
    public void getWeatherObservers() {
        List<WeatherObserver> observers = new ArrayList<>();
        observers.add(new SmartPhoneDisplay());
        weatherStation.setWeatherObservers(observers);
        assertEquals(observers, weatherStation.getWeatherObservers());
    }

}