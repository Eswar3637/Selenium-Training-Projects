package org.selenium3day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath 
{
   
	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\EswarGuru\\eclipse-workspace\\Selenium3rdday\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
         
        WebElement txtsearchbx= driver.findElement(By.id("twotabsearchtextbox"));
        txtsearchbx.sendKeys("iphone");
        
        WebElement btnsrch= driver.findElement(By.id("nav-search-submit-button"));
        btnsrch.click();
	}

}
