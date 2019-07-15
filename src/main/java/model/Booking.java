package model;

class Booking
{
    private int numberOfSeats;
    private String destination;
    private String companyName;
    public int companyAvailableSeats;

    Booking() {}

    Booking(int numberOfSeats, String destination, String companyName)
    {
        this.numberOfSeats = numberOfSeats;
        this.destination = destination;
        this.companyName = companyName;
    }

    boolean order()
    {
        return this.numberOfSeats <= this.companyAvailableSeats;
    }
}
