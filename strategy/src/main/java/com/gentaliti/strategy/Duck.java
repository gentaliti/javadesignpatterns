package com.gentaliti.strategy;

/*
 * @author Gent Aliti <aliti.genti@gmail.com>
 */
public class Duck {

    private FlyStrategy flyStrategy;

    public Duck(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    public void fly(){
        flyStrategy.fly();
    }
}
