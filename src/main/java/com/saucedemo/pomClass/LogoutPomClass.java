package com.saucedemo.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPomClass
{
private WebDriver driver;
@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
private WebElement settingButton;

	public void clickonsettingbutton ()
	{
		settingButton.click();
	}
	@FindBy(xpath ="//a[text()='Logout']")
	private WebElement logout;
	
		public void clickonlogoutbutton()
		{
			logout.click();
		}
		public  LogoutPomClass (WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	}
	


	



