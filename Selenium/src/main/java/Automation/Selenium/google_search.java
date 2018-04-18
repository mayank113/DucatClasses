package Automation.Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_search {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("selenium");
	Thread.sleep(5000l);
		//List<WebElement> lis = driver.findElements(By.xpath("//ul[@role='listbox']//li//div//div[@class='sbqs_c']"));
		//List<WebElement> lis = driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@class='sbqs_c']"));
		List<WebElement> lis = driver.findElements(By.xpath("//ul[@role='listbox']//li//div//div[@class='sbqs_c']"));
	System.out.println(lis.size());
//		for(int i=0;i<lis.size();i++) {
//			
//			System.out.println(lis.get(i).getText());
//			
//		}
	
	for(WebElement web: lis) {
		
		System.out.println(web.getText());	
		
	}
		
		driver.close();
		
	}}
