package com.maven.CapsuleMain.Test;

import org.testng.Assert;

import com.maven.Pages.CapsuleWebElements;

import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.company.Company;
import io.codearte.jfairy.producer.person.Person;

public class NewPerson  extends CapsuleLoginTest{

	CapsuleWebElements add = new CapsuleWebElements();
	Fairy fairy = Fairy.create();
	Person person = fairy.person();
	Company company = fairy.company();
	
	String fname = person.getFirstName();
	String lname = person.getLastName();
	String comp = company.getName();
	String phoneno = person.getTelephoneNumber();
	String email = person.getEmail();
	
	public void PeopleTest() {
		add.People().click();
	}
	
	public void AddPersonTest() {
		add.AddPerson().click();	
	}
	
	public void TitleTest() {
		add.Title().selectByIndex(4);
	}		
	
	public void FNameTest() {
		add.FName().sendKeys(fname);
	}
	
	public void LNameTest() {
		add.LName().sendKeys(lname);
	}
	
	public void JobTitleTest() {
		add.JobTitle().sendKeys("Software Engineer");
	}
	
	public void OrganisationTest() {
		add.Organisation().sendKeys(comp);
	}
	
	public void PhoneNumberTest() {
		add.PhoneNumber().sendKeys(phoneno);
	}
	
	public void PhoneTypeTest() {
		add.PhoneType().selectByIndex(3);
	}
	
	public void EmailTest() {
		add.Email().sendKeys(email);
	}
	
	public void EmailTypeTest() {
		add.EmailType().selectByIndex(2);
	}

	public void WebsitesTest() {
		add.Websites().sendKeys("https://www.linkedin.com/in/abcde_123/");
	}
	
	public void SocialsTest() {
		add.Socials().selectByIndex(6);
	}
	
	public void SocialsTypeTest() {
		add.SocialsType().selectByIndex(2);
	}
	
	public void AddanAddressTest() {
		add.AddanAddress().click();
	}
	
	public void AddressTest() {
		add.Address().sendKeys("B10, Sector-50");
	}

	public void AddressTypeTest() {
		add.AddressType().selectByIndex(1);
	}
	
	public void CityTest() {
		add.City().sendKeys("Noida");
	}
	
	public void StateTest() {
		add.State().sendKeys("Uttar Pradesh");
	}
	
	public void ZipTest() {
		add.Zip().sendKeys("201301");
	}
	
	public void CountryTest() {
		add.Country().selectByIndex(103);
	}

	public void SaveBtnTest() {
		add.SaveBtn1().click();
		
		String ActualTitle = driver.getTitle();
		String PrevTitle = " North Shore Technologies CRM";
		String message = "Titles didnot match";
		Assert.assertFalse(ActualTitle.equalsIgnoreCase(PrevTitle));
		System.out.println(message);
		logger.info("New Person added successfully");
	}
	
}
