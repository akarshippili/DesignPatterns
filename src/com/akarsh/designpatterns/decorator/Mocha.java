package com.akarsh.designpatterns.decorator;

public class Mocha extends CondimentDecorator{

    Mocha(Beverage beverage){
        this.setBeverage(beverage);
    }

    @Override
    public double cost() {
        return 10 + this.getBeverage().cost();
    }

    @Override
    public String getDescription() {
        return this.getBeverage().getDescription() + "\n" + "Mocha" ;
    }
}
