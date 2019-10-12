package com.mobile.app.pages;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import com.mobile.app.pageObjects.BookAServicePageObjects;
import com.mobile.core.Base;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BookAServicePage extends Base {

	private BookAServicePageObjects BookaServicePageObject = new BookAServicePageObjects();

	public BookAServicePage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), BookaServicePageObject);
	}

	public void verifyTheHomeScreenicon() {
		verifyElement(BookaServicePageObject.HomeScreenLogo);
	}

	public void clickMainMenuButton() {
		isElementClickable(BookaServicePageObject.MainMenuButton);
		clickElement(BookaServicePageObject.MainMenuButton);
	}

	public void clickServicesOption() {
		isElementClickable(BookaServicePageObject.ServicesOption);
		clickElement(BookaServicePageObject.ServicesOption);
	}

	public void clickBookaServiceOption() {
		clickElement(BookaServicePageObject.BookaServiceOption);
	}

	public void verifyTheHeaderForBookAService(String arg1) {
		verifyElement(BookaServicePageObject.BookaServiceHeader);
	}

	public void clickBookaServicefromHomeScreen() {
		clickElement(BookaServicePageObject.HomeScreenBookAService);
	}

	public void clickSettingsFromSlideMenu() {

		moveDownToElement(BookaServicePageObject.sideMenuTable, BookaServicePageObject.SettingsFromSlidemenu, 2);
		clickElement(BookaServicePageObject.SettingsFromSlidemenu);
	}

	public void clickCustomizeQuickMenu() {
		moveDownToElement(BookaServicePageObject.sideMenuTable, BookaServicePageObject.CustomizeQuickBar, 1);
		clickElement(BookaServicePageObject.CustomizeQuickBar);
	}

	public void verifyBookAServicefromCQM() {
		verifyElement(BookaServicePageObject.BookaServiceFromQuickMenu);
	}

	public void clickHomeFromSlideMenu() {
		clickElement(BookaServicePageObject.HomeButton);
	}

	public void verifyServiceCenterSubheader() {
		verifyElement(BookaServicePageObject.ServiceCenterSubHeader);
	}

	public void verifyStepNavigatorchoosecenter() {
		verifyElement(BookaServicePageObject.Stepnavigator1);

	}

	public void verifyStepNavigatorCarDetails() {
		verifyElement(BookaServicePageObject.Stepnavigator2);
	}

	public void verifyStepNavigatorBookingDetails() {
		verifyElement(BookaServicePageObject.Stepnavigator3);
	}

	public void verifyStepNavigatorConfirmation() {
		verifyElement(BookaServicePageObject.Stepnavigator4);
	}

	public void verifyMyLoacation() {
		verifyElement(BookaServicePageObject.MyLocation);
	}

	public void verifyListViewButton() {
		verifyElement(BookaServicePageObject.ListViewIcon);
	}

	public void clickLocationFromSettings() {
		moveDownToElement(BookaServicePageObject.sideMenuTable, BookaServicePageObject.LocationFromSettingsMenu, 1);
		clickElement(BookaServicePageObject.LocationFromSettingsMenu);
	}

	public void verifyAutodetectLocation() {

		verifyElement(BookaServicePageObject.AutoDetectLocationSwitch);
	}

	public void clickOnServiceCenterLocation() {
		clickElement(BookaServicePageObject.ServiceCenterPinLocation);
	}

	public void verifyServiceCenterName(String arg1) {
		verifyElement(BookaServicePageObject.ServiceCenterName);
	}

	public void verifyServiceCenterAddress(String arg1) {
		verifyElement(BookaServicePageObject.ServiceCenterAddress);
	}

	public void verifyDropDownButton() {
		verifyElement(BookaServicePageObject.DropDowniconmapview);
	}

	public void verifyNextButton() {
		verifyElement(BookaServicePageObject.NextButton);
	}

	public void clickOnDropDownButton() {
		clickElement(BookaServicePageObject.DropDowniconmapview);
	}

	public void verifyCallButton(String arg1) {
		verifyElement(BookaServicePageObject.DDCalloption);
	}

	public void verifyEmailButton(String arg1) {
		verifyElement(BookaServicePageObject.DDEmailoption);
	}

	public void verifyWebsiteButton(String arg1) {
		verifyElement(BookaServicePageObject.DDWebSiteoption);
	}

	public void verifyNavigateButton(String arg1) {
		verifyElement(BookaServicePageObject.DDNavigateoption);
	}

	public void clickOnlistViewIcon() {
		clickElement(BookaServicePageObject.ListViewIcon);
	}

	public void verifyTakeMeThereButton(String arg1) {
		verifyElement(BookaServicePageObject.DDTakemeThereoption);
	}

	public void clickOnNextButton() {
		clickElement(BookaServicePageObject.NextButton);
	}

	public void verifySecondScreenHeader(String arg1) {
		verifyElement(BookaServicePageObject.SelectcarHeader);
	}

	public void clickOnDropDownIconfromListView() {
		clickElement(BookaServicePageObject.DropDowniconListview);
	}

	public void clickOnServiceCenterfromListView(String arg1) {
		clickElement(BookaServicePageObject.ServiceCenterName);
	}

	public void verifyPlateNumberField() {
		verifyElement(BookaServicePageObject.PlateNumberField);
	}

	public void verifyMileageField() {
		verifyElement(BookaServicePageObject.MileageField);
	}

	public void verifyCarDetailsScreenNextButton() {
		verifyElement(BookaServicePageObject.CarDetailsNextButton);
	}

	public void verifyCarDetailsCarSelector() {
		verifyElement(BookaServicePageObject.CarDetailscarSelector);
	}

	public void EnterMileage(String mileage) {
		enterText(BookaServicePageObject.MileageField, mileage);
	}

	public void clicknextButton() {
		clickElement(BookaServicePageObject.CarDetailsNextButton);
	}

	public void clickDoneToDismissNumpad() {
		clickElement(BookaServicePageObject.DoneButton);
	}

	public void verifyErrorMessageForMileage(String arg1) {
		System.out.println("\n\nExpected Message : " + arg1);
		System.out.println("\n\nDisplayed Message : " + ImageToText_Compare());
		Assert.assertTrue(arg1 + " : error message not found", ImageToText_Compare().contains(arg1));
	}

	public void clearPlateNumberField() {
		clearField(BookaServicePageObject.PlateNumberField);
	}

	public void EnterPlateNumber(String plate) {
		enterText(BookaServicePageObject.PlateNumberFieldwithoutvalue, plate);
	}

	public void verifyErrorMessageForPlateNoField(String arg1) {
		System.out.println("\n\nExpected Message : " + arg1);
		System.out.println("\n\nDisplayed Message : " + ImageToText_Compare());
		Assert.assertTrue(arg1 + " : error message not found", ImageToText_Compare().contains(arg1));
	}

	public void verifyErrorForMileageField(String arg1) {
		System.out.println("\n\nExpected Message : " + arg1);
		System.out.println("\n\nDisplayed Message : " + ImageToText_Compare());
		Assert.assertTrue(arg1 + " : error message not found", ImageToText_Compare().contains(arg1));
	}

	public void clickReturnButton() {
		clickElement(BookaServicePageObject.ReturnFromKeyBoard);
	}

	public void verifyPreferredDateField() {
		verifyElement(BookaServicePageObject.PreferredDate);
	}

	public void verifyPreferredTimeField() {
		verifyElement(BookaServicePageObject.PreferredTime);
	}

	public void verifyBookingDetailsDisclaimer(String arg1) {
		System.out.println("\n\nExpected Message : " + arg1);
		System.out.println("\n\nDisplayed Message : " + ImageToText_Compare());
		Assert.assertTrue(arg1 + " : error message not found", ImageToText_Compare().contains(arg1));
	}

	public void verifyCameraIcon() {
		moveDownToElement(BookaServicePageObject.sideMenuTable, BookaServicePageObject.CameraIcon, 1);
		verifyElement(BookaServicePageObject.CameraIcon);
	}

	public void verifyAdditionalInfoBox() {
		verifyElement(BookaServicePageObject.AdditionalInfoBox);
	}

	public void verifyThirdScreenSubTitle() {
		verifyElement(BookaServicePageObject.BookingDetailsHeader);
	}

	public void verifyPreferredDateErrorMessage(String arg1) {
		System.out.println("\n\nExpected Message : " + arg1);
		System.out.println("\n\nDisplayed Message : " + ImageToText_Compare());
		Assert.assertTrue(arg1 + " : error message not found", ImageToText_Compare().contains(arg1));
	}

	public void verifyPreferredTimeErrorMessage(String arg1) {
		System.out.println("\n\nExpected Message : " + arg1);
		System.out.println("\n\nDisplayed Message : " + ImageToText_Compare());
		Assert.assertTrue(arg1 + " : error message not found", ImageToText_Compare().contains(arg1));
	}

	public void clickintopreferredDateField() {
		clickElement(BookaServicePageObject.PreferredDate);
	}

	public void clickintopreferredTimeField() {
		clickElement(BookaServicePageObject.PreferredTime);
	}

	public void SetTheTimeas(String date) {
		//BookaServicePageObject.TimeFieldPicker.sendKeys(arg1);
		enterText(BookaServicePageObject.TimeFieldPicker, date);
	}

	public void verifyConfirmationscreenSubtitle() {
		verifyElement(BookaServicePageObject.ConfirmationscreenSubTitle);
	}

	public void confirmationscreenModelandYearvalue(String arg1) {
		verifyElement(BookaServicePageObject.ConfirmationscreenModelandyear);
	}

	public void confirmationscreenPlateNumbervalue(String arg1) {
		verifyElement(BookaServicePageObject.ConfirmationscreenPlateNumber);
	}

	public void confirmationscreenMileagevalue(String arg1) {
		verifyElement(BookaServicePageObject.ConfirmationscreenMileage);
	}

	public void confirmationscreenpreferredTimevalue(String arg1) {
		// moveDownToElement(BookaServicePageObject.ConfirmationscreenPreferredTime, 1);
		verifyElement(BookaServicePageObject.ConfirmationscreenPreferredTime);
	}

	public void confirmationscreenSubmitbutton() {
		verifyElement(BookaServicePageObject.ConfirmationscreenSubmitButton);
	}

	public void confirmationscreenCrossbutton() {
		clickElement(BookaServicePageObject.ConfirmationscreenCrossButton);
	}

	public void clickSubmitButton() {
		clickElement(BookaServicePageObject.ConfirmationscreenSubmitButton);
	}

	public void verifySuccessfulServiceMessage(String arg1) {
		System.out.println("\n\nExpected Message : " + arg1);
		System.out.println("\n\nDisplayed Message : " + ImageToText_Compare());
		Assert.assertTrue(arg1 + " : error message not found", ImageToText_Compare().contains(arg1));
	}

}
