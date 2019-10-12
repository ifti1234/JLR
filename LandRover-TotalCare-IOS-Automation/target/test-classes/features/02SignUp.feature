Feature: SignUp Flow

  @SignUp
  Scenario: Verify if the SignUp page of the app opens on pressing the button
    Given Press the sign up button
    And Verify the title of as "Login details"

  @SignUp
  Scenario: Verify the elements on the first sign up page
    Given Press the sign up button
    Then verify the sign up icon image
    And verify the title on the top "Login details"
    And verify the email address field
    And verify the password field
    And verify the confirm password
    And verify the description text for the password
    And verify the next button
    And verify the cross on the top right

  @SignUp
  Scenario: Verify the error on entering an invalid email
    Given Press the sign up button
    When enter the email in the field as "test123"
    Then user enter the password as "12345678"
    And user enter the coonfirm password as "12345678"
    And user tap on Next Button
    And Verify the error message shown as "Email is invalid"

  @SignUp
  Scenario: Verify the error on leaving the email address blank
    Given Press the sign up button
    When Enter the password and confirm password as "12341234"
    Then user tap on next button
    And verify the error "Please enter your email"

  @SignUp
  Scenario: Verify the error on leaving the confirm password field blank
    Given Press the sign up button
    When enter the email in the field as "test@gmail.com"
    Then user enter the password as "12345678"
    Then user tap on next button
    And verify the error message "Please enter confirm password"

  @SignUp
  Scenario: Verify the error on unmatched passwords
    Given Press the sign up button
    When enter the email in the field as "test@gmail.com"
    Then user enter the password as "12345678"
    And user enter the coonfirm password as "12345679"
    And user tap on Next Button
    And verify the error of the current screen "Password doesn't match the confirmed password"

  @SignUp
  Scenario: Verify the second SignUp page turns up after signing up
    Given Press the sign up button
    When enter the email in the field as "test.dev@gmail.com"
    Then user enter the password as "test1234"
    And user enter the coonfirm password as "test1234"
    And user tap on Next Button
    And verify the title as "Personal details"

  @SignUp
  Scenario: Verify the elements of the second SignUp page
    Given Press the sign up button
    When enter the email in the field as "test.dev@gmail.com"
    Then user enter the password as "test1234"
    And user enter the coonfirm password as "test1234"
    And user tap on Next Button
    And verify the title as "Personal details"
    And verify the icon of the second sign up page
    And verify the first name text field
    And verify the last name text field
    And verify the country of residence drop down
    And verify the mobile number fields
    And verify the city text field
    And verify the next button

  @SignUp
  Scenario: Validate the error of leaving the fields blank
    Given Press the sign up button
    When enter the email in the field as "test.dev@gmail.com"
    Then user enter the password as "test1234"
    And user enter the coonfirm password as "test1234"
    And user tap on Next Button
    And verify the title as "Personal details"
    And user tap on Next Button
    And verify the error message for First name as "Please enter your First Name"
    And verify the error message for Last name as "Please enter your Last Name"
    And verify the error message for Phone number field as "Please enter Mobile Number"
    And verify the error message for City field as "Please enter your city"

  @SignUp
  Scenario: Validate the error for First Name validations
    Given Press the sign up button
    When enter the email in the field as "test.dev@gmail.com"
    Then user enter the password as "test1234"
    And user enter the coonfirm password as "test1234"
    And user tap on Next Button
    And verify the title as "Personal details"
    Then Enter the First name as "F"
    And Enter the Last Name as "L"
    When user tap on Next Button
    Then verify the error message for First name as "First/Last name should be between 2—20alphabetic characters only."

  @SignUp
  Scenario: Validate the error for Last Name validations
    Given Press the sign up button
    When enter the email in the field as "test.dev@gmail.com"
    Then user enter the password as "test1234"
    And user enter the coonfirm password as "test1234"
    And user tap on Next Button
    And verify the title as "Personal details"
    Then Enter the First name as "F"
    And Enter the Last Name as "L"
    When user tap on Next Button
    And verify the error message for Last name as "First/Last name should be between 2—20alphabetic characters only."

  @SignUp
  Scenario: Verify that the app redirects to the third sign up page and verify the elements of the third sign up page
    Given Press the sign up button
    When enter the email in the field as "test.automation15@gmail.com"
    Then user enter the password as "test1234"
    And user enter the coonfirm password as "test1234"
    And user tap on Next Button
    Then Enter the First name as "Farabi"
    And Enter the Last Name as "Dev"
    And Enter the mobile number as "506356678"
    And Enter the City as "Dubai"
    And user tap on Next Button
    And verify the icon for VIN screen
    And Verify the title is coming as "VEHICLE CHASSIS NUMBER"
    And verify the chassis number field
    And verify the Scan Vin button
    And verify the next button
    And User tap on cross button
    And user tap on Yes button from the pop up
    And Press the sign up button
    And Verify the title of as "Login details"

  @SignUp2
  Scenario: Verify that the error message for VIN field
    Given Press the sign up button
    When enter the email in the field as "test.automation26@gmail.com"
    Then user enter the password as "test1234"
    And user enter the coonfirm password as "test1234"
    And user tap on Next Button
    Then Enter the First name as "Farabi"
    And Enter the Last Name as "Dev"
    And Enter the mobile number as "506356678"
    And Enter the City as "Dubai"
    And user tap on Next Button
    And user tap on Next Button
    And verify the Vin error message as "Please enter chassis number"
    And User tap on cross button
    And user tap on Yes button from the pop up
    And Press the sign up button
    And Verify the title of as "Login details"

  @SignUp
  Scenario: Verify the message for already registered email
    Given Press the sign up button
    When enter the email in the field as "iftikhar@farabi.ae"
    Then user enter the password as "test1234"
    And user enter the coonfirm password as "test1234"
    And user tap on Next Button
    And Verify the message as "The provided email is already registered"

  @SignUp
  Scenario: Verify the message for successfull registration
    Given Press the sign up button
    When enter the email in the field as "farabi.develop54@gmail.com"
    Then user enter the password as "test1234"
    And user enter the coonfirm password as "test1234"
    And user tap on Next Button
    Then Enter the First name as "Farabi"
    And Enter the Last Name as "Dev"
    And Enter the mobile number as "506356678"
    And Enter the City as "Dubai"
    And user tap on Next Button
    And verify the message for sucessful registration as "User successfully registered"
    And User tap on cross button
    And user tap on Yes button from the pop up
    And Press the sign up button
    And Verify the title of as "Login details"

  @SignUp
  Scenario: Complete signup process
    Given Press the sign up button
    When enter the email in the field as "iftikhar0007@gmail.com"
    Then user enter the password as "test1234"
    And user enter the coonfirm password as "test1234"
    And user tap on Next Button
    Then Enter the First name as "Iftikhar	"
    And Enter the Last Name as "Hussain"
    And Enter the mobile number as "506385583"
    And Enter the City as "Dubai"
    And user tap on Next Button
    And User Enter the chassis number as "SALGA2DF8FA242214"
    And user tap on Next Button
    And verify the vehicle name as "RANGE ROVER"
    And verify the dealer name as "ALI ALGHANIM & SONS AUTOMOTIVE"
    And verify the Handover date as "2015-09-20"
    And user tap on Start using the application option
    And User tap on Done button
    And verify the weather text
    And user navigate to slide menu
    And User Tap on signout
    And User Tap on Ok button for SignOut
    And Press the sign up button
    And Verify the title of as "Login details"
