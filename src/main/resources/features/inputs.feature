Feature: Inputs page scenarios

  Background:
    Given I navigate to homepage
    When I open "Inputs" page

  Scenario: Verify Contact Us form displays msg on correct completion without data table
    When I input "first name" as "Eddie" in Inputs page
    When I input "last name" as "Murphy" in Inputs page
    When I input "email" as "some@email.com" in Inputs page
    When I input "phone" as "5555" in Inputs page
    When I input "address" as "some address" in Inputs page
    When I input "city" as "Cloud" in Inputs page
    When I input "zip code" as "321654" in Inputs page
    And I click on "send" button
    Then I should be able to see text with value "Thanks for contacting us, we will get back to you shortly."

  Scenario: Verify Contact Us form displays msg on correct completion WITH data table
    When I input following details in Inputs page form
      | first name | Eddie          |
      | last name  | Murphy         |
      | email      | some@email.com |
      | phone      | 5555           |
      |address     |some address    |
      | city       | Cloud          |
      | zip code   | 321654         |
    And I click on "send" button
    Then I should be able to see text with value "Thanks for contacting us, we will get back to you shortly."
