package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookloginTest {
	
	public static void main(String[] args) {
		//step:1 declare the path
				String path="D:\\Phase-5\\chromedriver2023\\chromedriver.exe";
				
				//step:2 set system property
				System.setProperty("webdriver.chrome.driver", path);
				
				//step:3 give base url
				String url="https://www.facebook.com/";
				
				//step:4 initiate webdriver
				WebDriver driver= new ChromeDriver();
				
				driver.get(url);
				
				
				//locating web elements
				
				WebElement email= driver.findElement(By.id("email"));
				//printing an attribute
				System.out.println(email.getAttribute("placeholder"));
				
				email.sendKeys("nikunj@gmail.com");
				
				
				WebElement password=driver.findElement(By.id("pass"));
				password.sendKeys("Nikunj@123");
				
				//driver.close();
				
				WebElement login=driver.findElement(By.name("login"));
				
				login.click();
				
				//login.submit();
				
	}

}
