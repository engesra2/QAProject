package com.learnautomation.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.Reporter;

public class ConfigReader {

	public static String getInput(String key) {

		Properties p = new Properties();

		try {
			p.load(new FileInputStream(new File("./ConfigFiles/config.properties")));
		}

		catch (IOException e) {

			Reporter.log("LOG:INFO- unable to load config file" + e.getMessage());
		}

		String value = p.getProperty(key);

		return value;

	}

}
