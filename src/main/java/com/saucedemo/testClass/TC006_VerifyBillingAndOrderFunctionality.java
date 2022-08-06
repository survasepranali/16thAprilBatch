package com.saucedemo.testClass;


import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.pomClass.AddToCartPomClass;
import com.saucedemo.pomClass.BillingAndOrderPomClass;
import com.saucedemo.pomClass.CheckoutPomClass;
import com.saucedemo.pomClass.LoginPomClass;
import com.saucedemo.utilityClass.Screenshots;

public class TC006_VerifyBillingAndOrderFunctionality extends TestBaseClass
{
	@Test
public void BillingAndOrderFunctionality ()throws IOException 
{
	
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
//    WebDriver driver = new ChromeDriver();
//    driver.get("https://www.google.com/");
//	 System.out.println("Browser is open");
//	 driver.get(("https://www.saucedemo.com/"));
//	 System.out.println("URL is open");
//	 Screenshots.takescreenshot(driver);
//	 driver.manage().window().maximize();
//	 System.out.println("window gets maximize");
//	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	 System.out.println("Applying waits");
//	 
//	 
//	 LoginPomClass lpc = new  LoginPomClass (driver);
//	 lpc.sendusername();
//	 System.out.println("pass the username");
//	 lpc.sendpassword();
//	 System.out.println("pass the password");
//	 lpc.Clickonlogin();
//	 System.out.println("click the login");
//	 Screenshots.takescreenshot(driver);

	 AddToCartPomClass atcpc = new AddToCartPomClass (driver);
	 atcpc.Clickondropdown();
	 atcpc.AddtocartBag();
	 log.info("add bag");
	 atcpc.AddtoCartBike();
	 log.info("add bike");
	 atcpc.addtocart();
	 log.info("check cart");
	 atcpc.removebag();
	 log.info("remove bag");
	 Screenshots.takescreenshot(driver);
	 
	
//	 atcpc.cancel();
//	 System.out.println("cancel the checkout");
//	 atcpc.continuetoshopping();
//	 System.out.println("do shopping");
	 
	 CheckoutPomClass copc= new CheckoutPomClass (driver);
     copc.checkout();
     log.info("Click on checkout");
	 copc.firstname();
	 log.info("Pass the firstname");
	 copc.lastname();
	 log.info("Pass the lastname");
	 copc.postalcode();
	 log.info("Pass the code");
	 Screenshots.takescreenshot(driver);
	 copc.clickoncontinue();
	 log.info("continue to shopping");
//	 Screenshots.takescreenshot(driver);
	 //Validation
//	 copc.validate();
//	 System.out.println("Checkout Overview");
	 
	 BillingAndOrderPomClass baopc = new BillingAndOrderPomClass (driver);
	 baopc.finish();
	 //validation
	 String text = baopc.getText();
	 log.info(text);
	 String expectedtext = " THANK YOU FOR YOUR ORDER";
	 Screenshots.takescreenshot(driver);
//	 if(expectedtext.equals(text))
//	 {
//		 System.out.println("tc is pass");
//	 }
//	 else
//	 {
//		 System.out.println("tc is fail");
//	 }
	 Assert.assertEquals(expectedtext, " THANK YOU FOR YOUR ORDER");
	 
	 
	 //System.out.println("finish the shopping");
	// baopc.text();
	// Screenshots.takescreenshot(driver);
//	 System.out.println("Thank you");
	 baopc.home();
	 log.info("back to home");
	 Screenshots.takescreenshot(driver);
	 //driver.close;
//	 System.out.println("end");
}
}
