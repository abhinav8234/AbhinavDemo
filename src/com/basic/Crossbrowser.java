package com.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void lunchbrowser(String browser){
		if(browser.equals("forefox")){
			driver= new FirefoxDriver();
			
		}
		else if ( browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\Browser Server\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	
		driver.get("https://filehippo.com");
		System.out.println(driver.getCurrentUrl());
	}
	

}
