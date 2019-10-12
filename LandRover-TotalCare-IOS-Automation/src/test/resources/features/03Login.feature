Feature: Login screen Test cases

  @Signin
  Scenario: Verify the elements on signin screen
    Given User Tap on signin Button
    Then verify that signin icon is present
    And verify that signin title is present
    And verify that Land Rover title is present
    And Verify that Email address field is present
    And Verify that Password field is present
    And Verify that Forgot password label is present
    And Verify that Next button is present

  @Signin
  Scenario: Verify the error messages for Email and password
    Given User Tap on signin Button
    And verify that signin icon is present
    When user tap on Next button
    Then verify the error message with email field is present as "Please enter your email"
    And verify the error message with password field is present as "Please enter password"

  @Signin
  Scenario: Verify that user is navigated to the startup screen on taping cross icon
    Given User Tap on signin Button
    And verify that signin icon is present
    When user tap on cross button
    Then verify the sign in button

  @Signin
  Scenario: Verify the error messages on Invalid Email
    Given User Tap on signin Button
    And verify that signin icon is present
    And Enter the email as "test@"
    And Enter the password as "test1234"
    When user tap on Next button
    Then verify the error message shown as "Email is invalid"

  @Signin
  Scenario Outline: Verify the error messages on Invalid Email on Different emails
    Given User Tap on signin Button
    And verify that signin icon is present
    And User enters the email address as "<Email>"
    And User enters the password as "test1234"
    When user tap on Next button
    Then verify the error message shown as "Email is invalid"

    Examples: 
      | Email    |
      | test@    |
      | test     |
      | test@123 |

  @Signin
  Scenario: Non registered Email message
    Given User Tap on signin Button
    And verify that signin icon is present
    Then Enter the email as "iftikha@farabi.com"
    And Enter the password as "test1234"
    And user tap on Next button
    And verify the message for not registered email as "Email address entered is not registered. Verify your email or try to Sign Up"

  @Signin
  Scenario: Incorrect password message
    Given User Tap on signin Button
    And verify that signin icon is present
    Then Enter the email as "iftikhar@farabi.ae"
    And Enter the password as "test12345"
    And user tap on Next button
    And verify the message for incorrect password as "Incorrect password"

  @Signin
  Scenario: Successful Login
    Given User Tap on signin Button
    And verify that signin icon is present
    Then Enter the email as "iftikhar@farabi.ae"
    And Enter the password as "test1234"
    And user tap on Next button
    And verify the Weather Text on home screen
    And User is on Home screen and verify the LR Logo
