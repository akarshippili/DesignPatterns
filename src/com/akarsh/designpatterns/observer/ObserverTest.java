package com.akarsh.designpatterns.observer;

public class ObserverTest {
    public static void main(String[] args) {
        HighSchool DPS = new HighSchool("DPS");

        HighSchoolStudent student1 = new HighSchoolStudent("Student1", DPS);
        HighSchoolStudent student2 = new HighSchoolStudent("Student2", DPS);
        HighSchoolStudent student3 = new HighSchoolStudent("Student3", DPS);
        HighSchoolStudent student4 = new HighSchoolStudent("Student4", DPS);
        DPS.removeStudent(student2);
        HighSchoolStudent student5 = new HighSchoolStudent("Student5", DPS);


        MiddleSchool vignanVidyalaya = new MiddleSchool("Vignan Vidyalaya");
        MiddleSchoolStudent middleStudent1 = new MiddleSchoolStudent("Student1", vignanVidyalaya);
        MiddleSchoolStudent middleStudent2 = new MiddleSchoolStudent("Student2", vignanVidyalaya);

        MiddleSchool kendriyaVidyalaya = new MiddleSchool("Kendriya Vidyalaya");
        MiddleSchoolStudent middleStudent3 = new MiddleSchoolStudent("Student3", kendriyaVidyalaya);
        MiddleSchoolStudent middleStudent4 = new MiddleSchoolStudent("Student4", kendriyaVidyalaya);
    }
}
