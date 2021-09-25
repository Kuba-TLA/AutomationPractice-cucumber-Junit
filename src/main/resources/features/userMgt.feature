Feature: User Management page scenarios
  Background:
    Given I navigate to homepage
    When I open User-Mgt page

  Scenario: Verify title of the page
    Then Title of the page should be "Register New User"

  Scenario: Verify Login button is present
    Then I should see Login button

  Scenario: Verify Access DB button is present
    Then I should see Access DB button
