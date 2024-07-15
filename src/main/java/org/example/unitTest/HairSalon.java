package org.example.unitTest;

public class HairSalon {

    private int hairCutPrice = 20;
    private Calculator calculator = new Calculator();
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

    public int getHairCutPrice() {
        return hairCutPrice;
    }

    public double applyDiscount() {
        return calculator.divide(hairCutPrice,2)+5;
    }


}
