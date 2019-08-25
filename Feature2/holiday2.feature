#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@BookHotelAndFlights
Feature: Going on holiday
I want to book a flight ticket and a hotel

  @BookHotel
  Scenario: I want to book hotel
    Given I live in Dhaka
    And I want to go on a holiday
    And We are 2 adults
    |Mir |Mamun  |
    |Mir2|Safwan |
    And We want to book from 10th Sep 2019 to 20th Sep 2019
    When I go to travel agent
    Then He should be able to to help me in a budget of 1000 USD
    And He should provide me option to cancel
    But He should not ask for advance more the 300 USD
  
  
  
  