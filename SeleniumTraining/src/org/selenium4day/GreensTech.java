package org.selenium4day;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\EswarGuru\\eclipse-workspace\\Selenium3rdday\\chrome\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://greenstech.in/selenium-course-content.html");
    driver.manage().window().maximize();
    
    WebElement clckmdl= driver.findElement(By.xpath("//span[@title='Overview']"));
    clckmdl.click();

    WebElement textp =  driver.findElement(By.xpath("//p[contains(text(),'Greens Technologies Selenium training class')]"));
   // String text= textp.getText();
    System.out.println(textp.getText());
    

}
}
