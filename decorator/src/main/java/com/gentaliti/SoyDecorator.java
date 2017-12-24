package com.gentaliti;

/*
 * @author Gent Aliti <aliti.genti@gmail.com>
 */
public class SoyDecorator extends AddonDecorator{
    private Beverage beverage;

    public SoyDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return this.beverage.getCost() + 0.16;
    }

    @Override
    public String getDecription() {
        return beverage.getDecription() + " + Soy ";
    }
}
