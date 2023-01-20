package org.otherprog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandle 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\EswarGuru\\eclipse-workspace\\Selenium3rdday\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13",Keys.ENTER);
		driver.findElement(By.linkText("Apple iPhone 13 (128GB) - Starlight")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='submit.add-to-cart']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-checkout-button-announce']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.linkText("Apple iPhone 12 (64GB) - Purple")).click();
//        driver.wait();
//		String parenttab = driver.getWindowHandle();
//		driver.findElement(By.xpath("//input[@aria-labelledby='color_name_3-announce']")).click();	
//		driver.findElement(By.xpath("//span[@id='submit.add-to-cart-announce']")).click();
//		driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")).click();	
//		driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();	
//		driver.switchTo().window(parenttab);
//		
//		
		
		
//		driver.switchTo().window(newwindow);
//		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//		close.click();
//
//		WebElement searchbox = driver.findElement(By.className("_3704LK"));
//		searchbox.sendKeys("iphone 12",Keys.ENTER);
//		
//		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		

		

//		WebElement login = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
//		login.click();
//		Thread.sleep(1000);
//
//		WebElement username = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//		username.sendKeys("eswarguru1@gmail.com");
//		
//		WebElement request = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
//		request.click();
		
		
		
		
	}

}
