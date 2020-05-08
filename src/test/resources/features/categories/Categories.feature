@Web @Categories
Feature: Categories

  Scenario: Create Categories
    Given User open moka backoffice login page
    And User input email "your email" on backoffice login page
    And User input password "your password" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu categories on backoffice
    And User click create category button on backoffice category
    And User input name on backoffice category
    And User click save btn on backoffice category

