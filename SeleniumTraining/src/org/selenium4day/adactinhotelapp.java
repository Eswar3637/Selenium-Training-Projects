package org.selenium4day;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class adactinhotelapp {
	
	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\EswarGuru\\eclipse-workspace\\Selenium3rdday\\chrome\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://adactinhotelapp.com/");	
	        
	       WebElement textp =  driver.findElement(By.xpath("//p[contains(text(),'Adactin Launches')]"));
	        String text= textp.getText();
	        System.out.println(text);
	        
	        driver.quit();
	
	}
	

}
