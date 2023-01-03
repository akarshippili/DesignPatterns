package com.akarsh.designpatterns.observer;

public class MiddleSchoolStudent implements Student {

    String name;
    School school;

    public MiddleSchoolStudent(String name, School school) {
        this.name = name;
        this.school = school;
        school.addStudent(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Student newStudent) {
        System.out.println(this.school.name + " We have a new member " + ((MiddleSchoolStudent) newStudent).getName());
    }
}
