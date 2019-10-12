package cucumber.stepDefinitions;

import com.mobile.app.pages.SignupPage;
import com.mobile.core.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpStepDefinitions extends Base {

	SignupPage SignUpPageObject = new SignupPage();

	@Given("^Press the sign up button$")
	public void press_the_sign_up_button() {
		SignUpPageObject.clickonsignupButton();
	}

	@Given("^Verify the title of as \"([^\"]*)\"$")
	public void verify_the_title_of_as(String arg1) {
		SignUpPageObject.loginDetailsText(arg1);
	}

	@Then("^verify the sign up icon image$")
	public void verify_the_sign_up_icon_image() {
		SignUpPageObject.signupImageIcon();
	}

	@Then("^verify the title on the top \"([^\"]*)\"$")
	public void verify_the_title_on_the_top(String arg1) {
		SignUpPageObject.loginDetailsText(arg1);
	}

	@Then("^verify the email address field$")
	public void verify_the_email_address_field() {
		SignUpPageObject.emailAddressField();
	}

	@Then("^verify the password field$")
	public void verify_the_password_field() {
		SignUpPageObject.passwordField();
	}

	@Then("^verify the confirm password$")
	public void verify_the_confirm_password() {
		SignUpPageObject.confirmPasswordField();
	}

	@Then("^verify the description text for the password$")
	public void verify_the_description_text_for_the_password() {
		SignUpPageObject.descriptionText();
	}

	@Then("^verify the next button$")
	public void verify_the_next_button() {
		SignUpPageObject.nextButton();
	}

	@Then("^verify the cross on the top right$")
	public void verify_the_cross_on_the_top_right() {
		SignUpPageObject.crossIcon();
	}

	@When("^enter the email in the field as \"([^\"]*)\"$")
	public void enter_the_email_in_the_field_as(String arg1) {
		SignUpPageObject.enterEmail(arg1);
		SignUpPageObject.clickOnReturnButton();
	}

	@Then("^user enter the password as \"([^\"]*)\"$")
	public void user_enter_the_password_as(String arg1) {
		SignUpPageObject.enterpassword(arg1);
		SignUpPageObject.clickOnReturnButton();
	}

	@Then("^user enter the coonfirm password as \"([^\"]*)\"$")
	public void user_enter_the_coonfirm_password_as(String arg1) {
		SignUpPageObject.enterconfirmpassword(arg1);
		SignUpPageObject.clickOnReturnButton();
	}

	@Then("^user tap on Next Button$")
	public void user_tap_on_Next_Button() {
		SignUpPageObject.clickNextButton();
		sleep(2);
	}

	@Then("^verify the title as \"([^\"]*)\"$")
	public void verify_the_title_as(String arg1) {
		SignUpPageObject.personalDetailsScreentitle(arg1);
	}

	@Then("^Verify the error message shown as \"([^\"]*)\"$")
	public void verify_the_error_message_shown_as(String arg1) {
		SignUpPageObject.emailErrorMessage(arg1);
	}

	@Then("^user tap on coss icon$")
	public void user_tap_on_coss_icon() {
		SignUpPageObject.clickonCrossIcon();
	}

	@When("^Enter the password and confirm password as \"([^\"]*)\"$")
	public void enter_the_password_and_confirm_password_as(String arg1) {
		SignUpPageObject.enterpassword(arg1);
		SignUpPageObject.enterconfirmpassword(arg1);
		SignUpPageObject.clickOnReturnButton();
	}

	@Then("^user tap on next button$")
	public void user_tap_on_next_button() {
		SignUpPageObject.clickNextButton();
	}

	@Then("^verify the error \"([^\"]*)\"$")
	public void verify_the_error(String arg1) {
		SignUpPageObject.emptyEmailfielderrormessage(arg1);
	}

	@Then("^verify the error message \"([^\"]*)\"$")
	public void verify_the_error_message(String arg1) {
		SignUpPageObject.emptyconfirmpasswordfielderror(arg1);
	}

	@Then("^verify the error of the current screen \"([^\"]*)\"$")
	public void verify_the_error_of_the_current_screen(String arg1) {
		SignUpPageObject.mismatchpasswordserrormessage(arg1);
	}

	@Then("^verify the icon of the second sign up page$")
	public void verify_the_icon_of_the_second_sign_up_page() {
		SignUpPageObject.imageIconOnPersonalDetailsScreen();
	}

	@Then("^verify the first name text field$")
	public void verify_the_first_name_text_field() {
		SignUpPageObject.firstNameField();
	}

	@Then("^verify the last name text field$")
	public void verify_the_last_name_text_field() {
		SignUpPageObject.lastNameField();
	}

	@Then("^verify the country of residence drop down$")
	public void verify_the_country_of_residence_drop_down() {
		SignUpPageObject.countryOfResidence();
	}

	@Then("^verify the mobile number fields$")
	public void verify_the_mobile_number_fields() {
		SignUpPageObject.phoneNumberField();
	}

	@Then("^verify the city text field$")
	public void verify_the_city_text_field() {
		SignUpPageObject.cityField();
	}

	@Then("^verify the error message for First name as \"([^\"]*)\"$")
	public void verify_the_error_message_for_First_name_as(String arg1) {
		SignUpPageObject.firstNameFieldErrorMessage(arg1);

	}

	@Then("^verify the error message for Last name as \"([^\"]*)\"$")
	public void verify_the_error_message_for_Last_name_as(String arg1) {
		SignUpPageObject.lastNameFieldErrorMessage(arg1);

	}

	@Then("^verify the error message for Phone number field as \"([^\"]*)\"$")
	public void verify_the_error_message_for_Phone_number_field_as(String arg1) {
		SignUpPageObject.phoneFieldErrorMessage(arg1);
	}

	@Then("^verify the error message for City field as \"([^\"]*)\"$")
	public void verify_the_error_message_for_City_field_as(String arg1) {
		SignUpPageObject.cityFieldErrorMessage(arg1);
	}

	@Then("^Enter the First name as \"([^\"]*)\"$")
	public void enter_the_First_name_as(String arg1) {
		SignUpPageObject.enterFirstName(arg1);
		SignUpPageObject.clickOnReturnButton();
	}

	@Then("^Enter the Last Name as \"([^\"]*)\"$")
	public void enter_the_Last_Name_as(String arg1) {
		SignUpPageObject.enterLastName(arg1);
		SignUpPageObject.clickOnReturnButton();
	}

	@Then("^Enter the mobile number as \"([^\"]*)\"$")
	public void enter_the_mobile_number_as(String arg1) {
		SignUpPageObject.entermobilenumber(arg1);
		SignUpPageObject.clickOnDoneToDismissNumPad();
	}

	@Then("^Enter the City as \"([^\"]*)\"$")
	public void enter_the_City_as(String arg1) {
		SignUpPageObject.entercity(arg1);
		SignUpPageObject.clickOnReturnButton();
	}

	@Then("^verify the icon for VIN screen$")
	public void verify_the_icon_for_VIN_screen() {
		SignUpPageObject.barCodeIcon();
	}

	@Then("^Verify the title is coming as \"([^\"]*)\"$")
	public void verify_the_title_is_coming_as(String arg1) {
		SignUpPageObject.chassisNumberTitle(arg1);
	}

	@Then("^verify the chassis number field$")
	public void verify_the_chassis_number_field() {
		SignUpPageObject.chassisNumberField();
	}

	@Then("^verify the Scan Vin button$")
	public void verify_the_Scan_Vin_button() {
		SignUpPageObject.registrationButton();
	}

	@Then("^verify the Vin error message as \"([^\"]*)\"$")
	public void verify_the_Vin_error_message_as(String arg1) {
		SignUpPageObject.vinfielderrormessage(arg1);
	}

	@Then("^User tap on cross button$")
	public void user_tap_on_cross_button() {
		SignUpPageObject.clickCrosIcon();
	}

	@Then("^user tap on Yes button from the pop up$")
	public void user_tap_on_Yes_button_from_the_pop_up() {
		SignUpPageObject.popupYesButton();
	}

	@Then("^Verify the message as \"([^\"]*)\"$")
	public void verify_the_message_as(String arg1) {
		SignUpPageObject.alreadyregisteredEmailMessage(arg1);
	}

	@Then("^user click on scan Vin button$")
	public void user_click_on_scan_Vin_button() {
		SignUpPageObject.scanVehicleRegistrationCardButton();
	}

	@Then("^verify the message for sucessful registration as \"([^\"]*)\"$")
	public void verify_the_message_for_sucessful_registration_as(String arg1) {
		SignUpPageObject.userSuccessfullyRegisteredMessage(arg1);
	}

	@Then("^User Enter the chassis number as \"([^\"]*)\"$")
	public void user_Enter_the_chassis_number_as(String arg1) {
		SignUpPageObject.enterChassisNumber(arg1);
		SignUpPageObject.clickOnReturnButton();
	}

	@Then("^verify the vehicle name as \"([^\"]*)\"$")
	public void verify_the_vehicle_name_as(String arg1) {
		SignUpPageObject.verifyTheVehicleModel(arg1);

	}

	@Then("^verify the dealer name as \"([^\"]*)\"$")
	public void verify_the_dealer_name_as(String arg1) {
		SignUpPageObject.verifyTheVehicleDealer(arg1);

	}

	@Then("^verify the Handover date as \"([^\"]*)\"$")
	public void verify_the_Handover_date_as(String arg1) {
		SignUpPageObject.verifyTheVehicleHandOverDate(arg1);

	}

	@Then("^user tap on Start using the application option$")
	public void user_tap_on_Start_using_the_application_option() {
		SignUpPageObject.clickOnStartUsingTheApplication();

	}

	@Then("^User tap on Done button$")
	public void user_tap_on_Done_button() {
		SignUpPageObject.clickOnDoneButton();

	}

	@Then("^verify the weather text$")
	public void verify_the_weather_text() {
		SignUpPageObject.verifyTheWeatherText();

	}

	@Then("^user navigate to slide menu$")
	public void user_navigate_to_slide_menu() {
		SignUpPageObject.clickOnMainMenuIcon();
	}

	@Then("^User Tap on signout$")
	public void user_Tap_on_signout() {
		SignUpPageObject.clickOnSignOutButton();
	}

	@Then("^User Tap on Ok button for SignOut$")
	public void user_Tap_on_Ok_button_for_SignOut() {
		SignUpPageObject.clickOnOKbuttonTosignout();
	}

}
