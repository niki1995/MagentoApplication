package com.abc.Magentoobjects;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {

	WebDriver driver;
	By myacc = By.linkText("My Account");
	
	   public Home() {
		   super();
		this.driver =driver;
	   }
		public void clickOnMyAcc()
		{
			driver.findElement(myacc).click();
	}
	}


