package com.crm.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	//PageFactory -- OR
	@FindBy(name="email")   //findBy is equivalent to driver.find element in POM
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[text()='Sign Up']")
	WebElement signUpBtn;
	
	public LoginPage()
	{
		//initializing Page Objects
		PageFactory.initElements(driver, this); //this points to  current class objects
	}
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public HomePage login(String em,String pass)
	{
		email.sendKeys(em);
		password.sendKeys(pass);
		loginBtn.click();
		
		return new HomePage(); //Since HomePage is landing page of login page hence its returning homepage object
	}

}
