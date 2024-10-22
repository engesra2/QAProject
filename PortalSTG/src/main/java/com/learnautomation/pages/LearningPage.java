package com.learnautomation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.learnautomation.helper.Utility;

public class LearningPage {

	protected WebDriver driver;

	public LearningPage(WebDriver driver) {
		this.driver = driver;
	}

	private By DubaiHealthLogo = By.xpath("/html//img[@id='logoSize']");
	

	//Click On Dubai Health Logo from the LoginPage
	public void ClickOnDHLogoFromLoginPage()
	{
		Utility.waitForElement(driver, DubaiHealthLogo).click();

	}
}
