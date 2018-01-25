package com.example.tests;



import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class CreatCustomer {

	  public static String baseUrl;
	  private StringBuffer verificationErrors = new StringBuffer();

	 
	  @Test
	  public static void testCadastroCliente (WebDriver driver) throws Exception {
	    
	   // assertEquals("Login do Cliente", driver.getTitle());
		driver.get(baseUrl + "/customer/account/login/");
		System.out.println("Passou aqui");  
	    driver.findElement(By.linkText("cadastre-se")).click();
	    assertEquals("Criar Nova Conta de Cliente", driver.getTitle());
	    driver.findElement(By.id("tipo_pessoa_pf")).click();
	    driver.findElement(By.id("firstname")).clear();
	    driver.findElement(By.id("firstname")).sendKeys("Teste");
	    driver.findElement(By.id("lastname")).clear();
	    driver.findElement(By.id("lastname")).sendKeys("Bizcommerce");
	    driver.findElement(By.id("email_address")).clear();
	    driver.findElement(By.id("email_address")).sendKeys("testeselenium@bizcommerce.com.br");
	    driver.findElement(By.id("day")).clear();
	    driver.findElement(By.id("day")).sendKeys("31");
	    driver.findElement(By.id("month")).clear();
	    driver.findElement(By.id("month")).sendKeys("08");
	    driver.findElement(By.id("year")).clear();
	    driver.findElement(By.id("year")).sendKeys("1988");
	    driver.findElement(By.id("taxvat")).clear();
	    driver.findElement(By.id("taxvat")).sendKeys("376.714.698-31");
	    new Select(driver.findElement(By.id("gender"))).selectByVisibleText("Feminino");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("biz123");
	    driver.findElement(By.id("confirmation")).clear();
	    driver.findElement(By.id("confirmation")).sendKeys("biz123");
	    driver.findElement(By.cssSelector("button.button")).click();
	    // ERROR: Caught exception [unknown command []]
	    assertEquals("Minha Conta", driver.getTitle());
	    driver.findElement(By.linkText("Logout")).click();
	  }

	  @After
	  public void tearDown(WebDriver driver) throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  

	 
	  }


	

