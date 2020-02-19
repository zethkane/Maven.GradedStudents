package io.zipcoder;

import java.awt.*;
import java.util.ArrayList;

public class Student {
   private String firstName;
   private String LastName;
   private ArrayList<Double> examScores;

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

    public ArrayList<Double> getExamScores() {
        return examScores;
    }
}
