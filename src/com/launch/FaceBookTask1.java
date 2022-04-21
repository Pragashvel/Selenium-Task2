package com.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookTask1 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Downloads\\Pragash\\ECLIPSE\\eclipse\\Day2TaskSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://www.facebook.com/");
		
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("vel123@gmail.com");
		
		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys("1234567");
		

		
		
		
	}

}
