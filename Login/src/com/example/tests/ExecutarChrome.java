package com.example.tests;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutarChrome {
	
	public static WebDriver driver;
	public static String baseUrl;
	static String titulo;
	
	
	public static WebDriver executarchromeDriver() { // metodo responsável por executar o chrome
		
		System.setProperty("webdriver.chrome.driver", "/Users/carina/Documents/workspace/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
	
	
}
