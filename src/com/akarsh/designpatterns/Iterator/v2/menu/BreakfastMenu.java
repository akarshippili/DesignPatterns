package com.akarsh.designpatterns.Iterator.v2.menu;

import com.akarsh.designpatterns.Iterator.MenuItem;
import com.akarsh.designpatterns.Iterator.v2.iterator.BreakfastIterator;
import com.akarsh.designpatterns.Iterator.v2.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class BreakfastMenu extends Menu {

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

    public List<MenuItem> getItemList() {
        return itemList;
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new BreakfastIterator(this.itemList);
    }
}
