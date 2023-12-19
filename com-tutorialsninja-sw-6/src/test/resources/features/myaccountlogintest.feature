@regression @author_Disha
Feature: MyAccount Login Page Test Feature

  Background: User is on HomePage
    When      user mouse hover on Currency Dropdown and click on it
    And       User mouse hover on £Pound Sterling and click on it

  @sanity @smoke
  Scenario: Verify That User Should Login And Logout Successfully
    When      User click on My Account Link
    And       User Click on Login link
    And       User Enter an EmailAddress
    And       User enter password
    And       User click on Login button
    Then      User should be able to login successfully and Verify the text "My Account"
    And       User click On LogOut link
    Then      User should be able to logout successfully and Verify the text "Logout"
    And       User click on continue buttonThree