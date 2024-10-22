package com.learnautomation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.learnautomation.helper.Utility;

public class DiscoveryPage {

	protected WebDriver driver;

	public DiscoveryPage(WebDriver driver) {
		this.driver = driver;
	}

	
	//I used the breadcrumb below
	public By DiscoveryPageTitle = By.xpath("/html//nav[@id='_com_liferay_site_navigation_breadcrumb_web_portlet_SiteNavigationBreadcrumbPortlet_INSTANCE_acxq_breadcrumbs-defaultScreen']//span[.='Discovery']");

	
	
	//****** Get the title of the page  ****//
	public String GetTheTitleForDiscoveryPagePage() {

		return driver.findElement(DiscoveryPageTitle).getText();

	}
	
}
