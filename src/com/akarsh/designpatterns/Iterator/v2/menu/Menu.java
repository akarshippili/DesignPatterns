package com.akarsh.designpatterns.Iterator.v2.menu;

import com.akarsh.designpatterns.Iterator.MenuItem;
import com.akarsh.designpatterns.Iterator.v2.iterator.Iterator;

public abstract class Menu {

    protected MenuItem createMenuItem(String name, String description, Float amount, boolean vegan){
        return new MenuItem(name, description, amount, vegan);
    }

    public abstract Iterator<MenuItem> createIterator();
}
