@user-mgt
Feature: User Management page scenarios

  Background:
    Given I navigate to homepage
    When I open "User-Mgt" page

  @runFromCMLine
  Scenario: Verify title of the page
    Then Title of the page should be "Register New User"

  @smoke
  Scenario: Verify Login button is present
    Then I should see Login button

  @regression
  Scenario: Verify Access DB button is present
    Then I should see Access DB button

  @withoutDataTable
  Scenario: Verify user registration form
    When I input "firstname" as "Jack"
    And I input "lastname" as "Z"
    And I input "phone number" as "333-333-3333"
    And I input "email" as "kz@test.com"
    And I input "role" as "Instructor"
    And I click on "Submit" button
    Then I should see all fields displayed on user table

  @withDataTable
  Scenario: Verify user registration form with Cucumber Data Table
    When I input following user details:
      | firstname    | Jack         |
      | lastname     | Z            |
      | phone number | 333-333-3333 |
      | email        | kz@test.com  |
      | role         | Instructor   |
    And I click on "Submit" button
    Then I should see all fields displayed on user table

  @typeRegistry @pojo
  Scenario: Create users using cucumber typeRegistry with POJO class
    When I create following users
      | firstName | lastName | phoneNumber | email          | role       |
      | Jack      | Great    | 222         | jack@test.com  | Student    |
      | Silva     | Blue     | 333         | silva@test.com | Instructor |
      | Rose      | Gold     | 444         | rose@test.com  | Mentor     |

  @readFromExcel
  Scenario: Create users using excel file
    When I create users from "Sheet 1" sheet in "users.xlsx" file