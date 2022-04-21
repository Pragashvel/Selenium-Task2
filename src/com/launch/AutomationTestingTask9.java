package com.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTestingTask9 {
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\admin\\Downloads\\Pragash\\ECLIPSE\\eclipse\\Day2TaskSelenium\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get(" http://demo.automationtesting.in/Register.html");
			
			
			
			
		}


}
