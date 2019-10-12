package com.mobile.app.pages;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import com.mobile.app.pageObjects.MyCarsPageObjects;
import com.mobile.core.Base;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyCarsPage extends Base {

	private MyCarsPageObjects mycarspageobjects = new MyCarsPageObjects();

	public MyCarsPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), mycarspageobjects);
	}

	public void clickOnMainMenuIcon() {
		isElementClickable(mycarspageobjects.MainMenuButton);
		clickElement(mycarspageobjects.MainMenuButton);
	}

	public void clickOnMyCarsIconFromSlideMenu() {
		isElementClickable(mycarspageobjects.MyCarsButton);
		clickElement(mycarspageobjects.MyCarsButton);
	}

	public void verifyMyCarsScreenTitle(String arg1) {
		verifyElement(mycarspageobjects.MyCarsScreenTitle);
	}

	public void verifyMyCarsScreenDeleteButton() {
		verifyElement(mycarspageobjects.MyCarsDeleteButton);
	}

	public void verifyMyCarsScreenAddCarButton() {
		verifyElement(mycarspageobjects.AddCarButton);
	}

	public void verifyMyCarsDetailsCarModel(String arg1) {
		verifyElement(mycarspageobjects.CarModelnumber);
	}

	public void verifyMyCarsDetailsCarHandOverDate(String arg1) {
		verifyElement(mycarspageobjects.HandOverDate);
	}

	public void verifyMyCarsDetailsCarVINnumber(String arg1) {
		verifyElement(mycarspageobjects.VINnumber);
	}

	public void verifyMyCarsDetailsCarCountry(String arg1) {
		verifyElement(mycarspageobjects.CountryoftheCar);
	}

	public void verifyMyCarsDetailsCarShowroom(String arg1) {
		verifyElement(mycarspageobjects.Showroomname);
	}

	public void verifyMyCarsEditInformationButton() {
		verifyElement(mycarspageobjects.EditInformationButton);
	}

	public void clickOnEditInformationButton() {
		clickElement(mycarspageobjects.EditInformationButton);
	}

	public void verifyEditInformationScreenInfoIcon() {
		verifyElement(mycarspageobjects.InformationScreenIcon);
	}

	public void verifyMyCarsEditInformationCarNameScreenTitle(String arg1) {
		verifyElement(mycarspageobjects.CarNameScreenTitle);
	}

	public void verifyMyCarsEditInformationCarNameField() {
		verifyElement(mycarspageobjects.EditInformationButton);
	}

	public void clickOnNextButton() {
		clickElement(mycarspageobjects.NextButton);
	}

	public void verifyMyCarsEditInformationPlateNumberScreenTitle(String arg1) {
		verifyElement(mycarspageobjects.PlateNumberScreenTitle);
	}

	public void verifyMyCarsEditInformationPlateNumberField() {
		verifyElement(mycarspageobjects.InformationScreenPlateNumberField);
	}

	public void verifyRegistrationScreenTitle(String arg1) {
		verifyElement(mycarspageobjects.RegistrationScreenTitle);
	}

	public void verifyRegistrationScreenDisclaimer(String arg1) {
		verifyElement(mycarspageobjects.RegistrationRenewalDisclaimer);
	}

	public void verifyInsuranceScreenTitle(String arg1) {
		verifyElement(mycarspageobjects.InsuranceScreenTitle);
	}

	public void verifyInsuranceScreenDisclaimer(String arg1) {
		verifyElement(mycarspageobjects.InsuranceRenewalDisclaimer);
	}

	public void verifyAdditionalInfScreentitle(String arg1) {
		verifyElement(mycarspageobjects.FinalScreenTitle);
	}

	public void clickOnDoneButton() {
		clickElement(mycarspageobjects.DoneButton);
	}

	public void verifySuccessMessage(String arg1) {
		System.out.println("\n\nExpected Message : " + arg1);
		System.out.println("\n\nDisplayed Message : " + ImageToText_Compare());
		Assert.assertTrue(arg1 + " : error message not found", ImageToText_Compare().contains(arg1));
	}

	public void clickOnDeleteCarButton() {
		clickElement(mycarspageobjects.MyCarsDeleteButton);
	}

	public void verifyPopUpmessage(String arg1) {
		verifyElement(mycarspageobjects.PopUpmessage);
	}

	public void clickOnNoFromPopup() {
		clickElement(mycarspageobjects.NoFromPopUp);
	}

	public void clickOnYesFromPopup() {
		clickElement(mycarspageobjects.YesFromPopUp);
	}

	public void deleteCarSuccessMessage(String arg1) {
		System.out.println("\n\nExpected Message : " + arg1);
		System.out.println("\n\nDisplayed Message : " + ImageToText_Compare());
		Assert.assertTrue(arg1 + " : error message not found", ImageToText_Compare().contains(arg1));
	}

	public void clickOnAddCarButton() {
		clickElement(mycarspageobjects.AddCarButton);
	}

	public void chassisNumberFieldErrorMessage(String arg1) {
		System.out.println("\n\nExpected Message : " + arg1);
		System.out.println("\n\nDisplayed Message : " + ImageToText_Compare());
		Assert.assertTrue(arg1 + " : error message not found", ImageToText_Compare().contains(arg1));
	}

	public void chassisNumberScreenTitle() {
		verifyElement(mycarspageobjects.VehicleChassisNumberTitle);
	}

	public void enterChassisNumber(String chassis) {
		enterText(mycarspageobjects.VehicleChassisNumberField, chassis);
	}

	public void clickOnAddMoreInformation() {
		clickElement(mycarspageobjects.AddMoreInformationButton);
	}

	public void enterCarName(String name) {
		enterText(mycarspageobjects.InformationScreenCarNameField, name);
	}

	public void enterPlateNumber(String plate) {
		enterText(mycarspageobjects.InformationScreenPlateNumberField, plate);
	}

	public void clickRegistrationExpirationDateField() {
		clickElement(mycarspageobjects.RegistrationExpirationField);
	}

	public void setTheMonthAs(String arg1) {
		mycarspageobjects.MonthfieldDatePicker.sendKeys(arg1);
	}

	public void setTheDateAs(String arg1) {
		mycarspageobjects.DatefieldDatePicker.sendKeys(arg1);
	}

	public void setTheYearAs(String arg1) {
		mycarspageobjects.YearfieldDatePicker.sendKeys(arg1);
	}

	public void clickDoneFromDatePicker() {
		clickElement(mycarspageobjects.DoneButtonFromDatePicker);
	}

	public void clickInsuranceExpirationDateField() {
		clickElement(mycarspageobjects.InsuranceExpirationField);
	}

	public void clickCustomertype() {
		clickElement(mycarspageobjects.CustomerType);
	}

	public void clickCarPurchasedAsOption() {
		clickElement(mycarspageobjects.CarPurchasedOption);
	}

	public void clickOnCarImage() {
		clickElement(mycarspageobjects.carimagesection);
	}

	public void verifyFirstImageOption(String arg1) {
		verifyElement(mycarspageobjects.ChangeCarImageFirstOption);
	}

	public void verifySecondImageOption(String arg1) {
		verifyElement(mycarspageobjects.ChangeCarImageSecondOption);
	}

	public void verifyCongratulationsMessage(String arg1) {
		verifyElement(mycarspageobjects.CongratulationsMessage);
	}

	public void verifyScreenHeader(String arg1) {
		verifyElement(mycarspageobjects.VehicleChassisNumberTitle);
	}

	public void verifyVehicleModel(String arg1) {
		verifyElement(mycarspageobjects.VehicleModel);
	}

	public void verifyVehicleDealerName(String arg1) {
		verifyElement(mycarspageobjects.VehicleDealer);
	}

	public void clickReturnToHomeOption() {
		clickElement(mycarspageobjects.ReturnToHomeOption);
	}
	public void verifyVehicleHandOverDate(String arg1) {
		verifyElement(mycarspageobjects.VehicleHandOverDate);
	}
	public void clickDoneButtonForAddVehicle() {
		clickElement(mycarspageobjects.AddVehicleDoneButton);
	}
	
	public void selectCameraOption() {
		clickElement(mycarspageobjects.ChangeCarImageFirstOption);
	}
	
	public void capturePhotoButton() {
		clickElement(mycarspageobjects.cameraPhotoCaptureButton);
	}
	
	public void usePhotobutton() {
		clickElement(mycarspageobjects.usePhotoIcon);
	}
	
}
