package com.akarsh.designpatterns.Iterator;

import com.akarsh.designpatterns.Iterator.v1.WaiterImpl;

public class IteratorMain {
    public static void main(String[] args) {

        System.out.println("-------------------------V1---------------------------");

        Waiter waiter = new WaiterImpl();
        waiter.printBreakfastMenu();
        waiter.printDinnerMenu();
        waiter.printVeganMenu();


        System.out.println("-------------------------V2---------------------------");

        Waiter waiter2 = new com.akarsh.designpatterns.Iterator.v2.WaiterImpl();
        waiter2.printBreakfastMenu();
        waiter2.printDinnerMenu();
        waiter2.printVeganMenu();
    }
}
