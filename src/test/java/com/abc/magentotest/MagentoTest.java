package com.abc.magentotest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.abc.magentopages.*;

public class MagentoTest {
	
	@Test
	public void magentoTest() {
		// TODO Auto-generated method stub
		//hhhfhfrhjkrhfjkhjk
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://magento.com/");
		System.out.println(driver);
		//HomePage
		HomePage home=new HomePage(driver);
		home.clickOnMyAccount();
		
		//Login Page
		LoginPage login=new LoginPage(driver);
		login.sendUserName("balajidinakaran1@gmail.com");
		login.sendPassword("Welcome123");
		login.clickOnLogin();
		
		//MainPage
		MainPage main=new MainPage(driver);
		main.clickOnLogout();


	}

}
