package org.otherprog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoAutoReg
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\EswarGuru\\eclipse-workspace\\Selenium3rdday\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement fname = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		fname.sendKeys("Eswar");
		
		WebElement lname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lname.sendKeys("Guru");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
		address.sendKeys("No.63,\nJai Indhra Nagar,\nGudiyatham");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("eswarguru1@gmail.com");
		
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("8526682216");
		
	    WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        gender.click();
        Thread.sleep(1000);

      //input[@type='checkbox']
        WebElement hobbies = driver.findElement(By.xpath("//input[@value='Movies']"));
        hobbies.click();
        
        
      //div[@id='msdd']
//        WebElement language = driver.findElement(By.xpath("//div[@id='msdd']"));
//        language.click();
        Thread.sleep(1000);
        WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
        Select select = new Select(skills);
        select.selectByIndex(7);
        Thread.sleep(1000);
        WebElement country = driver.findElement(By.xpath("//span[@role='combobox']"));
        country.click();
        country.sendKeys("India");
      //input[@type='search']
        Thread.sleep(1000);

//        WebElement country1 = driver.findElement(By.xpath("//input[@type='search']"));
//        country1.sendKeys("India");
//        Thread.sleep(1000);
      //select[@id='yearbox']
        WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));
        Select selectyear = new Select(year);
        Thread.sleep(1000);
        selectyear.selectByValue("1997");
        WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']']"));
        Select selectmonth = new Select(month);
        Thread.sleep(1000);
        selectmonth.selectByIndex(4);
        WebElement day = driver.findElement(By.xpath("//select[@id='daybox']"));
        Select selectday = new Select(day);
        selectyear.selectByIndex(32);
        
        
        
		
		
		
		
		
	}

}
