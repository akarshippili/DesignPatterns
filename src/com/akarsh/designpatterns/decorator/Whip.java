package com.akarsh.designpatterns.decorator;

public class Whip extends CondimentDecorator{

    Whip(Beverage beverage){
        this.setBeverage(beverage);
    }

    @Override
    public double cost() {
        return 15 + this.getBeverage().cost();
    }

    @Override
    public String getDescription() {
        return this.getBeverage().getDescription() + "\n" + "Whip" ;
    }

    public static class Main {
        public static void main(String[] args) {
            System.out.println("Hello world!");
        }
    }
}
