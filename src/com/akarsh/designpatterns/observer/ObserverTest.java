package com.akarsh.designpatterns.observer;

public class ObserverTest {
    public static void main(String[] args) {
        HighSchool DPS = new HighSchool("DPS");

        Student student1 = new Student("Student1", DPS);
        Student student2 = new Student("Student2", DPS);
        Student student3 = new Student("Student3", DPS);
        Student student4 = new Student("Student4", DPS);
        Student student5 = new Student("Student5", DPS);
    }
}
