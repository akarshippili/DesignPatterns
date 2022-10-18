package com.akarsh.designpatterns.decorator;

public class Espresso extends Beverage{

    Espresso(){
        this.setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 99.99;
    }

}
