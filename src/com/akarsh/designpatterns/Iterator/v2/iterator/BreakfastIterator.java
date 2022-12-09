package com.akarsh.designpatterns.Iterator.v2.iterator;

import com.akarsh.designpatterns.Iterator.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class BreakfastIterator  implements Iterator<MenuItem>{

    private List<MenuItem> itemList;
    private int index = 0;

    public BreakfastIterator(List<MenuItem> itemList) {
        this.itemList = itemList;
    }


    @Override
    public boolean hasNext() {
        return this.index < this.itemList.size();
    }

    @Override
    public MenuItem next() {
        return this.itemList.get(this.index++);
    }
}
