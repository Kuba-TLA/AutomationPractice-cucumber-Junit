Feature: Home page scenarios

  Scenario: Verify saucedemo link text
    Given I navigate to homepage
    Then I should be able to see Saucedemo link text
    When I click Saucedemo link text
    Then Title of the page should be Swag Labs