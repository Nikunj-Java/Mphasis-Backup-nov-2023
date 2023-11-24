package com.simplileaern.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GroupTest {
	WebDriver driver=null;
	
  @Test(groups="Chrome")
  public void launchChrome() {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\Phase-5\\chromedriver2023\\chromedriver.exe" );
	  driver =new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
  
  @Test(groups="Chrome",dependsOnMethods = {"launchChrome"} )
  public  void loginWithChrome() {
	  

	  driver.findElement(By.id("email")).sendKeys("Nikunj@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("Nikunj@123");
	  driver.findElement(By.name("login")).click();
	  //driver.close();
	  
  }
  
  
  @Test(groups="FireFox")
  public void launchFireFox() {
	  
	  System.setProperty("webdriver.gecko.driver","D:\\Phase-5\\geckodriver-v0.31.0-win64_new\\geckodriver.exe" );
	  driver =new FirefoxDriver();
	  driver.get("https://www.facebook.com/");
	  
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  
  @Test(groups="FireFox",dependsOnMethods = {"launchFireFox"} )
  public  void loginWithFirefox() {
	  

	  driver.findElement(By.id("email")).sendKeys("Nikunj@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("Nikunj@123");
	  driver.findElement(By.name("login")).submit();
	  //driver.close();
	  
  }
}
