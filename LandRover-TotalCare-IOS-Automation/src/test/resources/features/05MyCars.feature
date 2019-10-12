Feature: My cars features testing

  @mycars1
  Scenario: Verify that user is able to navigate to MyCars screen
    Given User tap on main menu icon from home screen
    When User tap on My cars option from slide menu
    And verify the screen title is present as "MY CARS"

  @mycars
  Scenario: Verify the car details are present
    Given User tap on main menu icon from home screen
    When User tap on My cars option from slide menu
    And verify the screen title is present as "MY CARS"
    And verify the Delete Car icon in present
    And verify the Add car icon is present
    And Verify the Car Model is coming as "	RANGE ROVER - 2015"
    And Verify the car Handover date as "Handover Date - 2015-06-21"
    Then Verify the VIN number as "SALGA2DF8FA219628"
    And verify the country as "Egypt"
    And verify the showroom name as "mm group for industry & intl. trade"

  @mycars
  Scenario: Cancel to Delete a car
    Given User tap on main menu icon from home screen
    When User tap on My cars option from slide menu
    And verify the screen title is present as "MY CARS"
    And user tap on Delete car button
    And verify the pop up message as "Are you sure you want to delete this car"
    And user tap on No button
    Then verify the screen title is present as "MY CARS"

  @mycars
  Scenario: Deleting a car
    Given User tap on main menu icon from home screen
    When User tap on My cars option from slide menu
    And verify the screen title is present as "MY CARS"
    And user tap on Delete car button
    And verify the pop up message as "Are you sure you want to delete this car"
    And user tap on Yes button
    Then verify the successful delete car message as "The selected car has been deleted successfully"

  @mycars
  Scenario: Error message for chassis number field
    Given User tap on main menu icon from home screen
    When User tap on My cars option from slide menu
    And verify the screen title is present as "MY CARS"
    Then user tap on Add car button
    And verify the Vehicle chassis number header is present as "VEHICLE CHASSIS NUMBER"
    And user tap on Next button
    And verify the field error message is present as "Please enter chassis number"

  @mycars
  Scenario: Adding a car
    Given User tap on main menu icon from home screen
    When User tap on My cars option from slide menu
    And verify the screen title is present as "MY CARS"
    Then user tap on Add car button
    And verify the Vehicle chassis number header is present as "VEHICLE CHASSIS NUMBER"
    And user enter the chassis number as "SALGA2DF8FA219628"
    And user tap on Next button
    And verify the congratulations message as "You have completed your registration."
    And verify the screen header as "VEHICLE CHASSIS NUMBER"
    And verify the Model of the car is "RANGE ROVER"
    And verify the Dealer name as "MM GROUP FOR INDUSTRY & INTL. TRADE"
    And verify the Vehicle Handover date as "2015-06-21"
    Then click on Return to my cars option
    And user tap on Done button for add vehicle
    And verify the screen title is present as "MY CARS"

  @mycars
  Scenario: Verify the Add Information flow
    Given User tap on main menu icon from home screen
    When User tap on My cars option from slide menu
    And verify the screen title is present as "MY CARS"
    Then click on add more Information button
    And verify the Info Icon
    And verify the car name screen title is present as "GIVE YOUR CAR A NAME"
    And Enter the car name as "RangeRover"
    And click on Next button
    And verify the Info Icon
    And verify the plate number screen title is present as "ADD CAR PLATE NUMBER"
    And Enter plate number as "542741"
    And click on Next button
    And verify the Info Icon
    And verify the Car Registration screen title is present as "CAR REGISTRATION EXPIRATION DATE"
    And verify the disclaimer for registration renewal as "REMIND ME FOR REGISTRATION RENEWAL"
    And tap on the Registration date field
    And user select the month as "December"
    And user select the date as "16"
    And user select the Year as "2018"
    And user tap on Done button
    And click on Next button
    And verify the Info Icon
    And verify the car insurance title is present as "CAR INSURANCE EXPIRATION DATE"
    And verify the disclaimer for INSURANCE renewal as "REMIND ME FOR INSURANCE RENEWAL"
    And tap on the Insurance date field
    And user select the month as "November"
    And user select the date as "16"
    And user select the Year as "2018"
    And user tap on Done button
    And click on Next button
    And verify the Info Icon
    And verify the final screen info is present as "ADDITIONAL INFO"
    And user select the customer type as Owner
    And user select the car purchased as New
    And tap on the Done button
    And verify the success message as "Car info has been updated"

  @mycars
  Scenario: Verify the Edit Information elements are present
    Given User tap on main menu icon from home screen
    When User tap on My cars option from slide menu
    And verify the screen title is present as "MY CARS"
    Then click on Edit Information button
    And verify the Info Icon
    And verify the car name screen title is present as "GIVE YOUR CAR A NAME"
    And click on Next button
    And verify the Info Icon
    And verify the plate number screen title is present as "ADD CAR PLATE NUMBER"
    And click on Next button
    And verify the Info Icon
    And verify the Car Registration screen title is present as "CAR REGISTRATION EXPIRATION DATE"
    And verify the disclaimer for registration renewal as "REMIND ME FOR REGISTRATION RENEWAL"
    And click on Next button
    And verify the Info Icon
    And verify the car insurance title is present as "CAR INSURANCE EXPIRATION DATE"
    And verify the disclaimer for INSURANCE renewal as "REMIND ME FOR INSURANCE RENEWAL"
    And click on Next button
    And verify the Info Icon
    And verify the final screen info is present as "ADDITIONAL INFO"
    And tap on the Done button
    And verify the success message as "Car info has been updated"

  @mycars1
  Scenario: Verify the change the image options
    Given User tap on main menu icon from home screen
    When User tap on My cars option from slide menu
    And verify the screen title is present as "MY CARS"
    And tap on car image section
    And verify the first option for changing the image as "Camera"
    And verify the Second option for changing the image as "Choose From Library"

  @mycars1
  Scenario: Verify user is able to change the image for car
    Given User tap on main menu icon from home screen
    When User tap on My cars option from slide menu
    And verify the screen title is present as "MY CARS"
    And tap on car image section
    And user select the camera icon for image
    And user click the image using camera
    And user tap on use photo option
    And verify the screen title is present as "MY CARS"
    
  #@mycars (on changing the image getting error message "Network connection is lost") so this test case is failing
  #Scenario: Verify user is able to revert the image to default one
    #Given User tap on main menu icon from home screen
    #When User tap on My cars option from slide menu
    #And verify the screen title is present as "MY CARS"
    #And tap on car image section
    #And user tap on default image option
    #And verify the pop up is diplaye with text "Are you sure you want to delete this car image?"
    #And user tap on Yes button
    #And verify the screen title is present as "MY CARS"
