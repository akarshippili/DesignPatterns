package com.akarsh.designpatterns.observer;

public class HighSchool extends School{

    public HighSchool(String name) {
        super(name);
    }

    @Override
    void addStudent(Student student) {
        notifyStudents(student);
        this.students.add(student);
    }

    @Override
    void removeStudent(Student student) {
        this.students.remove(student);
    }

    @Override
    void notifyStudents(Student newStudent) {
        for (Student student : students) {
            student.update(newStudent);
        }
    }
}
