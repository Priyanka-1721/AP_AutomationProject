package com.ap.testlayer;

import org.testng.annotations.Test;

import com.ap.pagelayer.HomePage;
import com.ap.pagelayer.SignupPage;
import com.ap.testbase.TestBase;

public class SignupTest extends TestBase {

	@Test
	public void validate_login_with_valid_credentials ()
	{
		//String expected_result = "https://ap-automation.odoo.com/my";
		
		HomePage homepage_obj = new HomePage (driver);
		SignupPage signuppage_obj = new SignupPage (driver);
		
		homepage_obj.click_on_signin_link();
		signuppage_obj.enter_your_name("");
		signuppage_obj.enter_email("");
		signuppage_obj.enter_password("");
		signuppage_obj.enter_confirm_password("");
		signuppage_obj.click_on_signup_button();
		
	}
}
