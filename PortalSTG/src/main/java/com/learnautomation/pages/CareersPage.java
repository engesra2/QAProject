package com.learnautomation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.learnautomation.helper.Utility;

public class CareersPage {

	protected WebDriver driver;

	public CareersPage(WebDriver driver) {
		this.driver = driver;
	}

	//I used the breadcrumb below
	public By CareersPageTitle = By.xpath("/html//nav[@id='_com_liferay_site_navigation_breadcrumb_web_portlet_SiteNavigationBreadcrumbPortlet_INSTANCE_adue_breadcrumbs-defaultScreen']//span[.='Careers']");

	
	//****** Get the title of the page  ****//
	public String GetTheTitleForCareersPage() {

		return driver.findElement(CareersPageTitle).getText();

	}

}
