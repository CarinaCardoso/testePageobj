package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



import java.util.concurrent.TimeUnit;

public class Principal {
	
	public static WebDriver driver;
	public static String titulo;
	public static String baseUrl;
	static int ct;
	
	public static class SwitchDemo {
		
		
	    public static void main(String[] args) throws Exception {
	      
	                executarchromeDriver();
	            	Pagina.acessaPagina(driver); 
	            	//login.testLoginFront(baseUrl);
	            	
	            	testCadastroCliente(driver,baseUrl);
	            	driver.getCurrentUrl();
	                    
	}
	    
	    public static WebDriver executarchromeDriver() { // metodo responsável por executar o chrome
			
			System.setProperty("webdriver.chrome.driver", "/Users/carina/Documents/workspace/chromedriver");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			return driver;
		}	
	    	
	    public static String acessaPagina (WebDriver driver){
			
			String baseUrl;
			
			baseUrl = "http://homologa.dev.bizcommerce.com.br/";
			
			driver.get(baseUrl);	
			return baseUrl;
		}
	    
	    public static void testCadastroCliente (WebDriver driver, String baseUrl) {
	    	System.out.println("Passou aqui");  
	    	System.out.print(baseUrl);
	    	driver.get(baseUrl + "/customer/account/login/");
	    	driver.findElement(By.id("tipo_pessoa_pf")).click();	 	
	 	    driver.findElement(By.id("firstname")).sendKeys("Teste");	 	   
	 	    driver.findElement(By.id("lastname")).sendKeys("Bizcommerce");	 	 
	 	    driver.findElement(By.id("email_address")).sendKeys("testeselenium@bizcommerce.com.br");	 	    
	 	    driver.findElement(By.id("day")).sendKeys("31");	 	    
	 	    driver.findElement(By.id("month")).sendKeys("08");	 	
	 	    driver.findElement(By.id("year")).sendKeys("1988");	 	    
	 	    driver.findElement(By.id("taxvat")).sendKeys("376.714.698-31");
	 	    new Select(driver.findElement(By.id("gender"))).selectByVisibleText("Feminino");	 	    
	 	    driver.findElement(By.id("password")).sendKeys("biz123"); 	  
	 	    driver.findElement(By.id("confirmation")).sendKeys("biz123");
	 	    driver.findElement(By.cssSelector("button.button")).click();
	 	   
	 	  }
	
	}
}
