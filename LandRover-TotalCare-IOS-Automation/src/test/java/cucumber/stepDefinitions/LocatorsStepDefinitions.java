package cucumber.stepDefinitions;

import com.mobile.app.pages.LocatorsPage;
import com.mobile.core.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LocatorsStepDefinitions extends Base {
	LocatorsPage locatorspageobj = new LocatorsPage();

	@Given("^User Tap on Main Menu Icon$")
	public void user_Tap_on_Main_Menu_Icon() {
		locatorspageobj.clickOnMainMenuIcon();
	}

	@Given("^User Tap on Services Option$")
	public void user_Tap_on_Services_Option() {
		locatorspageobj.clickOnServicesOptionFromMainMenu();
	}

	@Then("^Verify the Locators option is present$")
	public void verify_the_Locators_option_is_present() {
		locatorspageobj.verifyLocatorsOption();
	}

	@Then("^Verify the Book a Service option is present$")
	public void verify_the_Book_a_Service_option_is_present() {
		locatorspageobj.verifyBookAServiceOption();
	}

	@Then("^Verify the Customer care option is present$")
	public void verify_the_Customer_care_option_is_present() {
		locatorspageobj.verifyCustomerCareOption();
	}

	@Then("^Verify the Road Side Assistance option is present$")
	public void verify_the_Road_Side_Assistance_option_is_present() {
		locatorspageobj.verifyRoadSideAssistanceOption();
	}

	@When("^User Tap on Locators Option$")
	public void user_Tap_on_Locators_Option() {
		locatorspageobj.clickOnLocatorsOption();
	}

	@Then("^Verify the Locators screen header is present as \"([^\"]*)\"$")
	public void verify_the_Locators_screen_header_is_present_as(String arg1) {
		locatorspageobj.verifyLocatorsScreenHeader(arg1);
	}

	@Then("^Verify the Search icon is present$")
	public void verify_the_Search_icon_is_present() {

	}

	@Then("^Verify the showroom option is present$")
	public void verify_the_showroom_option_is_present() {
		locatorspageobj.verifyShowroomOption();
	}

	@Then("^Verify the Service option is present$")
	public void verify_the_Service_option_is_present() {
		locatorspageobj.verifyServiceOption();
	}

	@Then("^Verify the Parts option is present$")
	public void verify_the_Parts_option_is_present() {
		locatorspageobj.verifyPartsOption();
	}

	@Then("^Verify the Gas option is present$")
	public void verify_the_Gas_option_is_present() {
		locatorspageobj.verifyGASOption();
	}

	@Then("^Verify the ATM option is present$")
	public void verify_the_ATM_option_is_present() {
		locatorspageobj.verifyATMOption();
	}

	@Then("^User Tap on Showroom option$")
	public void user_Tap_on_Showroom_option() {
		locatorspageobj.clickOnShowRoomOption();
	}

	@Then("^Verify the Showroom header as \"([^\"]*)\"$")
	public void verify_the_Showroom_header_as(String arg1) {
		locatorspageobj.verifyHeaderForShowroomOption(arg1);
	}

	@Then("^User Tap on Service option$")
	public void user_Tap_on_Service_option() {
		locatorspageobj.clickOnServicesOption();
	}

	@Then("^Verify the Service header as \"([^\"]*)\"$")
	public void verify_the_Service_header_as(String arg1) {
		locatorspageobj.verifyHeaderForServicesOption(arg1);
	}

	@Then("^User Tap on Parts option$")
	public void user_Tap_on_Parts_option() {
		locatorspageobj.clickOnPartsOption();
	}

	@Then("^Verify the Parts header as \"([^\"]*)\"$")
	public void verify_the_Parts_header_as(String arg1) {
		locatorspageobj.verifyHeaderForPartsOption(arg1);
	}

	@Then("^User Tap on GAS option$")
	public void user_Tap_on_GAS_option() {
		locatorspageobj.clickOnGASOption();
	}

	@Then("^Verify the GAS header as \"([^\"]*)\"$")
	public void verify_the_GAS_header_as(String arg1) {
		locatorspageobj.verifyHeaderForGASOption(arg1);
	}

	@Then("^User Tap on ATM option$")
	public void user_Tap_on_ATM_option() {
		locatorspageobj.clickOnATMOption();
	}

	@Then("^Verify the ATM header as \"([^\"]*)\"$")
	public void verify_the_ATM_header_as(String arg1) {
		locatorspageobj.verifyHeaderForATMOption(arg1);
	}

	@Then("^Tap on the pin location$")
	public void tap_on_the_pin_location() {
		locatorspageobj.clickOnPinLocationForShowroom();
	}

	@Then("^verify the name of the showroom as \"([^\"]*)\"$")
	public void verify_the_name_of_the_showroom_as(String arg1) {
		locatorspageobj.verifyNameOfTheShowroom(arg1);
	}

	@Then("^verify the address of the showroom as \"([^\"]*)\"$")
	public void verify_the_address_of_the_showroom_as(String arg1) {
		locatorspageobj.verifyAddressOfTheShowroom(arg1);
	}

	@Then("^verify the timing is present as \"([^\"]*)\"$")
	public void verify_the_timing_is_present_as(String arg1) {
		locatorspageobj.verifyTimingOfTheShowroom(arg1);
	}

	@Then("^verify the DropDown icon is present$")
	public void verify_the_DropDown_icon_is_present() {
		locatorspageobj.verifyDropdownIcon();
	}

	@Then("^user Tap on DropDown Icon$")
	public void user_Tap_on_DropDown_Icon() {
		locatorspageobj.clickOnDropDownIcon();
	}

	@Then("^Verify that Call option is present$")
	public void verify_that_Call_option_is_present() {
		locatorspageobj.verifyDropdownCallButton();
	}

	@Then("^Verify that Email option is present$")
	public void verify_that_Email_option_is_present() {
		locatorspageobj.verifyDropdownEmailButton();
	}

	@Then("^Verify that Visit Website option is present$")
	public void verify_that_Visit_Website_option_is_present() {
		locatorspageobj.verifyDropdownVisitWebsiteButton();
	}

	@Then("^Verify that Navigate option is present$")
	public void verify_that_Navigate_option_is_present() {
		locatorspageobj.verifyDropdownNavigateButton();
	}

	@When("^User Tap on call button$")
	public void user_Tap_on_call_button() {
		locatorspageobj.clickOnCallButton();
		sleep(2);
	}

	@Then("^verify the message shown as \"([^\"]*)\"$")
	public void verify_the_message_shown_as(String arg1) {
		locatorspageobj.verifytheMessageForCall(arg1);
	}

	@When("^User Tap on navigate button$")
	public void user_Tap_on_navigate_button() {
		locatorspageobj.clickOnNavigateButton();
		sleep(1);
	}

	@Then("^verify the message for google maps as \"([^\"]*)\"$")
	public void verify_the_message_for_google_maps_as(String arg1) {
		locatorspageobj.verifytheMessageForGoogleMap(arg1);
	}

	@When("^Tap on Service pin location$")
	public void tap_on_Service_pin_location() {
		locatorspageobj.clickOnPinLocationForServiceCenter();
	}

	@When("^verify the service center name as \"([^\"]*)\"$")
	public void verify_the_service_center_name_as(String arg1) {
		locatorspageobj.verifyNameOfTheServiceCenter(arg1);
	}

	@When("^verify the service center address as \"([^\"]*)\"$")
	public void verify_the_service_center_address_as(String arg1) {
		locatorspageobj.verifyAddressOfTheServiceCenter(arg1);
	}

	@When("^Verify that Book a service option is present$")
	public void verify_that_Book_a_service_option_is_present() {
		locatorspageobj.verifyDropdownBookAServiceButton();
	}

	@When("^User Tap on Search Icon$")
	public void user_Tap_on_Search_Icon() {
		locatorspageobj.clickOnSearchicon();
	}

	@When("^User Enter text in search field as \"([^\"]*)\"$")
	public void user_Enter_text_in_search_field_as(String arg1) {
		locatorspageobj.enterTheSearchText(arg1);
	}

	@When("^User Tap on Search Button$")
	public void user_Tap_on_Search_Button() {
		locatorspageobj.clickOnSearchButtonFromKeyPad();
	}

	@When("^verify the No Result error message as \"([^\"]*)\"$")
	public void verify_the_No_Result_error_message_as(String arg1) {
		locatorspageobj.noResultFoundMessage(arg1);
	}
	
	@Then("^user select one Pin location of search result$")
	public void user_select_one_Pin_location_of_search_result() {
		locatorspageobj.tapOnSearchedPinLocation();
	}

	@Then("^verify the name of the searched service center as \"([^\"]*)\"$")
	public void verify_the_name_of_the_searched_service_center_as(String arg1){
		locatorspageobj.nameOfSearchedServicecenter(arg1);
	}

	@Then("^verify the Address of the searched service center as \"([^\"]*)\"$")
	public void verify_the_Address_of_the_searched_service_center_as(String arg1){
		locatorspageobj.addressOfSearchedServicecenter(arg1);
	}
}
