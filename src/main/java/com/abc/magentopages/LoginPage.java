package com.abc.magentopages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By email=By.id("email");
	By pass=By.id("pass");
	By login=By.id("send2");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public void sendUserName(String userName)
	{
		driver.findElement(email).sendKeys(userName);
	}
	public void sendPassword(String password)
	{
		driver.findElement(email).sendKeys(password);
	}
	public void clickOnLogin()
	{
		driver.findElement(login).click();
	}
}
