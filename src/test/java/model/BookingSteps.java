package model;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class BookingSteps
{
    private Booking booking;
    private boolean is_successful;

    @Given("^I want (\\d+) ticket\\(s\\) to (.*) with (.*)$")
    public void iWantSomeTicketsToDestinationWithCompany(int numberOfSeats, String destination, String company)
    {
        this.booking = new Booking(numberOfSeats, destination, company);
    }

    @And("^(\\d+) available\\(s\\)$")
    public void theyAreAvailable(int companyAvailableSeats)
    {
        this.booking.companyAvailableSeats = companyAvailableSeats;
    }

    @When("^I try to book airline tickets$")
    public void iTryToBookAirlineTickets()
    {
        this.is_successful = this.booking.order();
    }

    @Then("^(\\d+) ticket\\(s\\) are booked for me$")
    public void someTicketsAreBookedForMe(int numberOfBookedSeats)
    {
        assertTrue(this.is_successful);
    }

    @Then("^No tickets are booked$")
    public void noTicketsAreBooked()
    {
        assertFalse(this.is_successful);
    }

    @Given("^I want (\\d+) porthole ticket\\(s\\) and (\\d+) normal ticket\\(s\\) to (.*) with (.*)$")
    public void iWantSomePortholeTicketsAndSomeNormalTicketsToDestinationWithCompany(int numberOfPortholeSeats, int numberOfSeats, String destination, String company)
    {
        this.booking = new Booking(numberOfSeats, numberOfPortholeSeats, destination, company);
    }

    @And("^(\\d+) porthole are available$")
    public void somePortholeAreAvailable(int companyAvailablePortholeSeats)
    {
        this.booking.companyAvailablePortholeSeats = companyAvailablePortholeSeats;
    }

    @Then("^(\\d+) ticket\\(s\\) whose (\\d+) porthole\\(s\\) booked for me$")
    public void someTicketsWhoseSomeIsPortholeAreBookedForMe(int numberOfBookedSeats, int numberOfPortholeBookedSeats)
    {
        assertTrue(this.is_successful);
    }
}
