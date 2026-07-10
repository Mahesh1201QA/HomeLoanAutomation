Feature: Dashboard Validation


  @Regression
  Scenario: Verify Apply Home Loan option


    Given user opens the home loan application

    When user enters login details from JSON

    And user clicks on login button

    Then Apply Home Loan option should be displayed

    When user clicks Apply Home Loan option