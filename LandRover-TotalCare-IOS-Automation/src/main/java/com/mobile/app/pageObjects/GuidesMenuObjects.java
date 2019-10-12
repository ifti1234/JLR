package com.mobile.app.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;

public class GuidesMenuObjects {

	@iOSFindBy(accessibility = "MenuButton")
	public MobileElement mainMenuButton;
	
	@iOSFindBy(accessibility = "GUIDES")
	public MobileElement guides;
	
	@iOSFindBy(accessibility = "QUICK START GUIDE")
	public MobileElement quickStart;
	
	@iOSFindBy(accessibility = "TOTAL CARE HANDBOOK")
	public MobileElement handBook;
	
	@iOSFindBy(accessibility = "CAR MANUAL")
	public MobileElement carManual;
	
	@iOSFindBy(accessibility = "FAQ")
	public MobileElement faq;
	
	@iOSFindBy(xpath = "//XCUIElementTypeTable")
	public MobileElement sideMenuTable;
	
	@iOSFindBy(accessibility = "quick start guide")
	public MobileElement quickstartHeader;
	
	@iOSFindBy(accessibility = "TOTAL CARE HANDBOOK")
	public MobileElement handBookHeader;
}




		
		
