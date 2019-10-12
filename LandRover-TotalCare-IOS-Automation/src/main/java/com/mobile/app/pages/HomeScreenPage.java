package com.mobile.app.pages;

import org.openqa.selenium.support.PageFactory;

import com.mobile.app.pageObjects.HomeScreenObjects;
import com.mobile.core.Base;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomeScreenPage extends Base {

	private HomeScreenObjects HomeScreenPageObjects = new HomeScreenObjects();

	public HomeScreenPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), HomeScreenPageObjects);
	}

	public void lRLogo() {
		verifyElement(HomeScreenPageObjects.AppLogo);
	}

	public void weatherText() {
		verifyElement(HomeScreenPageObjects.WeatherText);
	}

	public void roadSideAssistance() {
		verifyElement(HomeScreenPageObjects.RoadSideAssistance);
	}

	public void customerCare() {
		verifyElement(HomeScreenPageObjects.CustomerCare);
	}

	public void bookaService() {
		verifyElement(HomeScreenPageObjects.BookaService);
	}

	public void locator() {
		verifyElement(HomeScreenPageObjects.locator);
	}

	public void rsaFromHomescreen() {
		clickElement(HomeScreenPageObjects.RoadSideAssistance);
	}

	public void roadSideAssistanceTitle(String arg1) {
		verifyElement(HomeScreenPageObjects.RoadSideAssistanceTitle);
	}

	public void clickRoadSideAssistanceButton() {
		clickElement(HomeScreenPageObjects.RoadSideAssistanceButton);
	}

	public void roadSideAssistancePhoneNumber(String arg1) {
		verifyElement(HomeScreenPageObjects.RSAPhnumber);
	}

	public void customerCarefromHomescreen() {
		clickElement(HomeScreenPageObjects.CustomerCare);
	}

	public void customerCareButton() {
		clickElement(HomeScreenPageObjects.CustomerCareButton);
	}

	public void customerCareTitle(String arg1) {
		verifyElement(HomeScreenPageObjects.CustomerCareScreenTitle);
	}

	public void customerCarePhoneNumber(String arg1) {
		verifyElement(HomeScreenPageObjects.CustomerCarePhnumber);
	}

	public void clickonBookaServiceButton() {
		clickElement(HomeScreenPageObjects.BookaService);
	}

	public void bookaServicescreenTitle(String arg1) {
		verifyElement(HomeScreenPageObjects.BookaServicescreenTitle);
	}

	public void dropDownMenuIcon() {
		verifyElement(HomeScreenPageObjects.DropDownMenuicon);
	}

	public void clickOnPinLocation() {
		clickElement(HomeScreenPageObjects.PinLocationOnMap);
	}

	public void serviceCenterName(String arg1) {
		verifyElement(HomeScreenPageObjects.ServiceCenterName);
	}

	public void serviceCenterAddress(String arg1) {
		verifyElement(HomeScreenPageObjects.ServiceCenterAddress);
	}
	
	public void clickLocatorsButton() {
		clickElement(HomeScreenPageObjects.locator);
	}
	
	public void locatorScreenTitle(String arg1) {
		verifyElement(HomeScreenPageObjects.LocatorScreenTitle);
	}
	
	public void searchIcon() {
		verifyElement(HomeScreenPageObjects.LocatorScreenSearchIcon);
	}
	public void showRoomTitle(String arg1) {
		verifyElement(HomeScreenPageObjects.LocatorScreenShowRoomTitle);
	}
	
	public void selectDefaultcarDropdownButton() {
		clickElement(HomeScreenPageObjects.SelectCarDropDown);
	}
	
	public void popUpscreenTitle(String arg1) {
		verifyElement(HomeScreenPageObjects.PopUpScreenTitle);
	}
	
	public void addCarButton() {
		verifyElement(HomeScreenPageObjects.AddaCarButton);
	}
	public void selectSecondCar() {
		clickElement(HomeScreenPageObjects.Secondcarselection);
	}
	
}
