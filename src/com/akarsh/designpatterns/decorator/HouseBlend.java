package com.akarsh.designpatterns.decorator;

public class HouseBlend extends Beverage{

    HouseBlend(){
        this.setDescription("HouseBlend");
    }

    @Override
    public double cost() {
        return 79.99;
    }

}
