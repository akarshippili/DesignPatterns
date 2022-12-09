package com.akarsh.designpatterns.Iterator.v1;

import com.akarsh.designpatterns.Iterator.MenuItem;

public class DinnerMenu {

    private int size = 5;
    private MenuItem[] items;
    private int numberOfItemsInMenu;

    public DinnerMenu() {
        numberOfItemsInMenu = 0;
        items = new MenuItem[size];
        addItem(createMenuItem("name1", "description1", 1.99f, true));
        addItem(createMenuItem("name2", "description2", 2.99f, false));
        addItem(createMenuItem("name3", "description3", 3.99f, false));
    }

    public void addItem(MenuItem item) throws RuntimeException {
        if(numberOfItemsInMenu >= size) throw new RuntimeException("Dinner menu is full");
        items[numberOfItemsInMenu] = item;
        numberOfItemsInMenu++;
    }

    private MenuItem createMenuItem(String name, String description, Float amount, boolean vegan){
        return new MenuItem(name, description, amount, vegan);
    }

    public int getNumberOfItemsInMenu() {
        return numberOfItemsInMenu;
    }

    public MenuItem[] getItems() {
        return items;
    }
}
