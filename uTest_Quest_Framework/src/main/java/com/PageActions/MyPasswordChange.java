package com.PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.TestBase.Testbase;

public class MyPasswordChange extends Testbase{


	public static WebElement change_password_button(WebDriver driver)
	{
		return driver.findElement(By.xpath(configOR("changepasswordbutton")));
	}

	public static WebElement current_password_edit(WebDriver driver)
	{
		return driver.findElement(By.id(configOR("currentpasswordedit")));
	}

	public static WebElement new_password_edit(WebDriver driver)
	{
		return driver.findElement(By.xpath(configOR("newpasswordedit")));
	}

	public static WebElement confirm_new__password_edit(WebDriver driver)
	{
		return driver.findElement(By.xpath(configOR("confirmnewpasswordedit")));
	}

	public static WebElement save_button(WebDriver driver)
	{
		return driver.findElement(By.xpath(configOR("savebutton")));
	}

	public static WebElement cancel_button(WebDriver driver)
	{
		return driver.findElement(By.xpath(configOR("cancelbutton")));
	}

}
