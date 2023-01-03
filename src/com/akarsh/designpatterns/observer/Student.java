package com.akarsh.designpatterns.observer;

public class Student implements Observer{

    String name;
    School school;

    public Student(String name, School school) {
        this.name = name;
        this.school = school;
        school.addObserver(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observer newObserver) {
        System.out.println("we have a new member " + ((Student) newObserver).getName());
    }
}
