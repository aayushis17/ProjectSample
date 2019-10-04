package com.maven.Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BasicClass {

	protected static WebDriver driver;
	
	
	public void Openbrowser(String browser) {
		final Logger logger = Logger.getLogger(this.getClass().getSimpleName());
		browser = browser.toUpperCase();
		
		Properties prop = new Properties();
		try {
			prop.load(BasicClass.class.getClassLoader().getResourceAsStream("log4j.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PropertyConfigurator.configure(prop);
		
		logger.info("Starting " + browser.toUpperCase() + " browser ...");
		
		switch(browser) {
		case "CHROME":
			System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir")+  File.separator + ("src\\main\\resources\\chromedriver.exe").toString());
			driver = new ChromeDriver();
			break;
		case "FIREFOX":
			System.setProperty("webdriver.gecko.driver",  System.getProperty("user.dir")+  File.separator + ("src\\main\\resources\\geckodriver.exe").toString());
			driver = new FirefoxDriver();
			break;
		case "IE":
			System.setProperty("webdriver.ie.driver",  System.getProperty("user.dir")+ File.separator + ("src\\main\\resources\\iedriver.exe").toString());
			driver = new InternetExplorerDriver();
			break;
		}
		driver.manage().window().maximize();
		
	}
	
}
