package com.mobile.app.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ForgotPasswordPageobjects {

	@iOSFindBy(accessibility = "SIGN IN")
	public MobileElement SignInButton;

	@iOSFindBy(accessibility = "FORGOT PASSWORD?")
	public MobileElement ForgotPassword;

	@iOSFindBy(accessibility = "MailIcon")
	public MobileElement ImageIcon;

	@iOSFindBy(accessibility = "FORGOT PASSWORD?")
	public MobileElement FPScreenHeader;

	@iOSFindBy(accessibility = "TO ENSURE SECURITY ON YOUR ACCOUNT ENTER THE ONE TIME PASSWORD SENT TO YOUR EMAIL")
	public MobileElement FPDescriptionText;

	@iOSFindBy(accessibility = "Email Address")
	public MobileElement EmailaddressField;

	@iOSFindBy(accessibility = "REQUEST ONE TIME PASSWORD")
	public MobileElement RequestOneTimePassButton;

	@iOSFindBy(accessibility = "Please enter one time password")
	public MobileElement ErrorMessageForOneTimePassword;

	@iOSFindBy(accessibility = "One Time Password")
	public MobileElement OneTimePasswordField;

	@iOSFindBy(accessibility = "NextBtn")
	public MobileElement NextButton;

	@iOSFindBy(xpath = "(//XCUIElementTypeButton[@name=\"NextBtn\"])[2]")
	public MobileElement clickNextButton;

	@iOSFindBy(accessibility = "Return")
	public MobileElement ReturnFromKeyPad;

}
//