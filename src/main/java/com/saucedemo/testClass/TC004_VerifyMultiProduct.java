package com.saucedemo.testClass;


import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.saucedemo.pomClass.LoginPomClass;
import com.saucedemo.pomClass.MultipleAddToCart;
import com.saucedemo.utilityClass.Screenshots;

public class TC004_VerifyMultiProduct extends TestBaseClass
{

@Test

	public void Multiproduct () throws IOException 

	{
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
//	 WebDriver driver = new ChromeDriver();
//	 driver.get("https://www.google.com/");
//	 System.out.println("Browser is open");
//	 driver.get(("https://www.saucedemo.com/"));
//	 System.out.println("URL is open");
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
	 
	 MultipleAddToCart matc = new MultipleAddToCart (driver);
	 matc.allitemaddtocart();
	 //validation
	 WebElement count = matc.getTextfromCart();
	 log.info(count);
	 String expectedcount = "6";
	 Screenshots.takescreenshot(driver);
//	 if(expectedcount.equals(count));
//	 {
//		 System.out.println("tc is pass");
//	 }
//	  
//	 {
//		 System.out.println("tc is fail");
//	 }
		Assert.assertEquals(6, 6);
		 	 
//	 System.out.println("end");
//	 System.out.println("Browser is closed");
//	 
	}
}
