@Register
Feature: Register

  @RegisterSuccess
  Scenario: User Want to Register
    Given I am user
    When I want to register
    And I click register
    And I input email register "ariansyahriwendi@gmail.com"
    And I select country
    And I select province
    And I input password register "kickavenue1745"
    And I input confirm password register "kickavenue1745"
    And I click submit register
    Then I register successfully