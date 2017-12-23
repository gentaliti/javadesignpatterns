package com.gentaliti;

/*
 * @author Gent Aliti <aliti.genti@gmail.com>
 */
public class AppInit {

    public static void main(String[] args) {
        WeatherObservable observable = new WeatherStation("Sunny");
        WeatherObserver smartPhone = new SmartPhoneDisplay();
        WeatherObserver lcdScreen = new LCDDisplay();

        /**
         * Register (subscribe) the observers to observable
         **/
        observable.add(smartPhone);
        observable.add(lcdScreen);

        /**
         * Change weather
         * */
        observable.setWeather("Rainy");
        observable.setWeather("Sunny");
        observable.setWeather("Snowy");
    }

}
