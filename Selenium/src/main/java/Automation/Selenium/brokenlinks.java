package Automation.Selenium;

import static org.testng.Assert.assertNotNull;

import java.net.HttpURLConnection;
import java.net.URI;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.apache.commons.lang3.ObjectUtils.Null;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.HttpConnection;
import org.testng.Assert;

import com.gargoylesoftware.htmlunit.javascript.host.URL;


public class brokenlinks {

public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("http://toolsqa.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//img[@class=\"ib-img-default\"]")).click();
List<WebElement> links = driver.findElements(By.tagName("a"));
System.out.println(links.size());
List<WebElement> Img = driver.findElements(By.tagName("img"));
System.out.println(Img.size());


}
}