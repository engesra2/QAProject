package com.learnautomation.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.learnautomation.DataProvider.ConfigReader;
import com.learnautomation.factory.BrowserFactory;

public class BaseClass {
	
public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		Reporter.log("LOG:INFO-Running before the class-Setting Up Browser" , true);
		
        driver=BrowserFactory.startBrowser(ConfigReader.getInput("browser"), ConfigReader.getInput("appURL"));
		
		Reporter.log("LOG:INFO-Browser and Application up and running" , true);
		
	}
	
	/*
	 * @AfterClass
	 * 
	 * public void teardown() {
	 * Reporter.log("LOG:INFO-Running After the class-Closing the browser" , true);
	 * 
	 * BrowserFactory.closeBrowser(driver);
	 * 
	 * Reporter.log("LOG:INFO-Browser Closed" , true); }
	 */
	
	

}
