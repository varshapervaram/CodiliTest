###########################################################################################################################################################
#
Feature: Wish list lowest price item added to cart for Demo Shop Application
#
###########################################################################################################################################################

  Scenario: Wish list lowest price item added to MyCart for Demo Shop Application
    Given I add four different products to my wish list
    And I view my wish list table
    And I find total four selected items in my wish list
    When I search for lowest price product
    Then I must be able to add the lowest price item to my cart
    And I am able to verify the item in my cart