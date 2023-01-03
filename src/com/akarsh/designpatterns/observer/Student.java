package com.akarsh.designpatterns.observer;

public class Student implements Observer{

    String name;
    School school;

    public Student(String name, School school) {
        this.name = name;
        this.school = school;
    }

    @Override
    public void update() {}

}
