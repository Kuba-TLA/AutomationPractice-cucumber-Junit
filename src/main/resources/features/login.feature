Feature: Login page steps

  Scenario: Verify title is Login Page
    Given I navigate to homepage
    When I open "User-Mgt" page
    And I click on "Login" button
    Then Title of the page should be "Login Page"

  @smoke @regression @loginPage
  Scenario: Verify TLA logo is displayed
    Given I navigate to homepage
    When I open "User-Mgt" page
    And I click on "Login" button
    Then Image "TLA logo" should have value "logo.jpeg"

  Scenario: Input username
    Given I navigate to homepage
    When I open "User-Mgt" page
    And I click on "Login" button
    When I input "username" as "Jack" in input field
    When I input "password" as "Jack123" in input field

  @typeRegistry @pojo
  Scenario: Verify multiple credentials' login
    Given I navigate to homepage
    When I open "User-Mgt" page
    And I click on "Login" button
    Then I validate following credentials are login in with no issue:
      | username        | password   |
      | jwick@gmail.com | john.wick$ |
      | liz@b.com       | liz.blue$ |
      | jwick@gmail.com | john.wick$ |