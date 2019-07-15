package model;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

public class BookingSteps
{
    private Booking booking;
    private boolean is_successful;

    @Given("^I want two tickets to New York with AirFrance$")
    public void iWantTwoTicketsToNewYorkWithAirFrance()
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

    @Then("^two tickets are booked for me$")
    public void twoTicketsAreBookedForMe()
    {
        assertTrue(this.is_successful);
    }
}
