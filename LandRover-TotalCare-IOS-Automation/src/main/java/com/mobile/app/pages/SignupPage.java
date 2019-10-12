package com.mobile.app.pages;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import com.mobile.app.pageObjects.SignupPageObjects;
import com.mobile.core.Base;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignupPage extends Base {

	private SignupPageObjects signupPageObjects = new SignupPageObjects();

	public SignupPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), signupPageObjects);
	}

	public void clickonsignupButton() {
		clickElement(signupPageObjects.signupbutton);
	}

	public void loginDetailsText(String arg1) {
		verifyElement(signupPageObjects.signupscreentextlogo);
	}

	public void signupImageIcon() {
		verifyElement(signupPageObjects.signupImagelogo);
	}

	public void emailAddressField() {
		verifyElement(signupPageObjects.EmailField);
	}

	public void passwordField() {
		verifyElement(signupPageObjects.PasswordField);
	}

	public void confirmPasswordField() {
		verifyElement(signupPageObjects.ConfirmPassword);
	}

	public void descriptionText() {
		verifyElement(signupPageObjects.DescriptionText);
	}

	public void nextButton() {
		verifyElement(signupPageObjects.NextButton);
	}

	public void crossIcon() {
		verifyElement(signupPageObjects.CrossIcon);
	}

	public void enterEmail(String email) {
		enterText(signupPageObjects.EmailField, email);
	}

	public void enterpassword(String password) {
		enterText(signupPageObjects.PasswordField, password);
	}

	public void enterconfirmpassword(String confirmpassword) {
		enterText(signupPageObjects.ConfirmPassword, confirmpassword);
	}

	public void clickNextButton() {
		clickElement(signupPageObjects.NextButton);
	}

	public void emailErrorMessage(String arg1) {
		verifyElement(signupPageObjects.Emailerrormessage);
	}

	public void clickonCrossIcon() {
		clickElement(signupPageObjects.CrossIcon);
	}

	public void emptyEmailfielderrormessage(String arg1) {
		verifyElement(signupPageObjects.BlankEmailFieldError);
	}

	public void emptyconfirmpasswordfielderror(String arg1) {
		verifyElement(signupPageObjects.BlankconfirmpasswordfieldError);
	}

	public void mismatchpasswordserrormessage(String arg1) {
		verifyElement(signupPageObjects.MismatchPasswordserror);
	}

	public void personalDetailsScreentitle(String arg1) {
		verifyElement(signupPageObjects.TitleForSeconScreen);
	}

	public void imageIconOnPersonalDetailsScreen() {
		verifyElement(signupPageObjects.usericonForSeconScreen);
	}

	public void firstNameField() {
		verifyElement(signupPageObjects.FirstNameField);
	}

	public void lastNameField() {
		verifyElement(signupPageObjects.LastNameField);
	}

	public void countryOfResidence() {
		verifyElement(signupPageObjects.CountryOfResidence);
	}

	public void phoneNumberField() {
		verifyElement(signupPageObjects.CountryCode);
		verifyElement(signupPageObjects.MobileNumber);
	}

	public void cityField() {
		verifyElement(signupPageObjects.City);
	}

	public void firstNameFieldErrorMessage(String arg1) {
		//verifyElement(signupPageObjects.FirstNameFielderror);
		System.out.println("\n\nExpected Message : " + arg1);
		System.out.println("\n\nDisplayed Message : " + ImageToText_Compare());
		Assert.assertTrue(arg1 + " : error message not found", ImageToText_Compare().contains(arg1));

	}

	public void lastNameFieldErrorMessage(String arg1) {
		
		System.out.println("\n\nExpected Message : " + arg1);
		System.out.println("\n\nDisplayed Message : " + ImageToText_Compare());
		Assert.assertTrue(arg1 + " : error message not found", ImageToText_Compare().contains(arg1));

	}

	public void phoneFieldErrorMessage(String arg1) {
		
		System.out.println("\n\nExpected Message : " + arg1);
		System.out.println("\n\nDisplayed Message : " + ImageToText_Compare());
		Assert.assertTrue(arg1 + " : error message not found", ImageToText_Compare().contains(arg1));
	}

	public void cityFieldErrorMessage(String arg1) {
		System.out.println("\n\nExpected Message : " + arg1);
		System.out.println("\n\nDisplayed Message : " + ImageToText_Compare());
		Assert.assertTrue(arg1 + " : error message not found", ImageToText_Compare().contains(arg1));
	}

	public void enterFirstName(String firstname) {
		enterText(signupPageObjects.FirstNameField, firstname);
	}

	public void enterLastName(String lastname) {
		enterText(signupPageObjects.LastNameField, lastname);
	}

	public void entermobilenumber(String number) {
		enterText(signupPageObjects.MobileNumber, number);
	}

	public void entercity(String city) {
		enterText(signupPageObjects.City, city);
	}

	public void barCodeIcon() {
		verifyElement(signupPageObjects.VINScreenicon);
	}

	public void chassisNumberTitle(String arg1) {
		verifyElement(signupPageObjects.ChassisNumberTitle);
	}

	public void chassisNumberField() {
		verifyElement(signupPageObjects.chassisnumberfield);
	}

	public void registrationButton() {
		verifyElement(signupPageObjects.ScanVINButton);
	}

	public void vinfielderrormessage(String arg1) {
		System.out.println("\n\nExpected Message : " + arg1);
		System.out.println("\n\nDisplayed Message : " + ImageToText_Compare());
		Assert.assertTrue(arg1 + " : error message not found", ImageToText_Compare().contains(arg1));
	}
		

	public void clickCrosIcon() {
		clickElement(signupPageObjects.CrossIcon);
	}

	public void popupYesButton() {
		clickElement(signupPageObjects.PopUpYesButton);
	}

	public void scanVehicleRegistrationCardButton() {
		clickElement(signupPageObjects.ScanVINButton);
	}

	public void alreadyregisteredEmailMessage(String arg1) {
		System.out.println("\n\nExpected Message : " + arg1);
		System.out.println("\n\nDisplayed Message : " + ImageToText_Compare());
		Assert.assertTrue(arg1 + " : error message not found", ImageToText_Compare().contains(arg1));
	}

	public void userSuccessfullyRegisteredMessage(String arg1) {
		System.out.println("\n\nExpected Message : " + arg1);
		System.out.println("\n\nDisplayed Message : " + ImageToText_Compare());
		Assert.assertTrue(arg1 + " : error message not found", ImageToText_Compare().contains(arg1));
	}

	public void enterChassisNumber(String Vin) {
		enterText(signupPageObjects.chassisnumberfield, Vin);
	}

	public void verifyTheVehicleModel(String arg1) {
		verifyElement(signupPageObjects.VehicleModel);
	}

	public void verifyTheVehicleDealer(String arg1) {
		verifyElement(signupPageObjects.VehicleDealer);
	}

	public void verifyTheVehicleHandOverDate(String arg1) {
		verifyElement(signupPageObjects.VehicleHandOverDate);
	}

	public void clickOnStartUsingTheApplication() {
		clickElement(signupPageObjects.StartUsingTheApp);
	}

	public void clickOnDoneButton() {
		clickElement(signupPageObjects.DoneButton);
	}

	public void verifyTheWeatherText() {
		verifyElement(signupPageObjects.WeatherText);
	}

	public void clickOnReturnButton() {
		clickElement(signupPageObjects.ReturnButton);
	}

	public void clickOnSignOutButton() {
		verticalSwipe_Up(signupPageObjects.sideMenuTable);
		clickElement(signupPageObjects.SignoutButton);
	}

	public void clickOnMainMenuIcon() {
		clickElement(signupPageObjects.MainMenuButton);
	}

	public void clickOnOKbuttonTosignout() {
		clickElement(signupPageObjects.OkButtonToSignOut);
	}
	
	public void clickOnDoneToDismissNumPad() {
		clickElement(signupPageObjects.DoneButtonOnNumPad);
	}

}
