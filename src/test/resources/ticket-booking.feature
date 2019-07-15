#Author : Mohamed Allam HADJI

Feature: Book a airline ticket

  I would want to book airline ticket for me to go on vacation

  Scenario: Book two tickets successfully
    Given I want two tickets to New York with AirFrance
    And they are available
    When I try to book airline tickets
    Then two tickets are booked for me

  Scenario: Book two tickets unsuccessfully
    Given I want two tickets to New York with AirFrance
    And they are not available
    When I try to book airline tickets
    Then No tickets are booked

  Scenario: Book two tickets whose one is porthole successfully
    Given I want two tickets to New York with AirFrance whose one is porthole
    And they are availables
    When I try to book airline tickets
    Then two tickets whose one is porthole are booked for me

  Scenario: Book a ticket with the ability to bring my pet successfully
    Given I want a ticket to New York with AirFrance that enables me to bring my pet
    And the airline company does accept it
    When I try to book airline ticket
    Then A special ticket that enables pet is booked for me