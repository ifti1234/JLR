Feature: To test failed cases


  @Locators
  Scenario: Search with Junk text
    Given User Tap on Main Menu Icon
    And User Tap on Services Option
    When User Tap on Locators Option
    And Verify the Locators screen header is present as "LOCATOR"
    And User Tap on Search Icon
    And User Enter text in search field as "heheheheheheh"
    And User Tap on Search Button
    And verify the No Result error message as "No Result Found"

  @BAS
  Scenario: Verify the error messages for empty plate number and mileage field
    Given the user is signed in
    Then the user is on the BAS page
    And User select the service center location
    And press the next button on the service centre option
    And verify the title of the page containing text "BOOK A SERVICE"
    And User clear the Plate number
    Then User tap on next button
    And verify the error for plate number field "Please enter Plate Number"
    And User enter the plate number as "12345"
    Then User tap on next button
    And verify the error for mileage field "Please enter mileage"

 