package com.mobile.app.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LoginPageObjects {

	@iOSFindBy(accessibility = "SIGN IN")
	public MobileElement signinbutton;

	@iOSFindBy(accessibility = "SignInIcon")
	public MobileElement signinIcon;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SIGN IN\"]")
	public MobileElement signinTitle;

	@iOSFindBy(accessibility = "LAND ROVER TOTAL CARE")
	public MobileElement TotalCareTitle;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='Email Address']")
	public MobileElement EmailAddressField;

	@iOSFindBy(xpath = "//XCUIElementTypeSecureTextField[@value='Password']")
	public MobileElement PasswordField;

	@iOSFindBy(accessibility = "FORGOT PASSWORD?")
	public MobileElement ForgotPassword;

	@iOSFindBy(accessibility = "NextBtn")
	public MobileElement NextButton;

	@iOSFindBy(accessibility = "Please enter your email")
	public MobileElement EmailFieldErrorMessage;

	@iOSFindBy(accessibility = "Please enter password")
	public MobileElement PasswordFieldErrorMessage;

	@iOSFindBy(accessibility = "CrossIcon")
	public MobileElement CrossIcon;

	@iOSFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Email is invalid\"])[2]")
	public MobileElement invalidEmail;

	@iOSFindBy(accessibility = "WEATHER")
	public MobileElement WeatherText;

	@iOSFindBy(accessibility = "Return")
	public MobileElement ReturnButton;
}
