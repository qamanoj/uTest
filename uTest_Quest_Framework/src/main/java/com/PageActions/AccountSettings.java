package com.PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.TestBase.Testbase;

public class AccountSettings extends Testbase {


	public static WebElement nativeLanguage(WebDriver driver)
	{
		return driver.findElement(By.xpath("//div[@class='buttonLabel']"));
	}

	public static WebElement nativeLanguageSearch(WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[@placeholder='Search...']"));
	}

	public static WebElement nativeLanguageSelect(WebDriver driver)
	{
		return driver.findElement(By.xpath("//div[@class='multiSelectItem selected vertical']"));
	}

	public static WebElement avatar(WebDriver driver)
	{
		return driver.findElement(By.name("avatarTypeId"));
	}

	public static WebElement gravatarEmail(WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[@placeholder='Gravatar Email']"));
	}

	public static WebElement testFlightEmail(WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[@id='testFlightEmail']"));
	}

	public static WebElement googlePlayEmail(WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[@id='googlePlayEmail']"));
	}

	public static WebElement aboutMe(WebDriver driver)
	{
		return driver.findElement(By.xpath("//textarea[@id='aboutMe']"));
	}

	public static WebElement mobileNumberbutton(WebDriver driver)
	{
		return driver.findElement(By.xpath("//div[@class='selected-dial-code']"));
	}

	public static WebElement mobileNumberIndiaSelection(WebDriver driver)
	{
		return driver.findElement(By.xpath("//span[contains(text(),'India (')]"));
	}

	public static WebElement mobileNumber_edit(WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[@id='phoneNumber']"));
	}

	public static WebElement backTotop_link(WebDriver driver)
	{
		return driver.findElement(By.xpath("//a[@class='scroll-to-top']"));
	}

	public static WebElement save_button(WebDriver driver)
	{
		return driver.findElement(By.xpath("//div[@class='pull-right button-top']//button[@class='btn btn-primary'][contains(text(),'Save')]"));
	}
}
