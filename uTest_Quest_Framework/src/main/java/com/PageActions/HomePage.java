package com.PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.TestBase.Testbase;

public class HomePage extends Testbase{

	public static WebElement my_profile_button(WebDriver driver)
	{
		return driver.findElement(By.xpath(configOR("myprofilebutton")));
	}
}
