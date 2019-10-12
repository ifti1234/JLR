package cucumber.stepDefinitions;

import com.mobile.app.pages.LoginPage;
import com.mobile.core.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinitions extends Base {

	LoginPage loginpageobject = new LoginPage();

	@Given("^User Tap on signin Button$")
	public void user_Tap_on_signin_Button() {

		loginpageobject.clickSignInButton();
	}

	@Then("^verify that signin icon is present$")
	public void verify_that_signin_icon_is_present() {

		loginpageobject.checkSignInIcon();
	}

	@Then("^verify that signin title is present$")
	public void verify_that_signin_title_is_present() {

		loginpageobject.checkSignInTitle();
	}

	@Then("^verify that Land Rover title is present$")
	public void verify_that_Land_Rover_title_is_present() {

		loginpageobject.checkTotalCareTitle();
	}

	@Then("^Verify that Email address field is present$")
	public void verify_that_Email_address_field_is_present() {

		loginpageobject.checkEmailAddressField();
	}

	@Then("^Verify that Password field is present$")
	public void verify_that_Password_field_is_present() {

		loginpageobject.checkPasswordField();
	}

	@Then("^Verify that Forgot password label is present$")
	public void verify_that_Forgot_password_label_is_present() {

		loginpageobject.checkForgotPasswordlabel();
	}

	@Then("^Verify that Next button is present$")
	public void verify_that_Next_button_is_present() {

		loginpageobject.nextButton();
	}

	@When("^user tap on Next button$")
	public void user_tap_on_Next_button() {
		loginpageobject.clickNextButton();
		sleep(2);
	}

	@Then("^verify the error message with email field is present as \"([^\"]*)\"$")
	public void verify_the_error_message_with_email_field_is_present_as(String arg1) {
		loginpageobject.emailFieldErrorMessage(arg1);
		sleep(2);

	}

	@Then("^verify the error message with password field is present as \"([^\"]*)\"$")
	public void verify_the_error_message_with_password_field_is_present_as(String arg1) {
		loginpageobject.passwordFieldErrorMessage(arg1);

	}

	@When("^user tap on cross button$")
	public void user_tap_on_cross_button() {
		loginpageobject.clickCrossIcon();
	}

	@Then("^verify the sign in button$")
	public void verify_the_sign_in_button() {
		loginpageobject.checkSigninButton();
	}

	@Given("^Enter the email as \"([^\"]*)\"$")
	public void enter_the_email_as(String arg1) {
		loginpageobject.enterEmail(arg1);
		loginpageobject.clickOnReturnButton();
	}

	@Given("^Enter the password as \"([^\"]*)\"$")
	public void enter_the_password_as(String arg1) {
		loginpageobject.enterPassword(arg1);
		loginpageobject.clickOnReturnButton();
	}

	@Then("^verify the error message shown as \"([^\"]*)\"$")
	public void verify_the_error_message_shown_as(String arg1) {
		loginpageobject.invalidEmailErrorMessage(arg1);
		sleep(2);
	}

	@Given("^User enters the email address as \"([^\"]*)\"$")
	public void user_enters_the_email_address_as(String email) {
		loginpageobject.enterEmailToLogIn(email);

	}

	@Given("^User enters the password as \"([^\"]*)\"$")
	public void user_enters_the_password_as(String arg1) {
		loginpageobject.enterPasswordToLogIn(arg1);

	}

	@Then("^verify the message for not registered email as \"([^\"]*)\"$")
	public void verify_the_message_for_not_registered_email_as(String arg1) {
		loginpageobject.emailNotRegisteredMessage(arg1);
	}

	@Then("^verify the message for incorrect password as \"([^\"]*)\"$")
	public void verify_the_message_for_incorrect_password_as(String arg1) {
		loginpageobject.incorrectPasswordMessage(arg1);
	}

	@Then("^verify the Weather Text on home screen$")
	public void verify_the_Weather_Text_on_home_screen() {
		loginpageobject.homeScreenWeatherText();
		sleep(5);
	}

}
