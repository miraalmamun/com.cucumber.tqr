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
@RegisterUser
Feature: Registering User
I want to register user

  @Registeration
  Scenario Outline: Register user on Gmail.com
    Given I am on gmail.com registeration page
    When I enter <username>
    When I enter <password>
    When I enter <mobilenumber>
    Then regiteration should be <result>

    Examples: 
      | username  | password | mobilenumber  | result |
      | user1     | pass1    | 2222222222    | success|
      | user2     | pass2    | 3333333333    | failure|
