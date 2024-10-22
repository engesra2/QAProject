package com.learnautomation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.learnautomation.helper.Utility;

public class BoardOfDirectorsPage {

	protected WebDriver driver;

	public BoardOfDirectorsPage(WebDriver driver) {
		this.driver = driver;
	}

	public By BoardOfDirectorsPageTitle = By.xpath("/html//div[@id='main-content']/div[2]/div//div[@class='pagename']");

	
	//****** Get the title of the page  ****//
	public String GetTheTitleForBoardOfDirectorsPage() {

		return driver.findElement(BoardOfDirectorsPageTitle).getText();

	}

}
