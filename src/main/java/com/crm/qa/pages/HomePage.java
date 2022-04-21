package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	@FindBy(xpath="//span[contains(text(),'akash sontake')]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//i[@class='users icon']")
	WebElement contactsLink;
	
	
	
	@FindBy(xpath="//i[@class='money icon']")
	WebElement dealsLink;
	
	@FindBy(xpath="//i[@class='tasks icon']")
	WebElement tasksLink;

	public HomePage()
	{
		//initializing Page Objects
		PageFactory.initElements(driver, this); //this points to  current class objects
	}
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
		
	}
	public boolean verifyCorrectUserName()
	{
		return userNameLabel.isDisplayed();
	}
	public ContactsPage clickOnContactsLink()
	{
		contactsLink.click();
		return new ContactsPage();
		
	}
	
	
	
	public DealsPage clickOnDealsLink()
	{
		dealsLink.click();
		return new DealsPage();
		
	}
	
	public TasksPage clickOnTasksLink()
	{
		tasksLink.click();
		return new TasksPage();
		
	}
}
