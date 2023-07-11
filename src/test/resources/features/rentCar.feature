Feature: rentCar

  @rent
  Scenario: Add a car
    Given User launches browser
    When User opens ilCarro Home Page
    And User clicks on Log in link
    And User enters valid data
    And User clicks on Yalla button
    And User verifies Log in message
    And User clicks on OK button
    And User clicks on Let the car work link
    And User enters valid data about a car
    And User clicks on submit button
    Then User verifies message, that a car was added
    And User quits browser