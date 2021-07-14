@ForgotPassword
Feature: Forgot Password

  @ForgotPasswordSuccess
  Scenario: User Want to Use Forgot Password
    Given I am user
    When I want to use forgot password
    And I click login
    And I click forgot password
    And I input email forgot password "ariansyahriwendi@gmail.com"
    And I click send reset link
    Then I use forgot password successfully