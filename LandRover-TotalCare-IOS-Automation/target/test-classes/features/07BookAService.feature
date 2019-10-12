Feature: Book A Service Feature

  @BAS
  Scenario: Verify the user directed to BAS page when accessed from the side menu
    Given the user is signed in
    And tap the side menu button
    And tap the BAS button
    And verify that the app directs to the BAS page with title "BOOK A SERVICE"

  @BAS
  Scenario: Verify the user is directed to the BAS page when accessed from the bottom menu
    Given the user is signed in
    And tap the side menu button
    Then User tap on settings options
    And User select customize quick bar button
    And Verify the Book a Service option
    And user click Home button
    And tap the BAS button on homepage
    And verify that the app directs to the BAS page with title "BOOK A SERVICE"

  @BAS
  Scenario: Verify the design of the first page of BAS
    Given the user is signed in
    Given the user is on the BAS page
    And verify that the app directs to the BAS page with title "BOOK A SERVICE"
    And verify the subtitle of the page containing text "Service Centre"
    And verify the step navigator
    And verify my location button on the map
    And verify the list view button on the top right corner

  @BAS
  Scenario: Verify that Auto detect location is enabled
    Given the user is signed in
    Then tap the side menu button
    And User tap on settings options
    And User selects Location Options
    And Verify the auto detect location is enabled

  @BAS
  Scenario: Verify the details when a service centre is selected
    Given the user is signed in
    Given the user is on the BAS page
    Then User select the service center location
    And verify service centre name containing text "AL TAYER MOTORS - GARHOUD"
    And verify the Address of the center as "Garhoud Atrium Building , Near GGICO Metro Station"
    And verify the DropDown button shown
    And verify the next button displayed

  @BAS
  Scenario: Verify the different options displayed when the Dropdown button is pressed and pop up is displayed
    Given the user is signed in
    Then the user is on the BAS page
    Then User select the service center location
    And tap the DropDown button
    And verify the call option present as "Call"
    And verify the email option preset as "Email"
    And verify the website option preset as "Visit website"
    And verify the navigate option preset as "Navigate"

  @BAS
  Scenario: verify when the user selects the list view button the service centre name, address are displayed
    Given the user is signed in
    Then the user is on the BAS page
    And press the list view button on the top right
    And verify the subtitle of the page containing text "Service Centre"
    And verify service centre name containing text "AL TAYER MOTORS - GARHOUD"
    And verify the Address of the center as "Garhoud Atrium Building , Near GGICO Metro Station"
    And verify the DropDown button shown

  @BAS
  Scenario: Verify the contact us pop up displayed when accessed thorugh the list view button on the top right
    Given the user is signed in
    Then the user is on the BAS page
    And press the list view button on the top right
    And tap the DropDown button from list view
    And verify the call option present as "Call"
    And verify the email option preset as "Email"
    And verify the website option preset as "Visit website"
    And verify the navigate option preset as "Navigate"
    And verify the Take me there option preset as "Take Me There"

  @BAS
  Scenario: Verify the second step of car details can be reached by using the button the map in the first step
    Given the user is signed in
    Then the user is on the BAS page
    And User select the service center location
    And press the next button on the service centre option
    And verify the title of the page containing text "BOOK A SERVICE"
    And verify the select car header is present as "SELECT CAR"

  @BAS
  Scenario: Verify the second step of the car details can be reached by the list view button in the first step
    Given the user is signed in
    Then the user is on the BAS page
    And press the list view button on the top right
    And select the centre name with text "AL TAYER MOTORS - GARHOUD"
    And verify the title of the page containing text "BOOK A SERVICE"
    And verify the select car header is present as "SELECT CAR"

  @BAS
  Scenario: Verify the cars details page when booking a service
    Given the user is signed in
    Then the user is on the BAS page
    And User select the service center location
    And press the next button on the service centre option
    And verify the title of the page containing text "BOOK A SERVICE"
    And verify the select car header is present as "SELECT CAR"
    And verify the step navigator
    And verify the car selector
    And verify the plate number field
    And verify the mileage field
    And verify the next button of the car details page

  @BAS
  Scenario: Verify the error when the mileage entered is less than five hundred
    Given the user is signed in
    Then the user is on the BAS page
    And User select the service center location
    And press the next button on the service centre option
    And verify the title of the page containing text "BOOK A SERVICE"
    And enter the mileage as "499"
    And User tap on next button
    And verify the error displayed "Mileage must be at least 500 KM"

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

  @BAS
  Scenario: Verify the 3rd step of book a service
    Given the user is signed in
    Then the user is on the BAS page
    And User select the service center location
    And press the next button on the service centre option
    And verify the title of the page containing text "BOOK A SERVICE"
    And enter the mileage as "501"
    Then User tap on next button
    And Verify the screen subtitle as "BOOKING DETAILS"
    And verify the preferred date field
    And verify the preferred time field
    And verify the text description "Specified Date and Time are subject to availability"
    And verify the camera icon
    And verify the additional information box
    And verify the next button on the third step of BAS

  @BAS
  Scenario: Verify the error messages for Date and Time fields
    Given the user is signed in
    Then the user is on the BAS page
    And User select the service center location
    And press the next button on the service centre option
    And enter the mileage as "501"
    Then User tap on next button
    And Verify the screen subtitle as "BOOKING DETAILS"
    And User tap on next button
    And Verify the error message for preferred date as"Please select Preferred Date"
    Then User tap into the preferred date field
    And user selects the date
    And User tap on next button
    And Verify the error message for preferred Time as"Please select Preferred Time"

  @BAS
  Scenario: Verify that user is able to navigate to Confirmation screen
    Given the user is signed in
    Then the user is on the BAS page
    And User select the service center location
    And press the next button on the service centre option
    And enter the mileage as "501"
    Then User tap on next button
    And Verify the screen subtitle as "BOOKING DETAILS"
    Then User tap into the preferred date field
    And user selects the date
    Then User tap into the preferred Time field
    And user select the time as "08:30 AM"
    And User tap on next button
    And verify the subtitle as "CHOOSE CENTER"

  @BAS
  Scenario: Verify the elements on Confirmation screen
    Given the user is signed in
    Then the user is on the BAS page
    And User select the service center location
    And press the next button on the service centre option
    And enter the mileage as "501"
    Then User tap on next button
    And Verify the screen subtitle as "BOOKING DETAILS"
    Then User tap into the preferred date field
    And user selects the date
    Then User tap into the preferred Time field
    And user select the time as "08:30 AM"
    And User tap on next button
    And verify the subtitle as "CHOOSE CENTER"
    And verify that the Model & year is present as "Range Rover Sport - 2015"
    And verify that the Plate Number is present as "12345"
    And verify that the Mileage is present as "501 KM"
    And verify that the preferred Time is present as "08:30 AM"
    And verify that Submit button is present

  @BAS
  Scenario: Verify that on cross button user should be redirected to Home screen
    Given the user is signed in
    Then the user is on the BAS page
    And User select the service center location
    And press the next button on the service centre option
    And enter the mileage as "501"
    Then User tap on next button
    And Verify the screen subtitle as "BOOKING DETAILS"
    Then User tap into the preferred date field
    And user selects the date
    Then User tap into the preferred Time field
    And user select the time as "08:30 AM"
    And User tap on next button
    And verify the subtitle as "CHOOSE CENTER"
    Then User tap on cross button from confirmation screen
    And Verify the home screen logo

  @BAS
  Scenario: Successfull Service Booking
    Given the user is signed in
    Then the user is on the BAS page
    And User select the service center location
    And press the next button on the service centre option
    And enter the mileage as "501"
    Then User tap on next button
    And Verify the screen subtitle as "BOOKING DETAILS"
    Then User tap into the preferred date field
    And user selects the date
    Then User tap into the preferred Time field
    And user select the time as "08:30 AM"
    And User tap on next button
    And verify the subtitle as "CHOOSE CENTER"
    Then User tap on submit button
    And verify the message after successful service booking is shown as "Request received, we'll contact you to confirm your appointment within 1-2 working days"
