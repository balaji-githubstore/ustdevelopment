package com.abc.magentopages;
//fff
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	By myAccount=By.linkText("MY ACCOUNT");
	
	/*By myAccount=By.xpath("//*[text()='Account']/ancestor::a");
	By myAccount=By.xpath("//*[text()='Account']");
	By myAccount=By.xpath("//*[contains(text(),'Account')]");*/
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnMyAccount()
	{
		System.out.println(driver);
		driver.findElement(myAccount).click();
		
	}

}
