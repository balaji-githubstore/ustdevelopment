package com.abc.magentopages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
	WebDriver driver;
	By logout=By.linkText("Log Out");
	
	public MainPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public void clickOnLogout()
	{
		driver.findElement(logout).click();
	}
}
