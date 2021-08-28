Feature: Login Function Test

  Scenario: Login Test With Data

    Given Browser Opening and Navigating to Login Page
    When Enter Invalid Login Credentials
    And Login Unsuccessful
    Then End Test