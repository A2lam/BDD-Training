package model;

import java.lang.reflect.Array;

class Booking
{
    private int numberOfSeats;
    private int numberOfPortholeSeats;
    private String destination;
    private String companyName;
    int companyAvailableSeats;
    int companyAvailablePortholeSeats;

    Booking() {}

    Booking(int numberOfSeats, String destination, String companyName)
    {
        this.numberOfSeats = numberOfSeats;
        this.destination = destination;
        this.companyName = companyName;
        this.numberOfPortholeSeats = 0;
        this.companyAvailablePortholeSeats = 0;
    }

    Booking(int numberOfSeats, int numberOfPortholeSeats, String destination, String companyName)
    {
        this.numberOfSeats = numberOfSeats;
        this.numberOfPortholeSeats = numberOfPortholeSeats;
        this.destination = destination;
        this.companyName = companyName;
    }

    boolean order()
    {
        return this.numberOfSeats <= this.companyAvailableSeats && this.numberOfPortholeSeats <= this.companyAvailablePortholeSeats;
    }
}
