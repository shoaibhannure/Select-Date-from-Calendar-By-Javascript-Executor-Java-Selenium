package com.shoaib.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * 
 * @Author:- Shoaib Hannure
 * 
 */

public class DateSelectionByJSE {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // launch chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get("https://www.goair.in/");
		driver.navigate().to("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//This will select From date 
		  WebElement elementFromDate = driver.findElement(By.id("onward_cal"));
		  ((JavascriptExecutor)driver).executeScript ("document.getElementById('onward_cal')"
		  		+ ".removeAttribute('readonly',0);"); // Enables the from date box
		  elementFromDate.clear();
		  elementFromDate.sendKeys("02-Oct-2020"); //Enter date in required format
		  
	}

}
