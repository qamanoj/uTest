package com.testScripts;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.PageActions.AccountSettings;
import com.PageActions.HomePage;
import com.PageActions.Login;
import com.PageActions.Logout;
import com.PageActions.MyPasswordChange;
import com.TestBase.Testbase;

public class Repository extends Testbase

{
	public static WebDriver driver;

	public void open_URL()
	{
		System.setProperty(config("webdriverprorerty"),config("ChromePath")); 
		driver=new ChromeDriver();
		driver.get(config("Build1"));	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void Login_browser()
	{
		Login.sighin_button_homepage(driver).click();
		Login.username_edit(driver).sendKeys(config("username"));
		Login.password_edit(driver).sendKeys(config("password"));
		Login.rememberMe_CheckBox(driver).click();
		Login.login_button(driver).click();	
	}

	public void my_profile()
	{
		HomePage.my_profile_button(driver).click();
	}

	public void password_change()
	{
		MyPasswordChange.change_password_button(driver).click();
		MyPasswordChange.current_password_edit(driver).sendKeys("Admin12345");
		MyPasswordChange.new_password_edit(driver).sendKeys("Admin12345");
		MyPasswordChange.confirm_new__password_edit(driver).sendKeys("Admin12345");

	}


	public void Account_Settings_Page()
	{
		AccountSettings.nativeLanguage(driver).click();
		AccountSettings.nativeLanguageSearch(driver).sendKeys("English");

		//Personal Info
		AccountSettings.avatar(driver).click();
		AccountSettings.gravatarEmail(driver).sendKeys("mail2manoj18@gmail.com");
		AccountSettings.testFlightEmail(driver).sendKeys("mail2manoj18@gmail.com");
		AccountSettings.googlePlayEmail(driver).sendKeys("mail2manoj18@gmail.com");
		AccountSettings.aboutMe(driver).sendKeys("qa tester");

		//Mobile number
		AccountSettings.mobileNumberbutton(driver).click();
		AccountSettings.mobileNumberIndiaSelection(driver).click();
		AccountSettings.mobileNumber_edit(driver).sendKeys("9535960971");

		AccountSettings.backTotop_link(driver).click();
	}

	public void signout()
	{
		Logout.signout_button(driver).click();
	}

	public void quitbrowser()
	{
		driver.quit();
	}
}
