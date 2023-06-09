package com.ds.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.pageLayer.LoginPage;
import com.ds.testBase.TestBase;
import com.ds.utilities.UtilClass;

public class LoginPageTest extends TestBase{
	

	@Test
	public void verifyLoginWithCorrectCred() throws InterruptedException
	{
		String expected_output = "https://www.apps.dalalstreet.ai/dashboard";
		
		LoginPage login_obj = new LoginPage(driver);
		UtilClass util_obj = new UtilClass();
		login_obj.enterEmailAddress("Shetesarita@gmail.com");
		login_obj.enterPassword("@Test13jully");
		login_obj.clickOnLoginButton();
		
		Thread.sleep(5000);
		String actual_output = util_obj.getWebPageUrl();
		Assert.assertEquals(actual_output, expected_output);
	}
	

}
