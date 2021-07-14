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
    And I search "adidas nmd r1 black olive"
    And I click adidas nmd r1 black olive
    And I click brand new
    And I select size
    And I click continue
    And I click choose payment
    And I click bca installments
    And I click continue payment
    Then I checkout successfully