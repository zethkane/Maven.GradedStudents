package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {

    @Test
    public void getExamScoresTest(){

        String firstName = "Zeth";
        String lastName = "Kane";
        Double[] examScores = {89.0, 75.6, 97.4};
        Student student = new Student(firstName,lastName, examScores);


        String expected = "Exam 1 -> 89\nExam 2 -> 75.6\nExam 3 -> 97.4";
        String actual = student.getExamScores();

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testAddAll(){
        String firstName = null;
        String lastName = null;
        Double[] examScores = {75.0 ,85.5, 99.4};
        Student student = new Student(firstName,lastName,examScores);

        student.addAll(examScores);
        String actualGrades = student.getExamScores();
        String expectedGrades = "Exam 1 -> 75.0, Exam 2 -> 85.5, Exam 3 -> 99.4";

        Assert.assertEquals(actualGrades,expectedGrades);
    }

    @Test
    public void testAddExamScore(){

        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { };
        Student student = new Student(firstName, lastName,examScores);

        student.addScore(100.0);
        String output = student.getExamScores();
    }

    @Test
    public void setExamScoreTest(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { };
        Student student = new Student(firstName, lastName, examScores);
        student.addScore(100.0);

        student.setExamScore(1, 150.0);
        String output = student.getExamScores();

        System.out.println(output);

    }

    @Test
    public void getAverageScoresTest(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);
        student.addAll(examScores);

        Double expected = 500/4.0;
        Double actual = student.getAverageExamScore();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void toStringTest(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);
        student.addAll(examScores);

        // When
        String output = student.toString();

    }
}