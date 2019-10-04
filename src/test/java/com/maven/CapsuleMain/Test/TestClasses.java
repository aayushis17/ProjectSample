package com.maven.CapsuleMain.Test;

import org.testng.annotations.Test;

public class TestClasses {
	
	@Test
	public void LoginTest() {
		CapsuleLoginTest login = new CapsuleLoginTest();
		login.HomepageTest();
		login.UsernameTest();
		login.PasswordTest();
		login.SubmitTest();
		
	}

	@Test
	public void NewPersonTest() {
		NewPerson addper = new NewPerson();
		addper.PeopleTest();
		addper.AddPersonTest();
		addper.TitleTest();
		addper.FNameTest();
		addper.LNameTest();
		addper.JobTitleTest();
		addper.OrganisationTest();
		addper.PhoneNumberTest();
		addper.PhoneTypeTest();
		addper.EmailTest();
		addper.EmailTypeTest();
		addper.WebsitesTest();
		addper.SocialsTest();
		addper.SocialsTypeTest();
		addper.AddanAddressTest();
		addper.AddressTest(); 
		addper.AddressTypeTest();
		addper.CityTest();
		addper.StateTest();
		addper.ZipTest();
		addper.CountryTest();
		addper.SaveBtnTest();
		
	}
	
	@Test
	public void NewCaseTest() {
		NewCase addcase =  new NewCase();
		addcase.CasesTest();
		addcase.AddCasesTest();
		addcase.CasesTextBxTest();
		addcase.NameTxtBxTest();
		addcase.DescrpTest();
		addcase.TagTest();
		addcase.SaveBtnTest();
	}
	
}
