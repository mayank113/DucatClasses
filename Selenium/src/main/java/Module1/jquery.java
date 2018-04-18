package selenium; 

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.interactions.Actions; 

public class DragnDrop { 

public static void main(String[] args) { 
System.setProperty("webdriver.gecko.driver","C:\\tools\\geckodriver.exe"); 
WebDriver driver = new FirefoxDriver(); 
driver.get("http://jqueryui.com/droppable/"); 
driver.manage().window().maximize(); 

driver.switchTo().frame(0); 

WebElement dragable=driver.findElement(By.xpath("//*[@id=\"draggable\"]")); 

WebElement dropable=driver.findElement(By.id("droppable")); 

Actions action= new Actions(driver); 
action.dragAndDrop(dragable, dropable).perform(); 




} 

} 




Second 

package selenium; 

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.interactions.Actions; 

public class slider { 

public static void main(String[] args) { 
System.setProperty("webdriver.gecko.driver","C:\\tools\\geckodriver.exe"); 
WebDriver driver = new FirefoxDriver(); 
driver.get("http://jqueryui.com/slider/"); 
driver.manage().window().maximize(); 

driver.switchTo().frame(0); 

WebElement slider= driver.findElement(By.xpath("//*[@id=\"slider\"]/span")); 

WebElement bar=driver.findElement(By.xpath("//*[@id=\"slider\"]")); 

System.out.println(slider.getSize()); 

System.out.println(slider.getLocation()); 

System.out.println(bar.getSize()); 

System.out.println(bar.getLocation()); 

Actions action = new Actions(driver); 

action.dragAndDropBy(slider, 400, 0).perform(); 

} 

} 


---- 
Third 

package selenium; 

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 

public class AjaxSearch { 

public static void main(String[] args) { 
System.setProperty("webdriver.gecko.driver","C:\\tools\\geckodriver.exe"); 
WebDriver driver = new FirefoxDriver(); 
driver.get("http://google.com/"); 
driver.manage().window().maximize(); 

driver.findElement(By.id("lst-ib")).sendKeys("seleniu"); 

String first="//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul/li["; 
String last="]"; 
int x=1; 
try { 
while(true) 
{ 
System.out.println(driver.findElement(By.xpath(first+x+last)).getText()); 
x++; 
} 
}catch(Throwable t) { 
System.out.println("done"); 
} 
} 

} 