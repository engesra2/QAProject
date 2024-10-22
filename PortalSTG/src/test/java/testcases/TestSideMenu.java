package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.learnautomation.base.BaseClass;
import com.learnautomation.helper.Utility;
import com.learnautomation.pages.AboutDHPage;
import com.learnautomation.pages.BlogPage;
import com.learnautomation.pages.BoardOfDirectorsPage;
import com.learnautomation.pages.CareersPage;
import com.learnautomation.pages.ContactUsPage;
import com.learnautomation.pages.FAQsPage;
import com.learnautomation.pages.HomePage;
import com.learnautomation.pages.LeadershipTeamPage;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.pages.MediaCenterPage;
import com.learnautomation.pages.SideMenu;

public class TestSideMenu extends BaseClass {

	HomePage HomePageObject;
	SideMenu SideMenuObject;
	AboutDHPage AboutDHPageObject;
	BoardOfDirectorsPage BoardOfDirectorsPageObject;
	LeadershipTeamPage LeadershipTeamPageObject;
	MediaCenterPage MediaCenterPageObject;
	BlogPage BlogPageObject;
	CareersPage CareersPageObject;
	FAQsPage FAQsPageObject;
	ContactUsPage ContactUsPageObject;
	

	// *********** User Click on the About Dubai Health Link *********//
	@Test(priority = 1)
	public void ClickOnAboutDH() throws InterruptedException {

		HomePage HomePageObject = new HomePage(driver);
		SideMenu SideMenuObject = new SideMenu(driver);
		AboutDHPage AboutDHPageObject = new AboutDHPage(driver);

		SideMenuObject.ClickOnSidemenuBtnFromHeader();
		Thread.sleep(1000);
		SideMenuObject.ClickOnAboutDHLink();

		String Title1;
		// TTtile = driver.findElement(AboutDHPageObject.AboutDHPageTitle).getText();
		// System.out.println("The page Title1 is " +
		// driver.findElement(AboutDHPageObject.AboutDHPageTitle).getText());

		Title1 = AboutDHPageObject.GetTheTitleForDHPage();
		System.out.println("The page Tile is  " + Title1);

		// Assert.assertEquals(Title1, "About Dubai Health ");
		Assert.assertTrue(Title1.contains("About Dubai Health"));
		Thread.sleep(1000);

		HomePageObject.ClickOnDHLogo();

	}

	// *********** User Click on the Board Of Directors Option *********//
	@Test(priority = 2)
	public void ClickOnBoardOfDirectors() throws InterruptedException {

		HomePage HomePageObject = new HomePage(driver);
		SideMenu SideMenuObject = new SideMenu(driver);
		BoardOfDirectorsPage BoardOfDirectorsPageObject = new BoardOfDirectorsPage(driver);

		SideMenuObject.ClickOnSidemenuBtnFromHeader();
		Thread.sleep(1000);

		SideMenuObject.ClickOnBoardOfDirectorsOption();

		String Title2;
		Title2 = BoardOfDirectorsPageObject.GetTheTitleForBoardOfDirectorsPage();
		System.out.println("The page Tile is  " + Title2);

		Assert.assertTrue(Title2.contains("Board of Directors"));
		Thread.sleep(1000);

		HomePageObject.ClickOnDHLogo();

	}

	// *********** User Click on the Leadership Team Option *********//
	@Test(priority = 3)
	public void ClickOnLeadershipTeam() throws InterruptedException {

		HomePage HomePageObject = new HomePage(driver);
		SideMenu SideMenuObject = new SideMenu(driver);
		LeadershipTeamPage LeadershipTeamPageObject = new LeadershipTeamPage(driver);

		SideMenuObject.ClickOnSidemenuBtnFromHeader();
		Thread.sleep(1000);
		SideMenuObject.ClickOnLeadershipTeamOption();

		String Title3;
		Title3 = LeadershipTeamPageObject.GetTheTitleForLeadershipTeamPage();
		System.out.println("The page Tile is  " + Title3);

		Assert.assertTrue(Title3.contains("Leadership Team"));
		Thread.sleep(1000);

		HomePageObject.ClickOnDHLogo();

	}

