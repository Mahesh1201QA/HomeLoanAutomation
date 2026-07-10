Feature: Home Loan Application Login

  @Smoke
  Scenario: Validate login using JSON test data


    Given user opens the home loan application

    When user enters login details from JSON

    And user clicks on login button

    Then user should navigate to dashboard page