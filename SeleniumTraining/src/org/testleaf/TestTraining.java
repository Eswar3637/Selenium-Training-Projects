package org.testleaf;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestTraining 
{

	public static void main(String[] args) throws InterruptedException, AWTException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\EswarGuru\\eclipse-workspace\\Selenium3rdday\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/");	
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li[@id='menuform:j_idt40']")).click();
		driver.findElement(By.xpath("//span[text()='Dropdown']")).click();
		
		WebElement tool= driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select select=new Select(tool);
		Thread.sleep(1000);
		select.selectByIndex(4);
		
		//Multi Select
		WebElement course= driver.findElement(By.xpath("//button[@class='ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only']"));
		
        course.click();
		Thread.sleep(1000);

        driver.findElement(By.xpath("//li[@data-item-label='Appium']")).click();
        course.click();
		Thread.sleep(1000);

        driver.findElement(By.xpath("//li[@data-item-label='AWS']")).click();
        course.click();
		Thread.sleep(1000);

        driver.findElement(By.xpath("//li[@data-item-label='PostMan']")).click();
        
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        
        File source= screenshot.getScreenshotAs(OutputType.FILE);
        System.out.println(source);
        
        driver.close();
        
        File dest = new File ("C:\\Users\\ESWARG~1\\AppData\\Local\\Temp\\screenshot3814169807543178753.png");
        FileUtils.copyFile(source,dest);
        
        
        
        
        

        
		
		
		
		
		
		
		
		
		
//		Robot robot=new Robot();
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		for (int i = 0; i < 3; i++) {
//			driver.switchTo().activeElement().sendKeys("",Keys.DOWN);
//
//		}
//		driver.findElement(By.xpath("//button[@class='ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only']"));
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		                       //****alert****//
		
//		driver.findElement(By.xpath("//li[@id='menuform:j_idt39']")).click();
//		driver.findElement(By.xpath("//li[@id='menuform:m_overlay']")).click();
//		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
//		Thread.sleep(1500);
//		driver.switchTo().alert().accept();
//		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
//		Thread.sleep(1500);
//		driver.switchTo().alert().dismiss();
//
//		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
//		Thread.sleep(1500);
//		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]")).click();
//		
//		
//        driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).click();
//        Thread.sleep(1500);
//        driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
//        Thread.sleep(1500);
//        driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
//		driver.switchTo().alert().sendKeys("Eswar");
//		driver.switchTo().alert().accept();
//        driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[7]")).click();
//        Thread.sleep(1500);
//        driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[9]")).click();
		

		
		


	}

}
