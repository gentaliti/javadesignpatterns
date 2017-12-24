package com.gentaliti;

/*
 * @author Gent Aliti <aliti.genti@gmail.com>
 */
public class CaramelDecorator extends AddonDecorator {

    private Beverage beverage;

    public CaramelDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return this.beverage.getCost() + 0.3;
    }

    @Override
    public String getDecription() {
        return beverage.getDecription() + " + Caramel ";
    }
}
