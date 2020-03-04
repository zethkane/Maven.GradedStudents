package io.zipcoder;

import java.awt.*;
import java.util.ArrayList;

public class Student {
   private String firstName;
   private String LastName;
   private Double[] examScores;
   private ArrayList<Double> grades = new ArrayList<>();

   public Student( String firstName, String lastName, Double[] examScores){
       this.firstName = firstName;
       this.LastName = lastName;
       this.examScores = examScores;
   }


    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.LastName;
    }

    public ArrayList<Double> getTestScores(){return this.grades;}

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public void addAll(Double... examScores){
       if(examScores != null){
           for (int i = 0; i < examScores.length; i++) {
               grades.add(i,examScores[i]);
           }
       }
    }

    public void addScore(Double examScore){
       if(examScore != null){
           grades.add(examScore);
       }
    }

    public Integer getNumberOfExamsTaken(){
       int count = 0;
        for (int i = 0; i < grades.size(); i++) {
            count++;
        }
       return count;
    }
    public String getExamScores(){
       String examNum = "";
       int count = 0;
        for (int i = 0; i < getNumberOfExamsTaken() ; i++) {
                count++;
                examNum += "Exam "+ count + " -> " + grades.get(i);
                if(i != getNumberOfExamsTaken()-1){
                    examNum += ", ";
                }
        }
        return examNum;
    }
    public void setExamScore(int index, Double score){
       grades.add(index,score);
    }

    public Double getAverageExamScore(){
      Double totalSum = 0.0;
      Double averageGrade;
        for (int i = 0; i < grades.size() ; i++) {
            totalSum += grades.get(i);
        }
        averageGrade = totalSum / getNumberOfExamsTaken();
      return averageGrade;
    }

    @Override
    public String toString(){
       return String.format(getFirstName(), getLastName(), getAverageExamScore(),getExamScores());
    }
}
