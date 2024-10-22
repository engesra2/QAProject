package com.learnautomation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.learnautomation.helper.Utility;

public class ContactUsPage {

	protected WebDriver driver;

	public ContactUsPage(WebDriver driver) {
		this.driver = driver;
	}

	public By ContactUsPageTitle = By.xpath("/html//div[@id='page-banner']/div/div//h1[@role='heading']");

	
	//****** Get the title of the page  ****//
	public String GetTheTitleForContactUsPage() {

		return driver.findElement(ContactUsPageTitle).getText();

	}

}
