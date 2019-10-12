package com.mobile.app.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;

public class HomeScreenObjects {

	@iOSFindBy(accessibility = "AppLogoOnNavBar.png")
	public MobileElement AppLogo;

	@iOSFindBy(accessibility = "WEATHER")
	public MobileElement WeatherText;

	@iOSFindBy(accessibility = "ROAD SIDE ASSISTANCE")
	public MobileElement RoadSideAssistance;

	@iOSFindBy(accessibility = "CUSTOMER CARE")
	public MobileElement CustomerCare;

	@iOSFindBy(accessibility = "BOOK A SERVICE")
	public MobileElement BookaService;

	@iOSFindBy(accessibility = "LOCATOR")
	public MobileElement locator;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@name=\"ROAD SIDE ASSISTANCE\"]")
	public MobileElement RoadSideAssistanceTitle;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"ROAD SIDE ASSISTANCE\"]")
	public MobileElement RoadSideAssistanceButton;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"800526376837\"]")
	public MobileElement RSAPhnumber;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@name=\"CUSTOMER CARE\"]")
	public MobileElement CustomerCareScreenTitle;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"CUSTOMER CARE\"]")
	public MobileElement CustomerCareButton;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"+97143098901\"]")
	public MobileElement CustomerCarePhnumber;

	@iOSFindBy(accessibility = "Al Tayer Motors - Garhoud")
	public MobileElement PinLocationOnMap;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@name=\"BOOK A SERVICE\"]")
	public MobileElement BookaServicescreenTitle;

	@iOSFindBy(accessibility = "DropDownMenuIcon")
	public MobileElement DropDownMenuicon;

	@iOSFindBy(accessibility = "NextBtn")
	public MobileElement NextButton;

	@iOSFindBy(accessibility = "AL TAYER MOTORS - GARHOUD")
	public MobileElement ServiceCenterName;

	@iOSFindBy(accessibility = "Garhoud Atrium Building , Near GGICO Metro Station")
	public MobileElement ServiceCenterAddress;

	@iOSFindBy(accessibility = "LOCATOR")
	public MobileElement LocatorScreenTitle;

	@iOSFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"LOCATOR\"]/XCUIElementTypeButton[2]")
	public MobileElement LocatorScreenSearchIcon;

	@iOSFindBy(accessibility = "SHOWROOM")
	public MobileElement LocatorScreenShowRoomTitle;

	@iOSFindBy(accessibility = "RANGEROVER 2015 - 542741")
	public MobileElement SelectCarDropDown;

	@iOSFindBy(accessibility = "Choose a default vehicle")
	public MobileElement PopUpScreenTitle;

	@iOSFindBy(accessibility = "AddCarIcon")
	public MobileElement AddaCarButton;

	@iOSFindBy(accessibility = "RANGE")
	public MobileElement Secondcarselection;

}
