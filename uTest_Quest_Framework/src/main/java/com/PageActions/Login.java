package com.PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.TestBase.Testbase;

public class Login extends Testbase
{	

	public static WebElement sighin_button_homepage(WebDriver driver)
	{
		return driver.findElement(By.xpath(configOR("loginlink")));
	}

	public static WebElement username_edit(WebDriver driver)
	{
		return driver.findElement(By.id(configOR("usernameid")));
	}

	public static WebElement password_edit(WebDriver driver)
	{
		return driver.findElement(By.id(configOR("passwordid")));
	}

	public static WebElement login_button(WebDriver driver)
	{
		return driver.findElement(By.id(configOR("loginid")));
	}

	public static WebElement forgot_password(WebDriver driver)
	{
		return driver.findElement(By.id(configOR("forgotpassword")));
	}

	public static WebElement rememberMe_CheckBox(WebDriver driver)
	{
		return driver.findElement(By.id(configOR("rememberme")));

	}
}
