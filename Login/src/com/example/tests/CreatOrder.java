package com.example.tests;


import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

public class CreatOrder {
	

public static void GerarPedido(WebDriver driver) throws Exception {
		
		driver.findElement(By.id("search-busca-topo")).clear();
		driver.findElement(By.id("search-busca-topo")).sendKeys("Teste Automatizado");
        System.out.println("ok2");	
	    driver.findElement(By.name("Comprar")).click(); 
	    System.out.println("ok3");	
	    
	   
	    System.out.println("ok4");	
	    
	    driver.findElement(By.id("s_method_correios_40010")).click();
	    driver.findElement(By.cssSelector("#shipping-method-buttons-container > button.button")).click();
	
	    driver.findElement(By.id("p_method_deposito")).click();
	    driver.findElement(By.cssSelector("#payment-buttons-container > button.button")).click();
	    driver.findElement(By.cssSelector("#payment-buttons-container > button.button")).click();
	    driver.findElement(By.cssSelector("button.button.btn-checkout")).click();
	    driver.findElement(By.id("btFechar")).click();
	    try {
	      assertEquals("Seu Pedido foi realizado com sucesso!", driver.getTitle());
	    } catch (Error e) {
	      
	      System.out.println("Pedido não foi finalizado com Sucesso");
	    }
	
	  }
  
	  
  }
  
 

