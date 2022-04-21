package com.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusTask2 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Downloads\\Pragash\\ECLIPSE\\eclipse\\Day2TaskSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		
		driver.get(" https://www.redbus.in/");
		
		WebElement txtFrom = driver.findElement(By.id("src"));
		txtFrom.sendKeys("Karur");
		
		WebElement txtTo = driver.findElement(By.id("dest"));
		txtTo.sendKeys("Bangalore");
		
			
		
	}

}