	// *********** User Click on the News and Events Link *********//
	@Test(priority = 4)
	public void ClickOnNewsAndEvents() throws InterruptedException {

		HomePage HomePageObject = new HomePage(driver);
		SideMenu SideMenuObject = new SideMenu(driver);
		MediaCenterPage MediaCenterPageObject = new MediaCenterPage(driver);
		
		SideMenuObject.ClickOnSidemenuBtnFromHeader();
		Thread.sleep(1000);
		SideMenuObject.ClickOnNewsAndEventsLink();
		
		String Title4;
		Title4 = MediaCenterPageObject.GetTheTitleForMediaCenterPage();
		System.out.println("The page Tile is  " + Title4);

		Assert.assertTrue(Title4.contains("Media Center"));
		Thread.sleep(1000);

		HomePageObject.ClickOnDHLogo();
	}

	// *********** User Click on the Blog Link *********//
	@Test(priority = 5)
	public void ClickOnBlog() throws InterruptedException {

		HomePage HomePageObject = new HomePage(driver);
		SideMenu SideMenuObject = new SideMenu(driver);
		BlogPage BlogPageObject = new BlogPage(driver);
		
		SideMenuObject.ClickOnSidemenuBtnFromHeader();
		Thread.sleep(1000);
		SideMenuObject.ClickOnBlogLink();
		
		String Title5;
		Title5 = BlogPageObject.GetTheTitleForBlogPage();
		System.out.println("The page Tile is  " + Title5);

		Assert.assertTrue(Title5.contains("Educational material"));
		Thread.sleep(1000);

		HomePageObject.ClickOnDHLogo();
	
	}

	// *********** User Click on the Careers Link *********//
	@Test(priority = 6)
	public void ClickOnCareers() throws InterruptedException {

		HomePage HomePageObject = new HomePage(driver);
		SideMenu SideMenuObject = new SideMenu(driver);
		CareersPage CareersPageObject = new CareersPage(driver);
		
		
		SideMenuObject.ClickOnSidemenuBtnFromHeader();
		Thread.sleep(1000);
		SideMenuObject.ClickOnCareersLink();

		String Title6;
		Title6 = CareersPageObject.GetTheTitleForCareersPage();
		System.out.println("The page Tile is  " + Title6);

		Assert.assertTrue(Title6.contains("Career"));
		Thread.sleep(1000);

		HomePageObject.ClickOnDHLogo();

	}

	// *********** User Click on the FAQs Link *********//
	@Test(priority = 7)
	public void ClickOnFAQs() throws InterruptedException {

		HomePage HomePageObject = new HomePage(driver);
		SideMenu SideMenuObject = new SideMenu(driver);
		FAQsPage FAQsPageObject = new FAQsPage(driver);
		
		SideMenuObject.ClickOnSidemenuBtnFromHeader();
		Thread.sleep(1000);
		SideMenuObject.ClickOnFAQsLink();
		
		String Title7;
		Title7 = FAQsPageObject.GetTheTitleForFAQsPage();
		System.out.println("The page Tile is  " + Title7);

		Assert.assertTrue(Title7.contains("Frequently Asked Questions"));
		Thread.sleep(1000);

		HomePageObject.ClickOnDHLogo();

	}

	// *********** User Click on the Contact Us Link *********//
	@Test(priority = 8)
	public void ClickOnContactUs() throws InterruptedException {

		HomePage HomePageObject = new HomePage(driver);
		SideMenu SideMenuObject = new SideMenu(driver);
		ContactUsPage ContactUsPageObject = new ContactUsPage(driver);
		
		SideMenuObject.ClickOnSidemenuBtnFromHeader();
		Thread.sleep(1000);
		SideMenuObject.ClickOnContactUsLink();
		
		String Title8;
		Title8 = ContactUsPageObject.GetTheTitleForContactUsPage();
		System.out.println("The page Tile is  " + Title8);

		Assert.assertTrue(Title8.contains("Contact Us"));
		Thread.sleep(1000);

		HomePageObject.ClickOnDHLogo();

	}
}
