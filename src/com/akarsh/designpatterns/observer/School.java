package com.akarsh.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class School {

    String name;
    List<Student> students;

    protected School(String name){
        this.name = name;
        this.students = new ArrayList<>();
    }

    abstract void addStudent(Student student);
    abstract void removeStudent(Student student);
    abstract void notifyStudents(Student newStudent);
}
