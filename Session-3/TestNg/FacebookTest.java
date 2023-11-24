package com.simplileaern.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FacebookTest {
	
	WebDriver driver=null;
  @Test
  public void welcome() {
	  
	  System.out.println("Welcome to Automated Testing");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
	  System.setProperty("webdriver.chrome.driver","D:\\Phase-5\\chromedriver2023\\chromedriver.exe" );
	  driver =new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  
	  WebElement email=driver.findElement(By.id("email"));
	  email.sendKeys("Nikunj@gmail.com");
	  
	  WebElement pass=driver.findElement(By.id("pass"));
	  pass.sendKeys("Nikunj@123");
	  
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("After Method");
	  driver.close();
	  driver=null;
	  
  }

}
