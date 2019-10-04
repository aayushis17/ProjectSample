package com.maven.CapsuleMain.Test;

import org.testng.Assert;

import com.maven.Pages.CapsuleWebElements;

public class CapsuleLoginTest extends CapsuleWebElements {

	CapsuleWebElements login = new CapsuleWebElements();

	public void HomepageTest() {
		login.HomePage();
		
	}

	public void UsernameTest() {
		login.Username().sendKeys("aayushis");
	}
	
	public void PasswordTest() {
			login.Password().sendKeys("123456789");
		
	}
	
	public void SubmitTest() {
			login.Submit().click();
			
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "DashBoard | North Shore Technologies CRM";
		Assert.assertTrue(ActualTitle.equalsIgnoreCase(ExpectedTitle));
		System.out.println("Titles matched");
		logger.info("Login Successful");
	}
}
