package com.PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.TestBase.Testbase;

public class Logout extends Testbase
{
	
	public static WebElement signout_button(WebDriver driver)
	{
		return driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
	}
}