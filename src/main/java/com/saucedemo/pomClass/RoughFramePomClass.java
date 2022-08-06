package com.saucedemo.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoughFramePomClass 
{
	
		private WebDriver driver;
		@FindBy (xpath = "//form//div[2]//input")
		private WebElement frameEle;
		public WebElement getElement()
		{
			return frameEle;
		}
		public RoughFramePomClass (WebDriver driver)
		{
			this.driver = driver ;
			PageFactory.initElements(driver, this);
		}

		}


