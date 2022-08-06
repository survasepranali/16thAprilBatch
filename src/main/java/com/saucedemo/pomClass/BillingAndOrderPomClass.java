package com.saucedemo.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingAndOrderPomClass
{
private WebDriver driver;
@FindBy (xpath = "//button[@id='finish']")
private WebElement finish;
public void finish()
{
	finish.click();
}
@FindBy (xpath = "//h2[text()='THANK YOU FOR YOUR ORDER']")
private WebElement Billingtext;
public String getText()
{
	String text = Billingtext.getText();
	return text;
}
public void Billingtext()
{
	Billingtext.click();
}


@FindBy (xpath = "//button[@id='back-to-products']")
private WebElement home;
public void home()
{
	home.click();
}
public BillingAndOrderPomClass (WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver,this);
}
}
