Feature: Locators Feature From Services

  @Locators
  Scenario: Verify the services options
    Given User Tap on Main Menu Icon
    And User Tap on Services Option
    Then Verify the Locators option is present
    And Verify the Book a Service option is present
    And Verify the Customer care option is present
    And Verify the Road Side Assistance option is present

  @Locators
  Scenario: Verify Locators screen elements
    Given User Tap on Main Menu Icon
    And User Tap on Services Option
    When User Tap on Locators Option
    Then Verify the Locators screen header is present as "LOCATOR"
    And Verify the Search icon is present
    And Verify the showroom option is present
    And Verify the Service option is present
    And Verify the Parts option is present
    And Verify the Gas option is present
    And Verify the ATM option is present

  @Locators
  Scenario: Verify Headers on different options
    Given User Tap on Main Menu Icon
    And User Tap on Services Option
    When User Tap on Locators Option
    Then Verify the Locators screen header is present as "LOCATOR"
    Then User Tap on Showroom option
    And Verify the Showroom header as "SHOWROOM"
    And User Tap on Service option
    And Verify the Service header as "SERVICE CENTER"
    And User Tap on Parts option
    And Verify the Parts header as "PARTS"
    And User Tap on GAS option
    And Verify the GAS header as "GAS STATION"
    And User Tap on ATM option
    And Verify the ATM header as "ATM"

  @Locators
  Scenario: Verify Name and Address of the showroom
    Given User Tap on Main Menu Icon
    And User Tap on Services Option
    When User Tap on Locators Option
    And Verify the Locators screen header is present as "LOCATOR"
    Then Tap on the pin location
    And verify the name of the showroom as "AL TAYER MOTORS - PRE OWNED CARS (AL ITTIHAD)"
    And verify the address of the showroom as "Al Ittihad Road"
    And verify the timing is present as "8:00AM - 8:00PM"
    And verify the DropDown icon is present

  @Locators
  Scenario: Verify Dropdown Menu options
    Given User Tap on Main Menu Icon
    And User Tap on Services Option
    When User Tap on Locators Option
    And Verify the Locators screen header is present as "LOCATOR"
    Then Tap on the pin location
    And user Tap on DropDown Icon
    And Verify that Call option is present
    And Verify that Email option is present
    And Verify that Visit Website option is present
    And Verify that Navigate option is present

  @Locators
  Scenario: Call button From DropDownMenu
    Given User Tap on Main Menu Icon
    And User Tap on Services Option
    When User Tap on Locators Option
    And Verify the Locators screen header is present as "LOCATOR"
    Then Tap on the pin location
    And user Tap on DropDown Icon
    When User Tap on call button
    Then verify the message shown as "Sorry, your device isn't able to make a phone calls"

  @Locators
  Scenario: Navigate From Locators
    Given User Tap on Main Menu Icon
    And User Tap on Services Option
    When User Tap on Locators Option
    And Verify the Locators screen header is present as "LOCATOR"
    Then Tap on the pin location
    And user Tap on DropDown Icon
    When User Tap on navigate button
    Then verify the message for google maps as "Do you want to install Google Maps in order to navigate"

  @Locators
  Scenario: Options for selected service center
    Given User Tap on Main Menu Icon
    And User Tap on Services Option
    When User Tap on Locators Option
    And Verify the Locators screen header is present as "LOCATOR"
    And User Tap on Service option
    And Tap on Service pin location
    And verify the service center name as "AL TAYER MOTORS - GARHOUD"
    And verify the service center address as "Garhoud Atrium Building , Near GGICO Metro Station"
    And user Tap on DropDown Icon
    And Verify that Call option is present
    And Verify that Email option is present
    And Verify that Visit Website option is present
    And Verify that Navigate option is present
    And Verify that Book a service option is present

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

  @Locators
  Scenario: Search with proper text
    Given User Tap on Main Menu Icon
    And User Tap on Services Option
    When User Tap on Locators Option
    And Verify the Locators screen header is present as "LOCATOR"
    And User Tap on Search Icon
    And User Enter text in search field as "Premier"
    Then User Tap on Search Button
    And user select one Pin location of search result
    And verify the name of the searched service center as "PREMIER MOTORS - MUSAFFAH"
    And verify the Address of the searched service center as "Musaffah, Abu Dhabi"
