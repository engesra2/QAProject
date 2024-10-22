package com.learnautomation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.learnautomation.helper.Utility;

public class LoginPage {

	protected WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	private By DubaiHealthLogo = By.xpath("/html//img[@id='logoSize']");
	public By textOnFirstCard = By.xpath("//a[@id='patientsTab']//h5[@role='heading']");

	
	//****** Get the title of the page  ****//
	public String GetTheTitleForLoginPage() {

		return driver.findElement(textOnFirstCard).getText();

	}
	
	//Click On Dubai Health Logo from the LoginPage
	public void ClickOnDHLogoFromLoginPage()
	{
		Utility.waitForElement(driver, DubaiHealthLogo).click();

	}
}
