package com.akarsh.designpatterns.decorator;

import static java.lang.System.*;

public class Test {
    public static void main(String[] args) {
        Espresso espresso = new Espresso();
        System.out.println(new Mocha(new Whip(espresso)).cost());
        System.out.println("____________________________________");


        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);

        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
}
