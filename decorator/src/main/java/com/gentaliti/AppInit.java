package com.gentaliti;

import org.apache.log4j.Logger;

public class AppInit {
    private static Logger logger = Logger.getLogger(AppInit.class);

    public static void main(String[] args) {
        // Building espresso
        Beverage espresso = new Espresso();
        logger.info( espresso.getDecription() + espresso.getCost());

        // Adding Caramel
        AddonDecorator esspresoWithCaramel = new CaramelDecorator(espresso);
        logger.info(esspresoWithCaramel.getDecription() + esspresoWithCaramel.getCost());

        // Adding Soy to the "Caramel Espresso"
        AddonDecorator esspresoWithCaramelAndSoy = new SoyDecorator(esspresoWithCaramel);
        logger.info(esspresoWithCaramelAndSoy.getDecription() + esspresoWithCaramelAndSoy.getCost());
    }
}
