package cucumber.stepDefinitions;

import com.mobile.app.pages.BookAServicePage;
import com.mobile.core.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BookAServiceStepDefinitions extends Base {

	BookAServicePage BookaServiceObj = new BookAServicePage();

	@Given("^the user is signed in$")
	public void the_user_is_signed_in() {
		BookaServiceObj.verifyTheHomeScreenicon();
	}

	@Given("^tap the side menu button$")
	public void tap_the_side_menu_button() {
		BookaServiceObj.clickMainMenuButton();
	}

	@Given("^tap the BAS button$")
	public void tap_the_BAS_button() {
		BookaServiceObj.clickServicesOption();
		BookaServiceObj.clickBookaServiceOption();
	}

	@Given("^verify that the app directs to the BAS page with title \"([^\"]*)\"$")
	public void verify_that_the_app_directs_to_the_BAS_page_with_title(String arg1) {
		BookaServiceObj.verifyTheHeaderForBookAService(arg1);
	}

	@Given("^tap the BAS button on homepage$")
	public void tap_the_BAS_button_on_homepage() {
		BookaServiceObj.clickBookaServicefromHomeScreen();
	}

	@Then("^User tap on settings options$")
	public void user_tap_on_settings_options() {
		BookaServiceObj.clickSettingsFromSlideMenu();
		
	}

	@Then("^User select customize quick bar button$")
	public void user_select_customize_quick_bar_button() {
		BookaServiceObj.clickCustomizeQuickMenu();
	}

	@Then("^Verify the Book a Service option$")
	public void verify_the_Book_a_Service_option() {
		BookaServiceObj.verifyBookAServicefromCQM();
	}

	@Then("^user click Home button$")
	public void user_click_Home_button() {
		BookaServiceObj.clickMainMenuButton();
		BookaServiceObj.clickHomeFromSlideMenu();
	}

	@Given("^the user is on the BAS page$")
	public void the_user_is_on_the_BAS_page() {
		BookaServiceObj.clickMainMenuButton();
		BookaServiceObj.clickServicesOption();
		BookaServiceObj.clickBookaServiceOption();
	}

	@Given("^verify the subtitle of the page containing text \"([^\"]*)\"$")
	public void verify_the_subtitle_of_the_page_containing_text(String arg1) {
		BookaServiceObj.verifyServiceCenterSubheader();
	}

	@Given("^verify the step navigator$")
	public void verify_the_step_navigator() {
		BookaServiceObj.verifyStepNavigatorchoosecenter();
		BookaServiceObj.verifyStepNavigatorCarDetails();
		BookaServiceObj.verifyStepNavigatorBookingDetails();
		BookaServiceObj.verifyStepNavigatorConfirmation();
	}

	@Given("^verify my location button on the map$")
	public void verify_my_location_button_on_the_map() {
		BookaServiceObj.verifyMyLoacation();
	}

	@Given("^verify the list view button on the top right corner$")
	public void verify_the_list_view_button_on_the_top_right_corner() {
		BookaServiceObj.verifyListViewButton();
	}

	@Then("^User selects Location Options$")
	public void user_selects_Location_Options() {
		BookaServiceObj.clickLocationFromSettings();
	}

	@Then("^Verify the auto detect location is enabled$")
	public void verify_the_auto_detect_location_is_enabled() {
		BookaServiceObj.verifyAutodetectLocation();
	}

	@Then("^User select the service center location$")
	public void user_select_the_service_center_location() {
		BookaServiceObj.clickOnServiceCenterLocation();
	}

	@Then("^verify service centre name containing text \"([^\"]*)\"$")
	public void verify_service_centre_name_containing_text(String arg1) {
		BookaServiceObj.verifyServiceCenterName(arg1);
	}

	@Then("^verify the Address of the center as \"([^\"]*)\"$")
	public void verify_the_Address_of_the_center_as(String arg1) {
		BookaServiceObj.verifyServiceCenterAddress(arg1);
	}

	@Then("^verify the DropDown button shown$")
	public void verify_the_DropDown_button_shown() {
		BookaServiceObj.verifyDropDownButton();
	}

	@Then("^verify the next button displayed$")
	public void verify_the_next_button_displayed() {
		BookaServiceObj.verifyNextButton();
	}

	@Then("^tap the DropDown button$")
	public void tap_the_DropDown_button() {
		BookaServiceObj.clickOnDropDownButton();
	}

	@Then("^verify the call option present as \"([^\"]*)\"$")
	public void verify_the_call_option_present_as(String arg1) {
		BookaServiceObj.verifyCallButton(arg1);
	}

	@Then("^verify the email option preset as \"([^\"]*)\"$")
	public void verify_the_email_option_preset_as(String arg1) {
		BookaServiceObj.verifyEmailButton(arg1);
	}

	@Then("^verify the website option preset as \"([^\"]*)\"$")
	public void verify_the_website_option_preset_as(String arg1) {
		BookaServiceObj.verifyWebsiteButton(arg1);
	}

	@Then("^verify the navigate option preset as \"([^\"]*)\"$")
	public void verify_the_navigate_option_preset_as(String arg1) {
		BookaServiceObj.verifyNavigateButton(arg1);
	}

	@Then("^press the list view button on the top right$")
	public void press_the_list_view_button_on_the_top_right() {
		BookaServiceObj.clickOnlistViewIcon();
	}

	@Then("^verify the title of the page containing text \"([^\"]*)\"$")
	public void verify_the_title_of_the_page_containing_text(String arg1) {
		BookaServiceObj.verifyTheHeaderForBookAService(arg1);
	}

	@Then("^verify the Take me there option preset as \"([^\"]*)\"$")
	public void verify_the_Take_me_there_option_preset_as(String arg1) {
		BookaServiceObj.verifyTakeMeThereButton(arg1);
	}

	@Then("^press the next button on the service centre option$")
	public void press_the_next_button_on_the_service_centre_option() {
		BookaServiceObj.clickOnNextButton();
	}

	@Then("^verify the select car header is present as \"([^\"]*)\"$")
	public void verify_the_select_car_header_is_present_as(String arg1) {
		BookaServiceObj.verifySecondScreenHeader(arg1);
	}

	@Then("^tap the DropDown button from list view$")
	public void tap_the_DropDown_button_from_list_view() {
		BookaServiceObj.clickOnDropDownIconfromListView();
	}

	@Then("^select the centre name with text \"([^\"]*)\"$")
	public void select_the_centre_name_with_text(String arg1) {
		BookaServiceObj.clickOnServiceCenterfromListView(arg1);
	}

	@Then("^verify the plate number field$")
	public void verify_the_plate_number_field() {
		BookaServiceObj.verifyPlateNumberField();
	}

	@Then("^verify the mileage field$")
	public void verify_the_mileage_field() {
		BookaServiceObj.verifyMileageField();
	}

	@Then("^verify the next button of the car details page$")
	public void verify_the_next_button_of_the_car_details_page() {
		BookaServiceObj.verifyCarDetailsScreenNextButton();
	}

	@Then("^verify the car selector$")
	public void verify_the_car_selector() {
		BookaServiceObj.verifyCarDetailsCarSelector();
	}

	@Then("^enter the mileage as \"([^\"]*)\"$")
	public void enter_the_mileage_as(String arg1) {
		BookaServiceObj.EnterMileage(arg1);
		BookaServiceObj.clickDoneToDismissNumpad();
	}

	@Then("^User tap on next button$")
	public void user_tap_on_next_button() {
		BookaServiceObj.clicknextButton();
		sleep(1);
	}

	@Then("^verify the error displayed \"([^\"]*)\"$")
	public void verify_the_error_displayed(String arg1) {
		BookaServiceObj.verifyErrorMessageForMileage(arg1);
	}

	@Then("^User clear the Plate number$")
	public void user_clear_the_Plate_number() {
		BookaServiceObj.clearPlateNumberField();
		BookaServiceObj.clickReturnButton();
	}

	@Then("^verify the error for plate number field \"([^\"]*)\"$")
	public void verify_the_error_for_plate_number_field(String arg1) {
		BookaServiceObj.verifyErrorMessageForPlateNoField(arg1);
	}

	@Then("^User enter the plate number as \"([^\"]*)\"$")
	public void user_enter_the_plate_number_as(String arg1) {
		BookaServiceObj.EnterPlateNumber(arg1);
		BookaServiceObj.clickReturnButton();
	}

	@Then("^verify the error for mileage field \"([^\"]*)\"$")
	public void verify_the_error_for_mileage_field(String arg1) {
		BookaServiceObj.verifyErrorForMileageField(arg1);
	}

	@Then("^Verify the screen subtitle as \"([^\"]*)\"$")
	public void verify_the_screen_subtitle_as(String arg1) {
		BookaServiceObj.verifyThirdScreenSubTitle();
	}

	@Then("^verify the preferred date field$")
	public void verify_the_preferred_date_field() {
		BookaServiceObj.verifyPreferredDateField();
	}

	@Then("^verify the preferred time field$")
	public void verify_the_preferred_time_field() {
		BookaServiceObj.verifyPreferredTimeField();
	}

	@Then("^verify the text description \"([^\"]*)\"$")
	public void verify_the_text_description(String arg1) {
		BookaServiceObj.verifyBookingDetailsDisclaimer(arg1);
	}

	@Then("^verify the camera icon$")
	public void verify_the_camera_icon() {
		BookaServiceObj.verifyCameraIcon();
	}

	@Then("^verify the additional information box$")
	public void verify_the_additional_information_box() {
		BookaServiceObj.verifyAdditionalInfoBox();
	}

	@Then("^verify the next button on the third step of BAS$")
	public void verify_the_next_button_on_the_third_step_of_BAS() {
		BookaServiceObj.verifyCarDetailsScreenNextButton();
	}

	@Then("^Verify the error message for preferred date as\"([^\"]*)\"$")
	public void verify_the_error_message_for_preferred_date_as(String arg1) {
		BookaServiceObj.verifyPreferredDateErrorMessage(arg1);
	}
	
	@Then("^user selects the date$")
	public void user_selects_the_date(){
		BookaServiceObj.clickDoneToDismissNumpad();
	}

	@Then("^Verify the error message for preferred Time as\"([^\"]*)\"$")
	public void verify_the_error_message_for_preferred_Time_as(String arg1) {
		BookaServiceObj.verifyPreferredTimeErrorMessage(arg1);
	}

	@Then("^User tap into the preferred date field$")
	public void user_tap_into_the_preferred_date_field() {
		BookaServiceObj.clickintopreferredDateField();
	}

	@Then("^User tap into the preferred Time field$")
	public void user_tap_into_the_preferred_Time_field() {
		BookaServiceObj.clickintopreferredTimeField();
	}

	@Then("^user select the time as \"([^\"]*)\"$")
	public void user_select_the_time_as(String arg1) {
		BookaServiceObj.SetTheTimeas(arg1);
		BookaServiceObj.clickDoneToDismissNumpad();
	}

	@Then("^verify the subtitle as \"([^\"]*)\"$")
	public void verify_the_subtitle_as(String arg1) {
		BookaServiceObj.verifyConfirmationscreenSubtitle();
	}

	@Then("^verify that the Model & year is present as \"([^\"]*)\"$")
	public void verify_that_the_Model_year_is_present_as(String arg1) {
		BookaServiceObj.confirmationscreenModelandYearvalue(arg1);
	}

	@Then("^verify that the Plate Number is present as \"([^\"]*)\"$")
	public void verify_that_the_Plate_Number_is_present_as(String arg1) {
		BookaServiceObj.confirmationscreenPlateNumbervalue(arg1);
	}

	@Then("^verify that the Mileage is present as \"([^\"]*)\"$")
	public void verify_that_the_Mileage_is_present_as(String arg1) {
		BookaServiceObj.confirmationscreenMileagevalue(arg1);
	}

	@Then("^verify that the preferred Time is present as \"([^\"]*)\"$")
	public void verify_that_the_preferred_Time_is_present_as(String arg1) {
		BookaServiceObj.confirmationscreenpreferredTimevalue(arg1);
	}

	@Then("^verify that Submit button is present$")
	public void verify_that_Submit_button_is_present() {
		BookaServiceObj.confirmationscreenSubmitbutton();
	}

	@Then("^User tap on cross button from confirmation screen$")
	public void user_tap_on_cross_button_from_confirmation_screen() {
		BookaServiceObj.confirmationscreenCrossbutton();
	}

	@Then("^Verify the home screen logo$")
	public void verify_the_home_screen_logo() {
		BookaServiceObj.verifyTheHomeScreenicon();
	}
	
	@Then("^User tap on submit button$")
	public void user_tap_on_submit_button(){
		BookaServiceObj.clickSubmitButton();
		
	}

	@Then("^verify the message after successful service booking is shown as \"([^\"]*)\"$")
	public void verify_the_message_after_successful_service_booking_is_shown_as(String arg1){
		BookaServiceObj.verifySuccessfulServiceMessage(arg1);
	}
	
}
