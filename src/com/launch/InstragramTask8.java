package com.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstragramTask8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\Downloads\\Pragash\\ECLIPSE\\eclipse\\Day2TaskSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://www.instagram.com/accounts/login/?hl=en) login page");
		
		WebElement txtusername = driver.findElement(By.name("username"));
		txtusername.sendKeys("Pragash");
		
		WebElement txtpassword = driver.findElement(By.name("password"));
		txtpassword.sendKeys("12345");
		
		

}}
