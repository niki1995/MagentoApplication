package com.abc.Magentoobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login 
{

	WebDriver driver;
	By login = By.linkText("Login");
	public Login(WebDriver driver) 
	{
		super();
		this.driver=driver;
	}
	public void typeEmail(String username)
	{
		driver.findElement("email").sendKeys(username);
		
	}
	public void typePassword(String pwd)
	{
		driver.findElement("pass").sendKeys(pwd);
	}
	public void clickOnLogin()
	{
		driver.findElement(login).click();
	}
}
	


