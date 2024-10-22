package com.learnautomation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.learnautomation.helper.Utility;

public class FAQsPage {

	protected WebDriver driver;

	public FAQsPage(WebDriver driver) {
		this.driver = driver;
	}

	public By FAQsPageTitle = By.xpath("/html//div[@id='main-content']/div[2]/div[3]/div/div[1]/div[1]/div/h1[@role='heading']");

	
	//****** Get the title of the page  ****//
	public String GetTheTitleForFAQsPage() {

		return driver.findElement(FAQsPageTitle).getText();

	}

}
