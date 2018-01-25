package com.example.tests;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	
	public static WebDriver driver;

	private static StringBuffer verificationErrors = new StringBuffer();
	
public static void testLoginFront(String baseUrl2) {
		

		driver.get(baseUrl2 + "/customer/account/login/");
	    
	    driver.findElement(By.id("email")).sendKeys("carina@bizcommerce.com.br");
	    driver.findElement(By.id("pass")).sendKeys("biz123");
	    driver.findElement(By.id("send2")).click();
	    
	    try {
	        assertEquals("Minha Conta", driver.getTitle());
	      } catch (Error e) {
	        verificationErrors.append(e.toString());
	      }
	  }


}
