package com.gentaliti;

/*
 * @author Gent Aliti <aliti.genti@gmail.com>
 */
public class Espresso implements Beverage {

    @Override
    public String getDecription() {
        return "Esspreso";
    }

    @Override
    public double getCost() {
        return 2;
    }
}
