package mavenproj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;

public class keys {
	
	

	
	public static void main(String[] args) throws InterruptedException
	{
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.google.com");
	WebElement l = driver.findElement(By.name("q"));
	 Actions a = new Actions(driver);
	 a.moveToElement(l).click();
	 a.keyDown(Keys.SHIFT);
	 a.sendKeys("taj").keyUp(Keys.SHIFT).build().perform();
	 a.contextClick().perform();
	 
		Thread.sleep(3000);
		driver.quit();

	 
	}

}
