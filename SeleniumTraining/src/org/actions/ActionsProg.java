package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsProg 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\EswarGuru\\eclipse-workspace\\Selenium3rdday\\chrome\\chromedriver.exe");
         WebDriver driver =new ChromeDriver();
        driver.get("https://www.leafground.com/");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//li[@id='menuform:j_idt39']")).click();
        driver.findElement(By.xpath("//i[@class='pi pi-fw pi-calendar layout-menuitem-icon']")).click();
        WebElement source=driver.findElement(By.xpath("//div[@id='form:drag_content']"));
        WebElement target=driver.findElement(By.xpath("//div[@id='form:drop_header']"));

        
        Actions action =new Actions(driver);
        action.dragAndDrop(source, target).perform();
        		
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
