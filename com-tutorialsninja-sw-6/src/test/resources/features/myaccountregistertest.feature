@regression @author_Disha
Feature: MyAccount Register Page Test Feature

  Background: User is on HomePage
    When      user mouse hover on Currency Dropdown and click on it
    And       User mouse hover on £Pound Sterling and click on it
  @sanity @smoke
  Scenario: Verify User Should Navigate To Register Page Successfully
    When      User click on My Account Link
    And       User Click on Register link
    Then      User should verify the text for Register Account "Register Account"
  @smoke
  Scenario: Verify User Should Navigate To Login Page Successfully
    When    User click on My Account Link
    And     User Click on Login link
    Then    User should verify the text for customer "Returning Customer"
  @regression
  Scenario: Verify That User Register Account Successfully
    When      User click on My Account Link
    And       User Click on Register link
    And       User Enter First Name
    And       User enter Last Name
    And       User Enter an Email
    And       User enter Telephone Number
    And       User enter password
    And       User enter confirm password
    And       User Select subscribe radio button as Yes
    And       User click on privacy policy check box
    And       User click on continue button
    Then      User should able to verify the message Your Account Has Been Created!
    And       User click on continue buttonOne
    And       User click on My Account Link
    And       User click on "Logout" button
    Then      User should able to verify the text "Logout"
    And       User click on continue buttonTwo