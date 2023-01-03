package com.akarsh.designpatterns.observer;

public class HighSchool extends School{

    public HighSchool(String name) {
        super(name);
    }

    @Override
    void addObserver(Observer observer) {
        notifyObservers(observer);
        this.observers.add(observer);
    }

    @Override
    void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    void notifyObservers(Observer newObserver) {
        for (Observer observer : observers) {
            observer.update(newObserver);
        }
    }
}
