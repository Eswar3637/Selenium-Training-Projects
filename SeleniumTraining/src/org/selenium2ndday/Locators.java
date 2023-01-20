package org.selenium2ndday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators 
{
  
	public static void main(String[] args) throws InterruptedException 
	{
            System.setProperty("webdriver.chrome.drive", "C:\\\\Users\\\\EswarGuru\\\\eclipse-workspace\\\\Selenium3rdday\\\\chrome\\\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.linkedin.com/home");
            driver.manage().window().maximize();
            
            driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("eswarguru1@gmail.com");
            driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("Eswar31@");
            driver.findElement(By.xpath("//button[@class='sign-in-form__submit-button']")).click();
            
            
            		
            
            
            
            
            		
          
	}

}
