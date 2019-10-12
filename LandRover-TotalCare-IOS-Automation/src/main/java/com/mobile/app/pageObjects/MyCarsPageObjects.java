package com.mobile.app.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MyCarsPageObjects {

	@iOSFindBy(accessibility = "MenuButton")
	public MobileElement MainMenuButton;

	@iOSFindBy(accessibility = "MY CARS")
	public MobileElement MyCarsButton;

	@iOSFindBy(accessibility = "MY CARS")
	public MobileElement MyCarsScreenTitle;

	@iOSFindBy(accessibility = "deleteCarBarItem")
	public MobileElement MyCarsDeleteButton;

	@iOSFindBy(accessibility = "addCarBarItem")
	public MobileElement AddCarButton;

	@iOSFindBy(accessibility = "RANGE ROVER - 2015")
	public MobileElement CarModelnumber;

	@iOSFindBy(accessibility = "Handover Date - 2015-06-21")
	public MobileElement HandOverDate;

	@iOSFindBy(accessibility = "SALGA2DF8FA219628")
	public MobileElement VINnumber;

	@iOSFindBy(accessibility = "Egypt")
	public MobileElement CountryoftheCar;

	@iOSFindBy(accessibility = "mm group for industry & intl. trade")
	public MobileElement Showroomname;

	@iOSFindBy(accessibility = "EDIT INFORMATION")
	public MobileElement EditInformationButton;

	@iOSFindBy(accessibility = "InfoTitleImg")
	public MobileElement InformationScreenIcon;

	@iOSFindBy(accessibility = "GIVE YOUR CAR A NAME")
	public MobileElement CarNameScreenTitle;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='Car Name']")
	public MobileElement InformationScreenCarNameField;

	@iOSFindBy(accessibility = "NextBtn")
	public MobileElement NextButton;

	@iOSFindBy(accessibility = "ADD CAR PLATE NUMBER")
	public MobileElement PlateNumberScreenTitle;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='Plate Number']")
	public MobileElement InformationScreenPlateNumberField;

	@iOSFindBy(accessibility = "CAR REGISTRATION EXPIRATION DATE")
	public MobileElement RegistrationScreenTitle;

	@iOSFindBy(accessibility = "REMIND ME FOR REGISTRATION RENEWAL")
	public MobileElement RegistrationRenewalDisclaimer;

	@iOSFindBy(accessibility = "CAR INSURANCE EXPIRATION DATE")
	public MobileElement InsuranceScreenTitle;

	@iOSFindBy(accessibility = "REMIND ME FOR INSURANCE RENEWAL")
	public MobileElement InsuranceRenewalDisclaimer;

	@iOSFindBy(accessibility = "ADDITIONAL INFO")
	public MobileElement FinalScreenTitle;

	@iOSFindBy(accessibility = "CheckMarkNextBtnImg")
	public MobileElement DoneButton;

	@iOSFindBy(accessibility = "Are you sure you want to delete this car?")
	public MobileElement PopUpmessage;

	@iOSFindBy(accessibility = "No")
	public MobileElement NoFromPopUp;

	@iOSFindBy(accessibility = "Yes")
	public MobileElement YesFromPopUp;

	@iOSFindBy(accessibility = "VEHICLE CHASSIS NUMBER")
	public MobileElement VehicleChassisNumberTitle;

	@iOSFindBy(accessibility = "Enter Chassis Number")
	public MobileElement VehicleChassisNumberField;

	@iOSFindBy(accessibility = "ADD MORE INFORMATION")
	public MobileElement AddMoreInformationButton;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='Registration Expiration Date']")
	public MobileElement RegistrationExpirationField;

	@iOSFindBy(xpath = "//XCUIElementTypePickerWheel[1]")
	public MobileElement MonthfieldDatePicker;

	@iOSFindBy(xpath = "//XCUIElementTypePickerWheel[2]")
	public MobileElement DatefieldDatePicker;

	@iOSFindBy(xpath = "//XCUIElementTypePickerWheel[3]")
	public MobileElement YearfieldDatePicker;

	@iOSFindBy(accessibility = "Done")
	public MobileElement DoneButtonFromDatePicker;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='Insurance Expiration Date']")
	public MobileElement InsuranceExpirationField;

	@iOSFindBy(accessibility = "Owner")
	public MobileElement CustomerType;

	@iOSFindBy(accessibility = "New")
	public MobileElement CarPurchasedOption;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Total Care\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther")
	public MobileElement carimagesection;

	@iOSFindBy(accessibility = "Camera")
	public MobileElement ChangeCarImageFirstOption;

	@iOSFindBy(accessibility = "Choose From Library")
	public MobileElement ChangeCarImageSecondOption;

	@iOSFindBy(accessibility = "RANGE ROVER")
	public MobileElement VehicleModel;

	@iOSFindBy(accessibility = "EGYPT")
	public MobileElement VehicleCountry;

	@iOSFindBy(accessibility = "MM GROUP FOR INDUSTRY & INTL. TRADE")
	public MobileElement VehicleDealer;

	@iOSFindBy(accessibility = "2015-06-21")
	public MobileElement VehicleHandOverDate;

	@iOSFindBy(accessibility = "You have completed your registration.")
	public MobileElement CongratulationsMessage;

	@iOSFindBy(accessibility = "Return to My Cars")
	public MobileElement ReturnToHomeOption;

	@iOSFindBy(accessibility = "CheckMarkNextBtnImg")
	public MobileElement AddVehicleDoneButton;

	@iOSFindBy(accessibility = "PhotoCapture")
	public MobileElement cameraPhotoCaptureButton;

	@iOSFindBy(accessibility = "Use Photo")
	public MobileElement usePhotoIcon;
}

//
//