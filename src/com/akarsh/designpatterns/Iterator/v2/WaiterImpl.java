package com.akarsh.designpatterns.Iterator.v2;

import com.akarsh.designpatterns.Iterator.MenuItem;
import com.akarsh.designpatterns.Iterator.Waiter;
import com.akarsh.designpatterns.Iterator.v2.iterator.Iterator;
import com.akarsh.designpatterns.Iterator.v2.menu.BreakfastMenu;
import com.akarsh.designpatterns.Iterator.v2.menu.DinnerMenu;

public class WaiterImpl implements Waiter {

    private com.akarsh.designpatterns.Iterator.v2.menu.BreakfastMenu breakfastMenu;
    private com.akarsh.designpatterns.Iterator.v2.menu.DinnerMenu dinnerMenu;


    public WaiterImpl() {
        breakfastMenu = new BreakfastMenu();
        dinnerMenu = new DinnerMenu();
    }

    @Override
    public void printMenu() {
        printMenu(breakfastMenu.createIterator());
        printMenu(dinnerMenu.createIterator());
    }

    @Override
    public void printBreakfastMenu() {
        printMenu(breakfastMenu.createIterator());
    }

    @Override
    public void printDinnerMenu() {
        printMenu(dinnerMenu.createIterator());
    }

    @Override
    public void printVeganMenu() {
        printVeganMenu(dinnerMenu.createIterator());
        printVeganMenu(breakfastMenu.createIterator());
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while(iterator.hasNext()){
            MenuItem item = iterator.next();
            System.out.println(item);
        }
    }

    private void printVeganMenu(Iterator<MenuItem> iterator) {
        while(iterator.hasNext()){
            MenuItem item = iterator.next();
            if(item.isVegan()) System.out.println(item);
        }
    }

}
