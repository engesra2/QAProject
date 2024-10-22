package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.learnautomation.base.BaseClass;
import com.learnautomation.helper.Utility;
import com.learnautomation.pages.DiscoveryPage;
import com.learnautomation.pages.HomePage;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.pages.MediaCenterPage;
import com.learnautomation.pages.ScheduleApptPage;
import com.learnautomation.pages.SideMenu;

public class HomePageHeaderLinks extends BaseClass {

	HomePage HomePageObject;
	LoginPage LoginPageObject;
	DiscoveryPage DiscoveryPageObject;
	ScheduleApptPage ScheduleApptPageObject;

	// *********** User Click on the Login button *********//

	@Test(priority = 1)
	public void ClickOnLoginButton() throws InterruptedException {

		HomePage HomePageObject = new HomePage(driver);
		LoginPage LoginPageObject = new LoginPage(driver);

		HomePageObject.ClickOnLogin();
		Thread.sleep(1000);

		String Title1;
		Title1 = LoginPageObject.GetTheTitleForLoginPage();
		System.out.println("The page Tile is  " + Title1);

		Assert.assertTrue(Title1.contains("Patient Services"));
		Thread.sleep(1000);

		LoginPageObject.ClickOnDHLogoFromLoginPage();

	}

	// *********** User Click on the Schedule Appointment *********//

	@Test(priority = 2)
	public void ClickOnScheduleApptFromHeader() throws InterruptedException {

		HomePage HomePageObject = new HomePage(driver);
		ScheduleApptPage ScheduleApptPageObject = new ScheduleApptPage(driver);

		HomePageObject.ClickOnScheduleAppt();
		Thread.sleep(1000);

		String Title1;
		Title1 = ScheduleApptPageObject.GetTheTitleForScheduleApptPagePage();
		System.out.println("The page Tile is  " + Title1);

		Assert.assertTrue(Title1.contains("Schedule Appointment"));
		Thread.sleep(1000);

		HomePageObject.ClickOnDHLogo();

	}

	// *********** User Click on the Donate Link *********//

	@Test(priority = 3)
	public void ClickOnDonateLinkFromHeader() {

		HomePage HomePageObject = new HomePage(driver);

		HomePageObject.ClickOnDonate();

		String Curl = driver.getCurrentUrl();
		System.out.println("The url is  " + Curl);
		Assert.assertTrue(Curl.contentEquals("https://www.aljalilafoundation.ae/get-involved/make-a-donation/"));

		driver.navigate().back();

	}

	// *********** User Click on the Switch Language Link *********//
	@Test(priority = 4)
	public void ClickOnSwitchLanguageFromHeader() throws InterruptedException {

		HomePage HomePageObject = new HomePage(driver);

		HomePageObject.ClickOnArabicBtn();
		Thread.sleep(1000);

		

	}

	// *********** User Click on the Giving Link *********//

	@Test(priority = 5)
	public void ClickOnGivingLinkFromHeader() {

		HomePage HomePageObject = new HomePage(driver);

		HomePageObject.ClickOnGivingLink();

		String Curl = driver.getCurrentUrl();
		System.out.println("The url is  " + Curl);
		Assert.assertTrue(Curl.contentEquals("https://www.aljalilafoundation.ae/"));

		driver.navigate().back();

	}

	// *********** User Click on the Discovery Link *********//

	@Test(priority = 6)
	public void ClickOnDiscoveryLinkFromHeader() throws InterruptedException {

		HomePage HomePageObject = new HomePage(driver);
		DiscoveryPage DiscoveryPageObject = new DiscoveryPage(driver);

		HomePageObject.ClickOnDiscoveryLink();
		Thread.sleep(1000);

		String Title;
		Title = DiscoveryPageObject.GetTheTitleForDiscoveryPagePage();
		System.out.println("The page Tile is  " + Title);

		Assert.assertTrue(Title.contains("Discovery"));
		Thread.sleep(1000);

		HomePageObject.ClickOnDHLogo();

	}

	// *********** User Click on the Learning Link *********//

	@Test(priority = 7)
	public void ClickOnLearningLinkFromHeader() {
		HomePage HomePageObject = new HomePage(driver);
		HomePageObject.ClickOnLearningLink();

		String Curl = driver.getCurrentUrl();
		System.out.println("The url is  " + Curl);
		Assert.assertTrue(Curl.contentEquals("https://www.mbru.ac.ae/"));

		driver.navigate().back();

	}

	// *********** User Click on Dubai Health Link *********//

	@Test(priority = 8)
	public void ClickOnTheDubaiHealthLogoFromHeader() {
		HomePage HomePageObject = new HomePage(driver);

		HomePageObject.ClickOnDHLogo();

	}

	/*
	 * @AfterTest public void ReturnToHome() { HomePage HomePageObject2 = new
	 * HomePage(driver); HomePageObject2.ClickOnDHLogo();
	 * 
	 * }
	 */

}
