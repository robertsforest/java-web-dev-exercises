package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student myStudent = new Student("Forest",69,1,4.0);
//        System.out.println(myStudent.getGpa());

        ArrayList<Student> mathStudents = new ArrayList<>();

        mathStudents.add(myStudent);
        Course algebraTwo = new Course(mathStudents, 3);

        System.out.println("The name of the first student enrolled in Algebra II is " + algebraTwo.getEnrolledStudents().get(0).getName());
    }
}
