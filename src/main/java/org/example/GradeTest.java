package org.example;

public class GradeTest {

    public static void main(String[] args) {
        GradeSystem gradeSystem = new GradeSystem();

        int points = 50;

        System.out.println(gradeSystem.isPass(points));
        System.out.println(gradeSystem.getGrade(points));
        System.out.println(gradeSystem.retakeMessage(points, true));

    }
}
