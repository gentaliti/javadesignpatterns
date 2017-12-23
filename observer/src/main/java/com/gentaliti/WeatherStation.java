package com.gentaliti;

import java.util.ArrayList;
import java.util.List;

/*
 * @author Gent Aliti <aliti.genti@gmail.com>
 */
public class WeatherStation implements WeatherObservable {

    private List<WeatherObserver> weatherObservers;
    private String weather;

    public WeatherStation(String weather) {
        this.weather = weather;
        weatherObservers = new ArrayList<>();
    }

    @Override
    public void add(WeatherObserver o) {
        this.weatherObservers.add(o);
    }

    @Override
    public void remove(WeatherObserver o) {
        this.weatherObservers.remove(o);
    }

    @Override
    public void notifyObservers() {
        weatherObservers.forEach(o -> o.update(this));
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
        notifyObservers();
    }

    public List<WeatherObserver> getWeatherObservers() {
        return weatherObservers;
    }

    public void setWeatherObservers(List<WeatherObserver> weatherObservers) {
        this.weatherObservers = weatherObservers;
    }
}
