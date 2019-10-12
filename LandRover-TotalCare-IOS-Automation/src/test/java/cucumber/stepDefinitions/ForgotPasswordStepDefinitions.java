package cucumber.stepDefinitions;

import com.mobile.app.pages.ForgotPasswordPage;
import com.mobile.core.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ForgotPasswordStepDefinitions extends Base {

	ForgotPasswordPage forgotpasswordpageobj = new ForgotPasswordPage();

	@Given("^User click on Sign In button$")
	public void user_click_on_Sign_In_button() {
		forgotpasswordpageobj.clickSignInButton();
	}

	@When("^User tap on Forgot password$")
	public void user_tap_on_Forgot_password() {
		forgotpasswordpageobj.clickForgotPassword();
	}

	@Then("^Verify the Image logo on forgot password screen is present$")
	public void verify_the_Image_logo_on_forgot_password_screen_is_present() {
		forgotpasswordpageobj.screenImageIcon();
	}

	@Then("^verify the Screen title is present$")
	public void verify_the_Screen_title_is_present() {
		forgotpasswordpageobj.screenHeader();
	}

	@Then("^verify the description text is present$")
	public void verify_the_description_text_is_present() {
		forgotpasswordpageobj.screenDescriptionText();
	}

	@Then("^verify the Email Address field is present$")
	public void verify_the_Email_Address_field_is_present() {
		forgotpasswordpageobj.emailAddressField();
	}

	@Then("^verify the Request One Time Password button is present$")
	public void verify_the_Request_One_Time_Password_button_is_present() {
		forgotpasswordpageobj.requestOneTmePasswordButton();
	}

	@Then("^verify the One Time Password field is present$")
	public void verify_the_One_Time_Password_field_is_present() {
		forgotpasswordpageobj.oneTimePasswordField();
	}

	@Then("^Next button is present$")
	public void next_button_is_present() {
		forgotpasswordpageobj.nextButton();
	}

	@Then("^Tap on Next button$")
	public void tap_on_Next_button() {
		forgotpasswordpageobj.clickonNextButton();
		sleep(1);
	}

	@Then("^verify the error message for Email field as \"([^\"]*)\"$")
	public void verify_the_error_message_for_Email_field_as(String arg1) {
		forgotpasswordpageobj.errorMessageForEmailField(arg1);
	}

	@Then("^verify the one time password field error as \"([^\"]*)\"$")
	public void verify_the_one_time_password_field_error_as(String arg1) {
		forgotpasswordpageobj.errorMessageForOneTimePasswordField(arg1);
	}

	@Then("^Enter the Email as \"(.*)\"$")
	public void enter_the_Email_as(String arg1) {
		forgotpasswordpageobj.enterTheEmail(arg1);
		forgotpasswordpageobj.clickonReturnFromKeyPad();
	}

	@Then("^user tap on Request One Time Password button$")
	public void user_tap_on_Request_One_Time_Password_button() {
		forgotpasswordpageobj.clickonOneTimePasswordButton();
		sleep(1);
	}

	@Then("^verify the error message is shown as \"([^\"]*)\"$")
	public void verify_the_error_message_is_shown_as(String arg1) {
		forgotpasswordpageobj.errorMessageforNonRegisterEmail(arg1);
	}

	@Then("^verify the message as \"([^\"]*)\"$")
	public void verify_the_message_as(String arg1) {
		forgotpasswordpageobj.messageForMailSent(arg1);
		
	}

	@Then("^Enter the Code as \"([^\"]*)\"$")
	public void enter_the_Code_as(String arg1) {
		forgotpasswordpageobj.enterOneTimePassword(arg1);
		forgotpasswordpageobj.clickonReturnFromKeyPad();
	}

	@Then("^verify the error message as \"([^\"]*)\"$")
	public void verify_the_error_message_as(String arg1) {
		forgotpasswordpageobj.errorMessageforWrongCode(arg1);
	}
	
	@Then("^press the OTP button five times$")
	public void press_the_OTP_button_five_times(){
		forgotpasswordpageobj.clickOTPButtonx5();
	}

	@Then("^press the OTP button sixth time and verify the toast message \"([^\"]*)\"$")
	public void press_the_OTP_button_sixth_time_and_verify_the_toast_message(String arg1){
		forgotpasswordpageobj.errorMessagefor6thtimeOTP(arg1);
	}

}
