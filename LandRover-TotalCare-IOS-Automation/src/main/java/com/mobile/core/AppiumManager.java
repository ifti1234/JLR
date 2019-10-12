package com.mobile.core;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class AppiumManager {

	public static AppiumDriver<MobileElement> driver;
	private InputStream inputStream;

	public void Driverinitializer() {

		Properties desiredcapabilitiesFile = loadPropertiesFile("config.properties");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", "XCUITest");
		capabilities.setCapability("platformName", desiredcapabilitiesFile.getProperty("platformName"));
		capabilities.setCapability("deviceName", desiredcapabilitiesFile.getProperty("deviceName"));
		capabilities.setCapability("platformVersion", desiredcapabilitiesFile.getProperty("platformVersion"));
		capabilities.setCapability("udid", desiredcapabilitiesFile.getProperty("udid"));
		capabilities.setCapability("bundleId", desiredcapabilitiesFile.getProperty("bundleId")); // com.solutions4mobility.lrmena
																									// //com.s4m.lrmena
		capabilities.setCapability("app", "/Users/iftikhar/Desktop/LandRover.ipa");
		capabilities.setCapability("autoLaunch", desiredcapabilitiesFile.getProperty("autoLaunch"));
		capabilities.setCapability("useNewWDA", desiredcapabilitiesFile.getProperty("useNewWDA"));
		capabilities.setCapability("autoAcceptAlerts", desiredcapabilitiesFile.getProperty("autoAcceptAlerts"));
		capabilities.setCapability("clearSystemFiles", desiredcapabilitiesFile.getProperty("clearSystemFiles"));
		capabilities.setCapability("newCommandTimeout", 32000);
		try {
			driver = new IOSDriver<MobileElement>(new URL("http://" + desiredcapabilitiesFile.getProperty("hub_URL")+ ":" + desiredcapabilitiesFile.getProperty("port") + "/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		} catch (MalformedURLException e) {

			e.printStackTrace();

		}
	}

	/**
	 * Description : Get the config.properties file
	 *
	 * @author Iftikhar
	 *
	 * @param deviceID , name and OS
	 *            : For the device id and name passed in the config file
	 *
	 * @param setStatus
	 *            :
	 */

	public Properties loadPropertiesFile(String fileName) {
		Properties prop = new Properties();
		inputStream = getClass().getClassLoader().getResourceAsStream(fileName);
		try {
			prop.load(inputStream);
		} catch (IOException e) {

			e.printStackTrace();
		}
		return prop;
	}
}
