package com.learnautomation.DataProvider;

import org.testng.annotations.DataProvider;

public class Dataprovider {

	@DataProvider(name = "ApplicantLoginData")

	public static Object[][] getDataforApplicantLogin()

	{
		Object[][] arr = ExcelReader.getDataFromExcel("AppLoginData");

		return arr;

	}

	@DataProvider(name = "ReviewerLoginData")

	public static Object[][] getDataforREviewerLogin()

	{
		Object[][] arr = ExcelReader.getDataFromExcel("RevLoginData");

		return arr;

	}

	@DataProvider(name = "TestDataForRegistartion")

	public static Object[][] getDataForEgisterUser()

	{
		Object[][] arr = ExcelReader.getDataFromExcel("RegDetails");

		return arr;

	}

}
