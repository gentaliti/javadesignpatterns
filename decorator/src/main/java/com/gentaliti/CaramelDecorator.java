package com.gentaliti;

/*
 * @author Gent Aliti <aliti.genti@gmail.com>
 */
public class CaramelDecorator extends AddonDecorator {

    public CaramelDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() {
        return this.beverage.getCost() + 0.3;
    }

    @Override
    public String getDecription() {
        return this.beverage.getDecription() + " + Caramel ";
    }
}
