package org.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotProg 
{

	public static void main(String[] args) throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\EswarGuru\\eclipse-workspace\\Selenium3rdday\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://adactinhotelapp.com/");	
		driver.manage().window().maximize();
//		Robot robot =new Robot();
//		for (int i = 0; i < 3; i++) 
//		{
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		}
//		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
//
//		robot.keyPress(KeyEvent.VK_A);
//		robot.keyRelease(KeyEvent.VK_A);
//		Thread.sleep(1000);
//		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
//		
//		robot.keyPress(KeyEvent.VK_N);
//		robot.keyRelease(KeyEvent.VK_N);
//		robot.keyPress(KeyEvent.VK_A);
//		robot.keyRelease(KeyEvent.VK_A);
//		robot.keyPress(KeyEvent.VK_N);
//		robot.keyRelease(KeyEvent.VK_N);
//		robot.keyPress(KeyEvent.VK_D);
//		robot.keyRelease(KeyEvent.VK_D);
//		
//		robot.keyPress(KeyEvent.VK_AT);
//		robot.keyRelease(KeyEvent.VK_AT);
//		robot.keyPress(KeyEvent.VK_1);
//		robot.keyRelease(KeyEvent.VK_1);
//		robot.keyPress(KeyEvent.VK_2);
//		robot.keyRelease(KeyEvent.VK_2);
//		robot.keyPress(KeyEvent.VK_3);
//		robot.keyRelease(KeyEvent.VK_3);
//		

		Robot robot =new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		driver.switchTo().activeElement().sendKeys("Eswar");
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		driver.switchTo().activeElement().sendKeys("Eswar123@");
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		driver.switchTo().activeElement().click();
		
		
		
//		driver.switchTo().toString();
//		System.out.println(driver.switchTo().toString(););


		
	
	}

}
