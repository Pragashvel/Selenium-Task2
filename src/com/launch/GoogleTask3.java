package com.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTask3 {public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\admin\\Downloads\\Pragash\\ECLIPSE\\eclipse\\Day2TaskSelenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	WebElement txtName = driver.findElement(By.name("q"));
	txtName.sendKeys("GreensTechnology.");
	
}

}
