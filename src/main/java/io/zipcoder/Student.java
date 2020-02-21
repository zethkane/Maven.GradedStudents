package io.zipcoder;

import java.awt.*;
import java.util.ArrayList;

public class Student {
   private String firstName;
   private String LastName;
   private ArrayList<Double> examScores = new ArrayList<>();

   public void Student( String firstName, String lastName, Double[] testScores){
       this.firstName = firstName;
       this.LastName = lastName;
   }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Integer getNumberOfExamsTaken(){
       int count = 0;
       Student student = new Student();
        for (int i = 0; i < student.examScores.size(); i++) {
            count++;
        }
       return null;
    }
    public String getExamScores(){
       Student student = new Student();
       String examNum = "Exam ";
        for (int i = 1; i < getNumberOfExamsTaken() ; i++) {
            examNum += i + " -> " + student.getExamScores();
        }
        return examNum;
    }
}
