package org.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateProg 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\EswarGuru\\eclipse-workspace\\Selenium3rdday\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//a[@data-csa-c-content-id='nav_cs_mobiles']
		driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_mobiles']")).click();
        driver.navigate().back();
        
	}

}
