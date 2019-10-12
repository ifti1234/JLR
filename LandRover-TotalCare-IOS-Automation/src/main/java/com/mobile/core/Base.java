package com.mobile.core;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

public class Base extends AppiumManager {
	

	private static String folder;

	/**
	 * Description : To Verify that element is displayed or not
	 *
	 * @author Iftikhar
	 *
	 * @param element
	 *            need to locate on screen
	 *
	 * @param element
	 *            taken from objects class
	 */
	public void verifyElement(MobileElement element) {

		try {
			element.isDisplayed();
		} catch (Exception e) {
			Assert.assertTrue(element.toString() + " : Element not found", false);
		}
	}

	/**
	 * Description : Click on a element
	 *
	 * @param element
	 *            to be clicked
	 *
	 * @param element
	 *            taken from object class
	 */
	public void clickElement(MobileElement element) {
		element.click();
	}

	/**
	 * Description : Clears the field
	 *
	 * @param element
	 *            : field which need
	 *
	 * @param element
	 *            taken from object class
	 */
	public void clearField(MobileElement element) {
		element.clear();
	}

	/**
	 * Enter text in text field
	 *
	 * @param element
	 *            - string value to be entered
	 *
	 * @param element
	 *            taken from object class
	 */
	public void enterText(MobileElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue(element.toString() + " : Element not found", false);
		}
	}

	public void extentReport_AddScreenCapture() {
		SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
		String image_name = "image_" + df.format(new Date()) + ".png";

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(scrFile, new File(getFolder() + "/" + image_name));
			Reporter.addScreenCaptureFromPath(image_name);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static void setFolder(String folderin) {
		folder = folderin;
	}

	public String getFolder() {
		
		return folder;
	}


	/**
	 * Description : To quit the driver
	 *
	 * @author iftikhar
	 *
	 */
	public void tearDownDriver() {
		try {
			driver.close();
		} catch (Exception e) {
		}
		driver.quit();
	}

	/**
	 * Description : Sleep Time (Wait)
	 *
	 * @author iftikhar
	 *
	 * @param sleep
	 *            time in milli sec
	 *
	 */
	public void sleep(int mSec) {
		try {
			Thread.sleep(mSec * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();

			System.out.println("Timed Out");
		}
	}

	/**
	 * Description : Wait for and element to be clickable for 10 sec
	 *
	 * @author iftikhar
	 *
	 * @param element
	 * 
	 * @return true or false
	 */
	public boolean isElementClickable(MobileElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Description : Return Key for the keypads
	 *
	 * @author iftikhar
	 * 
	 * @category dismiss keypads
	 *
	 */
	public void ReturnKeyFromKeyBoard() {
		driver.findElement(By.id("Return")).click();
	}

	/**
	 * Description : OCR read text from image
	 *
	 * @author iftikhar
	 * 
	 * @return text in a string imageToText
	 *
	 */
	public String ImageToText_Compare() {
		String imageToText = null;
		try {
			String folder_name = "./imageTextCompare";
			File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
			String file_name = df.format(new Date()) + ".png";
			String image = folder_name + "/" + file_name;
			FileUtils.copyFile(f, new File(folder_name + "/" + file_name));

			File imageFile = new File(image);
			ITesseract instance = new Tesseract();
			imageToText = instance.doOCR(imageFile);
			imageToText = imageToText.replace("\n", "").replace("\r", " ");
			imageToText = imageToText.replaceAll("®", "");
			imageToText = imageToText.replaceAll("[‘]", "'");
			imageToText = imageToText.replaceAll("[;|(6|9|Q]", "");
			System.out.println(" Text from screenshot::  " + imageToText);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return imageToText;
	}

	@SuppressWarnings("rawtypes")
	public TouchAction getTouchAction() {
		return new TouchAction(driver);
	}

	/**
	 * Description : Swipe vertically upwards
	 *
	 * 
	 * @param ele
	 *            , size of the screen taken
	 * 
	 * 
	 * @return swipe vertically upwards
	 *
	 */
	public void verticalSwipe_Up(MobileElement ele) {
		Dimension size = ele.getSize();
		ElementOption press = element(ele, size.width / 2, (int) (size.height * 0.75));
		ElementOption move = element(ele, size.width / 2, 25);
		@SuppressWarnings("rawtypes")
		TouchAction swipe = new TouchAction(driver).press(press).waitAction(waitOptions(Duration.ofMillis(1000)))
				.moveTo(move).release();
		swipe.perform();

	}

	/**
	 * Description : Access some elements using assesbilityId
	 *
	 * @param accessibilityId
	 * 
	 *
	 *
	 */
	public void elementWithAssesbilityIdIsPresent(String accessibilityId) {
		try {
			driver.findElement(MobileBy.AccessibilityId(accessibilityId)).isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue(accessibilityId.toString() + " : Element not found", false);
		}
	}

	/**
	 * swipe down to element if the element is not present
	 *
	 * @param swipe
	 *            element - expected element and swipe count
	 *
	 *
	 */
	public void moveDownToElement(MobileElement swipeReference, MobileElement expectedElement, int swipeCount) {
		int i = 0;
		do {

			try {

				if (!expectedElement.getAttribute("visible").equals("false")) {
					break;
				} else {
					verticalSwipe_Up(swipeReference);

				}
			} catch (Exception e) {
				verticalSwipe_Up(swipeReference);

			}
			i++;
		} while (i < swipeCount);
	}

}
