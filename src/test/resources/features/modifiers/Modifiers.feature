@Web @Categories
Feature: Modifiers

  Scenario: Create modifier
    Given User open moka backoffice login page
    And User input email "your email" on backoffice login page
    And User input password "your password" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu modifiers on backoffice
    And User click create modifier button on backoffice modifier
    And User input random modifier name on backoffice modifier
    And User click save button on backoffice modifier