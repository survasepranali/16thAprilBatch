package com.saucedemo.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPomClass
{
	private WebDriver driver;
	private Actions act;
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
    public void sendusername ()
    {
    	username.sendKeys("standard_user");
    }
    @FindBy(xpath="//input[@id='password']")
    private WebElement password;
    public void sendpassword ()
    {
    	password.sendKeys("secret_sauce");
    }
    @FindBy (xpath = "//input[@name='login-button']")
    private WebElement Login;
    // Normal click method
//    public void Clickonlogin ()
//    {
//    	Login.click();
//    }
    // Using Mouse Actions class
    public void Clickonlogin ()
    {
    	act.click(Login).perform();
    }
    
    
    public LoginPomClass (WebDriver driver)
    {
    	this.driver = driver;
    	PageFactory.initElements (driver,this);
    	act = new Actions (driver);

    }
    
}
