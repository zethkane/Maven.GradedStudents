package io.zipcoder;

import com.sun.tools.javac.util.List;

public class Classroom {
    Student[] students;

    public Classroom(int maxNumberOfStudents){
        this.students = new Student[maxNumberOfStudents];

    }
    public Classroom(Student[] students){

    }

    public Classroom(){
        this.students = new Student[30];
    }

    public String getStudents(){
        return students.toString();
    }

    public Double getAverageExamScore(){
        
        return 0.0;
    }
    
    public void addStudents(Student student){
        Student[] newClassroom = new Student[0];
        for (int i = 0; i < students.length ; i++) {
            for (int j = 0; j < students.length + 1; j++) {
                newClassroom[j] = students[i];
            }
        }
    }
}
