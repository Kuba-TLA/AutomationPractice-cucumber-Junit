Feature: Home page scenarios
  Background:
    Given I navigate to homepage

  Scenario: Verify saucedemo link text
    Then I should be able to see "Saucedemo" link text
    When I click "Saucedemo" link text
    Then Title of the page should be "Swag Labs"

  @smoke @regression @tempTest @homeScenario
  Scenario: Verify e-commerce link text
    Then I should be able to see "E-commerce" link text
    When I click "E-commerce" link text
    Then Title of the page should be "My Store"

  @smoke @regression
  Scenario: Verify shopping cart link text
    Then I should be able to see "Shopping Cart" link text
    When I click "Shopping Cart" link text
    Then Title of the page should be "React Shopping Cart"


