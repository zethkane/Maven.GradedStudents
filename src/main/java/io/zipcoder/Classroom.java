package io.zipcoder;

import com.sun.tools.javac.util.List;

import java.util.ArrayList;

public class Classroom {
    Student[] students;
    private ArrayList<Student> aClassroom = new ArrayList<>();

    public Classroom(int maxNumberOfStudents){
        this.students = new Student[maxNumberOfStudents];

    }
    public Classroom(Student[] students){

    }

    public Classroom(){
        this.students = new Student[30];
    }

    public String[] getStudents(){
        String[] studentList = new String[students.length];
        for (int i = 0; i <students.length ; i++) {
            studentList[i] += students[i];
        }
        return studentList;
    }

    public Double getAverageExamScore(){
        
        return 0.0;
    }
    
    public void addStudents(Student student) {
        aClassroom.add(student);

    }

    public void removeStudent(String firstName, String lastName){
        String wholeName = "";
        for (int i = 0; i < aClassroom.size() ; i++) {
            if (wholeName.equals(aClassroom.get(i)))
                aClassroom.remove(i);

        }
    }

//    public Student getStudentByScore(Integer score){
//        for (int i = 0; i < aClassroom.size() ; i++){}
//
//
//            }
}
