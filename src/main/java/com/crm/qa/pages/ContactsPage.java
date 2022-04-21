package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase{
	@FindBy(xpath="//div[text()='Contacts']")
	WebElement contactsLabel;
	
	@FindBy(xpath="//i[@class='users icon']")
	WebElement contactsLink;
	
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@name='last_name']")
	WebElement lastName;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[4]/div[2]/div/div")
	WebElement categoryDropdown;
	
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")//change to absolute later
	WebElement addContactsLinkl;
	
	
	
	//span[@class='text' and contains(text(),'Lead')]
	
	
	public ContactsPage()
	{
		//initializing Page Objects
		PageFactory.initElements(driver, this); //this points to  current class objects
	}
	
	public boolean verifyContactsLabel()
	{
		return contactsLabel.isDisplayed();
		
	}
	public void clickOnAddCOntactsLink()
	{
		contactsLink.click();
		addContactsLinkl.click();  //click on create button
		
		
		
	}
	
	public void AddNewContactsDetails(String fname, String lname)
	
	{
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		
	}

}
