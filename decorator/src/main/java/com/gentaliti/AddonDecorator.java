package com.gentaliti;

/*
 * @author Gent Aliti <aliti.genti@gmail.com>
 */
public abstract class AddonDecorator implements Beverage{

    protected Beverage beverage;

    public AddonDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDecription() {
        return "Addon Decorator";
    }

    @Override
    public double getCost() {
        return 0;
    }
}
