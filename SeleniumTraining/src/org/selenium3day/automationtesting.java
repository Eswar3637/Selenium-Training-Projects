package org.selenium3day;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationtesting 
{
   
	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\EswarGuru\\eclipse-workspace\\Selenium3rdday\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
         
        WebElement txtusername= driver.findElement(By.xpath("//input[@id='email']"));
        txtusername.sendKeys("eswarguru1@gmail.com");
        
        WebElement txtpass= driver.findElement(By.xpath("//input[@id='pass']"));
        txtpass.sendKeys("Eswar31@");
        
        WebElement btnlgn= driver.findElement(By.name("login"));
        btnlgn.click();
        
	}

}
