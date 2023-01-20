package org.selenium4day;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\EswarGuru\\eclipse-workspace\\Selenium3rdday\\chrome\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.amazon.in/");	
	        
	       WebElement textp =  driver.findElement(By.xpath("//a[contains(text(),'Conditions')]"));
	        String text= textp.getText();
	        System.out.println(text);
	        
	        driver.quit();
	
	}
	
}
