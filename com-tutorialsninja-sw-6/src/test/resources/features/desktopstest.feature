@regression @author_Disha
Feature: Desktops Page Test Feature

  Background: User is on HomePage
    When      user mouse hover on Currency Dropdown and click on it
    And       User mouse hover on £Pound Sterling and click on it

  @sanity @smoke
  Scenario: User should verify product arrange in alphabetical order
    When    User mouse hover on Desktops tab and click on it
    And     User click on Show All Desktops Option
    And     User click on sort By Position Name: Z to A
    Then    User should see products are arranged in Descending order

   @smoke
  Scenario Outline: User should verify that product added to shopping cart successFully
    When      User mouse hover on Desktops tab and click on it
    And       User click on Show All Desktops Option
    And       User click on sort By Position Name: A to Z
    And       User select the product "<product>"
    Then      User should navigate to the product page and see text for "<product>"
    And       User enter the Qty require as "<qty>"
    And       User click on Add to cart button
    Then      User should able to verify the message Success: You have added "<product>" to your shopping cart!
    And       user click on Link Shopping Cart display into success message
    Then      USer should able to verify the text Shopping Cart"<shopping cart weight>"
    Then      User should able to verify the product name "<product>"
    Then      User should able to verify the Model "<model>"
    Then      User should able to verify the Total "<price>"

    Examples:
      | product      | model      | price   | qty | shopping cart weight     |
      | HTC Touch HD | Product 1  | £74.73  | 1   | Shopping Cart  (0.15kg)  |
      | iPhone       | product 11 | £75.46  | 1   | Shopping Cart  (10.00kg) |
      | iPod Classic | product 20 | £74.73  | 1   | Shopping Cart  (1.00kg)  |
      | MacBook      | Product 16 | £368.73 | 1   | Shopping Cart  (0.00kg)  |
      | MacBook Air  | Product 17 | £736.23 | 1   | Shopping Cart  (0.00kg)  |
      | Sony VAIO    | Product 19 | £736.23 | 1   | Shopping Cart  (0.00kg)  |