package selenium; 

import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 

public class JavaScriptExecutor { 

public static void main(String[] args) throws InterruptedException { 
System.setProperty("webdriver.gecko.driver","C:\\tools\\geckodriver.exe"); 
WebDriver driver = new FirefoxDriver(); 
driver.get("https://flipkart.com/"); 
driver.manage().window().maximize(); 
JavascriptExecutor method=(JavascriptExecutor) driver; 
method.executeScript("history.go(0);"); 
Thread.sleep(3000l); 
//method.executeScript("window.alert('you are on wrong window');"); 
method.executeScript("window.scrollBy(0,500);"); 

} 

} 








Second 

package selenium; 

import java.util.List; 

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.support.ui.Select; 

public class DropDown { 

public static void main(String[] args) { 
System.setProperty("webdriver.gecko.driver","C:\\tools\\geckodriver.exe"); 
WebDriver driver = new FirefoxDriver(); 
driver.get("https://www.wikipedia.org/"); 
driver.manage().window().maximize(); 

WebElement dropDown= driver.findElement(By.xpath("//select[@id='searchLanguage']")); 

dropDown.sendKeys("Dansk"); 

Select select= new Select(dropDown); 
select.selectByValue("el"); 

List values=dropDown.findElements(By.tagName("Option")); 
System.out.println(values.size()); 
for(int i=0;i