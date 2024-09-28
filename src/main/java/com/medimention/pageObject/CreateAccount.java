package com.medimention.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount extends BasePage{
WebDriver driver;

public CreateAccount(WebDriver driver)
{
	super(driver);
}
@FindBy(xpath="//button[@title='Select Group']")
@CacheLookup
WebElement groupselect;

@FindBy(xpath="//span[text()='Blood Bank']")
@CacheLookup
WebElement chooseGroup;


@FindBy(xpath="//input[@id='DetailName']")
@CacheLookup
WebElement firmselect;

@FindBy(xpath="//input[@id='UserUsername']")
@CacheLookup
WebElement username;

@FindBy(xpath="//input[@id='UserEmail']")
@CacheLookup
WebElement useremail;

@FindBy(xpath="//input[@id='UserPassword']")
@CacheLookup
WebElement userpassword;

@FindBy(xpath="//input[@id='UserPassword1']")
@CacheLookup
WebElement repeatPassword;

@FindBy(xpath="//input[@type='checkbox']")
@CacheLookup
WebElement termsandcond;

@FindBy(xpath="//button[@type='submit']")
@CacheLookup
WebElement register;


//selecting group
public void clickGroup()
{
	
//	Select se= new Select(groupselect);
//	se.selectByVisibleText(grpname);
	groupselect.click();
	}

public void groupName()
{
	chooseGroup.click();
}
//firm name
public void selectfirm(String firmname)
{
	firmselect.sendKeys(firmname);
}

//username

public void userName(String un)
{
	username.sendKeys(un);
}
//email
public void email(String em)
{
	useremail.sendKeys(em);
}

//password
public void password(String pass)
{
	userpassword.sendKeys(pass);
}

// confirm password

public void confirmPass(String cpass)
{
	repeatPassword.sendKeys(cpass);
}
//terms and cond

public void termsAndCond()
{
	termsandcond.click();
}
//register button

public void registerSuccess()
{
	register.click();
	}


}
