package com.PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.TestBase.Testbase;

public class AccountSettings extends Testbase {


	public static WebElement nativeLanguage(WebDriver driver)
	{
		return driver.findElement(By.xpath(configOR("nativelanguagebutton")));
	}

	public static WebElement nativeLanguageSearch(WebDriver driver)
	{
		return driver.findElement(By.xpath(configOR("nativelanguagesearch")));
	}

	public static WebElement nativeLanguageSelect(WebDriver driver)
	{
		return driver.findElement(By.xpath(configOR("nativelanguageselection")));
	}

	public static WebElement avatar(WebDriver driver)
	{
		return driver.findElement(By.name(configOR("avatarbutton")));
	}

	public static WebElement gravatarEmail(WebDriver driver)
	{
		return driver.findElement(By.xpath(configOR("gravataremail")));
	}

	public static WebElement testFlightEmail(WebDriver driver)
	{
		return driver.findElement(By.xpath(configOR("testfileemail")));
	}

	public static WebElement googlePlayEmail(WebDriver driver)
	{
		return driver.findElement(By.xpath(configOR("googleplayemail")));
	}

	public static WebElement aboutMe(WebDriver driver)
	{
		return driver.findElement(By.xpath(configOR("aboutme")));
	}

	public static WebElement mobileNumberbutton(WebDriver driver)
	{
		return driver.findElement(By.xpath(configOR("mobilenumberbutton")));
	}

	public static WebElement mobileNumberIndiaSelection(WebDriver driver)
	{
		return driver.findElement(By.xpath(configOR("mobilenumberIndiaselection")));
	}

	public static WebElement mobileNumber_edit(WebDriver driver)
	{
		return driver.findElement(By.xpath(configOR("mobilenumberedit")));
	}

	public static WebElement backTotop_link(WebDriver driver)
	{
		return driver.findElement(By.xpath(configOR("backtotop")));
	}

	public static WebElement save_button(WebDriver driver)
	{
		return driver.findElement(By.xpath(configOR("persionalinformationsavebutton")));
	}
}
