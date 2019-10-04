package com.maven.Pages;

import java.util.concurrent.TimeUnit;
import org.testng.Assert;

import com.maven.Utilities.OpenTest;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class CapsuleWebElements extends OpenTest {

	protected final Logger logger = Logger.getLogger(this.getClass().getSimpleName());
	
	WebElement user,pass,btn,people,add,fname,lname,job,org,ph,email,website,city,state,zip,cases,name,des,tag;
	
	String baseURL = "https://aayushis.capsulecrm.com/login";
	
	public void HomePage ()
	{
       driver.get(baseURL);
    }

	public WebElement Username() 
	{
		try {
			user= driver.findElement(By.xpath("//*[@id='login:usernameDecorate:username']"));
			return user;
		}
		catch(NoSuchElementException e) {
			Assert.fail("UserName not found." +e.getMessage());
			throw(e);
		}	
	}
	
	public WebElement Password()
	{
		try {
			pass= driver.findElement(By.xpath("//*[@id='login:passwordDecorate:password']"));
			return pass;
		}
		catch(NoSuchElementException e) {
			Assert.fail("Password not found." +e.getMessage());
			throw(e);
		}
	}
	
	public WebElement Submit()
	{
		try {
			btn =driver.findElement(By.xpath("//*[@id='login:login']"));
			return btn;
		}
		catch(NoSuchElementException e) {
			Assert.fail("Submitnot found." +e.getMessage());
			throw(e);
		}
	}
	
	public WebElement People() 
	{
		try {
			people=driver.findElement(By.xpath("//div[@class='nav-bar-section nav-bar-main']//descendant::a[2]"));
			//people=driver.findElement(By.xpath("//*[@class=\"nav-bar-item nav-bar-item-parties ember-view\"]"));
			return people;
		}
		catch(NoSuchElementException e) {
			Assert.fail("People and Organisations not clicked." +e.getMessage());
			throw(e);
		}
	}
	
	public WebElement AddPerson() 
	{
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			add=driver.findElement(By.linkText("Add Person"));
			return add;
		}
		catch(NoSuchElementException e) {
			Assert.fail("Add Person not clicked." +e.getMessage());
			throw(e);
		}
	}
	
	public Select Title()
	{
		try {
			Select sel = new Select( driver.findElement(By.xpath("//div[@class='propGroup']//descendant::select")));
			return sel;
		}
		catch(NoSuchElementException e) {
			Assert.fail("Title not selected." +e.getMessage());
			throw(e);
		}
	}

	public WebElement FName()
	{
		try {
			fname=driver.findElement(By.id("party:fnDecorate:fn"));
			return fname;
		}
		catch(NoSuchElementException e) {
			Assert.fail("First Name not found." +e.getMessage());
			throw(e);
		}
	}
	
	public WebElement LName()
	{
		try {
			lname=driver.findElement(By.id("party:lnDecorate:ln"));
			return lname;
		}
		catch(NoSuchElementException e) {	
			Assert.fail("Last Name not found." +e.getMessage());
			throw(e);
		}
	}
	
	public WebElement JobTitle()
	{
		try {
			job=driver.findElement(By.id("party:roleDecorate:jobTitle"));
			return job;
		}
		catch(NoSuchElementException e) {
			Assert.fail("Job Title not found." +e.getMessage());
			throw(e);
		}
	}
	
	public WebElement Organisation()
	{
		try {
			org=driver.findElement(By.id("party:orgDecorate:org"));
		return org;
		}
	catch(NoSuchElementException e) {
			Assert.fail("Organisation name not found." +e.getMessage());
			throw(e);
		}
	}
	
	public WebElement PhoneNumber()
	{
		try {
			ph=driver.findElement(By.xpath("//span[@id='party:phnPanel']//descendant::input"));
			return ph;
		}
		catch(NoSuchElementException e) {
			Assert.fail("Phone Number not found." +e.getMessage());
			throw(e);
		}
	}
	
	public Select PhoneType()
	{
		try {
			Select sel = new Select(driver.findElement(By.name("party:j_id323:0:phnDecorate:j_id326")));
			return sel;
		}
		catch(NoSuchElementException e) {
			Assert.fail("Phone Type not found." +e.getMessage());
			throw(e);
		}
	}
	
	public WebElement Email()
	{
		try {
			email=driver.findElement(By.id("party:j_id340:0:emlDecorate:nmbr"));
			return email;
		}
		catch(NoSuchElementException e) {
			Assert.fail("Email not found." +e.getMessage());
			throw(e);
		}
	}
	
	public Select EmailType()
	{
		try {
			Select sel = new Select(driver.findElement(By.name("party:j_id340:0:emlDecorate:j_id343")));
		return sel;
		}
		catch(NoSuchElementException e) {
			Assert.fail("Email Type not found." +e.getMessage());
			throw(e);
		}
	}
	
	public WebElement Websites()
	{
		try {
			website=driver.findElement(By.id("party:j_id368:0:webDecorate:web"));
			return website;
		}
		catch(NoSuchElementException e) {
			Assert.fail("Username not found." +e.getMessage());
			throw(e);
		}
	}
	
	public Select Socials()
	{
		try {
			Select sel = new Select(driver.findElement(By.id("party:j_id368:0:webDecorate:service")));
			return sel;
		}
		catch(NoSuchElementException e) {
			Assert.fail("Socials site not found." +e.getMessage());
			throw(e);
		}
	}
	
	public Select SocialsType()
	{
		try {
			Select sel = new Select(driver.findElement(By.name("party:j_id368:0:webDecorate:j_id373")));
			return sel;
		}
		catch(NoSuchElementException e) {
			Assert.fail("Socials Type not found." +e.getMessage());
			throw(e);
		}
	}
	
	public WebElement AddanAddress()
	{
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			add=driver.findElement(By.xpath("//*[@id='party:j_id441']/span"));
			return add;
		}
		catch(NoSuchElementException e) {
			Assert.fail("Add an address not found." +e.getMessage());
			throw(e);
		}
	}
	
	public WebElement Address()
	{
		try {
			add=driver.findElement(By.xpath("//div[@class='propGroup']//descendant::textarea"));
			return add;
		}
		catch(NoSuchElementException e) {
			Assert.fail("Address not found." +e.getMessage());
			throw(e);
		}
	}
	
	public Select AddressType()
	{
		try {
			Select sel = new Select(driver.findElement(By.name("party:j_id387:0:j_id436")));
			return sel;
		}
		catch(NoSuchElementException e) {
			Assert.fail("Address Type not found." +e.getMessage());
			throw(e);
		}
	}
	
	public WebElement City()
	{
		try {
			city=driver.findElement(By.xpath("//div[@id='party:j_id387:0:ctyDecorate']//descendant::input"));
			return city;
		}
		catch(NoSuchElementException e) {
			Assert.fail("City not found." +e.getMessage());
			throw(e);
		}
	}
	
	public WebElement State()
	{
		try {
			state=driver.findElement(By.xpath("//div[@id='party:j_id387:0:rgnDecorate']//descendant::input"));
			return state;
		}
		catch(NoSuchElementException e) {
			Assert.fail("State not found." +e.getMessage());
			throw(e);
		}
	}
	
	public WebElement Zip()
	{
		try {
			zip=driver.findElement(By.xpath("//div[@id='party:j_id387:0:ctyPstCd']//descendant::input"));
			return zip;
		}
		catch(NoSuchElementException e) {
			Assert.fail("Zip not found." +e.getMessage());
			throw(e);
			}
	}
	
	public Select Country()
	{
		try {
			Select sel = new Select(driver.findElement(By.xpath("//div[@class='select']//select[@name='party:j_id387:0:cntryDecorate:j_id429']")));
			return sel;
		}
		catch(NoSuchElementException e) {
			Assert.fail("Country not found." +e.getMessage());
			throw(e);
		}
	}
	
	public WebElement SaveBtn1() 
	{
		try {
			btn=driver.findElement(By.id("party:save"));
			return btn;
		}
		catch(NoSuchElementException e) {
			Assert.fail("Button not clicked." +e.getMessage());
			throw(e);
			}
	}
	
	public WebElement CasesMain() 
	{
		try {
			add=driver.findElement(By.xpath(" //div[@class='nav-bar-section nav-bar-main']//descendant::a[5]"));
			return add;
		}
		catch(NoSuchElementException e) {
			Assert.fail("Cases not clicked." +e.getMessage());
			throw(e);
		}
	}
	
	public WebElement AddCase()
	{
		try {
			add=driver.findElement(By.linkText("Add Case"));
			return add;
		}
		catch(NoSuchElementException e) {
			Assert.fail("Add Cases not clicked." +e.getMessage());
			throw(e);
		}
	}
	
	public WebElement CasesTxtBxMain()
	{
		 try {
			 cases=driver.findElement(By.xpath("//*[@placeholder='Find a person or organisation']"));
			 return cases;
		 }
		 catch(NoSuchElementException e) {
			 Assert.fail("Cases Text Box not filled." +e.getMessage());
			 throw(e);
		 }
		
	}
	
	public WebElement NameTxtBxMain()
	{
		try {
		name=driver.findElement(By.xpath("//input[@class='form-input-text']"));
		return name;
		}
		catch(NoSuchElementException e) {
			Assert.fail("Name Text Box not filled." +e.getMessage());
			throw(e);
		}
	}
	
	public WebElement DescrpMain()
	{
		try {
			des=driver.findElement(By.xpath("//textarea[@class='form-input-text']"));
			return des;
		}
		catch(Exception e) {
			Assert.fail("Description Box not filled." +e.getMessage());
			throw(e);
		}
	}
	
	public WebElement TagMain()
	{
		try {
			tag=driver.findElement(By.xpath("//div[@class='item-select-input-wrapper']//descendant::input"));
			return tag;
		}
		catch(NoSuchElementException e) {
			Assert.fail("Tag textarea not filled." +e.getMessage());
			throw(e);
		}
	}
	
	public WebElement SaveBtn2()
	{
		try {
			btn=driver.findElement(By.xpath("//*[@type='submit']"));
			return btn;
		}
	    catch(NoSuchElementException e) {
		    Assert.fail("Save Button not clicked." +e.getMessage());
		    throw(e);
	    }
	}
	
}
