package com.akarsh.designpatterns.observer;

public class HighSchoolStudent implements Student {

    String name;
    School school;

    public HighSchoolStudent(String name, School school) {
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
        System.out.println(this.school.name + " We have a new member " + ((HighSchoolStudent) newStudent).getName());
    }
}
