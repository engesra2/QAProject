package com.learnautomation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.learnautomation.helper.Utility;

public class AboutDHPage {

	protected WebDriver driver;

	public AboutDHPage(WebDriver driver) {
		this.driver = driver;
	}

	public By AboutDHPageTitle = By.xpath("//div[@id='genericMediaTemp']//div[@class='headTitle']");
	

	//****** Get the title of the page  ****//
	public String GetTheTitleForDHPage() 
	{
	
	  return driver.findElement(AboutDHPageTitle).getText();	
	}
	
}
