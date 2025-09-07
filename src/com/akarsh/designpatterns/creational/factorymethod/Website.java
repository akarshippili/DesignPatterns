package com.akarsh.designpatterns.creational.factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract  class Website {
    protected List<Page> pages = new ArrayList<>();

    public Website(){
        createWebsite();
    }

    public abstract void  createWebsite();

}
