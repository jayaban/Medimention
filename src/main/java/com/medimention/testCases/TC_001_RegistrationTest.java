package com.medimention.testCases;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.medimention.pageObject.CreateAccount;
import com.medimention.pageObject.HomePage;
import com.medimention.pageObject.MyAccount;

public class TC_001_RegistrationTest extends BaseClass {
	@Test
	public void accountRegister()
	{
		HomePage H= new HomePage(driver);
		H.homebtn();
		H.registerbtn();
		MyAccount ma = new MyAccount(driver);
		CreateAccount CA = new CreateAccount(driver);
	//	CA.selectGroup("Blood Bank");
		String pass = RandomStringUtils.randomAlphanumeric(8);
		String username= RandomStringUtils.randomAlphanumeric(6);
		String Bname= randomString();
		CA.clickGroup();
		CA.groupName();
		CA.selectfirm(Bname);
		CA.userName(username);
		CA.email(randomString()+"xyz.com");
		CA.password(pass);
		CA.confirmPass(pass);
		CA.termsAndCond();
		CA.registerSuccess();
		System.out.println(username+" "+pass);
		String act_head = "Medimention | ".toLowerCase()+Bname.toLowerCase()+ "'s User Panel".toLowerCase();
		Assert.assertEquals(act_head,ma.validateMyAccount());
		
		
		
	}

}
