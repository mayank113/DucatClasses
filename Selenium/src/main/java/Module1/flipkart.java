package Module1;
//To get all the elements of page in phone's tab
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;


public class flipkart {
	
	private static final boolean String = false;



	public void count() {
		
		
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		
		
		String url ="https://www.flipkart.com/mobile-phones-store?otracker=nmenu_sub_Electronics_0_Mobiles";
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		WebElement electronic = driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[3]/div/ul/li[1]/a/span"));
		Actions action = new Actions(driver);
		action.moveToElement(electronic).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[3]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[1]/a/span[1]")).click();
Assert.assertEquals(url, driver.getCurrentUrl());
		Thread.sleep(5000);
		
	List<WebElement> list =driver.findElements(By.className("iUmrbN"));
	List<WebElement> pc =driver.findElements(By.className("_3o3r66"));
	list.size();
for(WebElement a : list) {
	
	System.out.println(a.getText());
	
}

for(WebElement b : pc) {
	
	System.out.println(b.getText());
		
	}

	
	
}


	}