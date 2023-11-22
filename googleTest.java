package com.simplilearn.demo;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleTest {
	
	public static void main(String[] args) {
		
		//step:1 declare the path
		String path="D:\\Phase-5\\chromedriver2023\\chromedriver.exe";
		
		//step:2 set system property
		System.setProperty("webdriver.chrome.driver", path);
		
		//step:3 give base url
		String url="https://www.google.com/";
		
		//step:4 initiate webdriver
		WebDriver driver= new ChromeDriver();
		
		driver.get(url);
		
		
		driver.close();
		
		System.out.println("Driver Working Perfectly");
	
		
	}

}
