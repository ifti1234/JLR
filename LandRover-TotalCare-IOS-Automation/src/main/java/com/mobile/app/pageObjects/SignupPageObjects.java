package com.mobile.app.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;

public class SignupPageObjects {

	@iOSFindBy(accessibility = "SIGN UP")
	public MobileElement signupbutton;

	@iOSFindBy(accessibility = "LOGIN DETAILS")
	public MobileElement signupscreentextlogo;

	@iOSFindBy(accessibility = "MailIcon")
	public MobileElement signupImagelogo;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='Email Address']")
	public MobileElement EmailField;

	@iOSFindBy(xpath = "//XCUIElementTypeSecureTextField[@value='Password']")
	public MobileElement PasswordField;

	@iOSFindBy(xpath = "//XCUIElementTypeSecureTextField[@value='Confirm Password']")
	public MobileElement ConfirmPassword;

	@iOSFindBy(accessibility = "Password should contain minimum 8 characters")
	public MobileElement DescriptionText;

	@iOSFindBy(accessibility = "NextBtn")
	public MobileElement NextButton;

	@iOSFindBy(accessibility = "CrossIcon")
	public MobileElement CrossIcon;

	@iOSFindBy(accessibility = "Email is invalid")
	public MobileElement Emailerrormessage;

	@iOSFindBy(accessibility = "Please enter your email")
	public MobileElement BlankEmailFieldError;

	@iOSFindBy(accessibility = "Please enter Confirm Password")
	public MobileElement BlankconfirmpasswordfieldError;

	@iOSFindBy(accessibility = "New password and Confirm password don't match")
	public MobileElement MismatchPasswordserror;

	@iOSFindBy(accessibility = "PERSONAL DETAILS")
	public MobileElement TitleForSeconScreen;

	@iOSFindBy(accessibility = "UserIcon")
	public MobileElement usericonForSeconScreen;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='First Name']")
	public MobileElement FirstNameField;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='Last Name']")
	public MobileElement LastNameField;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='United Arab Emirates']")
	public MobileElement CountryOfResidence;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='+971']")
	public MobileElement CountryCode;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='Mobile Number']")
	public MobileElement MobileNumber;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='City']")
	public MobileElement City;

	@iOSFindBy(accessibility = "Please enter your First Name")
	public MobileElement FirstNameFielderror;

	@iOSFindBy(accessibility = "Please enter your Last Name")
	public MobileElement LastNameFielderror;

	@iOSFindBy(accessibility = "Please enter Mobile Number")
	public MobileElement PhoneFielderror;

	@iOSFindBy(accessibility = "Please enter your city")
	public MobileElement CityFielderror;

	@iOSFindBy(accessibility = "BarCodeIcon")
	public MobileElement VINScreenicon;

	@iOSFindBy(accessibility = "VEHICLE CHASSIS NUMBER")
	public MobileElement ChassisNumberTitle;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='Enter Chassis Number']")
	public MobileElement chassisnumberfield;

	@iOSFindBy(accessibility = "SCAN VEHICLE REGISTRATION CARD")
	public MobileElement ScanVINButton;

	@iOSFindBy(accessibility = "Please enter chassis number")
	public MobileElement VINfielderrormessage;

	@iOSFindBy(accessibility = "Yes")
	public MobileElement PopUpYesButton;

	@iOSFindBy(accessibility = "RANGE ROVER")
	public MobileElement VehicleModel;

	@iOSFindBy(accessibility = "KUWAIT")
	public MobileElement VehicleCountry;

	@iOSFindBy(accessibility = "ALI ALGHANIM & SONS AUTOMOTIVE")
	public MobileElement VehicleDealer;

	@iOSFindBy(accessibility = "2015-09-20")
	public MobileElement VehicleHandOverDate;

	@iOSFindBy(accessibility = "Start using the app now")
	public MobileElement StartUsingTheApp;

	@iOSFindBy(accessibility = "CheckMarkNextBtnImg")
	public MobileElement DoneButton;

	@iOSFindBy(accessibility = "WEATHER")
	public MobileElement WeatherText;

	@iOSFindBy(accessibility = "Return")
	public MobileElement ReturnButton;

	@iOSFindBy(accessibility = "SIGN OUT")
	public MobileElement SignoutButton;

	@iOSFindBy(accessibility = "MenuButton")
	public MobileElement MainMenuButton;

	@iOSFindBy(accessibility = "Ok")
	public MobileElement OkButtonToSignOut;
	
	@iOSFindBy(accessibility = "Done")
	public MobileElement DoneButtonOnNumPad;
	
	@iOSFindBy(xpath = "//XCUIElementTypeTable")
	public MobileElement sideMenuTable;

}
