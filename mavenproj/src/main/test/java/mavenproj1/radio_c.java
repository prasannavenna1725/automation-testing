package mavenproj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_c {
	public static void main(String[] args)throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		 WebElement r1= driver.findElement(By.id("vfb-6-0"));
		 r1.click();
		 System.out.println(r1.isSelected());
		 System.out.println(r1.isEnabled());
		 System.out.println(r1.isDisplayed());
		 Thread.sleep(3000);
		 
		 WebElement r2= driver.findElement(By.id("vfb-6-1"));
		 r2.click();
		 System.out.println(r2.isSelected());
		 System.out.println(r2.isEnabled());
		 System.out.println(r2.isDisplayed());
		 Thread.sleep(3000);
		 
		 WebElement r3= driver.findElement(By.id("vfb-6-2"));
		 r3.click();
		 System.out.println(r3.isSelected());
		 System.out.println(r3.isEnabled());
		 System.out.println(r3.isDisplayed());
		 Thread.sleep(3000);
		 
		 driver.quit();
		 
		 
		 
		 
	}

}
