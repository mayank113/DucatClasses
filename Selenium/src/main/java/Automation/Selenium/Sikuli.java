package Automation.Selenium;

import java.util.regex.Pattern;

import com.gargoylesoftware.htmlunit.javascript.host.Screen;

public class Sikuli {

	public static void main(String[] args) {
	Screen s = new Screen();
	Pattern p = new Pattern();
	s.wait(5000, p);
	s.click();
	}

}
