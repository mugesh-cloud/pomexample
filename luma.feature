Feature: Testing Luma website

  Scenario: Luma website
    Given User enter the luma url
    Then User mouseover the women item
    Then User click women product
    Then User mouseover the product image
    And User click the color and size in women product
    And User Click the addcart
    And User Click the add to compare button
    And User mouseover the men item
    And user click men product
    And user mouseover the men product image
    And user click the color and size in men product
    And user click the addto cart
    And user click the addto compare
    And user select the cart page
    And user select the del option
    Then First delete men product
    Then Again select the delete option 
    And Second delete the women product