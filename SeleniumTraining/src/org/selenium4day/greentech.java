package org.selenium4day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class greentech {

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\EswarGuru\\\\eclipse-workspace\\\\Selenium3rdday\\\\chrome\\\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.greenstech.in/selenium-course-content.html");
        driver.manage().window().maximize();
        
        WebElement faq=driver.findElement(By.xpath("//span[@title='FAQ']"));
        faq.click();
        
        WebElement txt=driver.findElement(By.xpath("//h3[contains(text(),'What are the pre-requisites')]"));
        txt.click();
        
        WebElement txt1=driver.findElement(By.xpath("//li[contains(text(),'From tool')]"));
        txt1.getText();
        driver.quit();
        System.out.println(txt1.getText());
        
        
        
        
        
        
	}

}
