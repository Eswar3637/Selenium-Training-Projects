package org.selenium3day;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toolsqa {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\EswarGuru\\eclipse-workspace\\Selenium3rdday\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cleartrip.com/trains");
        
        WebElement txtfrom= driver.findElement(By.id("from_station"));
        txtfrom.sendKeys("Chennai");

        WebElement txtto= driver.findElement(By.id("to_station"));
        txtto.sendKeys("Banglore");
        
        WebElement btnsearch= driver.findElement(By.id("trainFormButton"));
        btnsearch.click();
        
	}

}
