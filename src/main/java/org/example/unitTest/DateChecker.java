package org.example.unitTest;

public class DateChecker {

    //enum for the weeks
    public enum Week{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    //enum for the months
    public enum Month{
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    public boolean has31Days(Month month){
        if(month == Month.JANUARY || month == Month.MARCH || month == Month.MAY || month == Month.JULY || month == Month.AUGUST || month == Month.OCTOBER || month == Month.DECEMBER){
            return true;
        }
        return false;
    }

}
