package com.learnautomation.factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Reporter;

import com.learnautomation.DataProvider.ConfigReader;

public class BrowserFactory {
	
	public static WebDriver driver;
	
	public static WebDriver getDriver()
	{
		
		return driver;
	}
	
	
	
	public static WebDriver startBrowser(String browsername , String appURL)
	{ 
		
		
		if(browsername.equalsIgnoreCase("Chrome"))//||browsername.equalsIgnoreCase("Google") )
		{
			ChromeOptions options=new ChromeOptions();
			
			//ConfigReader.getInput("headless");
			
			if(ConfigReader.getInput("headless").equalsIgnoreCase("true"))
			{
			   options.addArguments("--headless=new");
			   
			   Reporter.log("LOG:INFO-Running chrome in headless mode",true);
			}
			driver=new ChromeDriver(options);
		}
		
		else if (browsername.equalsIgnoreCase("Firefox"))// || browsername.equalsIgnoreCase("Mozilla Firefox"))
		{
			
			FirefoxOptions options=new FirefoxOptions();
			
			if(ConfigReader.getInput("headless").equalsIgnoreCase("true"))
			{
				options.addArguments("--headless");
				
				Reporter.log("LOG:INFO-Running Firefox in headless mode", true);
			}
			
			
			driver=new FirefoxDriver(options);
		}
		
		else if(browsername.equalsIgnoreCase("Edge"))// || browsername.equalsIgnoreCase("Microsoft Edge"))
		{
			
			EdgeOptions options=new EdgeOptions();
			
			options.addArguments("--guest");
			
			System.out.println("Value from Config "+ConfigReader.getInput("headless"));
			
			if(ConfigReader.getInput("headless").equalsIgnoreCase("true"))
			{
				options.addArguments("--headless");
				
				Reporter.log("LOG:INFO-Running Edge in headless mode", true);
			}

			driver=new EdgeDriver(options);
		}
		
		else if (browsername.equalsIgnoreCase("safari"))
		{
			driver=new SafariDriver();
		}
		
		else
		{
			Reporter.log("LOG:INFO- sorry currently we do support chrome,edge,firefox and safari browser");
		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Long.parseLong(ConfigReader.getInput("pageLoadTimeout"))));
		
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(Long.parseLong(ConfigReader.getInput("scriptTimeout"))));
		
		driver.get(appURL);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(ConfigReader.getInput("implicitlyWait"))));
		
		return driver;
	}
	 
	public static void closeBrowser(WebDriver driver)
	{
		driver.quit();
	}
		

}
