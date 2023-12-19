@regression @author_Disha
Feature: Laptops And Notebooks Page Test Feature

  Background: User is on HomePage
    When      user mouse hover on Currency Dropdown and click on it
    And       User mouse hover on £Pound Sterling and click on it

  @sanity @smoke
  Scenario: User should verify products price display high to low successfully
    When    User mouse hover on Laptops & Notebooks tab and click on it
    And     User click on Show All Laptops & Notebooks Option
    And     User Select Sort By Price (High > Low)
    Then    User should see Product price is arrange in High to Low order.

  @smoke
  Scenario: User should place the order successfully
    When    User mouse hover on Laptops & Notebooks tab and click on it
    And     User click on Show All Laptops & Notebooks Option
    And     User Select Sort By Price (High > Low)
    And     User Select Product MacBook
    Then    User should able to verify the Product name "MacBook"
    And     User Click on Add To Cart button
    Then    User should see the message Success: You have added MacBook to your shopping cart!
    And     User click on link shopping cart display into success message
    Then    User should able to see "Shopping Cart  (0.00kg)"
    And     user should able to see Product name is "MacBook"
    And     User Change Quantity to 2
    And     User click on Update tab
    Then    User should see message "Success: You have modified your shopping cart!"
    And     User should see the updated  total price "£737.45"
    And     user click on Checkout button
    Then    User should see checkout text "Checkout"
    And     user should see customer text "New Customer"
    And     User click on Guest Checkout radio button
    And     User click on Continue tab
    Then    user fill all the mandatory fields
    And     User click on Continue
    And     User enter Comments about order into text field
    And     User Click on check the Terms & Conditions check box
    And     User Click on Continues
    Then    User should see warning message "Warning: Payment method required!"