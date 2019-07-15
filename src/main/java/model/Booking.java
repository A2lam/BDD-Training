package model;

import java.lang.reflect.Array;

class Booking
{
    private int numberOfSeats;
    private String destination;
    private String companyName;
    int companyAvailableSeats;
    String[] options;

    Booking() {}

    Booking(int numberOfSeats, String destination, String companyName)
    {
        this.numberOfSeats = numberOfSeats;
        this.destination = destination;
        this.companyName = companyName;
    }

    Booking(int numberOfSeats, String destination, String companyName, String options[])
    {
        this.numberOfSeats = numberOfSeats;
        this.destination = destination;
        this.companyName = companyName;
        this.options = options;
    }

    boolean order()
    {
        return this.numberOfSeats <= this.companyAvailableSeats;
    }
}
