Feature: Login to Salesflo

  Scenario: Login page logo
    Given I launch Chrome browser
    When I open Salesflo page
    Then Login is successful
    And Close Browser