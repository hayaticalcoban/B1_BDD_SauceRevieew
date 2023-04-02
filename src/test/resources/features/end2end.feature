Feature: Login and E2E Test
  @wip
  Scenario: Login and End to End Test
    Given The user is on the login page
    When The user enters "standard_user" and "secret_sauce"
    Then The user should be able to login and see "Products" header
    And The user should be able to sort product "Price (high to low)"
    When The user clicks the cheapest as "7.99" and the second costline as "29.99" product
    And The user opens basket
    And The user clicks on checkout button
    And The user enters details as "Ben" "Admin", "PK001" and finish purchase