package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private ArrayList<Student> enrolledStudents = new ArrayList<>();
    private int creditHours;
    private HashMap<String, Double> rubric = new HashMap<>();

    public Course(ArrayList<Student> enrolledStudents, int creditHours){
        this.enrolledStudents = enrolledStudents;
        this.creditHours = creditHours;
    }

    public void setEnrolledStudents(ArrayList<Student> students){
        enrolledStudents = students;
    }

    public ArrayList<Student> getEnrolledStudents(){
        return enrolledStudents;
    }

    public void setCreditHours(int aCreditHours){
        creditHours = aCreditHours;
    }

    public int getCreditHours(){
        return creditHours;
    }
}
