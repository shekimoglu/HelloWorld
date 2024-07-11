package org.example;

public class Ticket {
    //variables
    private double price;
    //destination
    private String destination;
    //isreturn
    private boolean isReturn;

    //constructor
    public Ticket() {}

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setReturn(boolean isReturn) {
        this.isReturn = isReturn;
    }

    public double getPrice() {
        return price;
    }

    public String getDestination() {
        return destination;
    }

    public boolean isReturn() {
        return isReturn;
    }
}
