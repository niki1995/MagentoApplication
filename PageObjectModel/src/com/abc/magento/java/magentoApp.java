package com.abc.magento.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class magentoApp
{

	public static void main(String[] args) 
	{
		String url ="http:///www.magento.com";
		WebDriver driver new =FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		
	}

	

}
