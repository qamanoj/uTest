package com.testScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class TestExecution extends Repository
{

	public WebDriver Driver;

	@BeforeTest
	public void lunch_Verify()
	{
		open_URL();
	}

	@Test(priority = 1)
	public void login_Verify()
	{
		Login_browser();
	}

	@Test(priority = 2)
	public void my_profile_button_verify()
	{
		my_profile();
	}

	@Test(priority = 3)
	public void password_verfy()
	{
		password_change();
	}

	@Test(priority = 4)
	public void Accout_Settings_verify()
	{
		Account_Settings_Page();
	}

	@Test(priority = 5)
	public void signout_button_verify()
	{
		signout();
	}

	@AfterTest
	public void quit_browser_verify()
	{
		quitbrowser();
	}

}
