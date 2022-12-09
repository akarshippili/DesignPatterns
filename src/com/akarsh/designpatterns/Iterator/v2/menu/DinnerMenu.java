package com.akarsh.designpatterns.Iterator.v2.menu;

import com.akarsh.designpatterns.Iterator.MenuItem;
import com.akarsh.designpatterns.Iterator.v2.iterator.DinnerIterator;
import com.akarsh.designpatterns.Iterator.v2.iterator.Iterator;

public class DinnerMenu extends Menu {

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

    public int getNumberOfItemsInMenu() {
        return numberOfItemsInMenu;
    }

    public MenuItem[] getItems() {
        return items;
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinnerIterator(this.items, this.numberOfItemsInMenu);
    }
}
