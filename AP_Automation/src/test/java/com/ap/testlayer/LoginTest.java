package com.ap.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ap.pagelayer.HomePage;
import com.ap.testbase.TestBase;

public class LoginTest extends TestBase {
	@Test
	public void validate_login_with_valid_credentials ()
	{
		String expected_result = "https://ap-automation.odoo.com/my";
		
		HomePage homepage_obj = new HomePage (driver);
		
		homepage_obj.click_on_signin_link();
		
		String actual_result = driver.getCurrentUrl();
		Assert.assertEquals(actual_result, expected_result);
	}

}
