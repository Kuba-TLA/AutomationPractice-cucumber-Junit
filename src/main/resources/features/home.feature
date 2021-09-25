Feature: Home page scenarios

  Scenario: Verify saucedemo link text
    Given I navigate to homepage
    Then I should be able to see "Saucedemo" link text
    When I click Saucedemo link text
    Then Title of the page should be Swag Labs

  Scenario: Verify e-commerce link text
    Given I navigate to homepage
    Then I should be able to see "E-commerce" link text
    When I click E-commerce link text
    Then Title of the page should be My Store

  Scenario: Verify shopping cart link text
    Given I navigate to homepage
    Then I should be able to see "Shopping Cart" link text
    When I click Shopping Cart link text
    Then Title of the page should be React Shopping Cart


