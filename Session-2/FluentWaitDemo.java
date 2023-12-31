package com.simplilearn.demo;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitDemo {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\chromedriver2023\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		
		driver.findElement(By.xpath("//*[@id=\"post-body-5280210221385817166\"]/div[1]/button")).click();
		
		
		FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		WebElement element= wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				
				WebElement element=driver.findElement(By.xpath("//*[@id=\"demo\"]"));
				String getTextonPage=element.getText();
				
				if(getTextonPage.equals("Software Testing Material - DEMO PAGE")) {
					System.out.println(getTextonPage);
					
					return element;
				}
				else {
					
					System.out.println("Fluent Wait Fail! Element Not Found");
					return null;
				}
				
				 
			}
			
		});
	}

}
