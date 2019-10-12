package com.mobile.app.pages;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import com.mobile.app.pageObjects.LoginPageObjects;
import com.mobile.core.Base;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends Base {

	private LoginPageObjects loginPageObjects = new LoginPageObjects();

	public LoginPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), loginPageObjects);
	}

	public void clickSignInButton() {
		clickElement(loginPageObjects.signinbutton);
	}

	public void checkSigninButton() {
		clickElement(loginPageObjects.signinbutton);
	}

	public void checkSignInIcon() {
		verifyElement(loginPageObjects.signinIcon);
	}

	public void checkSignInTitle() {
		verifyElement(loginPageObjects.signinTitle);
	}

	public void checkTotalCareTitle() {
		verifyElement(loginPageObjects.TotalCareTitle);
	}

	public void checkEmailAddressField() {
		verifyElement(loginPageObjects.EmailAddressField);
	}

	public void checkPasswordField() {
		verifyElement(loginPageObjects.PasswordField);
	}

	public void checkForgotPasswordlabel() {
		verifyElement(loginPageObjects.ForgotPassword);
	}

	public void nextButton() {
		verifyElement(loginPageObjects.NextButton);
	}

	public void clickNextButton() {
		clickElement(loginPageObjects.NextButton);
	}

	public void emailFieldErrorMessage(String err) {
		System.out.println(err);
		elementWithAssesbilityIdIsPresent(err);
	}

	public void passwordFieldErrorMessage(String arg1) {
		System.out.println("\n\nExpected Message : " + arg1);
		System.out.println("\n\nDisplayed Message : " + ImageToText_Compare());
		Assert.assertTrue(arg1 + " : error message not found", ImageToText_Compare().contains(arg1));
	}

	public void clickCrossIcon() {
		clickElement(loginPageObjects.CrossIcon);
	}

	public void invalidEmailErrorMessage(String arg1) {
		System.out.println("\n\nExpected Message : " + arg1);
		System.out.println("\n\nDisplayed Message : " + ImageToText_Compare());
		Assert.assertTrue(arg1 + " : error message not found", ImageToText_Compare().contains(arg1));
		
	}

	public void enterEmail(String email) {
		enterText(loginPageObjects.EmailAddressField, email);
	}

	public void enterPassword(String pass) {
		enterText(loginPageObjects.PasswordField, pass);
	}

	public void enterEmailToLogIn(String email) {
		loginPageObjects.EmailAddressField.sendKeys(email);
		ReturnKeyFromKeyBoard();

	}

	public void enterPasswordToLogIn(String arg1) {
		enterText(loginPageObjects.PasswordField, arg1);
		ReturnKeyFromKeyBoard();
		clickElement(loginPageObjects.NextButton);

	}

	public void emailNotRegisteredMessage(String arg1) {
		System.out.println("\n\nExpected Message : " + arg1);
		System.out.println("\n\nDisplayed Message : " + ImageToText_Compare());
		Assert.assertTrue(arg1 + " : error message not found", ImageToText_Compare().contains(arg1));
	}

	public void incorrectPasswordMessage(String arg1) {
		System.out.println("\n\nExpected Message : " + arg1);
		System.out.println("\n\nDisplayed Message : " + ImageToText_Compare());
		Assert.assertTrue(arg1 + " : error message not found", ImageToText_Compare().contains(arg1));
	}

	public void homeScreenWeatherText() {
		verifyElement(loginPageObjects.WeatherText);
	}

	public void clickOnReturnButton() {
		clickElement(loginPageObjects.ReturnButton);
	}

}
