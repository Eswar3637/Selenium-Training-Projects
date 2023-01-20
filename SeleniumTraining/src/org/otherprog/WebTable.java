package org.otherprog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\EswarGuru\\eclipse-workspace\\Selenium3rdday\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/table.html");
		driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.xpath("//table[@cellspacing='1']"));
		WebElement tablecol=table.findElement(By.tagName("tr"));
		System.out.println(tablecol.getText().charAt(3));
		
	}

}
