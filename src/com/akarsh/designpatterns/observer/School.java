package com.akarsh.designpatterns.observer;

import java.util.List;

public abstract class School {

    String name;
    List<Observer> observers;

    public School(String name){
        this.name = name;
    }

    abstract void addObserver(Observer observer);
    abstract void removeObserver(Observer observer);
    abstract void notifyObservers();
    
}
