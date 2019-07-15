package model;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class BookingSteps
{
    private Booking booking;
    private boolean is_successful;

    @Given("^I want (\\d+) tickets to (.*) with (.*)$")
    public void iWantSomeTicketsToDestinationWithCompany()
    {
        this.booking = new Booking(2, "New York", "Air France");
    }

    @And("^they are available$")
    public void theyAreAvailable()
    {
        this.booking.companyAvailableSeats = 100;
    }

    @When("^I try to book airline tickets$")
    public void iTryToBookAirlineTickets()
    {
        this.is_successful = this.booking.order();
    }

    @Then("^(\\d+) tickets are booked for me$")
    public void twoTicketsAreBookedForMe()
    {
        assertTrue(this.is_successful);
    }

    @And("^they are not available$")
    public void theyAreNotAvailable()
    {
        this.booking.companyAvailableSeats = 1;
    }

    @Then("^No tickets are booked$")
    public void noTicketsAreBooked()
    {
        assertFalse(this.is_successful);
    }
}
