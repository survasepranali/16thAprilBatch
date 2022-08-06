package com.saucedemo.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPomClass 
{
private WebDriver driver;
@FindBy(xpath = "//button[text()='Checkout']")
private WebElement checkout;
public void checkout ()
{
	checkout.click();
}
@FindBy(xpath = "//input[@id='first-name']")
private WebElement firstname;
public void firstname ()
{
	firstname.sendKeys("Pranali");
}
@FindBy(xpath = "//input[@id='last-name']")
private WebElement lastname;
public void lastname ()
{
	lastname.sendKeys("Survase");
}
@FindBy(xpath = "//input[@id='postal-code']")
private WebElement postalcode;
public void postalcode ()
{
	postalcode.sendKeys("12345");
}
@FindBy(xpath = "//input[@id='continue']")
private WebElement clickoncontinue;
public void clickoncontinue ()
{
	clickoncontinue.click();
}
@FindBy(xpath = "//div[@class='header_secondary_container']")
private WebElement Checkout;
public String getTextCheckout ()
{
	String checkout = Checkout.getText();
	return checkout;
	
}
public CheckoutPomClass (WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
}
