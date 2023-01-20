package org.selenium1day;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenYoutue {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\EswarGuru\\eclipse-workspace\\Selenium1stday\\chrome108\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.youtube.com");
    
}
}
