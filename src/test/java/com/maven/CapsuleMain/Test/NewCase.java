package com.maven.CapsuleMain.Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class NewCase extends NewPerson {

	String name1 = person.getFirstName();
	String name2 = person.getLastName();
	String comp2 = company.getName();
	
	public void CasesTest() {
			add.CasesMain().click();
	}
	
	public void AddCasesTest() {
			add.AddCase().click();
	}

	public void CasesTextBxTest() {
			add.CasesTxtBxMain().sendKeys(comp2);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Actions builder = new Actions(driver);
		    builder.sendKeys(Keys.ARROW_DOWN); 		    
		    builder.perform();
		    builder.sendKeys(Keys.ENTER);
		    builder.perform();
	}
	
	public void NameTxtBxTest() {
			add.NameTxtBxMain().sendKeys(name1 +" "+name2);
	}
	
	public void DescrpTest() {
			add.DescrpMain().sendKeys("Currently Active Member");
	}
	
	public void TagTest() {
			add.TagMain().sendKeys("Employee");
	}
	
	public void SaveBtnTest() {
			add.SaveBtn2().click();
		
		String ActualTitle = driver.getTitle();
		String PrevTitle = "New Case | North Shore Technologies CRM";
		String message = "Titles matched";
		Assert.assertTrue(ActualTitle.equalsIgnoreCase(PrevTitle));
		System.out.println(message);
		logger.info("New Case added successfully");
	}
}
