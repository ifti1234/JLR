package com.mobile.app.pages;

import org.openqa.selenium.support.PageFactory;

import com.mobile.app.pageObjects.GuidesMenuObjects;
import com.mobile.core.Base;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GuidesMenuPage extends Base {

	private GuidesMenuObjects GMO = new GuidesMenuObjects();

	public GuidesMenuPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), GMO);
	}

	public void clickOnGuidesMenuIcon() {
		clickElement(GMO.guides);
	}
	
	public void verifyQuickstartguideoption() {
		verifyElement(GMO.quickStart);
	}
	
	public void verifyHandBookoption() {
		verifyElement(GMO.handBook);
	}
	
	public void verifyCarManualoption() {
		verifyElement(GMO.carManual);
	}
	
	public void verifyFAQoption() {
		moveDownToElement(GMO.sideMenuTable, GMO.faq, 2);
		verifyElement(GMO.faq);
	}
	
	public void clickOnQuickStartGuidesMenuIcon() {
		clickElement(GMO.quickStart);
	}
	
	public void clickOnHandBookOption() {
		clickElement(GMO.handBook);
	}
	public void verifyQuickStatHeader(String arg1) {
		verifyElement(GMO.quickstartHeader);
	}

	public void verifyhandbookHeader(String arg1) {
		verifyElement(GMO.handBookHeader);
	}
	
	public void clickOnFAQOption() {
		moveDownToElement(GMO.sideMenuTable, GMO.faq, 2);
		clickElement(GMO.faq);
	}
	
	public void verifyheaderforFAQOption(String arg1) {
		verifyElement(GMO.faq);
	}
	
}
