package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class ContactsPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	
	public ContactsPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		contactsPage=homePage.clickOnContactsLink();
		
			
	} 
	
	@Test(priority=1,enabled=true)
	public void contactsPageLabelTest()
	{
		Assert.assertTrue(contactsPage.verifyContactsLabel());
	}
	
	@Test(priority=2,enabled=true)
	public void addNewContactTest()
	{
		contactsPage.clickOnAddCOntactsLink();
		contactsPage.AddNewContactsDetails("Akki", "Vakki");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
