package Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 
import pages.googlesearch;

public class Googletest {
	static WebDriver driver;
	public static void main(String[] args)
	{
		googlesearch();
		//driver.quit();
		
	}
	public static void googlesearch()
	{

	driver = new ChromeDriver();
	driver.get("http://www.google.com");
			driver.manage().window().maximize();
			
			googlesearch.textbox_search(driver).sendKeys("india");
			googlesearch.textbox_search(driver).sendKeys(Keys.ENTER);
}}
			