package com.akarsh.designpatterns.creational.factorymethod;

public class Blog extends Website{

    @Override
    public void createWebsite() {
        pages.add(new HomePage());
        pages.add(new PostPage());
        pages.add(new AboutPage());
    }
}
