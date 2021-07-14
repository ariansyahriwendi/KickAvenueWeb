@Login
Feature: Login

  @LoginSuccess
  Scenario: User Want to Login
    Given I am user
    When I want to login
    And I click login
    And I input email "ariansyahriwendi@gmail.com"
    And I input password "kickavenue1745"
    And I click submit login
    Then I login successfully

  @LoginLogout
  Scenario: User Want to Login and Logout
    Given I am user
    When I want to login
    And I click login
    And I input email "ariansyahriwendi@gmail.com"
    And I input password "kickavenue1745"
    And I click submit login
    And I click profile
    And I click logout
    Then I logout successfully

  @LoginFacebook
  Scenario: User Want to Login with Facebook
    Given I am user
    When I want to login
    And I click login
    And I click facebook button
    Then I login successfully

#  @LoginApple
#  Scenario: User Want to Login with Apple
#    Given I am user
#    When I want to login
#    And I click login
#    And I click apple button
#    Then I login successfully

  @LoginGoogle
  Scenario: User Want to Login with Apple
    Given I am user
    When I want to login
    And I click login
    And I click google button
    Then I login successfully