package com.learnautomation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.learnautomation.helper.Utility;

public class BlogPage {

	protected WebDriver driver;

	public BlogPage(WebDriver driver) {
		this.driver = driver;
	}

	public By BlogPageTitle = By.xpath("/html//div[@id='event-news']/div/div//div[@class='page-title']");

	
	//****** Get the title of the page  ****//
	public String GetTheTitleForBlogPage() {

		return driver.findElement(BlogPageTitle).getText();

	}

}
