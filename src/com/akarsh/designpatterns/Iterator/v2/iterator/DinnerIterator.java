package com.akarsh.designpatterns.Iterator.v2.iterator;

import com.akarsh.designpatterns.Iterator.MenuItem;

import java.util.ArrayList;

public class DinnerIterator implements Iterator<MenuItem>{

    private MenuItem[] itemList;
    private int index = 0;
    private int numberOfItemsInMenu = 0;

    public DinnerIterator(MenuItem[] itemList, int numberOfItemsInMenu) {
        this.itemList = itemList;
        this.numberOfItemsInMenu = numberOfItemsInMenu;
    }


    @Override
    public boolean hasNext() {
        return this.index < this.numberOfItemsInMenu;
    }

    @Override
    public MenuItem next() {
        return this.itemList[this.index++];
    }
}
