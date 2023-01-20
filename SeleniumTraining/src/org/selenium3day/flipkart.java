package org.selenium3day;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\EswarGuru\\eclipse-workspace\\Selenium3rdday\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        
        WebElement btnlogin= driver.findElement(By.xpath("//img[@class='_deals-shoveler-v2_style_dealImagePrimavera__39h59']"));
        btnlogin.click();

//        WebElement txtusername= driver.findElement(By.xpath("//input[@autocomplete='off']"));
//        txtusername.sendKeys("eswarguru1@gmail.com");
//        
//        WebElement txtpass= driver.findElement(By.xpath("//input[@type='password']"));
//        txtpass.sendKeys("Eswar31@");
        }

}
