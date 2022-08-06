package com.saucedemo.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddToCartPomClass
{
private WebDriver driver;
private Select s;


@FindBy(xpath="//select[@data-test='product_sort_container']")
private WebElement dropdown;
public void Clickondropdown ()
{
	dropdown.click();
	s.selectByVisibleText("Price (high to low)");
}
@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
WebElement Bag;
public void AddtocartBag ()
{
    Bag.click();
}
@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
private WebElement Bike;
public void AddtoCartBike ()
{
	Bike.click();
}
@FindBy(xpath = "//span[@Class='shopping_cart_badge']")
private WebElement AddtoCart;
public String getTextfromCart ()
{
	String TotalProduct = AddtoCart.getText();
	return TotalProduct;
	
}
public void addtocart ()
{
	AddtoCart.click();
}

@FindBy(xpath = "//button[text()='Remove']")
private WebElement remove;
public void removebag ()
{
	remove.click();
}

//@FindBy(xpath = "//button[@id='cancel']")
//private WebElement cancel;
//public void cancel ()
//{
//	cancel.click();
//}
//@FindBy(xpath = "//button[@id='continue-shopping']")
//private WebElement continuetoshopping;
//public void continuetoshopping ()
//{
//	continuetoshopping.click();
//}	
public AddToCartPomClass (WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver,this);
	s = new Select (dropdown);
	
}


}
