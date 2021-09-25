Feature: Login page steps

  Scenario: Verify title is Login Page
    Given I navigate to homepage
    When I open User-Mgt page
    And I click on "Login" button
    Then Title of the page should be "Login Page"

  Scenario: Verify TLA logo is displayed
    Given I navigate to homepage
    When I open User-Mgt page
    And I click on "Login" button
    Then Image "TLA logo" should have value "logo.jpeg"