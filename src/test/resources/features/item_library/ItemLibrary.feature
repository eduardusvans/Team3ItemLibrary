@Web @ItemLibrary
Feature: Item Library

  Scenario: Create Item
    Given User open moka backoffice login page
    And User input email "your email" on backoffice login page
    And User input password "your password" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu item library on backoffice
    And User click create item button on backoffice item library
    And User input random item name on backoffice item library
    And User input random item price on backoffice item library
    And User choose random item sku on backoffice item library
    And User choose modifier oreo on backoffice item library
    And User input item description on backoffice item library
    And User click save button on backoffice item library

