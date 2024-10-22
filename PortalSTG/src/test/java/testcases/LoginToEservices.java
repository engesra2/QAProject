package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.learnautomation.DataProvider.Dataprovider;
import com.learnautomation.DataProvider.ExcelReader;
import com.learnautomation.base.BaseClass;
import com.learnautomation.helper.Utility;
import com.learnautomation.pages.HomePage;


public class LoginToEservices extends BaseClass {

	HomePage HomePageObject;
	
	
	

	// *********** 1- User/Applicant Apply to the BT service *********//

	@Test
	public void ClickOnLoginButton() throws InterruptedException {

		HomePage HomePageObject = new HomePage(driver);
		
		HomePageObject.ClickOnLogin();
	 

		
	}

}
