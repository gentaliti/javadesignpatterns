package com.gentaliti;

/*
 * @author Gent Aliti <aliti.genti@gmail.com>
 */
public interface WeatherObservable {
    public void add(WeatherObserver o);
    public void remove(WeatherObserver o);
    public void notifyObservers();
    public String getWeather();
    public void setWeather(String weather);
}
