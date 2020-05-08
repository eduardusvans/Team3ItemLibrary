@Android @checkout
Feature: Checkout on moka pos

  Scenario: User checkout from Favorites
    Given User is on moka start page
    When User click sign in button on moka start page
    And User is on Home Page on moka pos
    And User checkout from favorites on moka pos
    And User click "Green Tea Latte" on moka pos
    And User click charge button on shopping cart on moka pos
    And User see checkout pop up on moka pos
    And User choose cash suggest on moka pos
    And User click charge button on checkout pop up on moka pos
    And User click no, thank you button
    And User redirect to Home Page
