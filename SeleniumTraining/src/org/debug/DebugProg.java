package org.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DebugProg
{

	public static void main(String[] args) throws InterruptedException
	{

		System.getProperty("webdriver.chrome.driver","C:\\Users\\EswarGuru\\eclipse-workspace\\SeleniumTraining\\chrome\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		//step by step execution
		WebElement user= driver.findElement(By.name("username"));
		user.sendKeys("eswarguru1@gmail.com");
		Thread.sleep(1000);

		
		WebElement pass= driver.findElement(By.name("password"));
		pass.sendKeys("Eswar31@");
		
		driver.findElement(By.xpath("//div[@class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p _abcm']")).click();
		
//		int a=5;
//		for (int i = 0; i < 3; i++) 
//		{
//			System.out.println(i);
//			System.out.println(a);
//
//		}
		
	}

}
