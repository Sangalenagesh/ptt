Feature: Test Login functionality

  @LoginPage
  Scenario: Validate Login is Successful with credentials
    Given user is on login page
    When user enters valid username and password
    And click on signin button
    Then User is navigated to Home page
