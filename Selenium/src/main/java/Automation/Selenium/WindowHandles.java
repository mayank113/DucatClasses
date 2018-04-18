package Automation.Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandles {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.naukri.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
Set<String> s = driver.getWindowHandles();
System.out.println(s.size());
System.out.println(s);
Iterator<String> i = s.iterator();

System.out.println("Total Windows:"+i);
String first = i.next();
System.out.println(first);
/*
for(int p=0;p<s.size();p++) {
	
	if (!i.equals(first)) {
	driver.switchTo().window(i.next()).close();
	}}*/

driver.switchTo().window(first);
System.out.println(driver.getTitle());
Thread.sleep(3000l);
driver.findElement(By.xpath("//*[@id=\"block\"]")).click();
driver.findElement(By.xpath("//a[@title='Jobseeker Login']")).click();
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mayank.saxena12051990@gmail.com");
driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("12may1990");
driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();



	}
}
