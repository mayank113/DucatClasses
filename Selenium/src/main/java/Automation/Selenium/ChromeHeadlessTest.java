package Automation.Selenium;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadlessTest {

 
    public static void main(String[] args) throws IOException {
       // System.setProperty("webdriver.chrome.driver", "<chromedrier_path>");

       // Add options to Google Chrome. The window-size is important for responsive sites
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        options.addArguments("headless");
        //options.addArguments("window-size=1200x600");

    	WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("selenium");
    }
}