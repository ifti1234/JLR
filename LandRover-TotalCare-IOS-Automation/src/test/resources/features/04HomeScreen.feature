Feature: Home Screen Test cases

  @HomeScreen
  Scenario: Main screen Elements
    Given User is on Home screen and verify the LR Logo
    And verify that weather text is present
    And verify the Road side assistance button is present
    And verify the customer care button is present
    Then verify the Book a service button is present
    And verify that Locator button is present

  @HomeScreen
  Scenario: Verify Road side Assistance screen
    Given User is on Home screen and verify the LR Logo
    When user click on Road side assistance button
    Then verify the screen header is present as "ROAD SIDE ASSISTANCE"
    And user click Road side assistance button
    And verify road side assistance number is present as "800526376837"

  @HomeScreen
  Scenario: Verify Customer Care screen
    Given User is on Home screen and verify the LR Logo
    When user click on customer care button
    Then verify the header is present as "	CUSTOMER CARE"
    And user click on Customer care button
    And verify Customer care number is present as "+97143098901"

  @HomeScreen
  Scenario: Verify Book a service screen
    Given User is on Home screen and verify the LR Logo
    When user click on Book a service button
    Then verify the book a service screen header is present as "BOOK A SERVICE"
    And user dropdown menu icon is present
    And user click on one pin location
    And verify the name of the service center as "	AL TAYER MOTORS - GARHOUD"
    And verify the address for the center is present as "Garhoud Atrium Building , Near GGICO Metro Station"

  @HomeScreen
  Scenario: Verify Locator screen
    Given User is on Home screen and verify the LR Logo
    When user click on Locators button
    Then verify the screen title for locators as "LOCATOR"
    And verify the search button is available
    And verify the showroom screen title as "SHOWROOM"

  @HomeScreen
  Scenario: Verify user is able to select second car
    Given User is on Home screen and verify the LR Logo
    When user click on car selection Dropdown
    Then verify the title of the pop up as "Choose a default vehicle"
    And verify that add a car button is available
    And User select the Second car
    And User is on Home screen and verify the LR Logo
    

  								
