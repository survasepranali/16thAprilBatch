package com.saucedemo.testClass;


import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.pomClass.AddToCartPomClass;
import com.saucedemo.pomClass.CheckoutPomClass;
import com.saucedemo.pomClass.LoginPomClass;
import com.saucedemo.utilityClass.Screenshots;

public class TC005_VerifyCheckoutFunctaionality extends TestBaseClass
{
	@Test
	public  void checkoutFunctionality () throws IOException 
	{
		
//	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
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
	 
	 AddToCartPomClass atcpc = new AddToCartPomClass (driver);
	 atcpc.AddtocartBag();
	 log.info("add bag");
	 atcpc.AddtoCartBike();
	 log.info("add bike");
	 atcpc.addtocart();
	 log.info("check cart");
	 Screenshots.takescreenshot(driver);
	 	 
	 CheckoutPomClass copc= new CheckoutPomClass (driver);
	         copc.checkout();
	         log.info("Click on checkout");
			 copc.firstname();
			 log.info("Pass the firstname");
			 copc.lastname();
			 log.info("Pass the lastname");
			 copc.postalcode();
			 log.info("Pass the code");
			 copc.clickoncontinue();
			 Screenshots.takescreenshot(driver);
			 log.info("continue to shopping");
			//validation
			 String text = copc.getTextCheckout();
			 log.info(text);
			 String expectedtext = "CHECKOUT: OVERVIEW";
			 Screenshots.takescreenshot(driver);
//			 if(expectedtext.equals(text))
//			 {
//				 System.out.println("tc is pass");
//			 }
//			 else
//			 {
//				 System.out.println("tc is fail");
//			 }
			 Assert.assertEquals(expectedtext, "CHECKOUT: OVERVIEW","Text are matching");
//			 System.out.println("end");
}
}