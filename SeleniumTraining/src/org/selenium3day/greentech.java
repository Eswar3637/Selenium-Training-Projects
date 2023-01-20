package org.selenium3day;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class greentech {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\EswarGuru\\eclipse-workspace\\Selenium3rdday\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://greenstech.in/selenium-course-content.html");
        
        WebElement clckmdl= driver.findElement(By.xpath("//h2[@class='mb-0']"));
        clckmdl.click();

        WebElement clckmdl1= driver.findElement(By.xpath("//a[@target='_blank']"));
        clckmdl1.click();
	}

}
