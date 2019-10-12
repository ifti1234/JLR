package cucumber.stepDefinitions;

import com.mobile.app.pages.MyCarsPage;
import com.mobile.core.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyCarsStepDefinitions extends Base {

	MyCarsPage mycarpageObject = new MyCarsPage();

	@Given("^User tap on main menu icon from home screen$")
	public void user_tap_on_main_menu_icon_from_home_screen() {
		mycarpageObject.clickOnMainMenuIcon();
	}

	@When("^User tap on My cars option from slide menu$")
	public void user_tap_on_My_cars_option_from_slide_menu() {
		mycarpageObject.clickOnMyCarsIconFromSlideMenu();
	}

	@When("^verify the screen title is present as \"([^\"]*)\"$")
	public void verify_the_screen_title_is_present_as(String arg1) {
		mycarpageObject.verifyMyCarsScreenTitle(arg1);
	}

	@When("^verify the Delete Car icon in present$")
	public void verify_the_Delete_Car_icon_in_present() {
		mycarpageObject.verifyMyCarsScreenDeleteButton();
	}

	@When("^verify the Add car icon is present$")
	public void verify_the_Add_car_icon_is_present() {
		mycarpageObject.verifyMyCarsScreenAddCarButton();
	}

	@When("^Verify the Car Model is coming as \"([^\"]*)\"$")
	public void verify_the_Car_Model_is_coming_as(String arg1) {
		mycarpageObject.verifyMyCarsDetailsCarModel(arg1);
	}

	@When("^Verify the car Handover date as \"([^\"]*)\"$")
	public void verify_the_car_Handover_date_as(String arg1) {
		mycarpageObject.verifyMyCarsDetailsCarHandOverDate(arg1);
	}

	@Then("^Verify the VIN number as \"([^\"]*)\"$")
	public void verify_the_VIN_number_as(String arg1) {
		mycarpageObject.verifyMyCarsDetailsCarVINnumber(arg1);
	}

	@Then("^verify the country as \"([^\"]*)\"$")
	public void verify_the_country_as(String arg1) {
		mycarpageObject.verifyMyCarsDetailsCarCountry(arg1);
	}

	@Then("^verify the showroom name as \"([^\"]*)\"$")
	public void verify_the_showroom_name_as(String arg1) {
		mycarpageObject.verifyMyCarsDetailsCarShowroom(arg1);
	}

	@Then("^verify the edit information button is present$")
	public void verify_the_edit_information_button_is_present() {
		mycarpageObject.verifyMyCarsEditInformationButton();
	}

	@Then("^click on Edit Information button$")
	public void click_on_Edit_Information_button() {
		mycarpageObject.clickOnEditInformationButton();
	}

	@Then("^verify the Info Icon$")
	public void verify_the_Info_Icon() {
		mycarpageObject.verifyEditInformationScreenInfoIcon();
	}

	@Then("^verify the car name screen title is present as \"([^\"]*)\"$")
	public void verify_the_car_name_screen_title_is_present_as(String arg1) {
		mycarpageObject.verifyMyCarsEditInformationCarNameScreenTitle(arg1);
	}

	@Then("^verify the Car Name field is present$")
	public void verify_the_Car_Name_field_is_present() {
		mycarpageObject.verifyMyCarsEditInformationCarNameField();
	}

	@Then("^click on Next button$")
	public void click_on_Next_button() {
		mycarpageObject.clickOnNextButton();
	}

	@Then("^verify the plate number screen title is present as \"([^\"]*)\"$")
	public void verify_the_plate_number_screen_title_is_present_as(String arg1) {
		mycarpageObject.verifyMyCarsEditInformationPlateNumberScreenTitle(arg1);
	}

	@Then("^verify the Plate Number field is present$")
	public void verify_the_Plate_Number_field_is_present() {
		mycarpageObject.verifyMyCarsEditInformationPlateNumberField();
	}

	@Then("^verify the Car Registration screen title is present as \"([^\"]*)\"$")
	public void verify_the_Car_Registration_screen_title_is_present_as(String arg1) {
		mycarpageObject.verifyRegistrationScreenTitle(arg1);
	}

	@Then("^verify the disclaimer for registration renewal as \"([^\"]*)\"$")
	public void verify_the_disclaimer_for_registration_renewal_as(String arg1) {
		mycarpageObject.verifyRegistrationScreenDisclaimer(arg1);
	}

	@Then("^verify the car insurance title is present as \"([^\"]*)\"$")
	public void verify_the_car_insurance_title_is_present_as(String arg1) {
		mycarpageObject.verifyInsuranceScreenTitle(arg1);
	}

	@Then("^verify the disclaimer for INSURANCE renewal as \"([^\"]*)\"$")
	public void verify_the_disclaimer_for_INSURANCE_renewal_as(String arg1) {
		mycarpageObject.verifyInsuranceScreenDisclaimer(arg1);
	}

	@Then("^verify the final screen info is present as \"([^\"]*)\"$")
	public void verify_the_final_screen_info_is_present_as(String arg1) {
		mycarpageObject.verifyAdditionalInfScreentitle(arg1);
	}

	@Then("^tap on the Done button$")
	public void tap_on_the_Done_button() {
		mycarpageObject.clickOnDoneButton();
		sleep(2);
	}

	@Then("^verify the success message as \"([^\"]*)\"$")
	public void verify_the_success_message_as(String arg1) {
		mycarpageObject.verifySuccessMessage(arg1);
	}

	@When("^user tap on Delete car button$")
	public void user_tap_on_Delete_car_button() {
		mycarpageObject.clickOnDeleteCarButton();
	}

	@When("^verify the pop up message as \"([^\"]*)\"$")
	public void verify_the_pop_up_message_as(String arg1) {
		mycarpageObject.verifyPopUpmessage(arg1);
	}

	@When("^user tap on No button$")
	public void user_tap_on_No_button() {
		mycarpageObject.clickOnNoFromPopup();
	}

	@When("^user tap on Yes button$")
	public void user_tap_on_Yes_button() {
		mycarpageObject.clickOnYesFromPopup();
		sleep(1);
	}

	@Then("^verify the successful delete car message as \"([^\"]*)\"$")
	public void verify_the_successful_delete_car_message_as(String arg1) {
		mycarpageObject.deleteCarSuccessMessage(arg1);
	}

	@Then("^user tap on Add car button$")
	public void user_tap_on_Add_car_button() {
		mycarpageObject.clickOnAddCarButton();
	}

	@Then("^verify the Vehicle chassis number header is present as \"([^\"]*)\"$")
	public void verify_the_Vehicle_chassis_number_header_is_present_as(String arg1) {
		mycarpageObject.chassisNumberScreenTitle();
	}

	@Then("^user enter the chassis number as \"([^\"]*)\"$")
	public void user_enter_the_chassis_number_as(String arg1) {
		mycarpageObject.enterChassisNumber(arg1);
		ReturnKeyFromKeyBoard();
	}

	@Then("^verify the field error message is present as \"([^\"]*)\"$")
	public void verify_the_field_error_message_is_present_as(String arg1) {
		mycarpageObject.chassisNumberFieldErrorMessage(arg1);
	}

	@Then("^Enter the car name as \"([^\"]*)\"$")
	public void enter_the_car_name_as(String arg1) {
		mycarpageObject.enterCarName(arg1);
		ReturnKeyFromKeyBoard();
	}

	@Then("^Enter plate number as \"([^\"]*)\"$")
	public void enter_plate_number_as(String arg1) {
		mycarpageObject.enterPlateNumber(arg1);
		ReturnKeyFromKeyBoard();
	}

	@Then("^tap on the Registration date field$")
	public void tap_on_the_Registration_date_field() {
		mycarpageObject.clickRegistrationExpirationDateField();
	}

	@Then("^click on add more Information button$")
	public void click_on_add_more_Information_button() {
		mycarpageObject.clickOnAddMoreInformation();
	}

	@Then("^user select the month as \"([^\"]*)\"$")
	public void user_select_the_month_as(String arg1) {
		mycarpageObject.setTheMonthAs(arg1);
	}

	@Then("^user select the date as \"([^\"]*)\"$")
	public void user_select_the_date_as(String arg1) {
		mycarpageObject.setTheDateAs(arg1);
	}

	@Then("^user select the Year as \"([^\"]*)\"$")
	public void user_select_the_Year_as(String arg1) {
		mycarpageObject.setTheYearAs(arg1);
	}

	@Then("^user tap on Done button$")
	public void user_tap_on_Done_button() {
		mycarpageObject.clickDoneFromDatePicker();
	}

	@Then("^tap on the Insurance date field$")
	public void tap_on_the_Insurance_date_field() {
		mycarpageObject.clickInsuranceExpirationDateField();
	}

	@Then("^user select the customer type as Owner$")
	public void user_select_the_customer_type_as_Owner() {
		mycarpageObject.clickCustomertype();
	}

	@Then("^user select the car purchased as New$")
	public void user_select_the_car_purchased_as_New() {
		mycarpageObject.clickCarPurchasedAsOption();
	}

	@When("^tap on car image section$")
	public void tap_on_car_image_section() {
		mycarpageObject.clickOnCarImage();
	}

	@When("^verify the first option for changing the image as \"([^\"]*)\"$")
	public void verify_the_first_option_for_changing_the_image_as(String arg1) {
		mycarpageObject.verifyFirstImageOption(arg1);
	}

	@When("^verify the Second option for changing the image as \"([^\"]*)\"$")
	public void verify_the_Second_option_for_changing_the_image_as(String arg1) {
		mycarpageObject.verifySecondImageOption(arg1);
	}

	@Then("^verify the congratulations message as \"([^\"]*)\"$")
	public void verify_the_congratulations_message_as(String arg1) {
		mycarpageObject.verifyCongratulationsMessage(arg1);
	}

	@Then("^verify the screen header as \"([^\"]*)\"$")
	public void verify_the_screen_header_as(String arg1) {
		mycarpageObject.verifyScreenHeader(arg1);
	}

	@Then("^verify the Model of the car is \"([^\"]*)\"$")
	public void verify_the_Model_of_the_car_is(String arg1) {
		mycarpageObject.verifyVehicleModel(arg1);
	}

	@Then("^verify the Dealer name as \"([^\"]*)\"$")
	public void verify_the_Dealer_name_as(String arg1) {
		mycarpageObject.verifyVehicleDealerName(arg1);
	}

	@Then("^click on Return to my cars option$")
	public void click_on_Return_to_my_cars_option() {
		mycarpageObject.clickReturnToHomeOption();
	}
	@Then("^verify the Vehicle Handover date as \"([^\"]*)\"$")
	public void verify_the_Vehicle_Handover_date_as(String arg1){
		mycarpageObject.verifyVehicleHandOverDate(arg1);
	}
	@Then("^user tap on Done button for add vehicle$")
	public void user_tap_on_Done_button_for_add_vehicle(){
		mycarpageObject.clickDoneButtonForAddVehicle();
	}
	
	@When("^user select the camera icon for image$")
	public void user_select_the_camera_icon_for_image(){
		mycarpageObject.selectCameraOption();
	}

	@When("^user click the image using camera$")
	public void user_click_the_image_using_camera(){
		mycarpageObject.capturePhotoButton();
	}

	@When("^user tap on use photo option$")
	public void user_tap_on_use_photo_option(){
		mycarpageObject.usePhotobutton();
	}
}
