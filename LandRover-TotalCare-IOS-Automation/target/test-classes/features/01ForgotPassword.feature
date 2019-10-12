Feature: Forgot Password Test Cases

  @FogotPassword
  Scenario: Elements Verification on forgot password screen
    Given User click on Sign In button
    When User tap on Forgot password
    Then Verify the Image logo on forgot password screen is present
    And verify the Screen title is present
    And verify the description text is present
    And verify the Email Address field is present
    And verify the Request One Time Password button is present
    And verify the One Time Password field is present
    And Next button is present

  @FogotPassword
  Scenario: Elements Verification on forgot password fields error messages
    Given User click on Sign In button
    When User tap on Forgot password
    Then Verify the Image logo on forgot password screen is present
    And Tap on Next button
    And verify the error message for Email field as "Please enter your email"
    And verify the one time password field error as "Please enter one time password"

  @FogotPassword
  Scenario: Verify the error on leaving the email address field blank and pressing the OTP button
    Given User click on Sign In button
    When User tap on Forgot password
    Then Verify the Image logo on forgot password screen is present
    And Enter the Code as "Test1234"
    And Tap on Next button
    And verify the error message for Email field as "Please enter your email"

  @FogotPassword
  Scenario: Non registered Email error message
    Given User click on Sign In button
    When User tap on Forgot password
    Then Verify the Image logo on forgot password screen is present
    And Enter the Email as "NONExisted@farabi.ae"
    And user tap on Request One Time Password button
    Then verify the error message is shown as "Email address doesn't exist"

  @FogotPassword
  Scenario: Password sent to the mail
    Given User click on Sign In button
    When User tap on Forgot password
    Then Verify the Image logo on forgot password screen is present
    And Enter the Email as "mudasir@farabi.ae"
    And user tap on Request One Time Password button
    And verify the message as "One Time Password is sent to the provided email address"

  @FogotPassword
  Scenario: Wrong One Time password
    Given User click on Sign In button
    When User tap on Forgot password
    Then Verify the Image logo on forgot password screen is present
    And Enter the Email as "mudasir@farabi.ae"
    And Enter the Code as "ABCD"
    And Tap on Next button
    And verify the error message as "Code doesn't exist"

  @FogotPassword
  Scenario: Verify the error after entering the OTP 5 times
    Given User click on Sign In button
    When User tap on Forgot password
    Then Verify the Image logo on forgot password screen is present
    And Enter the Email as "iftikhar@farabi.ae"
    And Enter the Code as "ABCD"
    And press the OTP button five times
    And press the OTP button sixth time and verify the toast message "You can now generate the OTP after one hour"
