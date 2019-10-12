package cucumber.stepDefinitions;

import com.mobile.app.pages.GuidesMenuPage;

import cucumber.api.java.en.Then;

public class GuidesStepDefinitions {

	GuidesMenuPage GuidesPage = new GuidesMenuPage();

	@Then("^User tap on Guides option from slide menu$")
	public void user_tap_on_Guides_option_from_slide_menu() {
		GuidesPage.clickOnGuidesMenuIcon();
	}

	@Then("^verify that quick start option is available$")
	public void verify_that_quick_start_option_is_available() {
		GuidesPage.verifyQuickstartguideoption();
	}

	@Then("^verify that TotalCare HandBook option is available$")
	public void verify_that_TotalCare_HandBook_option_is_available() {
		GuidesPage.verifyHandBookoption();
	}

	@Then("^verify that Car Manual option is available$")
	public void verify_that_Car_Manual_option_is_available() {
		GuidesPage.verifyCarManualoption();
	}

	@Then("^verify that FAQ option is available$")
	public void verify_that_FAQ_option_is_available() {
		GuidesPage.verifyFAQoption();
	}

	@Then("^user tap on quick start option$")
	public void user_tap_on_quick_start_option(){
		GuidesPage.clickOnQuickStartGuidesMenuIcon();
	}
	@Then("^user tap on hand book option$")
	public void user_tap_on_hand_book_option(){
		GuidesPage.clickOnHandBookOption();
	}
	
	@Then("^verify the quick start screen header as \"([^\"]*)\"$")
	public void verify_the_quick_start_screen_header_as(String arg1){
		GuidesPage.verifyQuickStatHeader(arg1);
	}

	@Then("^verify the hand book screen header as \"([^\"]*)\"$")
	public void verify_the_hand_book_screen_header_as(String arg1){
		GuidesPage.verifyhandbookHeader(arg1);
	}
	
	@Then("^user tap on FAQ option$")
	public void user_tap_on_FAQ_option(){
		GuidesPage.clickOnFAQOption();
	}

	@Then("^verify the FAQ screen header as \"([^\"]*)\"$")
	public void verify_the_FAQ_screen_header_as(String arg1){
		GuidesPage.verifyheaderforFAQOption(arg1);
	}

}
