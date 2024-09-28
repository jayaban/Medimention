package com.medimention.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.CacheLookup;

public class HomePage extends BasePage{

	
WebDriver driver;
	public HomePage(WebDriver driver)
	{		
	super(driver);		
	}
	
	@FindBy(xpath="//a[text()='Home']")  //defining homepage button
	@CacheLookup

	WebElement btnHome;
	
	@FindBy(xpath ="//a[text()='Join Us']") //defining joinus link on homepage
	@CacheLookup
	WebElement btnJoinUs;
	
	@FindBy(xpath="//a[text()='Login']")   //defining login button on homepage
	@CacheLookup
	WebElement btnLogin;
	
	
	//perform click operations 
	public void homebtn()
	{
		btnHome.click();
	}
	public void registerbtn()
	{
		btnJoinUs.click();
	}
	public void loginbtn()
	{
		btnLogin.click();
	}	
}
