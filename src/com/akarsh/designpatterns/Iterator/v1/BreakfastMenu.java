package com.akarsh.designpatterns.Iterator.v1;

import com.akarsh.designpatterns.Iterator.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class BreakfastMenu {

    private List<MenuItem> itemList;

    public BreakfastMenu() {
        itemList = new ArrayList<>();
        addItem(createMenuItem("name1", "description1", 1.99f, true));
        addItem(createMenuItem("name2", "description2", 2.99f, false));
        addItem(createMenuItem("name3", "description3", 3.99f, false));
    }

    public void addItem(MenuItem item) {
        itemList.add(item);
    }

    private MenuItem createMenuItem(String name, String description, Float amount, boolean vegan){
        return new MenuItem(name, description, amount, vegan);
    }

    public List<MenuItem> getItemList() {
        return itemList;
    }

}
