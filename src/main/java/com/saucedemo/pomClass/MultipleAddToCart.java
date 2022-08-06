package com.saucedemo.pomClass;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MultipleAddToCart
{
private WebDriver driver;
@FindBy(xpath = "//button[text()='Add to cart']")
List <WebElement> Allitemaddtocart;
public void allitemaddtocart ()
{
	for (WebElement i :Allitemaddtocart)
	{
		i.click();
	}
}
public WebElement getTextfromCart ()
{
	WebElement TotalProduct = Allitemaddtocart.get(0);
	return TotalProduct;
	
}

public MultipleAddToCart (WebDriver driver)
{
	this.driver = driver ;
	PageFactory.initElements(driver, Allitemaddtocart);
}

}
