package com.learnautomation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.learnautomation.helper.Utility;

public class ScheduleApptPage {

	protected WebDriver driver;

	public ScheduleApptPage(WebDriver driver) {
		this.driver = driver;
	}

	public By ScheduleApptPageTitle = By.xpath("/html//div[@id='main-content']/div[4]/div/div/div/section[@class='portlet']//doctor-list-app//section[@class='doctor-appointment doctor-section']//div[@class='doc-page-title']");

	
	//****** Get the title of the page  ****//
	public String GetTheTitleForScheduleApptPagePage() {

		return driver.findElement(ScheduleApptPageTitle).getText();

	}

}
