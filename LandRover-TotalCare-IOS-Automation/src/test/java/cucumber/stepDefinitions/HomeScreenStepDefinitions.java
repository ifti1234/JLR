package cucumber.stepDefinitions;

import com.mobile.app.pages.HomeScreenPage;
import com.mobile.core.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeScreenStepDefinitions extends Base {

	HomeScreenPage HomeScreenPageObject = new HomeScreenPage();

	@Given("^User is on Home screen and verify the LR Logo$")
	public void user_is_on_Home_screen_and_verify_the_LR_Logo() {
		HomeScreenPageObject.lRLogo();

	}

	@Given("^verify that weather text is present$")
	public void verify_that_weather_text_is_present() {
		HomeScreenPageObject.weatherText();

	}

	@Given("^verify the Road side assistance button is present$")
	public void verify_the_Road_side_assistance_button_is_present() {
		HomeScreenPageObject.roadSideAssistance();

	}

	@Given("^verify the customer care button is present$")
	public void verify_the_customer_care_button_is_present() {
		HomeScreenPageObject.customerCare();

	}

	@Then("^verify the Book a service button is present$")
	public void verify_the_Book_a_service_button_is_present() {

		HomeScreenPageObject.bookaService();
	}

	@Then("^verify that Locator button is present$")
	public void verify_that_Locator_button_is_present() {
		HomeScreenPageObject.locator();

	}

	@When("^user click on Road side assistance button$")
	public void user_click_on_Road_side_assistance_button() {

		HomeScreenPageObject.rsaFromHomescreen();
	}

	@Then("^verify the screen header is present as \"([^\"]*)\"$")
	public void verify_the_screen_header_is_present_as(String arg1) {

		HomeScreenPageObject.roadSideAssistanceTitle(arg1);
	}

	@Then("^user click Road side assistance button$")
	public void user_click_Road_side_assistance_button() {

		HomeScreenPageObject.clickRoadSideAssistanceButton();
	}

	@Then("^verify road side assistance number is present as \"([^\"]*)\"$")
	public void verify_road_side_assistance_number_is_present_as(String arg1) {

		HomeScreenPageObject.roadSideAssistancePhoneNumber(arg1);
	}

	@When("^user click on customer care button$")
	public void user_click_on_customer_care_button() {
		HomeScreenPageObject.customerCarefromHomescreen();
	}

	@Then("^user click on Customer care button$")
	public void user_click_on_Customer_care_button() {

		HomeScreenPageObject.customerCareButton();
	}

	@Then("^verify the header is present as \"([^\"]*)\"$")
	public void verify_the_header_is_present_as(String arg1) {

		HomeScreenPageObject.customerCareTitle(arg1);
	}

	@Then("^verify Customer care number is present as \"([^\"]*)\"$")
	public void verify_Customer_care_number_is_present_as(String arg1) {

		HomeScreenPageObject.customerCarePhoneNumber(arg1);
	}

	@When("^user click on Book a service button$")
	public void user_click_on_Book_a_service_button() {

		HomeScreenPageObject.clickonBookaServiceButton();
	}

	@Then("^verify the book a service screen header is present as \"([^\"]*)\"$")
	public void verify_the_book_a_service_screen_header_is_present_as(String arg1) {

		HomeScreenPageObject.bookaServicescreenTitle(arg1);
	}

	@Then("^user dropdown menu icon is present$")
	public void user_dropdown_menu_icon_is_present() {

		HomeScreenPageObject.dropDownMenuIcon();
	}

	@Then("^user click on one pin location$")
	public void user_click_on_one_pin_location() {

		HomeScreenPageObject.clickOnPinLocation();
	}

	@Then("^verify the name of the service center as \"([^\"]*)\"$")
	public void verify_the_name_of_the_service_center_as(String arg1) {

		HomeScreenPageObject.serviceCenterName(arg1);
	}

	@Then("^verify the address for the center is present as \"([^\"]*)\"$")
	public void verify_the_address_for_the_center_is_present_as(String arg1) {

		HomeScreenPageObject.serviceCenterAddress(arg1);
	}
	
	@When("^user click on Locators button$")
	public void user_click_on_Locators_button()  {
		HomeScreenPageObject.clickLocatorsButton(); 
	}

	@Then("^verify the screen title for locators as \"([^\"]*)\"$")
	public void verify_the_screen_title_for_locators_as(String arg1)  {
		HomeScreenPageObject.locatorScreenTitle(arg1);
	}

	@Then("^verify the search button is available$")
	public void verify_the_search_button_is_available()  {
		HomeScreenPageObject.searchIcon();
	}

	@Then("^verify the showroom screen title as \"([^\"]*)\"$")
	public void verify_the_showroom_screen_title_as(String arg1)  {
		HomeScreenPageObject.showRoomTitle(arg1);
	}
	
	@When("^user click on car selection Dropdown$")
	public void user_click_on_car_selection_Dropdown() {
		HomeScreenPageObject.selectDefaultcarDropdownButton();
	}

	@Then("^verify the title of the pop up as \"([^\"]*)\"$")
	public void verify_the_title_of_the_pop_up_as(String arg1) {
		HomeScreenPageObject.popUpscreenTitle(arg1);
	}

	@Then("^verify that add a car button is available$")
	public void verify_that_add_a_car_button_is_available() {
		HomeScreenPageObject.addCarButton();
	}

	@Then("^User select the Second car$")
	public void user_select_the_Second_car() {
		HomeScreenPageObject.selectSecondCar();
		sleep(2);
	}
}
