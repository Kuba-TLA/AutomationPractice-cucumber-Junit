Feature: Home page scenarios

  Background:
    Given I navigate to homepage

    @logPass
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

    @scenarioOutline
  Scenario Outline: Verify all following link texts open expected web page
    Then I should be able to see "<link name>" link text
    When I click "<link text>" link text
    Then Title of the page should be "<page title>"
    Examples:
      | link name     | link text     | page title          |
      | Saucedemo     | Saucedemo     | Swag Labs           |
      | E-commerce    | E-commerce    | My Store            |
      | Shopping Cart | Shopping Cart | React Shopping Cart |

  @navigation @single
  Scenario: Verify nav button is enabled
    Then I verify "Files" button is enabled
    Then I verify "iFrame" button is enabled
    Then I verify "Notes" button is enabled
    Then I verify "Home" button is enabled

  @navigation
  Scenario: Verify nav button is enabled
    Then I verify "Home" button is enabled

  @navigation
  Scenario: Verify nav button is enabled
    Then I verify "Notes" button is enabled

  @navigation
  Scenario: Verify nav button is enabled
    Then I verify "iFrame" button is enabled

  @navigation @scenarioOutline
  Scenario Outline: Verify nav button is enabled
    Then I verify "<button name>" button is enabled
    Examples:
    |button name|
    |Home       |
    |Notes      |
    |iFrame     |
    |Files      |