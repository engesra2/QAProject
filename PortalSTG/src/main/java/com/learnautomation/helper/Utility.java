package com.learnautomation.helper;

import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.text.SimpleDateFormat;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.learnautomation.DataProvider.ConfigReader;

public class Utility {

	// Scroll into view with javascript

	public static void scrollIntoViewJS(WebDriver driver, WebElement element) {

		JavascriptExecutor JS = (JavascriptExecutor) driver;

		JS.executeScript("arguments[0].scrollIntoView(true)", element);

	}

	// Switch to ChildWindow

	public static void switchToChildWindow(WebDriver driver) {

		String parentwindow = driver.getWindowHandle();

		Set<String> allwindows = driver.getWindowHandles();

		Iterator<String> childwindows = allwindows.iterator();

		while (childwindows.hasNext())

		{
			String s = childwindows.next();

			if (!s.equals(parentwindow))

			{
				driver.switchTo().window(s);

				String childtitle = driver.getCurrentUrl();

				System.out.println("child window is " + childtitle);

			}

		}
	}

	// Switch to ParentWindow

	public static void switchToParentWindow(WebDriver driver) {
		driver.switchTo().window(driver.getWindowHandle());
	}

	// Switch to Alert Accept

	public static void switchToAlertAccept(WebDriver driver) {
		Alert popup = driver.switchTo().alert();

		popup.accept();
	}

	// Switch to Alert Dismiss

	public static void switchToAlertDismiss(WebDriver driver) {
		Alert popup = driver.switchTo().alert();

		popup.dismiss();
	}

	// Switch to Alert with Sendkeys Method

	public static void switchToAlertSendKeys(WebDriver driver, String Value) {
		Alert popup = new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.alertIsPresent());

		popup.sendKeys(Value);

		popup.accept();

	}

	// Get the Screenshot
	public static String captureScreenshotAsByte(WebDriver driver) {
		TakesScreenshot ts = (TakesScreenshot) driver;

		String screenshot = ts.getScreenshotAs(OutputType.BASE64);

		return screenshot;
	}

	// Get the current time

	public static String getCurrentdate() {
		SimpleDateFormat myformat = new SimpleDateFormat("HH_mm_ss_dd_MM_yyyy");

		String newFormat = myformat.format(new Date());

		return newFormat;

	}

	// Select the value from the dropdown

	public static void selectValueFromDropDown(WebDriver driver, By locator, String valuetoselect) {

		Select s = new Select(Utility.waitForElement(driver, locator));
		// s.selectByValue(valuetoselect);
		s.selectByVisibleText(valuetoselect);
	}

	// HighLight on WebElement Field
	public static WebElement highLightOnElement(WebDriver driver, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style' , 'background:yellow ; border:solid 2px red')", element);
		sleep(1);
		js.executeScript("arguments[0].setAttribute ('style' , 'border:solid 2px black')", element);
		return element;

	}

//MouseHover on Element

	public static void mouseHoverElement(WebDriver driver, By Locator) {
		Actions act = new Actions(driver);

		act.moveToElement(driver.findElement(Locator)).build().perform();

	}

	// DoubleClick on Element
	public static void doubleClick(WebDriver driver, By Locator) {
		Actions act = new Actions(driver);

		act.doubleClick(driver.findElement(Locator)).build().perform();
	}

	// RightClick on Element

	public static void rightClick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);

		act.contextClick(element).perform();

	}

	// Drag and Drop on Element

	public static void dragAndDrop(WebDriver driver, WebElement source, WebElement Destination) {
		Actions act = new Actions(driver);

		act.dragAndDrop(source, Destination).perform();
	}

	// sleep method
	public static void sleep(int TimeInSeconds) {
		try {
			Thread.sleep(TimeInSeconds * 1000);
		} catch (InterruptedException e) {
			Reporter.log("LOG:FAIL - Thread Interruped" + e.getMessage(), true);
		}

	}

	// Scroll till element to be shown
	public static void scrollTillElementPresent(WebDriver driver, By locator) {
		Actions act = new Actions(driver);

		act.scrollToElement(driver.findElement(locator)).perform();
	}

	// method overloading for above method
	public static void scrollTillElementPresent(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);

		act.scrollToElement(element).build().perform();
	}

	public static void scrollEsra(WebDriver driver, By locator) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)");
		Thread.sleep(500);
	}

	public static void scrollToMiddle(WebDriver driver) {
		System.out.println("inside scroll 1");

		JavascriptExecutor JS = (JavascriptExecutor) driver;
		System.out.println("inside scroll 2");

		JS.executeScript("scrollBy(0, 600)");
		System.out.println("inside scroll 3");

		// jse.executeScript("window.scroll(600, 1000)");
	}

	public static void click(WebDriver driver, WebElement element) {
		element.click();
	}

	// Wait for element untill element to be visible for 30 seconds
	public static WebElement waitForElement(WebDriver driver, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(35));

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));

		String selement = ConfigReader.getInput("highLightOnElement");

		if (selement.equalsIgnoreCase("true")) {

			// highLightOnElement(driver, element);
			highLightOnElement(driver, element);

		}

		return element;
	}

	// method overloading for above method to wait more than 30 seconds

	public static WebElement waitForElement(WebDriver driver, By locator, int TimeInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TimeInSeconds));

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));

		String selement = ConfigReader.getInput("highLightOnElement");

		if (selement.equalsIgnoreCase("true")) {

			highLightOnElement(driver, element);

		}
		return element;

	}

	// click actions with normal click,actions click and JS click

	public static void clickElement(WebDriver driver, WebElement element) {

		try {

			element.click();

		} catch (Exception e) {
			Reporter.log("LOG:INFO - Webelement click failed ,trying with Actions click", true);

			Actions A = new Actions(driver);

			try {
				A.moveToElement(element).click().perform();

			} catch (Exception e2)

			{
				Reporter.log("LOG:INFO - Actions click failed , trying with JS click" + e2.getMessage(), true);

				JavascriptExecutor JS = (JavascriptExecutor) driver;

				JS.executeScript("arguments[0].click();", element);
			}

		}

	}

}
