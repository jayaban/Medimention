package com.medimention.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends BasePage{
	WebDriver driver;

	public MyAccount(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//a[@class='navbar-brand']/small")
	@CacheLookup
	WebElement acctHead;
	
	public String validateMyAccount()
	{
		return acctHead.getText().toLowerCase();
	}
	
	
}
