package org.example.unitTest;

public class HairSalon {
    private String [] openingDays ={
        "Monday",
        "Tuesday",
    };


    public String[] getOpeningDays() {
        return openingDays;
    }

    public boolean isOpen(String day){
        if (day.equals("Monday") || day.equals("Tuesday"))
            return true;
        else
            return false;
    }


}
