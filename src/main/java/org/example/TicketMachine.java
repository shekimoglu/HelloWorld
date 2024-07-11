package org.example;

public class TicketMachine {

    public static void main(String[] args) {

        Ticket ticket = new Ticket();
        //destination
        ticket.setDestination("London");
        //price
        ticket.setPrice(100);
        //is return
        ticket.setReturn(true);

        System.out.println("Destination: " + ticket.getDestination());
        System.out.println("Price: " + ticket.getPrice());
        System.out.println("Is return: " + ticket.isReturn());
    }
}
