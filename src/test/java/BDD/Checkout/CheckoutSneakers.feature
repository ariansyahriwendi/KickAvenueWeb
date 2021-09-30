@Checkout
Feature: Checkout

  @CheckoutSneakers
  Scenario: User Want to Checkout
    Given I am user
    When I want to checkout
    And I click login
    And I input email "ariansyahriwendi@gmail.com"
    And I input password "kickavenue1745"
    And I click submit login

    And I click sneakers
    And I click search
    And I search "seji high yin yang black"
    And I select product
    And I click brand new
    And I select size
    And I click continue
    And I click choose payment
    And I click bca installments
    And I click continue payment
    Then I checkout successfully