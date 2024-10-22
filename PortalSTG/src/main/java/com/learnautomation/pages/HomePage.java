package com.learnautomation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.learnautomation.helper.Utility;

public class HomePage {

	protected WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	private By DubaiHealthLogo = By.xpath("//div[@title='Dubai Health']");
	public By LoginBtn = By.id("idam-login");
	private By ScheduleBtn = By.linkText("Schedule Appointment");
	private By ArabicBtn = By.xpath(
			"/html//section[@id='portlet_com_liferay_site_navigation_language_web_portlet_SiteNavigationLanguagePortlet']//a[@href='/c/portal/update_language?p_l_id=1421&redirect=%2F&languageId=ar_SA']");
	private By GivingLink = By.linkText("Giving");
	private By DiscoveryLink = By.linkText("Discovery");
	private By LearningLink = By.linkText("Learning");
	private By DonateLink = By.xpath("/html//div[@id='main-content']/div[1]/div//div[@title='Donate']/a[@href='https://www.aljalilafoundation.ae/get-involved/make-a-donation/']");

	// Click on Login button
	public void ClickOnLogin() {
		Utility.waitForElement(driver, LoginBtn).click();

	}

	// Click on Schedule Appointment button
	public void ClickOnScheduleAppt() {
		Utility.waitForElement(driver, ScheduleBtn).click();

	}

	// Click on Donate button
	public void ClickOnDonate() {
		Utility.waitForElement(driver, DonateLink).click();

	}
	// Click on Giving Link
	public void ClickOnGivingLink() {
		Utility.waitForElement(driver, GivingLink).click();

	}

	// Click on Discovery Link
	public void ClickOnDiscoveryLink() {
		Utility.waitForElement(driver, DiscoveryLink).click();

	}

	// Click on Learning Link
	public void ClickOnArabicBtn() {
		Utility.waitForElement(driver, ArabicBtn).click();

	}

	// Click to Switch Language
	public void ClickOnLearningLink() {
		Utility.waitForElement(driver, LearningLink).click();

	}

	// Click On Dubai Health Logo from the Header
	public void ClickOnDHLogo() {
		Utility.waitForElement(driver, DubaiHealthLogo).click();

	}
}
