package com.mobile.app.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LocatorsPageObjects {

	@iOSFindBy(accessibility = "MenuButton")
	public MobileElement MainMenuButton;

	@iOSFindBy(accessibility = "SERVICES")
	public MobileElement ServicesOption;

	@iOSFindBy(accessibility = "LOCATOR")
	public MobileElement LocatorsOption;

	@iOSFindBy(accessibility = "BOOK A SERVICE")
	public MobileElement BookAServiceOption;

	@iOSFindBy(accessibility = "CUSTOMER CARE")
	public MobileElement CustomerCareOption;

	@iOSFindBy(accessibility = "ROAD SIDE ASSISTANCE")
	public MobileElement RoadSideAssistanceOption;

	@iOSFindBy(accessibility = "LOCATOR")
	public MobileElement LocatorsScreenHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"LOCATOR\"]/XCUIElementTypeButton[2]")
	public MobileElement LocatorsSearchIcon;

	@iOSFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"SHOWROOM\"])[2]")
	public MobileElement LocatorsShowroomOption;

	@iOSFindBy(accessibility = "SERVICE")
	public MobileElement LocatorsServiceOption;

	@iOSFindBy(accessibility = "PARTS")
	public MobileElement LocatorsPartsOption;

	@iOSFindBy(accessibility = "GAS")
	public MobileElement LocatorsGasOption;

	@iOSFindBy(accessibility = "ATM")
	public MobileElement LocatorsATMOption;

	@iOSFindBy(accessibility = "SHOWROOM")
	public MobileElement ShowroomOptionHeader;

	@iOSFindBy(accessibility = "SERVICE CENTER")
	public MobileElement ServiceOptionHeader;

	@iOSFindBy(accessibility = "PARTS")
	public MobileElement PartsOptionHeader;

	@iOSFindBy(accessibility = "GAS STATION")
	public MobileElement GASOptionHeader;

	@iOSFindBy(accessibility = "ATM")
	public MobileElement ATMOptionHeader;

	@iOSFindBy(accessibility = "Al Tayer Motors - Pre Owned Cars (Al Ittihad)")
	public MobileElement PinLocationForShowroom;

	@iOSFindBy(accessibility = "AL TAYER MOTORS - PRE OWNED CARS (AL ITTIHAD)")
	public MobileElement NameOfTheShowroom;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Al Ittihad Road \"]")
	public MobileElement AddressOfTheShowroom;

	@iOSFindBy(accessibility = "8:00AM - 8:00PM")
	public MobileElement TimingOfTheShowroom;

	@iOSFindBy(accessibility = "DropDownMenuIcon")
	public MobileElement DropDownIcon;

	@iOSFindBy(accessibility = "Call")
	public MobileElement DropDownCallButton;

	@iOSFindBy(accessibility = "Email")
	public MobileElement DropDownEmailButton;

	@iOSFindBy(accessibility = "Visit Website")
	public MobileElement DropDownVisitWebsiteButton;

	@iOSFindBy(accessibility = "Navigate")
	public MobileElement DropDownNavigateButton;

	@iOSFindBy(accessibility = "Al Tayer Motors - Garhoud")
	public MobileElement ServiceCenterPinLocation;

	@iOSFindBy(accessibility = "AL TAYER MOTORS - GARHOUD")
	public MobileElement ServiceCenterName;

	@iOSFindBy(accessibility = "Garhoud Atrium Building , Near GGICO Metro Station")
	public MobileElement ServiceCenterAddress;

	@iOSFindBy(accessibility = "Book A Service")
	public MobileElement DropDownBookAServiceButton;

	@iOSFindBy(xpath = "//XCUIElementTypeSearchField[@name='SEARCH']")
	public MobileElement SearchField;

	@iOSFindBy(accessibility = "Search")
	public MobileElement SearchButtonFromKeyPad;

	@iOSFindBy(accessibility = "Premier Motors - Musaffah")
	public MobileElement SearchedLocationPin;

	@iOSFindBy(accessibility = "PREMIER MOTORS - MUSAFFAH")
	public MobileElement NameOfSerachedCenter;

	@iOSFindBy(accessibility = "Musaffah, Abu Dhabi")
	public MobileElement AddressOfSerachedCenter;

}
