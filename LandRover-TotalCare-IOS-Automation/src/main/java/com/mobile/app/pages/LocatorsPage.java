package com.mobile.app.pages;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import com.mobile.app.pageObjects.LocatorsPageObjects;
import com.mobile.core.Base;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LocatorsPage extends Base {

	private LocatorsPageObjects locatorsobjects = new LocatorsPageObjects();

	public LocatorsPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), locatorsobjects);
	}

	public void clickOnMainMenuIcon() {
		isElementClickable(locatorsobjects.MainMenuButton);
		clickElement(locatorsobjects.MainMenuButton);
	}

	public void clickOnServicesOptionFromMainMenu() {
		isElementClickable(locatorsobjects.ServicesOption);
		clickElement(locatorsobjects.ServicesOption);
	}

	public void verifyLocatorsOption() {
		verifyElement(locatorsobjects.LocatorsOption);
	}

	public void verifyBookAServiceOption() {
		verifyElement(locatorsobjects.BookAServiceOption);
	}

	public void verifyCustomerCareOption() {
		verifyElement(locatorsobjects.CustomerCareOption);
	}

	public void verifyRoadSideAssistanceOption() {
		verifyElement(locatorsobjects.RoadSideAssistanceOption);
	}

	public void clickOnLocatorsOption() {
		clickElement(locatorsobjects.LocatorsOption);
	}

	public void verifyLocatorsScreenHeader(String arg1) {
		verifyElement(locatorsobjects.LocatorsScreenHeader);
	}

	public void verifySearchIcon() {
		verifyElement(locatorsobjects.LocatorsSearchIcon);
	}

	public void verifyShowroomOption() {
		verifyElement(locatorsobjects.LocatorsShowroomOption);
	}

	public void verifyServiceOption() {
		verifyElement(locatorsobjects.ServicesOption);
	}

	public void verifyPartsOption() {
		verifyElement(locatorsobjects.LocatorsPartsOption);
	}

	public void verifyGASOption() {
		verifyElement(locatorsobjects.LocatorsGasOption);
	}

	public void verifyATMOption() {
		verifyElement(locatorsobjects.LocatorsATMOption);
	}

	public void clickOnShowRoomOption() {
		clickElement(locatorsobjects.LocatorsShowroomOption);
	}

	public void verifyHeaderForShowroomOption(String arg1) {
		verifyElement(locatorsobjects.ShowroomOptionHeader);
	}

	public void clickOnServicesOption() {
		clickElement(locatorsobjects.LocatorsServiceOption);
	}

	public void verifyHeaderForServicesOption(String arg1) {
		verifyElement(locatorsobjects.ServiceOptionHeader);
	}

	public void clickOnPartsOption() {
		clickElement(locatorsobjects.LocatorsPartsOption);
	}

	public void verifyHeaderForPartsOption(String arg1) {
		verifyElement(locatorsobjects.PartsOptionHeader);
	}

	public void clickOnGASOption() {
		clickElement(locatorsobjects.LocatorsGasOption);
	}

	public void verifyHeaderForGASOption(String arg1) {
		verifyElement(locatorsobjects.GASOptionHeader);
	}

	public void clickOnATMOption() {
		clickElement(locatorsobjects.LocatorsATMOption);
	}

	public void verifyHeaderForATMOption(String arg1) {
		verifyElement(locatorsobjects.ATMOptionHeader);
	}

	public void clickOnPinLocationForShowroom() {
		clickElement(locatorsobjects.PinLocationForShowroom);
	}

	public void verifyNameOfTheShowroom(String arg1) {
		verifyElement(locatorsobjects.NameOfTheShowroom);
	}

	public void verifyAddressOfTheShowroom(String arg1) {
		verifyElement(locatorsobjects.AddressOfTheShowroom);
	}

	public void verifyTimingOfTheShowroom(String arg1) {
		verifyElement(locatorsobjects.TimingOfTheShowroom);
	}

	public void verifyDropdownIcon() {
		verifyElement(locatorsobjects.DropDownIcon);
	}

	public void clickOnDropDownIcon() {
		clickElement(locatorsobjects.DropDownIcon);
	}

	public void verifyDropdownCallButton() {
		verifyElement(locatorsobjects.DropDownCallButton);
	}

	public void verifyDropdownEmailButton() {
		verifyElement(locatorsobjects.DropDownEmailButton);
	}

	public void verifyDropdownVisitWebsiteButton() {
		verifyElement(locatorsobjects.DropDownVisitWebsiteButton);
	}

	public void verifyDropdownNavigateButton() {
		verifyElement(locatorsobjects.DropDownNavigateButton);
	}

	public void clickOnCallButton() {
		clickElement(locatorsobjects.DropDownCallButton);
	}

	public void verifytheMessageForCall(String arg1) {
		//alertIsPresent();
		System.out.println("\n\nExpected Message : " + arg1);
		System.out.println("\n\nDisplayed Message : " + ImageToText_Compare());
		Assert.assertTrue(arg1 + " : error message not found", ImageToText_Compare().contains(arg1));
	}

	public void clickOnNavigateButton() {
		clickElement(locatorsobjects.DropDownNavigateButton);
	}

	public void verifytheMessageForGoogleMap(String arg1) {
		System.out.println("\n\nExpected Message : " + arg1);
		System.out.println("\n\nDisplayed Message : " + ImageToText_Compare());
		Assert.assertTrue(arg1 + " : error message not found", ImageToText_Compare().contains(arg1));
	}

	public void clickOnPinLocationForServiceCenter() {
		clickElement(locatorsobjects.ServiceCenterPinLocation);
	}

	public void verifyNameOfTheServiceCenter(String arg1) {
		verifyElement(locatorsobjects.ServiceCenterName);
	}

	public void verifyAddressOfTheServiceCenter(String arg1) {
		verifyElement(locatorsobjects.ServiceCenterAddress);
	}

	public void verifyDropdownBookAServiceButton() {
		verifyElement(locatorsobjects.DropDownBookAServiceButton);
	}

	public void clickOnSearchicon() {
		clickElement(locatorsobjects.LocatorsSearchIcon);
	}

	public void enterTheSearchText(String text) {
		enterText(locatorsobjects.SearchField, text);
	}

	public void clickOnSearchButtonFromKeyPad() {

		clickElement(locatorsobjects.SearchButtonFromKeyPad);
	}

	public void noResultFoundMessage(String arg1) {
		//alertIsPresent();
		System.out.println("\n\nExpected Message : " + arg1);
		System.out.println("\n\nDisplayed Message : " + ImageToText_Compare());
		Assert.assertTrue(arg1 + " : error message not found", ImageToText_Compare().contains(arg1));
	}

	public void tapOnSearchedPinLocation() {
		clickElement(locatorsobjects.SearchedLocationPin);
	}

	public void nameOfSearchedServicecenter(String arg1) {
		verifyElement(locatorsobjects.NameOfSerachedCenter);
	}

	public void addressOfSearchedServicecenter(String arg1) {
		verifyElement(locatorsobjects.AddressOfSerachedCenter);
	}
}
