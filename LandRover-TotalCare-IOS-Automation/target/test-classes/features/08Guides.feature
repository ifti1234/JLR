Feature: Guides Feature

  @Guides
  Scenario: Verify that user is able to access guides feature and verify the elements
    Given the user is signed in
    When User tap on main menu icon from home screen
    Then User tap on Guides option from slide menu
    And verify that quick start option is available
    And verify that TotalCare HandBook option is available
    And verify that Car Manual option is available
    And verify that FAQ option is available

  @Guides
  Scenario: Verify the quick start guide screen
    Given the user is signed in
    When User tap on main menu icon from home screen
    Then User tap on Guides option from slide menu
    And user tap on quick start option
    And verify the quick start screen header as "quick start guide"

  @Guides
  Scenario: Verify the Hand book screen
    Given the user is signed in
    When User tap on main menu icon from home screen
    Then User tap on Guides option from slide menu
    And user tap on hand book option
    And verify the hand book screen header as "TOTAL CARE HANDBOOK"

  @Guides
  Scenario: Verify the FAQ screen
    Given the user is signed in
    When User tap on main menu icon from home screen
    Then User tap on Guides option from slide menu
    And user tap on FAQ option
    And verify the FAQ screen header as "FAQ"
