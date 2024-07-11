package org.example.training;

public class GradeSystem {

    //is pass
    public boolean isPass(int percentage) {
        if (percentage >= 55) {
            return true;
        } else {
            return false;
        }

    }

    //get grade method
    public String getGrade(int percentage){
        //if percentage is greater than or equal to 80
        if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            //if percentage is greater than or equal to 70
            return "B";
        } else if (percentage >= 60) {
            //if percentage is greater than or equal to 60
            return "C";
        } else if (percentage   >= 55) {
            //if percentage is greater than or equal to 50
            return "D";
        } else {
            //if percentage is less than 50
            return "F";
        }

    }

    //retake message
    public String retakeMessage(int percentage, boolean retakeAllowed) {

        if (percentage < 55 && retakeAllowed) {
            return "You are eligible for retake";
        } else if (percentage < 55 && !retakeAllowed) {
            return "You are not eligible for retake";
        }else {
            return "Not required to retake";
        }

    }
}
