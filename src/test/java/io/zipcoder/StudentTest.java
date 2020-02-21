package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void getExamScoresTest(){
        Student student = new Student();
        String firstName = "Zeth";
        String lastName = "Kane";
        Double[] examScores = {89.0, 75.6, 97.4};

        String expected = "Exam 1 -> 89\n Exam 2 -> 75.6\n Exam 3 -> 97.4";
        String actual = student.getExamScores();

        Assert.assertEquals(expected, actual);

    }

}