#Feature: User Login and Form Submission
#
  #Scenario: Login and Submit Form
    #Given open chrome and start application
    #When I enter valid username and valid password
    #And I click button hotel
    #Then I can login successfully
    
Feature: User Login and Form Submission

  Scenario: Login and Submit Form
    Given open chrome and start application
    When I enter valid username and valid password
    And I click button restaurant
    Then I can login successfully