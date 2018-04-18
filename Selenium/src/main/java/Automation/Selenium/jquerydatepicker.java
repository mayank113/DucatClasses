package Automation.Selenium;

import java.sql.Array;
import java.util.Collection;
//To Select the pervious date of Current date in jquery
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class jquerydatepicker {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		
		Collection<WebElement> si =driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
		//String  cord =driver.findElement(By.className("ui-datepicker-today")).getText();
		String  cord = driver.findElement(By.xpath("//a[text()='28']")).getText();
		
		
	int c = Integer.parseInt(cord);
	int sum = c-1;
	
/*System.out.println(sum);
	for (WebElement p :si) {
		
		if (p.getText().equals(cord)) {
		System.out.println(p.getText());*/
				
		//System.out.println(sum);
		driver.findElement(By.xpath("//a[text()='"+sum+"']")).click();
			//}
	//}
			
		}
	}
