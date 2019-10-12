package com.mobile.app.pages;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import com.mobile.app.pageObjects.ForgotPasswordPageobjects;
import com.mobile.core.Base;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ForgotPasswordPage extends Base {

	private ForgotPasswordPageobjects forgotpasswordPageObjects = new ForgotPasswordPageobjects();

	public ForgotPasswordPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), forgotpasswordPageObjects);
	}

	public void clickSignInButton() {
		clickElement(forgotpasswordPageObjects.SignInButton);
	}

	public void clickForgotPassword() {
		clickElement(forgotpasswordPageObjects.ForgotPassword);
	}

	public void screenImageIcon() {
		verifyElement(forgotpasswordPageObjects.ImageIcon);
	}

	public void screenHeader() {
		verifyElement(forgotpasswordPageObjects.FPScreenHeader);
	}

	public void screenDescriptionText() {
		verifyElement(forgotpasswordPageObjects.FPDescriptionText);
	}

	public void emailAddressField() {
		verifyElement(forgotpasswordPageObjects.EmailaddressField);
	}

	public void requestOneTmePasswordButton() {
		verifyElement(forgotpasswordPageObjects.RequestOneTimePassButton);
	}

	public void oneTimePasswordField() {
		verifyElement(forgotpasswordPageObjects.OneTimePasswordField);
	}

	public void nextButton() {
		verifyElement(forgotpasswordPageObjects.NextButton);
	}

	public void clickonNextButton() {
		clickElement(forgotpasswordPageObjects.clickNextButton);
	}

	public void errorMessageForEmailField(String err) {
		System.out.println(err);
		elementWithAssesbilityIdIsPresent(err);
	}

	public void errorMessageForOneTimePasswordField(String err) {
		System.out.println("\n\nExpected Message : " + err);
		System.out.println("\n\nDisplayed Message : " + ImageToText_Compare());
		Assert.assertTrue(err + " : error message not found", ImageToText_Compare().contains(err));
	}

	public void enterTheEmail(String email) {
		enterText(forgotpasswordPageObjects.EmailaddressField, email);
	}

	public void clickonOneTimePasswordButton() {
		clickElement(forgotpasswordPageObjects.RequestOneTimePassButton);
	}

	public void errorMessageforNonRegisterEmail(String arg1) {
		System.out.println("\n\nExpected Message : " + arg1);
		System.out.println("\n\nDisplayed Message : " + ImageToText_Compare());
		Assert.assertTrue(arg1 + " : error message not found", ImageToText_Compare().contains(arg1));
	}

	public void messageForMailSent(String arg1) {
		System.out.println("\n\nExpected Message : " + arg1);
		System.out.println("\n\nDisplayed Message : " + ImageToText_Compare());
		Assert.assertTrue(arg1 + " : error message not found", ImageToText_Compare().contains(arg1));
	}

	public void enterOneTimePassword(String OTP) {
		enterText(forgotpasswordPageObjects.OneTimePasswordField, OTP);
	}

	public void errorMessageforWrongCode(String arg1) {
		System.out.println("\n\nExpected Message : " + arg1);
		System.out.println("\n\nDisplayed Message : " + ImageToText_Compare());
		Assert.assertTrue(arg1 + " : error message not found", ImageToText_Compare().contains(arg1));
	}

	public void clickonReturnFromKeyPad() {
		clickElement(forgotpasswordPageObjects.ReturnFromKeyPad);
	}

	public void clickOTPButtonx5() {

		for (int i = 0; i <= 6; i++) {
			clickElement(forgotpasswordPageObjects.RequestOneTimePassButton);
			sleep(1);
		}
	}

	public void errorMessagefor6thtimeOTP(String arg1) {
		System.out.println("\n\nExpected Message : " + arg1);
		System.out.println("\n\nDisplayed Message : " + ImageToText_Compare());
		Assert.assertTrue(arg1 + " : error message not found", ImageToText_Compare().contains(arg1));
	}
}
