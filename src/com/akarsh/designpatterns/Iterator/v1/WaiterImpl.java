package com.akarsh.designpatterns.Iterator.v1;

import com.akarsh.designpatterns.Iterator.MenuItem;
import com.akarsh.designpatterns.Iterator.Waiter;

import java.util.List;

public class WaiterImpl implements Waiter {

    private BreakfastMenu breakfastMenu;
    private DinnerMenu dinnerMenu;
    private List<MenuItem> breakfastItems;
    private MenuItem[]  dinnerItems;


    public WaiterImpl() {
        breakfastMenu = new BreakfastMenu();
        breakfastItems = breakfastMenu.getItemList();
        dinnerMenu = new DinnerMenu();
        dinnerItems = dinnerMenu.getItems();
    }

    @Override
    public void printMenu() {
        for(int i = 0; i < breakfastItems.size(); i++) {
            System.out.println(breakfastItems.get(i));
        }

        for(int i = 0; i < dinnerMenu.getNumberOfItemsInMenu(); i++) {
            System.out.println(dinnerItems[i]);
        }
    }

    @Override
    public void printBreakfastMenu() {
        for(int i = 0; i < breakfastItems.size(); i++) {
            System.out.println(breakfastItems.get(i));
        }
    }

    @Override
    public void printDinnerMenu() {
        for(int i = 0; i < dinnerMenu.getNumberOfItemsInMenu(); i++) {
            System.out.println(dinnerItems[i]);
        }
    }

    @Override
    public void printVeganMenu() {
        for(int i = 0; i < breakfastItems.size(); i++) {
            MenuItem item = breakfastItems.get(i);
            if(item.isVegan()) System.out.println(item);
        }

        for(int i = 0; i < dinnerMenu.getNumberOfItemsInMenu(); i++) {
            MenuItem item = dinnerItems[i];
            if(item.isVegan()) System.out.println(item);
        }
    }
}
