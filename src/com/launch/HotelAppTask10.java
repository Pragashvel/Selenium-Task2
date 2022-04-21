package com.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelAppTask10 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Downloads\\Pragash\\ECLIPSE\\eclipse\\Day2TaskSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(" http://adactinhotelapp.com/");
		
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys("9876543210");
		
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys("55555555");
	}


}
