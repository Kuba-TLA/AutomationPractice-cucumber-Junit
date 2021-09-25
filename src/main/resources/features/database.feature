Feature: Database page tests

  Scenario: Verify title is User DB
    Given I navigate to homepage
    When I open User-Mgt page
    And I click on "Access DB" button
    Then Title of the page should be "User DB"