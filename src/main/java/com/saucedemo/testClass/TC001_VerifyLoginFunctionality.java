package com.saucedemo.testClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class TC001_VerifyLoginFunctionality extends TestBaseClass
{
	@Test
	public void loginfunctaionality () throws IOException
{


	 //validtion
		

	 String expectedTitle = "Swag Labs";
	String actualTitle = "Swag Labs";
//	if(expectedTitle.equals(actualTitle))
//	{
//		System.out.println("Test case is pass");
//	}
//	else
//	{
//		System.out.println("Test case is fail");
//	}

// Assert.assertEquals(actualTitle, expectedTitle);
 Assert.assertEquals(actualTitle, expectedTitle,"Titles are not matching");
// Assert.assertTrue(false);
}
} 

