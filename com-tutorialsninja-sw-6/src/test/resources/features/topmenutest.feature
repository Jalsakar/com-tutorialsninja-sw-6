@regression @author_Disha
Feature: TopMenu Test Feature
  As a User, I should be able to check TopMenu features

  Background: User is on HomePage
    When      user mouse hover on Currency Dropdown and click on it
    And       User mouse hover on £Pound Sterling and click on it

  @sanity @smoke
  Scenario: User should navigate to Desktops page successfully
    When I click on Desktops tab
    And I call selectMenu and pass all desktop "Show AllDesktops"
    And I should navigate to desktop page
    Then I should get desktop text like "Desktops"

  @sanity
  Scenario: User should navigate to Laptops and Notebooks page successfully
    When I click on Laptop and Notebooks tab
    And I call selectMenu and pass all laptop and notebook "Show AllLaptops & Notebooks"
    And I should navigate to laptop and notebook page
    Then I should get laptop and notebook text like "Laptops & Notebooks"

  @regression
  Scenario: User should navigate to Components page successfully
    When I click on Components tab
    And I call selectMenu and pass all components "Show AllComponents"
    And I should navigate to Components page
    Then I should get components like "Components"
