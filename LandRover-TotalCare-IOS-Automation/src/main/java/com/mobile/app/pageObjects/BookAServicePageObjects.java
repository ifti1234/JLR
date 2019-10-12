package com.mobile.app.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;

public class BookAServicePageObjects {

	@iOSFindBy(accessibility = "AppLogoOnNavBar.png")
	public MobileElement HomeScreenLogo;

	@iOSFindBy(accessibility = "MenuButton")
	public MobileElement MainMenuButton;

	@iOSFindBy(accessibility = "SERVICES")
	public MobileElement ServicesOption;

	@iOSFindBy(accessibility = "BOOK A SERVICE")
	public MobileElement BookaServiceOption;

	@iOSFindBy(accessibility = "BOOK A SERVICE")
	public MobileElement BookaServiceHeader;

	@iOSFindBy(accessibility = "BOOK A SERVICE")
	public MobileElement HomeScreenBookAService;

	@iOSFindBy(accessibility = "SETTINGS")
	public MobileElement SettingsFromSlidemenu;

	@iOSFindBy(accessibility = "CUSTOMIZE QUICK BAR")
	public MobileElement CustomizeQuickBar;

	@iOSFindBy(accessibility = "HOME")
	public MobileElement HomeButton;

	@iOSFindBy(accessibility = "BOOK A SERVICE")
	public MobileElement BookaServiceFromQuickMenu;

	@iOSFindBy(accessibility = "LOCATION")
	public MobileElement LocationFromSettingsMenu;

	@iOSFindBy(xpath = "//XCUIElementTypeSwitch[@value='1']")
	public MobileElement AutoDetectLocationSwitch;

	@iOSFindBy(accessibility = "SERVICE CENTER")
	public MobileElement ServiceCenterSubHeader;

	@iOSFindBy(accessibility = "CHOOSE CENTER")
	public MobileElement Stepnavigator1;

	@iOSFindBy(accessibility = "CAR DETAILS")
	public MobileElement Stepnavigator2;

	@iOSFindBy(accessibility = "BOOKING DETAILS")
	public MobileElement Stepnavigator3;

	@iOSFindBy(accessibility = "CONFIRMATION")
	public MobileElement Stepnavigator4;

	@iOSFindBy(accessibility = "My Location")
	public MobileElement MyLocation;

	@iOSFindBy(accessibility = "DropDownMenuIcon")
	public MobileElement ListViewIcon;

	@iOSFindBy(accessibility = "Al Tayer Motors - Garhoud")
	public MobileElement ServiceCenterPinLocation;

	@iOSFindBy(accessibility = "AL TAYER MOTORS - GARHOUD")
	public MobileElement ServiceCenterName;

	@iOSFindBy(accessibility = "Garhoud Atrium Building , Near GGICO Metro Station")
	public MobileElement ServiceCenterAddress;

	@iOSFindBy(xpath = "(//XCUIElementTypeButton[@name=\"DropDownMenuIcon\"])[2]")
	public MobileElement DropDowniconmapview;

	@iOSFindBy(xpath = "(//XCUIElementTypeButton[@name=\"DropDownMenuIcon\"])[1]")
	public MobileElement DropDowniconListview;

	@iOSFindBy(accessibility = "NextBtn")
	public MobileElement NextButton;

	@iOSFindBy(accessibility = "Call")
	public MobileElement DDCalloption;

	@iOSFindBy(accessibility = "Email")
	public MobileElement DDEmailoption;

	@iOSFindBy(accessibility = "Visit Website")
	public MobileElement DDWebSiteoption;

	@iOSFindBy(accessibility = "Navigate")
	public MobileElement DDNavigateoption;

	@iOSFindBy(accessibility = "Take Me There")
	public MobileElement DDTakemeThereoption;

	@iOSFindBy(accessibility = "SELECT CAR")
	public MobileElement SelectcarHeader;

	@iOSFindBy(accessibility = "NextBtnBlack")
	public MobileElement CarDetailsNextButton;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='Plate Number']")
	public MobileElement PlateNumberFieldwithoutvalue;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='12345']")
	public MobileElement PlateNumberField;

	@iOSFindBy(accessibility = "Mileage")
	public MobileElement MileageField;

	@iOSFindBy(accessibility = "RANGE ROVER SPORT - 2015")
	public MobileElement CarDetailscarSelector;

	@iOSFindBy(accessibility = "Return")
	public MobileElement ReturnFromKeyBoard;

	@iOSFindBy(accessibility = "BOOKING DETAILS")
	public MobileElement BookingDetailsHeader;

	@iOSFindBy(accessibility = "Preferred Date")
	public MobileElement PreferredDate;

	@iOSFindBy(accessibility = "Preferred Time")
	public MobileElement PreferredTime;

	@iOSFindBy(accessibility = "Additional Info")
	public MobileElement AdditionalInfoBox;

	@iOSFindBy(accessibility = "BookServiceCameraImg")
	public MobileElement CameraIcon;

	@iOSFindBy(xpath = "//XCUIElementTypePickerWheel")
	public MobileElement TimeFieldPicker;

	@iOSFindBy(accessibility = "CHOOSE CENTER")
	public MobileElement ConfirmationscreenSubTitle;

	@iOSFindBy(accessibility = "Range Rover Sport - 2015")
	public MobileElement ConfirmationscreenModelandyear;

	@iOSFindBy(accessibility = "12345")
	public MobileElement ConfirmationscreenPlateNumber;

	@iOSFindBy(accessibility = "501 KM")
	public MobileElement ConfirmationscreenMileage;

	@iOSFindBy(accessibility = "08:30 AM")
	public MobileElement ConfirmationscreenPreferredTime;

	@iOSFindBy(accessibility = "SUBMIT")
	public MobileElement ConfirmationscreenSubmitButton;

	@iOSFindBy(accessibility = "CrossBarButtonImg")
	public MobileElement ConfirmationscreenCrossButton;

	@iOSFindBy(accessibility = "Done")
	public MobileElement DoneButton;

	@iOSFindBy(accessibility = "Please enter Plate Number")
	public MobileElement platenumbererror;

	@iOSFindBy(xpath = "//XCUIElementTypeTable")
	public MobileElement sideMenuTable;

}
