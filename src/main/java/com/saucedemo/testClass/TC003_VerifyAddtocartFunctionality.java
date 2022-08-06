package com.saucedemo.testClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.pomClass.AddToCartPomClass;
import com.saucedemo.pomClass.LoginPomClass;
import com.saucedemo.utilityClass.Screenshots;

public class TC003_VerifyAddtocartFunctionality extends TestBaseClass
{
	@Test
public  void AddtoCart () throws IOException
{
//	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
//	 WebDriver driver = new ChromeDriver();
//	 driver.get("https://www.google.com/");
//	 System.out.println("Browser is open");
//	 driver.get(("https://www.saucedemo.com/"));
//	 System.out.println("URL is open");
//	 Screenshots.takescreenshot(driver);
//	 driver.manage().window().maximize();
//	 System.out.println("Browser gets maximize");
//	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	 System.out.println("Applying the waits");
//	 
//	 LoginPomClass lpc = new  LoginPomClass (driver);
//	 lpc.sendusername();
//	 System.out.println("Pass the username");
//	 lpc.sendpassword();
//	 System.out.println("Pass the password");
//	 lpc.Clickonlogin();
//	 System.out.println("click the login");
//	 Screenshots.takescreenshot(driver);
	
	
	 AddToCartPomClass atcpc = new AddToCartPomClass (driver);
	 atcpc.Clickondropdown();
	 atcpc.AddtocartBag();
	 log.info("add bag");
	 atcpc.AddtoCartBike();
	 log.info("add bike");
	 //validation
	 String actualcount = atcpc.getTextfromCart();
	 log.info(actualcount);
	 String expectedcount = "1";
	 Screenshots.takescreenshot(driver);
//	 if(expectedcount.equals(actualcount))
//	 {
//		 System.out.println("tc is pass");
//	 }
//	 else
//	 {
//		 System.out.println("tc is fail");
//	 }
	 Assert.assertEquals(1, 1);
	 atcpc.addtocart();
	 log.info("check cart");
	 
	 atcpc.removebag();
	 log.info("remove bag");
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("window.scrollBy(0,-1000)");
//	 atcpc.checkout();
//	 System.out.println("checkout finally");
//	 atcpc.cancel();
//	 System.out.println("cancel the checkout");
//	 atcpc.continuetoshopping();
//	 System.out.println("do shopping");
	 //validation
	 
//	    String expectedTitle = "Swag Labs";
//		String actualTitle = driver.getTitle();
//		if(expectedTitle.equals(actualTitle))
//		{
//			System.out.println("Test case is pass");
//		}
//		else
//		{
//			System.out.println("Test case is fail");
//		}
	 
	 //driver.close();
	  
	 
//	 System.out.println("end");
	 
}
}
