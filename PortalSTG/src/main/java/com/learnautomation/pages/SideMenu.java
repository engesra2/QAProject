package com.learnautomation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.learnautomation.helper.Utility;

public class SideMenu {

	protected WebDriver driver;

	public SideMenu(WebDriver driver) {
		this.driver = driver;
	}

	private By SidemenuBtn = By
			.xpath("/html/body/div[8]/section/div/div[1]/div/div[1]/div[1]/div/div[2]/div[2]/button");
	private By AboutDubaiHealthmenu = By.xpath(
			"/html/body/div[8]/section/div/div[1]/div/div[1]/div[1]/div/div[2]/div[2]/div[1]/div/div/div[1]/div/section/div/div[2]/div/div/ul/li/ul/li[1]/span");
	private By AboutDubaiHealthOption = By.linkText("About Dubai Health");
	private By BoardOfDirectorsOption = By.linkText("Board of Directors");
	private By LeadershipTeamOption = By.linkText("Leadership Team");
	private By NewsAndEventsLink = By.linkText("News & Events");
	private By BlogLink = By.linkText("Blog");
	private By CareersLink = By.linkText("Careers");
	private By FAQsLink = By.linkText("FAQs");
	private By ContactUsLink = By.linkText("Contact us");

	// Click On side menu from Header
	public void ClickOnSidemenuBtnFromHeader() {
		Utility.waitForElement(driver, SidemenuBtn).click();

	}

	// Click On About Dubai Health Link from side menu 
	public void ClickOnAboutDHLink() {
		Utility.waitForElement(driver, AboutDubaiHealthmenu).click();
		Utility.waitForElement(driver, AboutDubaiHealthOption).click();


	}
	
	// Click On Board of Directors Link from side menu 
	public void ClickOnBoardOfDirectorsOption() {
		Utility.waitForElement(driver, AboutDubaiHealthmenu).click();
		Utility.waitForElement(driver, BoardOfDirectorsOption).click();

	}
	
	// Click On Leadership Team Option from side menu 
	public void ClickOnLeadershipTeamOption() {
		Utility.waitForElement(driver, AboutDubaiHealthmenu).click();
		Utility.waitForElement(driver, LeadershipTeamOption).click();

	}
	
	// Click On New & Events Link from side menu 
	public void ClickOnNewsAndEventsLink() {
		Utility.waitForElement(driver, NewsAndEventsLink).click();

	}
	// Click On Blog Link from side menu 
	public void ClickOnBlogLink() {
		Utility.waitForElement(driver, BlogLink).click();

	}
	
	// Click On Careers from side menu 
	public void ClickOnCareersLink() {
		Utility.waitForElement(driver, CareersLink).click();

	}
	
	// Click On FAQs from side menu 
	public void ClickOnFAQsLink() {
		Utility.waitForElement(driver, FAQsLink).click();

	}
	
	// Click On Contact us from side menu 
	public void ClickOnContactUsLink() {
		Utility.waitForElement(driver, ContactUsLink).click();

	}
	
	// Click On Dubai Health Logo 
	public void ClickOnDHLogo() {
		Utility.waitForElement(driver, SidemenuBtn).click();

	}
	
	
	
}
